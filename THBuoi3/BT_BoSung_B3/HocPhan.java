import java.util.Scanner;
public class HocPhan {
	private String msHP;
	private String tenHP;
	private String dvQuanLy;
	private int soTinChi;
	private int soTietLT;
	private int soTietTH;
	
	public HocPhan() {
		msHP = new String();
		tenHP = new String();
		dvQuanLy = new String();
		soTinChi = 0;
		soTietLT = 0;
		soTietTH = 0;
	}
	public HocPhan(String msHP, String tenHP, String dvQuanLy, int soTinChi, int soTietLT, int soTietTH) {
		this.msHP = new String(msHP);
		this.tenHP = new String(tenHP);
		this.dvQuanLy = new String(dvQuanLy);
		this.soTinChi = soTinChi;
		this.soTietLT = soTietLT;
		this.soTietTH = soTietTH;
	}
	public HocPhan(HocPhan A){
		this.msHP = new String(A.msHP);
		this.tenHP = new String(A.tenHP);
		this.dvQuanLy = new String(A.dvQuanLy);
		this.soTinChi = A.soTinChi;
		this.soTietLT = A.soTietLT;
		this.soTietTH = A.soTietTH;
	}
	public void makeCopy(HocPhan A){
		this.msHP = new String(A.msHP);
		this.tenHP = new String(A.tenHP);
		this.dvQuanLy = new String(A.dvQuanLy);
		this.soTinChi = A.soTinChi;
		this.soTietLT = A.soTietLT;
		this.soTietTH = A.soTietTH;
	}
	public void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap ma so hoc phan");
		msHP = kb.nextLine();
		System.out.println("Nhap ten hoc phan");
		tenHP = kb.nextLine();
		System.out.println("Nhap dv Quan Ly");
		dvQuanLy = kb.nextLine();
		System.out.println("Nhap so tin chi");
		soTinChi = kb.nextInt();
		System.out.println("Nhap so tiet ly thuyet");
		soTietLT = kb.nextInt();
		System.out.println("Nhap so tiet thuc hanh");
		soTietTH = kb.nextInt();
	}
	public void hienThi() {
		System.out.println("ma so hoc phan: "+ msHP);
		System.out.println("ten hoc phan: "+ tenHP);
		System.out.println("dv Quan Ly: "+ dvQuanLy);
		System.out.println("so tin chi: "+ soTinChi);
		System.out.println("so tiet LT: "+ soTietLT);
		System.out.println("so tiet TH: "+ soTietTH);
	}
	public int hocPhi() {
		return 660000*this.soTinChi;
	}
	public String maSoHP() {
		return this.msHP;
	}
	public String TenHP() {
		return this.msHP;
	}
	public String dvQuanLy() {
		return this.msHP;
	}
	public int soTC() {
		return this.soTinChi;
	}
	public int soTietLiThuyet() {
		return this.soTietLT;
	}
	public int soTietThucHanh() {
		return this.soTietTH;
	}
}
