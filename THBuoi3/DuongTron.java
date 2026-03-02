import java.util.Scanner;
public class DuongTron {
	private Diem tam;
	private int bankinh;
	public DuongTron() {
		tam = new Diem();
		bankinh = 0;
	}
	public DuongTron(Diem tam, int bankinh) {
		this.tam = new Diem(tam);
		this.bankinh = bankinh;
	}
	public DuongTron(int x, int y, int bk)
	{
		this.tam = new Diem(x, y);
		this.bankinh = bk;
	}
	public DuongTron(DuongTron c)
	{
		this.tam = new Diem(c.tam);
		this.bankinh = c.bankinh;
	}
	public void makeCopy(DuongTron c) {
		this.tam = new Diem(c.tam);
		this.bankinh = c.bankinh;
	}
	public void nhap()
	{
		System.out.println("Nhap tam duong tron");
		tam.nhapDiem();
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap ban kinh");
		this.bankinh = kb.nextInt();
	}
	public void hienThi()
	{
		System.out.print("Tam duong tron : ");
		tam.hienThi();
		System.out.println("");
		System.out.println("Ban kinh duong tron = "+ this.bankinh);
	}
	public void doi(int dx, int dy) {
		tam.doiDiem(dx, dy);
	}
	public double dienTich() {
		return Math.PI*this.bankinh*this.bankinh;
	}
	public double chuVi() {
		return Math.PI*this.bankinh*2;
	}
	public boolean trongDuongTron (Diem d) {
		double s = Math.pow(d.giaTriX() - tam.giaTriX(), 2) 
				+  Math.pow(d.giaTriY() - tam.giaTriY(), 2);
		if (s<= this.bankinh*this.bankinh) return true;
		return false;
		
	}
	public boolean catNhau(DuongTron dt) {
		double temp = Math.sqrt(Math.pow(dt.tam.giaTriX() - tam.giaTriX(), 2) 
				+  Math.pow(dt.tam.giaTriY() - tam.giaTriY(), 2));
		if (temp <= (this.bankinh + dt.bankinh)) return true;
		return false;
	}
	public Diem layTam() {
		return tam;
	}
	public int layBanKinh() {
		return bankinh;
	}
}
