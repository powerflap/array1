import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание № 1 ");
        // Первый массив
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        // Второй массив
        double[] secondArray = {1.57, 7.654, 9.986};
        // Третий массив
        int[] thirthArray = new int[4];

        System.out.println("Задание № 2 ");
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(thirthArray));


        System.out.println("Задание № 3 ");

        int[] first1Array = {1, 2, 3};
        for (int i = first1Array.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(first1Array[i] + " ,");
            } else {
                System.out.print(first1Array[i]);
            }
        }
        System.out.println();
        double[] second2Array = {1.57, 7.654, 9.986};
        for (int i = second2Array.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(second2Array[i] + " ,");
            } else {
                System.out.print(second2Array[i]);
            }
        }
        System.out.println();
        int[] thirth3Array = new int[4];
        for (int i = thirth3Array.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(thirth3Array[i] + " ,");
            } else {
                System.out.print(thirth3Array[i]);
            }
        }
        System.out.println();
        System.out.println("Задание № 4 ");

        for (int d = 0; d < firstArray.length; d++) {
            if (firstArray[d] % 2 != 0) {
                firstArray[d] = firstArray[d] + 1;
            }
            System.out.println(Arrays.toString(firstArray));
        }
    }
}