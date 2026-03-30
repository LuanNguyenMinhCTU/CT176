import java.io.Serializable;
import java.util.Scanner;

class TBInternet implements Serializable{
    private String tenTaiKhoan;
    private String HoTen;
    private String soCCCD;
    private String diaChi;
    private MyDate ngayDangKy;
    private int tocDo;
    public TBInternet(){
        tenTaiKhoan = new String();
        HoTen = new String();
        soCCCD = new String();
        diaChi = new String();
        ngayDangKy = new MyDate();
        tocDo = 0;
    }
    public TBInternet(TBInternet a){
        tenTaiKhoan = new String(a.tenTaiKhoan);
        HoTen = new String(a.HoTen);
        soCCCD = new String(a.soCCCD);
        diaChi = new String(a.diaChi);
        ngayDangKy = new MyDate(a.ngayDangKy);
        tocDo = a.tocDo;
    }
    public void makeCopy(TBInternet a){
        tenTaiKhoan = a.tenTaiKhoan;
        HoTen = a.HoTen;
        soCCCD = a.soCCCD;
        diaChi = a.diaChi;
        ngayDangKy.makeCopy(a.ngayDangKy);
        tocDo = a.tocDo;
    }
    public void nhap(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap ten tai khoan: ");
        tenTaiKhoan = kb.nextLine();
        System.out.print("Nhap ho ten chu thue bao: ");
        HoTen = kb.nextLine();
        System.out.print("Nhap so CCCD: ");
        soCCCD = kb.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = kb.nextLine();
        System.out.println("Nhap ngay dang ky: ");
        ngayDangKy.nhap();
        System.out.print("Nhap toc do dang ky: ");
        tocDo = kb.nextInt();
        kb.nextLine();
    }
    public void hienThi(){
        System.out.println("Ten tai khoan : "+tenTaiKhoan);
        System.out.println("Ho ten chu thue bao : "+HoTen);
        System.out.println("so CCCD : "+soCCCD);
        System.out.println("Dia chi :  "+diaChi);
        System.out.println("Ngay dang ky : "); ngayDangKy.hienThi();
        System.out.println();
        System.out.println("Toc do dang ky : "+tocDo+" Mbps");
    }
    public int tinhCuoc(){
        int temp;
        switch (tocDo) {
            case 300:
                temp = 190000;
                break;
            case 500:
                temp = 240000;
                break;
            case 1000:
                temp = 280000;
                break;
            default:
                temp = 0;
                break;
        }
    return temp;
    }
    public boolean tocDoCaoHon(TBInternet tb){
        return tocDo>tb.tocDo;
    }
    public MyDate layNgayDangKy(){
        return ngayDangKy;
    }
    public String laySoCCCD(){
        return soCCCD;
    }
    public String layHoTen(){
        return HoTen;
    }
}