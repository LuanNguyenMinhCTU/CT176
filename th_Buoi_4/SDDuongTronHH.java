class SDDuongTronHH{
    public static void main(String[] args){
        Diem d1 = new Diem(2, 5);
        DuongTronHH gc1 = new DuongTronHH(d1, 6, "den", "xanh");
        System.out.print(gc1.toString());
        DuongTronHH gc2 = new DuongTronHH();
        gc2.nhap();
        System.out.print(gc2.toString());
        System.out.println(", Chu vi : " + gc2.chuVi() + ", dien tich : " + gc2.dienTich());
        gc2.doi(1, 2);
        System.out.println("gc1 " + (gc1.catNhau(gc2) ? "" : "khong") + " cat gc2");
        System.out.println("gc1 " + (gc1.equals(gc2) ? "" : "khong") + " bang gc2");
    }
}