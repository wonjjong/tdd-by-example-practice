public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
