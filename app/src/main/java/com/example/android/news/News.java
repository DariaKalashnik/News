package com.example.android.news;

// Created by Daria Kalashnikova 24.05.2017

class News {

    final private String section;
    final private String title;
    final private String date;
    final private String url;

    News(String section, String title, String date, String url) {
        this.section = section;
        this.title = title;
        this.date = date;
        this.url = url;
    }

    String getSection() {
        return section;
    }

    public String getTitle() {
        return title;
    }

    String getDate() {
        return date;
    }

    String getURL() {
        return url;
    }
}
