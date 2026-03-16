import java.util.Scanner;
class Diem {
	// Khai bao cac thuoc tinh
	private	int x;
	private int	y;
	// Ham xay dung (constructor)
	public Diem() {		// Ham xay dung mac nhien (default constructor)
		x = y = 0;
	}
	public Diem(int h, int t) {
		x = h; y = t;
	}
	public Diem(int a) {
		x = y = a;
	}
	// Ham xay dung sao chep (copy constructor)
	public Diem(Diem d) {
		x = d.x;
		y = d.y;
	}
	// Sao chep sau (deep copy)
	public void makeCopy(Diem d) {
		x = d.x;
		y = d.y;
	}

	// Dinh nghia cac phuong thuc
	public void khoiTao(int h, int t) {
		x = h; y = t;
	}
	public void hienThi() {
		System.out.print("(" + x + "," + y + ")");
	}
	public void nhapDiem() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap hoanh do: ");
		x = kb.nextInt();
		System.out.print("Nhap tung do: ");
		y = kb.nextInt();
	}
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
	public float khoangCach() {
		float kc = 0;
		kc = (float)Math.sqrt(x*x + y*y);
		return kc;
	}
	// Getter
	public int giaTriX() {
		return x;
	}
	public int giaTriY() {
		return y;
	}
	public boolean equals(Diem d) {
		return ((x==d.giaTriX()) && (y==d.giaTriY()));
	}
	public String toString() {
		return "(" + x + "," + " " + y + ")";
	}
	// ......
}