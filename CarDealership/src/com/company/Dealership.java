package com.company;

public class Dealership {

    public static void main(String[] args) {

        Customer cust1 = new Customer("Tom", "Test", 20000 );

        Vehicle vehicle = new Vehicle("Honda", "Accord", 50000);

        Employee employee = new Employee();

        cust1.purchaseCar(vehicle, employee, false);

    }
}
