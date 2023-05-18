/*
Records are immutable data classes that require only the type and name of fields.
This was Introduced in Java 14.
 */
public record VehicleRecord(String code, String engineType) {
}
