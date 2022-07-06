package comparation.lesson_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee(3, "Spider-man", "Parker", 1_000);
        Employee emp2 = new Employee(4, "Zorro", "Rodrigo", 200);
        Employee emp3 = new Employee(1, "Batman", "Wayne", 80_000_000);
        Employee emp4 = new Employee(2, "Dr. Evil", "Genius", 1_000_000);
        Employee emp5 = new Employee(777, "Minion", "Second", 1);
        Employee emp6 = new Employee(666, "Minion", "First", 1);

        List<Employee> empList = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6));

        System.out.println("Before compare by ID:");
        System.out.println(empList);

        System.out.println("After compare by ID:");
        Collections.sort(empList);
        System.out.println(empList);

        System.out.println("After compare by Name");
        Collections.sort(empList, new NameComparator());
        System.out.println(empList);

        System.out.println("After compare by Salary:");
        Collections.sort(empList, new SalaryComparator());
        System.out.println(empList);
    }
}


/*
Before compare by ID:
[Employee{id=3, name='Spider-man', surname='Parker', salary=1000},
Employee{id=4, name='Zorro', surname='Rodrigo', salary=200},
Employee{id=1, name='Batman', surname='Wayne', salary=80000000},
Employee{id=2, name='Dr. Evil', surname='Genius', salary=1000000},
Employee{id=777, name='Minion', surname='Second', salary=1},
Employee{id=666, name='Minion', surname='First', salary=1}]

After compare by ID (with implements Comparable<Employee>):
[Employee{id=1, name='Batman', surname='Wayne', salary=80000000},
Employee{id=2, name='Dr. Evil', surname='Genius', salary=1000000},
Employee{id=3, name='Spider-man', surname='Parker', salary=1000},
Employee{id=4, name='Zorro', surname='Rodrigo', salary=200},с
Employee{id=666, name='Minion', surname='First', salary=1},
Employee{id=777, name='Minion', surname='Second', salary=1}]

After compare by Name (with implements Comparator<Employee> in NameComparator class):
[Employee{id=1, name='Batman', surname='Wayne', salary=80000000},
Employee{id=2, name='Dr. Evil', surname='Genius', salary=1000000},
Employee{id=666, name='Minion', surname='First', salary=1},
Employee{id=777, name='Minion', surname='Second', salary=1},
Employee{id=3, name='Spider-man', surname='Parker', salary=1000},
Employee{id=4, name='Zorro', surname='Rodrigo', salary=200}]

After compare by Salary (with implements Comparator<Employee> in SalaryComparator class):
[Employee{id=666, name='Minion', surname='First', salary=1},
Employee{id=777, name='Minion', surname='Second', salary=1},
Employee{id=4, name='Zorro', surname='Rodrigo', salary=200},
Employee{id=3, name='Spider-man', surname='Parker', salary=1000},
Employee{id=2, name='Dr. Evil', surname='Genius', salary=1000000},
Employee{id=1, name='Batman', surname='Wayne', salary=80000000}]
 */
