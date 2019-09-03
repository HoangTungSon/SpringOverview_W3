package dataConvert;

import rate.Currency;
import rate.RateConverted;

import java.util.ArrayList;
import java.util.List;

public class CurrencyData {
    private static List<Currency> currencies;

    static {
        currencies = new ArrayList<>();

        Currency c1 = new Currency();
        c1.setFirstCurrency("VND");
        c1.setSecondCurrency("USD");
        c1.setRate(1/220000.0);
        currencies.add(c1);

        Currency c2 = new Currency();
        c2.setFirstCurrency("USD");
        c2.setSecondCurrency("VND");
        c2.setRate(220000.0);
        currencies.add(c2);

        Currency c3 = new Currency();
        c3.setFirstCurrency("VND");
        c3.setSecondCurrency("EUR");
        c1.setRate(1/300000.0);
        currencies.add(c3);

        Currency c4 = new Currency();
        c4.setFirstCurrency("EUR");
        c4.setSecondCurrency("VND");
        c4.setRate(300000.0);
        currencies.add(c4);

    }

    public static Currency checkCurrency(RateConverted rate) {
        for (Currency c : currencies) {
            if (c.getFirstCurrency().equals(rate.getFirstCurrency())&& c.getSecondCurrency().equals(rate.getSecondCurrency())) {
                rate.setRate(c.getRate());
                rate.setSecondCurrencyValue(rate.getFirstCurrencyValue()*rate.getRate());
                c.setFirstCurrencyValue(rate.getFirstCurrencyValue());
                c.setSecondCurrencyValue(rate.getSecondCurrencyValue());
                currencies.add(c);
                return c;
            }
        }
        return null;
    }
}
