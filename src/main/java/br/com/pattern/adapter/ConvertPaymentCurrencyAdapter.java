package br.com.pattern.adapter;

import br.com.pattern.decorator.TaxSpreadDecorator;
import br.com.pattern.singleton.Currency;
import br.com.pattern.strategy.businessStrategy.PayPalPayment;

import java.math.BigDecimal;

public class ConvertPaymentCurrencyAdapter extends PayPalPayment {

    public ConvertPaymentCurrencyAdapter(String email) {
        super(email);
    }

    @Override
    public void pay(double amount) {
        super.pay(amount);
    }

    public void paymentAdapter(Currency type, BigDecimal amountBRL) {
        BigDecimal convertValue = new TaxSpreadDecorator(type.getConvector(), BigDecimal.valueOf(1.5)).convert(amountBRL);
        pay(convertValue.doubleValue());
        System.out.println("Pagamento Realizado");
        System.out.println(convertValue);
    }
}
