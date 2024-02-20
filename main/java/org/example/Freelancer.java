package org.example;

/**
 * Потомок класса Employee - Freelancer
 */
class Freelancer extends Employee {
    private double hourlyRate;

    public Freelancer(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }
}