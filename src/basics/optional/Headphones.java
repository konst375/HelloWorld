package basics.optional;

import java.util.Optional;

public class Headphones {
    private Double price;

    public Headphones(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean priceIsRange1() {
        boolean isRange = false;

        if (this == null)
            throw new NullPointerException();

        if (this.price != null && (this.price >= 10 && this.price <= 15))
            isRange = true;

        return isRange;
    }

    public boolean priceIsRange2() {
        return Optional.ofNullable(this)
                .map(Headphones::getPrice)
                .filter(p -> p >= 10)
                .filter(p -> p <= 15)
                .isPresent();
    }
}
