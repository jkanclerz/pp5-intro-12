package pl.jkanclerz;

import pl.jkanclerz.factory.Employee;
import pl.jkanclerz.factory.FactoryConfiguration;
import pl.jkanclerz.factory.Product;

public final class App {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Employee employee = FactoryConfiguration.getResponsibleEmployee();

        Product p1 = employee.doWork();
        Product p2 = employee.doWork();
        Product p3 = employee.doWork();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
