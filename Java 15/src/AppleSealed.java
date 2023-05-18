/**
* Sealed classes are a preview in Java 15
* Sealed classes have been there in Kotlin since a while and Java 15 finally introduces this feature for better control over inheritance.
*As the name suggests, Sealed classes let you restrict or permit class hierarchies to only certain types.
*
*This is incredibly useful for pattern matching as you have a specific number of classes to switch between.
*For executing with Java 15 use the below command
 * javac --enable-preview -source 15 ${your directory path}/Records.java
 *
 */
public non-sealed class AppleSealed extends FruitSealed {
}
