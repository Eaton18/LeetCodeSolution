package utilities.array;

/**
 * Created by eaton on 12/29/2017.
 */
public class ArrayOps {

    public static void printArray(String arrName, int[] a) {
        System.out.print(arrName);
        for (int i : a) System.out.print(i + " ");
        System.out.println();
    }

}
