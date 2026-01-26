import java.util.Scanner;
public class bt3{
	public static String daoChuoi(String s)
	{
		String str = "";
		for(int i = s.length()-1; i>=0; i--)
			str = str + s.charAt(i);
		return str;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("nhap chuoi s:");
		s = sc.nextLine();
		String kq = daoChuoi(s);
		System.out.println("chuoi s sau khi dao: " + kq);
	}
}