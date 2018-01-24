package com.example.android.newsapp;

public class News {

    /** Title of the article */
    private String mTitle;

    /** Section in which the article is published */
    private String mSectionName;

    /** Publication date of the article */
    private String mDate;

    /** Resume of the article */
    private String mResume;

    /** Link to the article */
    private String mUrl;

    /**
     * Create a new News object.
     */
    public News(String title, String sectionName, String date, String resume, String url) {
        mTitle = title;
        mSectionName = sectionName;
        mDate = date;
        mResume = resume;
        mUrl = url;
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

    public String getResume() {
        return mResume;
    }

    public String getUrl() {
        return mUrl;
    }
}
