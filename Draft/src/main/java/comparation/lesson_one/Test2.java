package comparation.lesson_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        Employee emp1 = new Employee(3, "Spider-man", "Parker", 1_000);
        Employee emp2 = new Employee(4, "Zorro", "Rodrigo", 200);
        Employee emp3 = new Employee(1, "Batman", "Wayne", 80_000_000);
        Employee emp4 = new Employee(2, "Dr. Evil", "Genius", 1_000_000);
        Employee emp5 = new Employee(777, "Minion", "Second", 1);
        Employee emp6 = new Employee(666, "Minion", "First", 1);

        List<Employee> employees = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6));

        System.out.println("Before:");
        System.out.println(employees);

        Collections.sort(employees);

        System.out.println("After:");
        System.out.println(employees);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        // 1ый способ
//        if (this.id == anotherEmp.id) {
//            return 0;
//        } else if (this.id > anotherEmp.id) {
//            return 1;
//        } else {
//            return -1;
//        }

        // 2ой способ
//        return this.id - anotherEmp.id;

        // 3ий способ, через name String
//        return this.name.compareTo(anotherEmp.name)

        // 4ый способ. По имени и фамилии:
        int result = this.name.compareTo(anotherEmp.name);
        if (result == 0) {
            result = this.surname.compareTo(anotherEmp.surname);
        }
        return result;
    }
}
