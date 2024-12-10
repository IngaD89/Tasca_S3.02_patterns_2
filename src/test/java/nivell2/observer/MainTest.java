package nivell2.observer;

import org.example.nivell2.observer.Broker;
import org.example.nivell2.observer.BrokerageNews;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testObserver(){

        Broker broker = new Broker();
        BrokerageNews brokerageNews = new BrokerageNews();

        broker.addObserver(brokerageNews);
        broker.setNews("Subida de bolsa");

        assertEquals("Subida de bolsa", brokerageNews.getNews());
    }
}
