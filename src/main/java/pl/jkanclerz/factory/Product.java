package pl.jkanclerz.factory;

import java.util.UUID;

public class Product {
    private final UUID productId;

    public Product(UUID productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product with id " + productId.toString();
    }
}
