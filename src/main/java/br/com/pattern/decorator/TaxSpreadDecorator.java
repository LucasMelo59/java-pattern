package br.com.pattern.decorator;

import java.math.BigDecimal;

public class TaxSpreadDecorator implements CurrencyConvector{

    private final CurrencyConvector convector;
    private final BigDecimal spread;

    public TaxSpreadDecorator(CurrencyConvector convector, BigDecimal spread) {
        this.convector = convector;
        this.spread = spread;
    }

    @Override
    public BigDecimal convert(BigDecimal amount) {
        return calculateAmountWithTax(convector.convert(amount));
    }

    private BigDecimal calculateAmountWithTax(BigDecimal amount) {
        return amount.add(amount.multiply(spread));
    }
}
