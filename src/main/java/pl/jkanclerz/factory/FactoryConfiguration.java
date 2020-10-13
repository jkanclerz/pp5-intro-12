package pl.jkanclerz.factory;

public final class FactoryConfiguration {
    public static Employee getResponsibleEmployee() {
        return new Boss(new Worker("bob", 10, true));
    }
}
