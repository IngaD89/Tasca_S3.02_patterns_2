package org.example.nivell2.observer;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private String news;
    private List<Brokerage> brokerageObservers = new ArrayList<>();

    public void addObserver(Brokerage brokerage) {
        this.brokerageObservers.add(brokerage);
    }

    public void setNews(String news){
        this.news = news;
        for (Brokerage brokerage : brokerageObservers){
            brokerage.update(this.news);
        }
    }
}
