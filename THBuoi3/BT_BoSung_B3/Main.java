import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        // HocPhan h1 = new HocPhan(); h1.nhap();
        
        // HocPhan h2 = new HocPhan(); h2.nhap();
        
        // HocPhan h3 = new HocPhan(); h3.nhap();
        
        // HocPhan h4 = new HocPhan(); h4.nhap();

        // h1.hienThi();
        // h2.hienThi();
        // h3.hienThi();
        // h4.hienThi();
        
        // GiangVien gv1 = new GiangVien(); gv1.nhap();
        
        // GiangVien gv2 = new GiangVien(); gv2.nhap();

        // GiangVien gv3 = new GiangVien(); gv3.nhap();

        // gv1.hienThi();
        // gv2.hienThi();
        // gv3.hienThi();
        int n;
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap so luong lop hoc phan : ");
        n = kb.nextInt();
        LopHocPhan list[];
        list = new LopHocPhan[n];
        for (int i = 0; i < n; i++){
            list[i]= new LopHocPhan();
            list[i].nhap();
            System.out.println();
        }
        
        for (int i = 0; i < n; i++){
            list[i].hienThi();
            System.out.println();
        }
        // list[0].phanCongGV(gv1);
        // list[1].phanCongGV(gv2);
        // list[2].phanCongGV(gv3);
        // list[0].hienThi();
        // list[1].hienThi();
        // list[2].hienThi();
    }
}