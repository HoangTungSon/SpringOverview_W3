package rate;

public class RateConverted {

    private String firstCurrency;
    private String secondCurrency;
    private Double firstCurrencyValue;
    private Double rate;
    private Double secondCurrencyValue;


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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

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
}
