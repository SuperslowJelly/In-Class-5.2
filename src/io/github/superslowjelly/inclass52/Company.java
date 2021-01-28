package io.github.superslowjelly.inclass52;

public class Company {

    public Company(String name, Employee[] employees) {
        this.EMPLOYEES = employees;
        this.NAME = name;
    }

    private final Employee[] EMPLOYEES;

    private final String NAME;

    public Employee[] getEmployees() {
        return this.EMPLOYEES;
    }

    public String getName() {
        return this.NAME;
    }

    public int getNumberOfEmployees() {
        return this.EMPLOYEES.length;
    }

}
