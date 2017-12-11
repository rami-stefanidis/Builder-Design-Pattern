package com.rami.vo;

/**
 * Created by ramistefanidis on 12/11/17.
 */
public class InvestmentVO {

    private final String name;
    private final InvestmentType investmentType;
    private final double price;
    private final String stockExchange;
    private final String ticker;
    private final String currency;

    public static class Builder {
        //default Values
        private String name = "";
        private InvestmentType investmentType = InvestmentType.STOCK;
        private double price = 0;
        private String stockExchange = "";
        private String ticker = "";
        private String currency = "";

        public Builder name(final String name) {
            this.name =name;
            return this;
        }

        public Builder price(final double price) {
            this.price = price;
            return this;
        }

        public Builder InvestmentType(final InvestmentType investmentType) {
            this.investmentType = investmentType;
            return this;
        }

        public Builder stockExchange(final String stockExchange) {
            this.stockExchange = stockExchange;
            return this;
        }

        public Builder ticker(final String ticker) {
            this.ticker = ticker;
            return this;
        }

        public Builder currency(final String currency) {
            this.currency = currency;
            return this;
        }

        public InvestmentVO build() {
            return new InvestmentVO(this);
        }

    }

    private InvestmentVO(final Builder builder) {
        this.name = builder.name;
        this.investmentType = builder.investmentType;
        this.price=builder.price;
        this.stockExchange=builder.stockExchange;
        this.ticker=builder.ticker;
        this.currency=builder.currency;
    }

    @Override
    public String toString() {
        return "InvestmentVO{" +
                "name='" + name + '\'' +
                ", investmentType=" + investmentType +
                ", price=" + price +
                ", stockExchange='" + stockExchange + '\'' +
                ", ticker='" + ticker + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
