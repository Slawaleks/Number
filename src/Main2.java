public class Main2 {
    public static void main(String[] args) {
        //создай метод в этом же классе Main, который принимает массив интов, в ответе дает !!количество!! нечетных чисел в этом массиве

        int[] nums1 = new int[]{-2, 5, -7, 16, -9};

        int nums2 = 0;
        for (int b = 0; b < nums1.length; b++) {
            if (nums1[b] < 0) nums2++;
        }
        System.out.println("Количество отрицательных чисел в этом массиве: " + nums2);
        nums2 = 0;
        for (int b = 0; b < nums1.length; b++) {
            if (nums1[b] < 0) nums2++;


        }
    }
}
