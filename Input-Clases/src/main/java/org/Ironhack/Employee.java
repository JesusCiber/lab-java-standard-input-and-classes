package org.Ironhack;

public class Employee {
    private String name;
    private String email;
    private int age;
    private int Salary;

    public Employee(String name, String email, int age, int salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Age: " + age + ", Salary: " + Salary;
    }
}
