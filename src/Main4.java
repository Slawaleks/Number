public class Main4 {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {10, 10, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                sum = sum + 1;
            }

        }
        System.out.println("Есть число 10");
        System.out.println("Всего числел 10: " + sum);
    }

}



