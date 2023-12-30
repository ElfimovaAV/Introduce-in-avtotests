package org.max.seminar2.provider;

import org.max.seminar2.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractNews implements NewsPaper {
    protected List<Subscriber> subscriberList = new ArrayList<>();
    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);

    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);

    }

    @Override
    public void notifySubscriber(String news) {
        for (Subscriber subscriber : subscriberList) {
            subscriber.updateSubscriber(news);
        }

    }
}
