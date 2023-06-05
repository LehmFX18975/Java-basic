package javabasic.bai3;
import java.util.Scanner;
import javabasic.bai3.Student;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class MainScreen {
	public static void main(String[] args) {

		ArrayList<Student> STUDENT = new ArrayList<Student>();
		// Sử dụng vòng lặp WHILE hoặc DO…WHILE để nhập thông tin Student từ bàn phím.
		String x; 
		do {
			int d = 0, m = 0, y = 0;
			boolean t = true;
			Scanner sc = new Scanner(System.in);
			Student st = new Student(null,null,null,null,0);
			
			// Nhập tên 
			System.out.println("Nhập họ tên học sinh: ");
			st.setFullName(sc.nextLine());
			
			//Nhập địa chỉ
			System.out.println("Nhập địa chỉ của học sinh: ");
			st.setAddress(sc.nextLine());

			// Nhập sinh nhật
			System.out.println("Nhập sinh nhật của học sinh: ");
			//Nhập năm
			do {
				try {
					System.out.print("Năm: ");
					y = Integer.parseInt(sc.nextLine());
					if(Integer.toString(y).length() != 4) {
						throw new Exception();
					}else if(Integer.toString(y).length() == 4) {
						t = true;
						break;
					}
				}catch(Exception e) {
					System.out.println("Năm không hợp lệ!");
					t = false;
				}
			}while(!t);
			//nhập tháng
			do {
				try {
					System.out.print("Tháng: ");
					m = Integer.parseInt(sc.nextLine());
					if(m > 12) {
						throw new Exception();
					}else if(m < 12) {
						t = true;
						break;
					}
				}catch(Exception e) {
					System.out.println("Tháng không hợp lệ!");
					t = false;
				}
			}while(!t);
			//nhập ngày
			do {
				try {
					System.out.print("Ngày: ");
					d = Integer.parseInt(sc.nextLine());
					if(y%4==0 && m==2 && d>29) {
						throw new Exception();
					}else if (y%4!=0 && m==2 && d>28) {
						throw new Exception();
					}else if ((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&d>31) {
						throw new Exception();
					}else if ((m==4||m==6||m==9||m==11)&&d>30) {
						throw new Exception();
					}else {
						t = true;
						break;
					}
				}catch(Exception e) {
					System.out.println("Ngày không hợp lệ!");
					t = false;
				}
			}while(!t);
			//ngày tháng theo yêu cầu đề bài
			String date = d+"/"+m+"/"+y;
			System.out.println(date);
						
			st.setDob(date);
			
			//Nhập giới tính
			System.out.println("Nhập giới tính của học sinh: ");
			st.setGender(sc.nextLine());
			
			// Nhập điểm 
			System.out.println("Nhập điểm số của học sinh: ");
			st.setFinalGrade(sc.nextFloat());
			
			STUDENT.add(st);			
			System.out.println("Do you want to continue (Y/N):");
			x = sc.next();		
		} while (x.equalsIgnoreCase("y"));
		
		// In ra tất cả Student trong danh sách theo định dạng.
		for (int i = 0; i < STUDENT.size(); i++) {

			System.out.println("Student " + (i + 1) + ":\n"
					+ "FullName: " + STUDENT.get(i).getFullName() + "\n"
					+ "Address: " + STUDENT.get(i).getAddress() + "\n"
					+ "Birthday: " + STUDENT.get(i).getDob() + "\n"
					+ "Gender: " + STUDENT.get(i).getGender() + "\n"
					+ "FinalGrade: " + STUDENT.get(i).getFinalGrade());
			}
		// Sử dụng vòng lặp FOR để in ra danh sách vừa nhập. Xét finalGrade.
		for (int i = 0; i < STUDENT.size(); i++) {
			if(STUDENT.get(i).getFinalGrade() < 4) {
				System.out.println("Học sinh " + STUDENT.get(i).getFullName() + " học lực Kém");
			} else if(STUDENT.get(i).getFinalGrade() < 5) {
				System.out.println("Học sinh " + STUDENT.get(i).getFullName() + " học lực Yếu");
			} else if(STUDENT.get(i).getFinalGrade() < 5.5) {
				System.out.println("Học sinh " + STUDENT.get(i).getFullName() + " học lực Trung bình yếu");
			} else if(STUDENT.get(i).getFinalGrade() < 6.5) {
				System.out.println("Học sinh " + STUDENT.get(i).getFullName() + " học lực Trung bình");
			} else if(STUDENT.get(i).getFinalGrade() < 7) {
				System.out.println("Học sinh " + STUDENT.get(i).getFullName() + " học lực Trung bình khá");
			} else if(STUDENT.get(i).getFinalGrade() < 8) {
				System.out.println("Học sinh " + STUDENT.get(i).getFullName() + " học lực Khá");
			} else if(STUDENT.get(i).getFinalGrade() < 8.5) {
				System.out.println("Học sinh " + STUDENT.get(i).getFullName() + " học lực Khá giỏi");
			} else if(STUDENT.get(i).getFinalGrade() <= 10) {
				System.out.println("Học sinh " + STUDENT.get(i).getFullName() + " học lực Giỏi");
				}
			}
		// Tính điểm tổng kết trung bình của danh sách học sinh  (tổng điểm /số lượng)
		float tongdiem = 0;
		for (int i = 0; i < STUDENT.size(); i++) {
			tongdiem = tongdiem + STUDENT.get(i).getFinalGrade();
		}
		System.out.println("Điểm tổng kết trung bình: " + tongdiem/STUDENT.size());
	}
}

