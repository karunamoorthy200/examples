package org.example.designpatterns.behavioural.observer;

public class Client {


    public static void main(String[] args) {
        Channel suntv = new ChannelImpl();
        Channel vijay = new ChannelImpl();
        NewsAgency kkAgency = new NewsAgency();
        kkAgency.getChannels().add(suntv);
        kkAgency.getChannels().add(vijay);
        kkAgency.setNews("new news arrived to the Agency");
    }
}
