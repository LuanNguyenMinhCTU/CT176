import java.util.Scanner;
class LopHocPhanOnline extends LopHocPhan{
    private int tietonline;
    private String linklop;
    private String linkthi;
    public LopHocPhanOnline(){
        super();
        tietonline = 0;
        linklop = new String();
        linkthi = new String();
    } 
    public LopHocPhanOnline(LopHocPhanOnline h){
        super(h);
        tietonline = h.tietonline;
        linklop = new String(h.linklop);
        linkthi = new String(h.linkthi);
    } 
    public void makeCopy(LopHocPhanOnline h){
        super.makeCopy(h);
        tietonline = h.tietonline;
        linklop = h.linklop;
        linkthi = h.linkthi;
    }
    public void nhap(){
        Scanner kb = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so tiet online : ");
        tietonline = kb.nextInt();
        kb.nextLine();
        System.out.print("Link lop : ");
        linklop = kb.nextLine();
        System.out.print("Link thi : ");
        linkthi = kb.nextLine();
    }
    public void hienThi(){
        super.hienThi();
        System.out.println("So tiet online : " + tietonline);
        System.out.println("Link lop : " + linklop);
        System.out.println("Link thi : " + linkthi);
    }
    public float tiLeHocOnl(){
        return (float)tietonline/(super.Hoc_phan().soTietLiThuyet() + super.Hoc_phan().soTietThucHanh());
    }
}