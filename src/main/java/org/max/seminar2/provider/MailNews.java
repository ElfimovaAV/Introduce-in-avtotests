package org.max.seminar2.provider;

import org.max.seminar2.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class MailNews extends AbstractNews {


        @Override
        public void notifySubscriber(String news) {
            super.notifySubscriber("Новость от Мэйл: " + news);

        }
}
