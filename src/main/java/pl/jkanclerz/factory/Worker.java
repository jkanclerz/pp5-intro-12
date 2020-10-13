package pl.jkanclerz.factory;

import java.util.UUID;

class Worker {
    private final String name;

    Worker(String name, int performance, boolean vip) {
        this.name = name;
    }

    public Product doWork() {
        return new Product(UUID.randomUUID());
    }
}
