import java.util.Scanner;
class Clock {
	public int gio, phut, giay;
	public Clock() {
		
	}
	public Clock(int h, int m, int s) {
		gio = h;
		phut = m;
		giay = s;
	}
	public void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.print("nhap gio: ");
		gio = kb.nextInt();
		System.out.print("nhap phut: ");
		phut = kb.nextInt();
		System.out.print("nhap giay: ");
		giay = kb.nextInt();
	}
	public void hienthi() {
		System.out.println(gio + ":" + phut + ":" + giay);
	}
	public void lamTron() {
		phut += giay/60;
		giay %= 60;
		gio += phut/60;
		phut %= 60;
		gio %= 24;
	}
	public Clock congPhut(int n) {
		Clock c = new Clock(gio, phut, giay);
		c.phut += n;
		// c.gio += c.phut/60;
		// c.phut %= 60;
        // c.gio /= 24;
        c.lamTron();
        return c;
	}
	int giaTriGio() {
		return gio;
	}
	int giaTriPhut() {
		return phut;
	}
	int giaTriGiay() {
		return giay;
	}
	
}
