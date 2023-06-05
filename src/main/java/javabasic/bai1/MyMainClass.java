package javabasic.bai1;
import java.util.Scanner;
public class MyMainClass extends CalculateUtils {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số thứ nhất x = ");
		int x = scanner.nextInt();
		System.out.print("Nhập vào số thứ hai y = ");
		int y = scanner.nextInt();
		System.out.print("Nhập lệnh ACTION: ");
		String s = scanner.next();
		String message = ""; 
		s = s.trim();
		s = s.toUpperCase();
		switch (s) {
			case "CONG":
				message = "phép cộng";
				tinhCong(x, y);
				break;
			case "TRU":
				message = "phép trừ ";
				tinhTru(x,y);
				break;
			case "NHAN":
				message = "phép nhân";
				tinhNhan(x,y);
				break;
			case "CHIA":
				message = "phép chia" ;
				tinhChia(x,y);
				break;
			default:
				message = "Giá trị ACTION không hợp lệ";
				break;
		}
		System.out.print(" là kết quả của " + message);
		}
	}
	