import java.util.Scanner;
class  DuongTronHH extends DuongTron{
    private String maubien;
    private String maunen;
    public DuongTronHH(){
        super();
        maubien = new String();
        maunen = new String();
    }
    public DuongTronHH(Diem tam, int bankinh, String maubien, String maunen){
        super(tam, bankinh);
        this.maubien = new String(maubien);
        this.maunen = new String(maunen);
    }
    public DuongTronHH(int x, int y, int bk, String maubien, String maunen){
        super(x, y, bk);
        this.maubien = new String(maubien);
        this.maunen = new String(maunen);
    }
    public DuongTronHH(DuongTronHH d){
        super(d);
        this.maubien = new String(d.maubien);
        this.maunen = new String(d.maunen);
    }
    public void makeCopy(DuongTronHH d){
        super.makeCopy(d);
        maubien = d.maubien;
        maunen = d.maunen;
    }
    public void nhap(){
        Scanner kb = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap mau bien: ");
        maubien = kb.nextLine();
        System.out.print("Nhap mau nen: ");
        maunen = kb.nextLine();
    }
    public String toString(){
        return super.toString() + ", mau bien: " + maubien + ", mau nen: " + maunen;
    }
    public boolean equals(DuongTronHH d){
        return super.equals(d) && maubien.equals(d.maubien) && maunen.equals(d.maunen);
    }
    public String layMauBien(){
        return maubien;
    }
    public String layMauNen(){
        return maunen;
    }
}