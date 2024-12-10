package org.example.nivell2.observer;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();
        BrokerageNews brokerageNews = new BrokerageNews();

        broker.addObserver(brokerageNews);
        broker.setNews("Subida de bolsa");

        System.out.println("La noticia actualizada es: " + brokerageNews.getNews());
    }
}
