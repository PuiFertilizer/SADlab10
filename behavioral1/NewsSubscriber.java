package edu.parinya.softarchdesign.behavioral;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {
	// You need to implement this class
	private final String name;
    public NewsSubscriber(String name) {
        this.name = name;
    }
	public void update(News item) {
        System.out.printf("%s get news (%s): %s\n", name, item.getClass().getName(), item.getContent());
    }
}
