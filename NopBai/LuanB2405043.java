
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class LuanB2405043 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        TBInternet a = new TBInternet();
        a.nhap();
        System.out.println("");
        a.hienThi();
        System.out.println("");

        System.out.print("Nhap so luong thue bao: ");
        int n = kb.nextInt();kb.nextLine();
        TBInternet dSach[] = new TBInternet[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap Thue bao thu " + (i+1) +": ");
            dSach[i] = new TBInternet();
            dSach[i].nhap();
        }
        System.out.println("");

        int maxIndex = 0;
        for (int i = 1; i < n; i++)
            if(dSach[i].tocDoCaoHon(dSach[maxIndex])){
                maxIndex = i;
            }
        System.out.println("Thue bao co toc do cuoc nhanh nhat la thue bao thu : "+ (maxIndex+1));

        int cost = 0;
        for (int i = 0; i < n; i++) 
            cost += dSach[i].tinhCuoc();
        System.out.println("Tong tien cuoc phai thu la: " + cost);

        // sap xep
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j< n; j++)
                if (dSach[j].layNgayDangKy().giaTriNam() < dSach[i].layNgayDangKy().giaTriNam()){
                    TBInternet temp =dSach[i];
                    dSach[i] = dSach[j];
                    dSach[j] = temp;
                } else 
                    if(dSach[j].layNgayDangKy().giaTriNam() == dSach[i].layNgayDangKy().giaTriNam()){
                        if (dSach[j].layNgayDangKy().giaTriThang() < dSach[i].layNgayDangKy().giaTriThang()){
                            TBInternet temp =dSach[i];
                            dSach[i] = dSach[j];
                            dSach[j] = temp;
                        } else if(dSach[j].layNgayDangKy().giaTriThang() == dSach[i].layNgayDangKy().giaTriThang()){
                            if (dSach[j].layNgayDangKy().giaTriNgay() < dSach[i].layNgayDangKy().giaTriNgay()){
                                TBInternet temp =dSach[i];
                                dSach[i] = dSach[j];
                                dSach[j] = temp;
                            }
            }
                    }}
        for (int i = 0; i < n; i++){
            dSach[i].hienThi();
            System.out.println("");
        }


        System.out.print("Nhap so can cuoc cong dan: ");
        String temp = kb.nextLine();
        System.out.println("Cac thue bao co so CCCD = " + temp +" la:");
            for (int i = 0; i < n; i++) 
                if (temp.equals(dSach[i].laySoCCCD())) 
                    {
                        dSach[i].hienThi();
                    }
        try {
            ObjectOutputStream f = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("TBInternet.ser"))
            );
            f.writeObject(dSach);
            f.flush();
            f.close();
        } catch (Exception e) {
        }

        int xuatHienNhieuNhat = 0, max = 0;
        for (int i = 1; i < n; i++){
            int count = 0;
            for (int j = 0; j < n; j++)
                if(dSach[i].layHoTen().equals(dSach[j].layHoTen()))
                    count++;
            if (count > max){
                max = count;
                xuatHienNhieuNhat = i;
            }
        }
        System.out.println("Nguoi dang ky nhieu tai khoan nhat la: " + dSach[xuatHienNhieuNhat].layHoTen());
    } 
}
