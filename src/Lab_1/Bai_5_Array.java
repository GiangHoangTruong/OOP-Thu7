package Lab_1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_5_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua day: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Nhap vao cac phan tu cua day: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        System.out.println("Tong cua cac phan tu trong day = " + sum);
        int avg = sum / N;
        System.out.println("Gia tri trung binh cua day = " + avg);


    }
}
