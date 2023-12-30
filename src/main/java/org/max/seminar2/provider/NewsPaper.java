package org.max.seminar2.provider;

import org.max.seminar2.subscriber.Subscriber;

/**
 * Интерфейс поставщика
 */
public interface NewsPaper {

    void registerSubscriber (Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscriber(String news);
}
