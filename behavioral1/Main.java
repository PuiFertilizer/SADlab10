package edu.parinya.softarchdesign.behavioral;

public class Main {
    public static void main(String[] args) {
        NewsPublisher blognone = new NewsPublisher();
        NewsPublisher brandInside = new NewsPublisher();
        NewsPublisher prachatai = new NewsPublisher();

        NewsSubscriber parinya = new NewsSubscriber("Parinya");
        blognone.subscribe(parinya);
        prachatai.subscribe(parinya);
        NewsSubscriber rome = new NewsSubscriber("Rangsiman");
        prachatai.subscribe(rome);
        NewsSubscriber mai = new NewsSubscriber("Sirikanya");
        brandInside.subscribe(mai);
        NewsSubscriber prawit = new NewsSubscriber("Prawit");

        News techNews = new TechnologyNews("A new security issue was found in Google Chrome.");
        News ecoNews = new EconomicNews("Fed raises interest rate by a half percentage.");
        News polNews = new PoliticalNews("Chatchart wins the election.");

        blognone.publish(techNews);
        brandInside.publish(ecoNews);
        prachatai.publish(ecoNews);
        prachatai.publish(polNews);
    }
}
