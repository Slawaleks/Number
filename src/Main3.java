public class Main3 {
    ////создай метод в этом же классе Main, который принимает массив интов, в ответе дает !!количество!! нечетных чисел в этом массиве
    public static void main(String[] args) {
        int[] nums1 = new int[]{-2, 5, -7, 16, -9, 77, -16};
        int nums2 = 0;
        for (int b = 0; b < nums1.length; b++) {
            if (nums1[b]%2 != 0) nums2++;
        }
        System.out.println("Количество нечетных чисел в этом массиве: " + nums2);

        int nums3 = 0;
        for (int b = 0; b < nums1.length; b++) {
            if (nums1[b]%2 == 0) nums3++;
        }
        System.out.println("Количество четных чисел в этом массиве: " + nums3);
        int nums4 = 0;
        for (int b = 0; b < nums1.length; b++) {
            if (nums1[b]%2 != 0) nums4++; if (nums1[b] < 0) nums4++;}
            System.out.println("Количество отрицательных и нечетных чисел в этом массиве: " + nums4);
        int c = nums3+nums2;
        System.out.println("Общее количество чисел: " + c);



    }
}
