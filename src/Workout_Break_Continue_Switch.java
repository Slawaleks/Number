import java.util.Scanner;

public class Workout_Break_Continue_Switch {
    public static void main(String[] args) {
        int[][] number = {{1},
                {5, 6, 7, 8},
                {2, 3, -5,},
                {45, 5, 76}};
        int sum = 0;
        String res = " ";
        for (int i = 0; i < number.length; i++) {
            for (int p = 0; p < number[i].length; p++) {
                if (number[i][p] % 2 == 0) {
                    sum= sum+ number[i][p];
                    res = res + number[i][p] + " + ";
                }
            }
        }
        res = res.substring(0, res.length() - 3);
        System.out.println(res + " = " + sum);
    }
}


