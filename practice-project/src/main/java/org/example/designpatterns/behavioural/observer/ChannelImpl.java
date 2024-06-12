package org.example.designpatterns.behavioural.observer;

public class ChannelImpl implements Channel{
    private String news;

    public String getNews() {
        return news;
    }
    public void setNews(String news) {
        this.news = news;
    }
    @Override
    public void update(Object o) {
        System.out.println("setting news to teh observer"+o);
        setNews((String)o);
    }
}
