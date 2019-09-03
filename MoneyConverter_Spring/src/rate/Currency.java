package rate;

public class Currency {
    private String firstCurrency;
    private String secondCurrency;
    private Double Rate;
    private Double firstCurrencyValue;
    private Double secondCurrencyValue;

    public Double getFirstCurrencyValue() {
        return firstCurrencyValue;
    }

    public void setFirstCurrencyValue(Double firstCurrencyValue) {
        this.firstCurrencyValue = firstCurrencyValue;
    }

    public Double getSecondCurrencyValue() {
        return secondCurrencyValue;
    }

    public void setSecondCurrencyValue(Double secondCurrencyValue) {
        this.secondCurrencyValue = secondCurrencyValue;
    }



    public Double getRate() {
        return Rate;
    }

    public void setRate(Double rate) {
        this.Rate = rate;
    }

    public String getFirstCurrency() {
        return firstCurrency;
    }

    public void setFirstCurrency(String firstCurrency) {
        this.firstCurrency = firstCurrency;
    }

    public String getSecondCurrency() {
        return secondCurrency;
    }

    public void setSecondCurrency(String secondCurrency) {
        this.secondCurrency = secondCurrency;
    }
}
