/**
 * This is a preview in Java 14
 * For executing with Java 14 use the below command
 * javac --enable-preview -source 14 ${your directory path}/Records.java
 * <p>
 * Short Introduction
 * <p>
 * A record is a data class that stores pure data.
 * The idea behind introducing records is to quickly create simple and concise classes devoid of boilerplate code.
 * <p>
 * Normally a class in Java would require you to implement equals(), hashCode(), the getters and setters methods.
 * While some IDEs support auto-generation of such classes, the code is still verbose.
 * With a record you need to simply define a class in the following way.
 * <p>
 * The additional constructor defined inside the record is called a Compact constructor.
 * It doesn’t consist of any parameters and is just an extension of the canonical constructor.
 * <p>
 * A compact constructor wouldn’t be generated as a separate constructor by the compiler.
 * Instead, it is used for validation cases and would be invoked at the start of the main constructor.
 * <p>
 * Few important things to note about Records:
 * <p>
 * 1. A record can neither extend a class nor it can be extended by another class. It’s a final class.
 * 2. Records cannot be abstract
 * 3. Records cannot extend any other class and cannot define instance fields inside the body. Instance fields must be defined in the state description only
 * 4. Declared fields are private and final
 * 5. The body of a record allows static fields and methods
 * 6. Records do generate public accessor methods for the fields defined in the state description, they also allow you to redefine the accessor methods in the body.
 * 7. Records provide us with isRecord() and getRecordComponents() to check if the class is a record and also look into its fields and types.
 */

public class Records {

    public static void main(String[] args) {
        VehicleRecord vehicleRecord = new VehicleRecord("XYZ", "Test");
        vehicleRecord.followers = 10;
        System.out.println(vehicleRecord.code());
        System.out.println(vehicleRecord.engineType());
        System.out.println(vehicleRecord.followerCount());
        System.out.println("vehicleRecord is a record ? " + vehicleRecord.getClass().isRecord());
        var recoredComponents = vehicleRecord.getClass().getRecordComponents();
        for (int i = 0; i < recoredComponents.length; i++) {
            System.out.println(String.format("components of vehicleRecord %s is %s", i, recoredComponents[i]));
        }
        VehicleRecord vehicleRecord2 = new VehicleRecord("", "Test");
    }
}

record VehicleRecord(String code, String engineType) {
    static int followers;

    public static String followerCount() {
        return "Followers are " + followers;
    }

    public String code() {
        return "Code is " + code;
    }

    public VehicleRecord {
        if (code.equals("")) {
            throw new IllegalArgumentException("A valid code is expected");
        }
    }
}