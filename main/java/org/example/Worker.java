package org.example;

/**
 * Потомок класса Employee - Worker
 */
class Worker extends Employee {
    private double fixedSalary;

    public Worker(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return fixedSalary;
    }
}