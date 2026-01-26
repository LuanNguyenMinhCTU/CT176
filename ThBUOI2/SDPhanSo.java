import java.util.Scanner;
public class SDPhanSo{
    public static void main(String agrs[]){
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        a.nhap();
        System.out.print("a: ");
        a.hienthi();
        System.out.print("a sau khi rut gon: ");
        a.rutgon(); a.hienthi();
        System.out.print("gia tri nghich dao cua a: ");
        a.giaTriNghichDao().hienthi();

        b.nhap();
        System.out.print("b: ");
        b.hienthi();
        System.out.print("b sau khi rut gon: ");
        b.rutgon(); b.hienthi();

        System.out.println(a.lonHon(b) ? "a" : "b" + " lon hon");
        System.out.print("a + b = ");
        a.cong(b).hienthi();
    }
}