package org.example.nivell3.callback;

import java.util.Optional;

public abstract class Payment {
    
    final void executeWith(PaymentGateway paymentGateway) {
        execute();
        Optional.ofNullable(paymentGateway).ifPresent(PaymentGateway::callback);
    }

    public abstract void execute();
}
