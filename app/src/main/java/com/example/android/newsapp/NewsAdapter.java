package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class NewsAdapter extends ArrayAdapter<News> {


    public NewsAdapter(Context context, List<News> earthquake) {
        super(context, 0, earthquake);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_items, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        News currentNews = getItem(position);

        // Find the TextView with view ID title of the news
        TextView titleView = (TextView) listItemView.findViewById(R.id.article_title);
        // Display the title of the current news in that TextView
        titleView.setText(currentNews.getTitle());


        // Find the TextView with view ID title of the news
        TextView resumeView = (TextView) listItemView.findViewById(R.id.article_description);
        // Display the title of the current news in that TextView
        resumeView.setText(currentNews.getResume());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Display the date when the current news was published in that TextView
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ss", Locale.UK);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.UK);

        try {
            Date date = dateFormat.parse(currentNews.getDate());

            String parseDate = dateFormat2.format(date);
            dateView.setText(parseDate);
        } catch (ParseException e) {
        }

        // Find the TextView with view ID news_section of the news
        TextView newsSectionView = (TextView) listItemView.findViewById(R.id.section);
        // Display the news_section of the current news in that TextView
        newsSectionView.setText(currentNews.getSectionName());

        // Return the list item view that is now showing the appropriate data
        return listItemView;

    }

}

