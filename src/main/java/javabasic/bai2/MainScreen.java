package javabasic.bai2;

import java.util.Scanner;

public class MainScreen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên N: ");
		int N = scanner.nextInt();
		// tao mot mang rong N phan tu
		int[] data = new int[N];
		int tongle = 0;
		int tongchan = 0;
		if (N > 0) {
			for (int i = 0; i <= N; i++) {
				if (i % 2 == 0) {
					tongchan = tongchan + i;
				} else {
						tongle = tongle + i;
				}
			}
		} else {
			System.out.print("N phải lớn hơn 0");
			}
		System.out.println("Tổng các số chẵn = " + tongchan);
		System.out.println("Tổng các số lẻ = " + tongle);
	}
}
