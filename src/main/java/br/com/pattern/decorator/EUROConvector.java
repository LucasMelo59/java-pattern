package br.com.pattern.decorator;

import java.math.BigDecimal;

public class EUROConvector implements CurrencyConvector {

    private final BigDecimal cotation = BigDecimal.valueOf(0.7);

    @Override
    public BigDecimal convert(BigDecimal amount) {
        return amount.multiply(cotation.multiply(BigDecimal.valueOf(1.5)));
    }
}
