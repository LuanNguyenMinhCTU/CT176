import java.util.Scanner;
public class SDClock{
    public static void main(String[] args)
    {
        Clock c1 = new Clock(12, 65,90);
        System.out.print("c1: ");
        c1.hienthi();
        System.out.print("c1 sau khi lam tron: ");
        c1.lamTron();
        c1.hienthi();

        System.out.print("Nhap c2: ");
        Clock c2 = new Clock();
        c2.nhap();
        System.out.print("c2: ");
        c2.hienthi();
        System.out.print("c2 sau khi lam tron: ");
        c2.lamTron();
        c2.hienthi();
        int n;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap n:");
        n = kb.nextInt();
        System.out.print("c2 sau khi cong "+ n +"phut: ");
        c2.congPhut(n).hienthi();
    }
}