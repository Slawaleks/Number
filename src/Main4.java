public class Main4 {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {

                sum = sum + 1;
            }
        }
        if(sum>0){
            System.out.println("Есть число 10");
        }

        System.out.println("Всего числел 10: " + sum);
    }

}



