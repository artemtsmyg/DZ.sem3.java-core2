package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Freelancer(10));
        employees.add(new Worker(2000));
        employees.add(new Freelancer(15));
        employees.add(new Worker(2500));

        // Создаем уникальный компаратор для сортировки по возрастанию заработной платы
        Comparator<Employee> salaryComparator = new Comparator<Employee>() {
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp1.calculateMonthlySalary(), emp2.calculateMonthlySalary());
            }
        };

        Collections.sort(employees, salaryComparator);

        // Класс для хранения и вывода данных сотрудников
        class EmployeeList implements Iterable<Employee> {
            private List<Employee> employeeList;

            public EmployeeList(List<Employee> employeeList) {
                this.employeeList = employeeList;
            }

            public void forEachEmployee() {
                for(Employee employee : employeeList) {
                    System.out.println(employee.calculateMonthlySalary());
                }
            }

            @Override
            public java.util.Iterator<Employee> iterator() {
                return employeeList.iterator();
            }
        }

        EmployeeList employeeList = new EmployeeList(employees);
        employeeList.forEachEmployee();
    }
}