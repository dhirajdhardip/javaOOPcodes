public class EnhanceForTest {
    public static void main(String[] args){
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;
        for(int value : array){
            total += value;
            System.out.printf("Total of array element: %d%n", total);
        }
    }
}
