package br.com.pattern.decorator;

import java.math.BigDecimal;

public interface CurrencyConvectorBRL {

    BigDecimal convert(BigDecimal amount);

}
