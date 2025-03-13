package br.com.pattern.factory.bsinessFactory;

import br.com.pattern.strategy.InterfaceStrategy.PaymentStrategy;
import br.com.pattern.strategy.businessStrategy.CreditCardPayment;
import br.com.pattern.strategy.businessStrategy.PayPalPayment;

public class PaymentFactory {

    public static PaymentStrategy createPayment(String type, String identifier, String name) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment(identifier, name);
            case "paypal":
                return new PayPalPayment(identifier);
            default:
                throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + type);
        }
    }
}
