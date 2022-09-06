package org.example;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee implements IManager{

    // A Manager has numberOfEmployeesSupervised attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager
    private List<Employee> employees = new ArrayList<Employee>();

    public Manager(int id, String firstName, String lastName, int age, double salary, String department, List<Employee> employees) {
        super(id, firstName, lastName, age, salary, department);
        this.employees = (ArrayList<Employee>) employees;
    }

    public Manager(int id, String firstName, String lastName, int age, double salary, String department){
        super(id, firstName, lastName, age, salary, department);

    }

    @Override
    public void increaseSalary(Employee employee, double increment) {
        double newSalary = employee.getSalary() + increment;
        employee.setSalary(newSalary);
        System.out.println(employee.getFirstName() + "'s salary is increased" +
                increment +  ". New Salary : " + employee.getSalary());
    }

    @Override
    public void hireEmployee(Employee  employee) {
        employees.add(employee);
        System.out.println(employee.getFirstName() + " is hired!");
    }

    @Override
    public void fireEmployee(Employee employee) {
        System.out.println(employee.getFirstName() + " is fired");
        employees.removeIf(emp -> emp.getId() == employee.getId());
    }

    public void getNumberOfEmployeesSupervised() {
        System.out.println(this.getFirstName() + " has " + this.employees.size() +
                " employees."
        );
    }

    public void getEmployees() {
        String print = " ";
        if (employees.size() == 0) {
            print = " ";
        } else {
                for (Employee emp : employees) {
                    print += "\r\n" + emp.getFirstName() + " " + emp.getLastName() ;
                }
        }
            System.out.println(this.getFirstName() + " " + this.getLastName() + "'s employees : " + print);
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = (ArrayList<Employee>) employees;
    }
}




