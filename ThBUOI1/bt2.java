import java.util.Scanner;
public class bt2{
	public static int uscln(int a, int b)
	{
		if (b == 0) return a;
		if (a%b == 0) return b;
		return uscln(b, a%b);
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("nhap a: ");
		a = sc.nextInt();
		System.out.println("nhap b: ");
		b = sc.nextInt();
		int kq = uscln(a, b);
		System.out.print("Uoc so chung lon nhat cua a va b la: " + kq);
	}
}