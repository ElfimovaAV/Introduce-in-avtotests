package org.max.seminar2.subscriber;

public class SubscriberMember implements Subscriber {
    private String news;
    @Override
    public void updateSubscriber(String news) {
        this.news = news;

    }

    public String getNews(){
        return news;
    }
}
