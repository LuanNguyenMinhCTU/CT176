import java.util.Scanner;
class GiangVien {
    private String mscb;
    private String hoTen;
    private String hocVi;
    private String donVi;
    int thamNien;
    int soLuongHocPhan;
    HocPhan dsHP[];
    public GiangVien()
    {
        mscb = new String();
        hoTen = new String();
        hocVi = new String();
        donVi = new String();
        thamNien = 0;
        soLuongHocPhan = 0;
        dsHP = new HocPhan[20];
    }
    public GiangVien(String ms, String ht, String hv, String dc, int tn){
        mscb = new String(ms);
        hoTen = new String(ht);
        hocVi = new String(hv);
        donVi = new String(dc);
        thamNien = tn;
        soLuongHocPhan = 0;
    }
    public GiangVien(GiangVien a){
        mscb = new String(a.mscb);
        hoTen = new String(a.hoTen);
        hocVi = new String(a.hocVi);
        donVi = new String(a.donVi);
        thamNien = a.thamNien;
        soLuongHocPhan = a.soLuongHocPhan;
        dsHP = new HocPhan[soLuongHocPhan];
        for (int i = 0; i < a.soLuongHocPhan; i++)
            dsHP[i] =new HocPhan(a.dsHP[i]);
    }
    public void makeCopy(GiangVien a){
        mscb = a.mscb;
        hoTen = a.hoTen;
        hocVi = a.hocVi;
        donVi = a.donVi;
        thamNien = a.thamNien;
        soLuongHocPhan = a.soLuongHocPhan;
        for (int i = 0; i < a.soLuongHocPhan; i++)
            dsHP[i].makeCopy(a.dsHP[i]);
    }
    public void nhap(){
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap ma so can bo : ");
        this.mscb = kb.nextLine();   
        System.out.print("Nhap ho ten Giang vien : ");
        this.hoTen = kb.nextLine();
        System.out.print("Nhap hoc vi : ");
        this.hocVi = kb.nextLine();
        System.out.print("Nhap don vi : ");
        this.donVi = kb.nextLine();
        System.out.print("Nhap tham nien giang day : ");
        this.thamNien =kb.nextInt();
        System.out.print("Nhap so luong hoc phan giang day : ");
        this.soLuongHocPhan = kb.nextInt();
        for (int i = 0; i < this.soLuongHocPhan; i++){
            System.out.println("Hoc phan thu "+ (i+1));
            this.dsHP[i] = new HocPhan();
            this.dsHP[i].nhap();
        }
    }
    public void hienThi(){
        System.out.println("Ma so can bo : " + this.mscb);
        System.out.println("Ho ten Giang vien : "+ this.hoTen);
        System.out.println("Hoc vi : " + this.hocVi);
        System.out.println("Don vi : " + this.donVi);
        System.out.println("Tham nien giang day : " + this.thamNien);
        System.out.println("Cac hoc phan giang day : ");
        for (int i = 0; i < this.soLuongHocPhan; i++){
            this.dsHP[i].hienThi();
        }
        System.out.println();
    }
    public boolean themHP(HocPhan h){
        this.dsHP[this.soLuongHocPhan] = new HocPhan(h);
        this.soLuongHocPhan++;
        return true;
    }
    public boolean xoaHP(HocPhan h){
        for (int i = 0; i < this.soLuongHocPhan; i++)
            if(dsHP[i].maSoHP().equals(h.maSoHP())){
                for(int j = i; j < this.soLuongHocPhan-1; j++)
                    dsHP[j] = dsHP[j+1];
                this.soLuongHocPhan--;
                return true;
            }
        return false;
    }
    public HocPhan layHPGD(int i){
        return dsHP[i];
    }

    // cac getter
    public String maSoCanBo(){
        return mscb;
    }
    public String HoTen(){
        return hoTen;
    }
    public String HocVi(){
        return hocVi;
    }
    public String DonVi(){
        return donVi;
    }
    public int ThamNien(){
        return thamNien;
    }
}
