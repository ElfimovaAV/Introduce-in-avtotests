package org.max.seminar2;

import org.max.seminar2.provider.MailNews;
import org.max.seminar2.provider.NewsPaper;
import org.max.seminar2.provider.YandexNews;
import org.max.seminar2.subscriber.Subscriber;
import org.max.seminar2.subscriber.SubscriberImpl;
import org.max.seminar2.subscriber.SubscriberMember;

public class Main {
    public static void main(String[] args) {
        NewsPaper yandex = new YandexNews();
        NewsPaper mail = new MailNews();

        Subscriber subscriber1 = new SubscriberImpl("Георгий");
        Subscriber subscriberYandex = new SubscriberImpl("Василий");
        Subscriber subscriberMail1 = new SubscriberImpl("Анастасия");
        Subscriber subscriberMail2 = new SubscriberImpl("Андрей");

        SubscriberMember subscriberMember = new SubscriberMember();

        mail.registerSubscriber(subscriber1);
        mail.registerSubscriber(subscriberMail1);
        mail.registerSubscriber(subscriberMail2);
        yandex.registerSubscriber(subscriber1);
        yandex.registerSubscriber(subscriberYandex);
        yandex.registerSubscriber(subscriberMember);

        String yandexNews = "Яндекс выпустил новые карты";
        String mailNews = "Ожидается сильное похолодание";

        mail.notifySubscriber(mailNews);
        yandex.notifySubscriber(yandexNews);

        System.out.println(subscriberMember.getNews());

        mail.unsubscribe(subscriberMail2);

        String mailNews1 = "Ожидается перекрытие дорог. Будьте осторожны";

        mail.notifySubscriber(mailNews1);
        System.out.println(subscriberMember.getNews());

        yandex.notifySubscriber("До Нового года осталось 2 дня");
        System.out.println(subscriberMember.getNews());

    }
}
