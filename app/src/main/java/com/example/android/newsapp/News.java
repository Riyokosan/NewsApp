package com.example.android.newsapp;

public class News {

    /** Title of the article */
    private String mTitle;

    /** Section in which the article is published */
    private String mSectionName;

    /** Publication date of the article */
    private String mDate;

    /** URL to the article */
    private String mUrl;

    /** Resume of the article */
    private String mResume;

    /**
     * Create a new News object.
     */
    public News(String title, String sectionName, String date, String url, String resume) {
        mTitle = title;
        mSectionName = sectionName;
        mDate = date;
        mUrl = url;
        mResume = resume;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getResume() {
        return mResume;
    }
}
