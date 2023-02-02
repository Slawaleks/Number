public class Workout_Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Это четные числа: " + i);
        }
    }
}