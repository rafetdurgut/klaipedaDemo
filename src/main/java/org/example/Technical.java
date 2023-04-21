package org.example;


import lombok.NonNull;

public class Technical extends Person implements Payable {
    private float salary;
    public Technical(@NonNull String name, @NonNull int ID, @NonNull String contactNumber) {
        super(name, ID, contactNumber);
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Professor{" +
                "name='" + this.name + '\'' +
                '}';
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public double totalTax() {
        System.out.println("The total amount of tax:");
        return 0;
    }
}
