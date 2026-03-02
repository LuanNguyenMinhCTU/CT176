public class SDDuongTron {

	public static void main(String[] args) {
		Diem d1 = new Diem(2, 5);
		DuongTron dt1 = new DuongTron(d1, 6);
		dt1.hienThi();
//		System.out.println(dt1.dienTich());
//		System.out.println(dt1.chuVi());
		DuongTron dt2 = new DuongTron();
		dt2.nhap();
		System.out.println("dt2 truoc khi doi: ");
		dt2.hienThi();
		dt2.doi(1,  2);
		System.out.println("dt2 sau khi doi: ");
		dt2.hienThi();
		System.out.println("dien tich dt2 = "+dt2.dienTich());
		System.out.println("chu vi dt2 = "+dt2.chuVi());
		if (dt1.catNhau(dt2)) System.out.print("dt1 cat dt2");
		else System.out.print("dt1 khong cat dt2");
	}

}
