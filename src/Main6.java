import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 0;
        arr[3] = 10;
        int i = 0;
        int count = 0;
        while (i < arr.length) {
            if (arr[i] == 10) {
                count++;
                i++;
            }
            else {
                i++;
            }
        }
        System.out.println("Количество десяток в массиве: " + count);
    }
}
