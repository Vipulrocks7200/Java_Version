/**
 * This is now a standard feature.
 */
public class APITesterPatternMatching {
    public static void main(String[] args) {
        PersonTest manager = new ManagerTest(23, "Robert");
        manager.name = "Robert";
        System.out.println(getId(manager));
    }

    public static int getId(PersonTest person) {
        if (person instanceof Test e) {
            return e.getEmployeeId();
        } else if (person instanceof ManagerTest m) {
            return m.getManagerId();
        }
        return -1;
    }
}

abstract class PersonTest {
    String name;

    String getName() {
        return name;
    }
}

final class Test extends PersonTest {
    String name;
    int id;

    Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getEmployeeId() {
        return id;
    }
}

final class ManagerTest extends PersonTest {
    int id;

    ManagerTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getManagerId() {
        return id;
    }
}