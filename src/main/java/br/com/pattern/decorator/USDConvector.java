package br.com.pattern.decorator;

import java.math.BigDecimal;

public class USDConvector implements CurrencyConvector {

    private final BigDecimal cotation = BigDecimal.valueOf(0.5);

    @Override
    public BigDecimal convert(BigDecimal amount) {
        return amount.multiply(cotation);
    }
}
