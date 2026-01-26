import java.util.Scanner;
class uocChung{
    public int uscln(int a, int b)
    {
        if (b==0)
            return a;
        return uscln(b, a%b);
    }
}
class PhanSo{
    private int tuSo;
    private int mauSo;
    Scanner kb = new Scanner(System.in);
    public PhanSo()
    {
        tuSo = 0;
        mauSo = 1;
    }
    public PhanSo(int tu, int mau)
    {
        while(true)
        {
            if (mau!=0)
            {
                tuSo = tu;
                mauSo = mau;
                break;
            }
            System.out.println("Nhap sai, nhap lai! ");
            System.out.print("nhap mau so: ");
            mau = kb.nextInt();
        }
    }
    public void nhap(){
        int tu, mau;
        System.out.print("nhap tu so: ");
        tu = kb.nextInt();
        while(true)
        {
            System.out.print("nhap mau so: ");
            mau = kb.nextInt();
            if (mau!=0)
            {
                tuSo = tu;
                mauSo = mau;
                break;
            }
            System.out.println("Nhap sai, nhap lai! ");
        }

    }
    public void rutgon(){
        uocChung t = new uocChung();
        int temp = t.uscln(tuSo, mauSo);
        tuSo/=temp;
        mauSo/=temp;
    }
    public void hienthi()
    {
        if (tuSo==0) System.out.println("0");
            else if (mauSo==1)
                System.out.println(tuSo);
            else System.out.println(tuSo+ "/" +mauSo);
    }
    public void nghichDao()
    {
        PhanSo t = new PhanSo(mauSo, tuSo);
        tuSo = t.mauSo;
        mauSo = t.tuSo;
    }
    public PhanSo giaTriNghichDao(){
        PhanSo t = new PhanSo(mauSo, tuSo);
        return t;
    }
    public float giaTriThuc()
    {
        return (float)tuSo/mauSo;
    }
    public boolean lonHon(PhanSo a){
        PhanSo t = new PhanSo(tuSo, mauSo);
        return t.giaTriThuc()>a.giaTriThuc() ? true : false;
    }
    public PhanSo cong(PhanSo a)
    {
        PhanSo t = new PhanSo(tuSo, mauSo);
        t.tuSo = t.tuSo*a.mauSo + a.tuSo*t.mauSo;
        t.mauSo *= a.mauSo;
        t.rutgon();
        return t;
    }
    public PhanSo nhan(PhanSo a)
    {
        PhanSo t = new PhanSo(tuSo, mauSo);
        t.tuSo*=a.tuSo;
        t.mauSo*=a.mauSo;
        t.rutgon();
        return t;
    }
    public PhanSo tru(PhanSo a)
    {
        PhanSo t = new PhanSo(tuSo, mauSo);
        t.tuSo = t.tuSo*a.mauSo - a.tuSo*t.mauSo;
        t.mauSo *= a.mauSo;
        t.rutgon();
        return t;
    }
    public PhanSo chia(PhanSo a)
    {
        PhanSo t = new PhanSo(tuSo, mauSo);
        t.tuSo*=a.mauSo;
        t.mauSo*=a.tuSo;
        t.rutgon();
        return t;
    }
    public PhanSo congNguyen(int a)
    {
        PhanSo t = new PhanSo(tuSo, mauSo);
        PhanSo b = new PhanSo(a, 1);
        return(t.cong(b));
    }
    public PhanSo truNguyen(int a)
    {
        PhanSo t = new PhanSo(tuSo, mauSo);
        PhanSo b = new PhanSo(a, 1);
        return(t.tru(b));
    }
    public PhanSo nhanNguyen(int a)
    {
        PhanSo t = new PhanSo(tuSo, mauSo);
        PhanSo b = new PhanSo(a, 1);
        return(t.nhan(b));
    }
    public PhanSo chiaNguyen(int a)
    {
        PhanSo t = new PhanSo(tuSo, mauSo);
        PhanSo b = new PhanSo(a, 1);
        return(t.chia(b));
    }
}