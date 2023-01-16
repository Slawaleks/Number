public class Main5 {
    public static void main(String[] args) throws InterruptedException {
//        int[] arr = {0, 0, 0};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 10) {
//                System.out.println("Есть число 10");
//                break;
//            }
//        }
//
//        System.out.println(checkNumberExist(new int[]{5, 1, 10}, 10));
//        Thread.sleep(1000);
//        System.out.println(checkNumberExist(new int[]{5, 1, 10}, 7));
//        Thread.sleep(1000);
//        System.out.println(checkNumberExist(new int[]{5, 1, 10, 0, -5}, -5));
//        Thread.sleep(1000);
//        System.out.println(checkNumberExist(new int[]{5, 1, 10}, 1));
//        Thread.sleep(1000);
//        System.out.println(checkNumberExist(new int[]{5, 1, 10}, 30));

        System.out.println(howManyNumbersInArray(new int[]{10, 5, 10, 10}, 10));
    }


   // public static boolean checkNumberExist(int[] arr, int number) {
     //   for (int i = 0; i < arr.length; i++) {
       //     if (arr[i] == number) {
          //      return true;
           // }
       // }
       // return false;
   // }

    public static int howManyNumbersInArray(int[] arr, int number) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                sum=sum+1;
            }

        }
        return sum;
    }
}