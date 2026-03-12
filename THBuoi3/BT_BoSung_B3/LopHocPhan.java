import java.util.Scanner;
class LopHocPhan {
    private String malop;
    HocPhan hp;
    int siSo;
    GiangVien gv;
    String phongHoc;
    String thoiGian;
    public LopHocPhan()
    {
        malop = new String();
        hp = new HocPhan();
        siSo = 0;
        gv = new GiangVien();
        phongHoc = new String();
        thoiGian = new String();
    }
    public LopHocPhan(String ms, HocPhan h, int ss, String p, String tg){
        malop = new String(ms);
        hp = new HocPhan(h);
        siSo = ss;
        phongHoc = new String(p);
        thoiGian = new String(tg);
    }
    public LopHocPhan(LopHocPhan h){
        malop = new String(h.malop);
        hp = new HocPhan(h.hp);
        siSo = h.siSo;
        gv = new GiangVien(h.gv);
        phongHoc = new String(h.phongHoc);
        thoiGian = new String(h.thoiGian);
    }
    public void makeCopy(LopHocPhan h){
        malop = h.malop;
        hp.makeCopy(h.hp);
        siSo = h.siSo;
        gv.makeCopy(h.gv);
        phongHoc = h.phongHoc;
        thoiGian = h.thoiGian;
    }
    public void nhap(){
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap ma lop : ");
        malop = kb.nextLine();
        hp.nhap();
        System.out.print("nhap si so lop : ");
        siSo = kb.nextInt();
        gv.nhap();
        System.out.print("nhap phong hoc : ");
        phongHoc = kb.nextLine();
        phongHoc = kb.nextLine();
        System.out.print("nhap thoi gian hoc : ");
        thoiGian = kb.nextLine();
    }
    public void hienThi()
    {
        System.out.println("Ma lop : " + malop);
        hp.hienThi();
        System.out.println("Si so lop : " + siSo);
        gv.hienThi();
        System.out.println("Phong hoc : " + phongHoc);
        System.out.println("Thoi gian hoc : " + thoiGian);
    }
    public void phanCongGV(GiangVien g){
        gv.makeCopy(g);
    }
    public void tangSiSo(int  n){
        siSo += n;
    }
    public String Ma_Lop(){
        return malop;
    }
    public HocPhan Hoc_phan(){
        return hp;
    }
    public int Si_So(){
        return siSo;
    }
    public GiangVien Giang_vien(){
        return gv;
    }
    public String Phong_hoc(){
        return phongHoc;
    }
    public String Thoi_gian(){
        return thoiGian;
    }
}
