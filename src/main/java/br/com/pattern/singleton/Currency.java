package br.com.pattern.singleton;

import br.com.pattern.decorator.CurrencyConvectorBRL;
import br.com.pattern.decorator.EUROConvector;
import br.com.pattern.decorator.USDConvector;

public enum Currency {

    USD("usd", new USDConvector()),
    EURO("euro", new EUROConvector());


    private String descricao;

    private CurrencyConvectorBRL convector;
    private


    Currency(String descricao, CurrencyConvectorBRL convector) {
        this.descricao = descricao;
        this.convector = convector;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CurrencyConvectorBRL getConvector() {
        return convector;
    }

    public void setConvector(CurrencyConvectorBRL convector) {
        this.convector = convector;
    }
}
