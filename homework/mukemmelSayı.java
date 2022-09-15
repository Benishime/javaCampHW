package homework;

public class mukemmelSayı {

	public static void main(String[] args) {
		//bölenelerini toplamı kendisine eşit olan sayıya mükemmel sayı denir.
		// örnek 6'nın bölenleri------->1,2,3 topladığımızda 6 ediyor(kendisini katmıyoruz).
		int sayı = 128;
		int toplam = 0;
		if(sayı<=1) {
			System.out.println("geçerli bir sayı girin");
			return;
		}
		for(int i=1;i<sayı;i++) {
			int sonuc = sayı%i;
			if(sonuc==0) {
				toplam=toplam +i;
			}
		}
		if(toplam == sayı ) {
			System.out.println(sayı+" sayısı mükemmel sayıdır.");
		}
		else{
			System.out.println(sayı+"sayısı mükemmel sayı değildir");
		}
	}
	

}
