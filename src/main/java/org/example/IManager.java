package org.example;

public interface IManager {
    void increaseSalary(Employee employee, double increment);
    void hireEmployee(Employee employee);
    void fireEmployee(Employee employee);

    void getNumberOfEmployeesSupervised();

    // A Manager can increaseSalary, hireEmployee, fireEmployee, and getNumberOfEmployeesSupervised
    // Please implement these methods
}
