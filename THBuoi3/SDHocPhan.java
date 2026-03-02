
public class SDHocPhan {

	public static void main(String[] args) {
		HocPhan hp1 = new HocPhan("CT176", "Lap trinh huong doi tuong", "", 3, 30, 30);
		hp1.hienThi();
		HocPhan hp2 = new HocPhan();
		hp2.nhap();
		hp2.hienThi();
	}

}
