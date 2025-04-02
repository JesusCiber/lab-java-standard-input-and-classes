package org.Ironhack;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "alice@kkkk.com", 30, 50000));
        employees.add(new Employee("Bob", "bob@kkkk.com", 25, 45000));
        employees.add(new Employee("Carlos", "carlos@kkkk.com", 28, 48000));
        employees.add(new Employee("David", "david@kkkk.com", 35, 55000));
        employees.add(new Employee("Eva", "eva@kkkk.com", 22, 40000));
        employees.add(new Employee("jesus", "jesus@kkkk.com", 27, 47000));
        employees.add(new Employee("hugo", "hugo@kkkk.com", 32, 51000));

        //Actualizar salario
        employees.add(new Intern("lola", "lola@kkkk.com", 20, 18000));
        employees.add(new Intern("juan", "juan@kkkk.com", 19, 22000)); // Excede el Limite

        try (PrintWriter pw = new PrintWriter(new FileWriter("employees.txt"))) {
            for (Employee emp : employees) {
                pw.println(emp);
            }
            System.out.println("Employees written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}