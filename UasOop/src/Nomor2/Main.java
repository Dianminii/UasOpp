package Nomor2;

public class Main {
    
    
    
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        bd.HitungLuas();
        bd.HitunganKeliling();
        
        System.out.println("NIM SAYA 201969040036");
        System.out.println("===========================");
        System.out.println("====> LUAS DAN KELILING SEGITIGA <===");
        
        Segitiga st = new Segitiga();
        st.HitungLuas();
        System.out.println("==============");
        st.HitungKeliling();
        
        System.out.println("==============");
        System.out.println("==============");
        System.out.println("==============");
        
        System.out.println("LUAS DAN KELILING PERSEGI");
        Persegi kotak = new Persegi();
        kotak.HitungLuas();
        System.out.println("==============");
        kotak.HitungKeliling();
        
        System.out.println("==============");
        System.out.println("==============");
        System.out.println("==============");
        
        System.out.println("==============");
        System.out.println("==============");
        System.out.println("==============");
        
        System.out.println("LUAS DAN KELILING LINGKARAN");
        Lingkaran bunder = new Lingkaran();
        bunder.HitungLuas();
        System.out.println("============");
        bunder.HitunganKeliling();
        
    }
}
