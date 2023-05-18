/**
 * Now, with Java 15, Records get their second preview.
 * While there aren’t any major changes(just some minor additions), still there are a few major clarifications and restrictions that we should know:
 *
 * 1. Prior to Java 15, one could declare native methods in records(though it wasn’t a good idea).
 * Now the JEP explicitly prohibits against declaring native methods in records.
 * Understandably, defining a native method steals away the USP of records by bringing an external state dependency.
 * The implicitly declared fields corresponding to the record components of a record class are final and should not be modified via reflection now as it will throw IllegalAccessException.
 *
 * 2. Records can now implement sealed interfaces.
 */

sealed interface Fruit permits RecordWithSealedInterface {

}

public record RecordWithSealedInterface(String name) implements Fruit {

}