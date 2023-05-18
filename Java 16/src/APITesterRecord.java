/**
 * This is now a permanent feature in Java 16.
 */
public class APITesterRecord {
   public static void main(String[] args) {
      StudentRecord student = new StudentRecord (1, "Julie", "Red", "VI", 12);
      System.out.println(student.id());
      System.out.println(student.name());
      System.out.println(student);
   } 
}
record StudentRecord(int id, 
   String name, 
   String section, 
   String className,
   int age){}