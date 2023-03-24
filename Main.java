import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i=0; i < size; i++) {
            System.out.printf("Введите %d эллимент массива: ", i);
            arr[i] = input.nextInt();
            System.out.println();
        }
        System.out.println("Введенный массив: "+ Arrays.toString(arr));

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {//больший элемент перемещается в конец, size -i-1 что бы избежать уже отсортированне числа
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив: "+ Arrays.toString(arr));
    }
}
