import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 2;
        arr[3] = 10;
        int i = 0;
        int sum = 0;

        while (true) {
            if (arr[i] != 10) {
                if (i == 3) break;
                i++;
            }
            if (arr[i] == 10) {
                sum = sum + 1;
                if (i == 3) break;
                i++;
            }

        }
        System.out.println("Количество десяток в массиве: " + sum);

    }
}
