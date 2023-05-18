/**
 * This is a preview feature.
 * For executing with Java 12 use the below command
 * javac --enable-preview -source 12 ${your directory path}/PatternMatching.java
 **/

public class PatternMatching {
    public static void main(String[] args) {
        Person manager = new Manager(23, "Robert");
        manager.name = "Robert";
        System.out.println(getId(manager));
    }

    public static int getId(Person person) {
        if (person instanceof Employee) {
            Employee e = (Employee) person;
            return e.getEmployeeId();
        } else if (person instanceof Manager m) {
            return m.getManagerId();
        }
        return -1;
    }
}

abstract class Person {
    String name;

    String getName() {
        return name;
    }
}

final class Employee extends Person {
    String name;
    int id;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getEmployeeId() {
        return id;
    }
}

final class Manager extends Person {
    int id;

    Manager(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getManagerId() {
        return id;
    }
}
