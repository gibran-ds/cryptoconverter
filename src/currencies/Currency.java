package currencies;

public abstract class Currency {
    private float amount;
    private String symbol;

    public Currency(float amount, String symbol) {
        this.amount = amount;
        this.symbol = symbol;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
