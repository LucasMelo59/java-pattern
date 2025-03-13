package br.com.pattern.decorator;

import java.math.BigDecimal;

public interface CurrencyConvector {

    BigDecimal convert(BigDecimal amount);

}
