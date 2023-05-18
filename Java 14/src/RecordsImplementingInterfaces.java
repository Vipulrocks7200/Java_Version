/**
 * This is a preview in Java 14
 * For executing with Java 12 use the below command
 * javac --enable-preview -source 14 ${your directory path}/RecordsImplementingInterfaces.java
 */
public class RecordsImplementingInterfaces {

    public static void main(String[] args) {
        Information author = new Author("Test", "Test");
        System.out.println(author.getFullName());
    }

}
record Author(String name, String topic) implements Information {
    public String getFullName() {
        return "Author "+ name + " writes on " + topic;
    }
}

interface Information {
    String getFullName();
}