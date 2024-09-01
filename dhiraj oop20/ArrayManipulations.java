import java.util.Arrays;
import java.util.Locale;

public class ArrayManipulations {
    public static void main(String[] args) {
        double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
        Arrays.sort(doubleArray);
        System.out.printf(Locale.US, "%n doubleArray: ");
        for(double value : doubleArray){
            System.out.printf(Locale.US, " %.1f ", value);
        }
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(" filledIntArray", filledIntArray);
        int[] intArray = {1,2,3,4,5,6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray("intArray", intArray);
        displayArray("intArrayCopy", intArrayCopy);
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n", (b ? "== " : "!="));
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray%n",  (b ? "==" : "!="));
        int location1 = Arrays.binarySearch(intArray, 5);
        if(location1 >= 0){
            System.out.printf("Found 5 at element in intArrray %n", location1);
        } else {
            System.out.printf("Not found");
        }
        int location2 = Arrays.binarySearch(intArray, 8763);
        if(location2 >= 0){
            System.out.printf("Found 5 at element in intArrray %n", location2);
        } else {
            System.out.printf("Not found");
        }
    }
    public static void displayArray(String description, int[] array) {
        System.out.printf("%s%n", description);
        for(int value : array) {
            System.out.printf("%d ", value);
        }
    }
}
