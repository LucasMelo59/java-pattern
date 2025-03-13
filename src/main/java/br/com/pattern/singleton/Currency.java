package br.com.pattern.singleton;

import br.com.pattern.decorator.CurrencyConvector;
import br.com.pattern.decorator.TaxSpreadDecorator;
import br.com.pattern.decorator.EUROConvector;
import br.com.pattern.decorator.USDConvector;

public enum Currency {

    USD("usd", new USDConvector()),
    EURO("euro", new EUROConvector());


    private final String descricao;

    private final CurrencyConvector convector;
    private


    Currency(String descricao, CurrencyConvector convector) {
        this.descricao = descricao;
        this.convector = convector;
    }

    public String getDescricao() {
        return descricao;
    }

    public CurrencyConvector getConvector() {
        return convector;
    }

}
