public class Kendaraan {
	
	 public int KecepatanMaks;
	 public int Berat;
	 public int Kapasitas;
	
	public Kendaraan() {
		KecepatanMaks = 20;
	}
	public void Kendaraan(){
		System.out.println(KecepatanMaks);
	}
}  
class Mobil extends Kendaraan{
	public int JumlahRoda;
	public int KecepatanMobil;
	public int Berat;
	public int Kapasitas;

	public  Mobil(int jr, int km, int b, int k){
			 JumlahRoda = jr;
			 KecepatanMobil = km;
			 Berat = b;
			 Kapasitas = k;
	}
	public void CetakSpesifikasi() {
		System.out.println (JumlahRoda);
		System.out.println (KecepatanMobil);
		System.out.println (Berat);
		System.out.println (Kapasitas);
	}
	public void Jalankan(int a){

	}
}  
