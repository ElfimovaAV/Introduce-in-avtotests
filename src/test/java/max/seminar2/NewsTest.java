package max.seminar2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.max.seminar2.Main;
import org.max.seminar2.provider.MailNews;
import org.max.seminar2.provider.YandexNews;
import org.max.seminar2.subscriber.SubscriberMember;

public class NewsTest {

    @ParameterizedTest
    @ValueSource(strings = {"Новость1", "Новость2"})
    void testSubscriberMember(String news){
        MailNews mailNews = new MailNews();
        SubscriberMember subscriberMember = new SubscriberMember();

        mailNews.registerSubscriber(subscriberMember);
        mailNews.notifySubscriber(news);

        Assertions.assertEquals("Новость от Мэйл: " + news, subscriberMember.getNews());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Новость1", "Новость2"})
    void testSubscriberMemberTwoSubscriptions(String news){
        MailNews mailNews = new MailNews();
        YandexNews yandexNews = new YandexNews();
        SubscriberMember subscriberMember = new SubscriberMember();

        mailNews.registerSubscriber(subscriberMember);
        mailNews.notifySubscriber(news);

        yandexNews.registerSubscriber(subscriberMember);
        yandexNews.notifySubscriber(news);

        Assertions.assertEquals("Новость от Яндекс: " + news, subscriberMember.getNews());
    }
}
