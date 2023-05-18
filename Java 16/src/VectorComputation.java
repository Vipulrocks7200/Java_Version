/**
 * Explaination of this example ->
 * The first thing we do in the vector-based code is to create two IntVectors from our input arrays using the static factory method of this class fromArray.
 * The first parameter is the size of the vector, followed by the array and the offset (here set to 0).
 * The most important thing here is the size of the vector that we're getting to 128 bits.
 * In Java, each int takes 4 bytes to hold.
 *
 * Since we have an input array of 4 ints, it takes 128 bits to store.
 * Our single Vector can store the whole array.
 *
 * On certain architectures, the compiler will be able to optimize the byte code to reduce the computation from 4 to only 1 cycle.
 * These optimizations benefit areas such as machine learning and cryptography.
 */

/*import jdk.incubator.vector.IntVector;

public class VectorComputation {
    public static void main(String[] args) {
        //Traditional way
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};

        var c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
        }
        //Vector way

        var x = new int[a.length];
        var vectorA = IntVector.fromArray(IntVector.SPECIES_128, a, 0);
        var vectorB = IntVector.fromArray(IntVector.SPECIES_128, b, 0);
        var vectorC = vectorA.mul(vectorB);
        vectorC.intoArray(x, 0);
    }
}*/
