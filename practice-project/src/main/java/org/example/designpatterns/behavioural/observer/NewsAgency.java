package org.example.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Channel> channels;
    public NewsAgency() {
        channels = new ArrayList<>();
    }
    public List<Channel> getChannels() {
        return channels;
    }
    public String getNews() {
        return news;
    }
    public void setNews(String news) {
        this.news = news;
        for(Channel c : channels)
        {
            c.update(this.news);
        }
    }
}
