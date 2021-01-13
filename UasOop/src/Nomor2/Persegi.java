package Nomor2;

public class Persegi extends Segitiga {
    
   
    public void HitunganLuas(){
        double luas;
            luas = this.sisib * this.sisic;
            System.out.println("Panjang SISI :" + this.sisic + " CM ");
            System.out.println("Luas Persegi Adalah : " +luas+ " CM ");
    }
    @Override
    public void HitunganKeliling() {
    double keliling;
        keliling= this.sisic * 2;
        System.out.println("Panjang SISI :" + this.sisic + " CM ");
        System.out.println("Luas Persegi Adalah : " +keliling+ " CM ");
                
    }
}
