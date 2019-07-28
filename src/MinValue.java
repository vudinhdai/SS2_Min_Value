import java.util.Scanner;

public class MinValue {
    private static int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = {4, 12, 7, 8, 0, 1, 6, 9};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }

}
