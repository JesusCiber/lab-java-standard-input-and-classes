package org.Ironhack;

class Intern extends Employee {
    private static final int MAX_SALARY = 20000;

    public Intern(String name, String email, int age, int salary) {
        super(name, email, age, Math.min(salary, MAX_SALARY));
        if (salary > MAX_SALARY) {
            System.out.println("The Salary of " + name + " exceeds the limit for Interns. Setting to " + MAX_SALARY);
        }
    }
}