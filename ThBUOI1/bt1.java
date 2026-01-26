import java.util.Scanner;
import java.util.InputMismatchException;
public class bt1{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Nhap x:");
		float x = sc.nextFloat(), kq = 1;
		while(true) {
			try {
				System.out.println("Nhap n:");
				int n = sc.nextInt();
				for(int i = 0; i < n; i++)
					kq *= x;
				System.out.print("x mu n =" + kq);
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("Nhap sai nhap lai");
				sc.nextLine();
			}
		}
	}
}