package homework;

public class asalSayı {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Bir sayının asal olma şartı şunlardır
		//1.Sayı, 1 sayısından ve kendisinden başka bir sayıya bölünemez
		//2.Sayı negatif değer alamaz ve 0 olamaz 
		//3. 1 Sayısı asaldır
		int sayı=97;
		if(sayı<=0) {
			System.out.println("Lütfen geçerli bir sayı giriniz sayı "+sayı+" sayısına  eşit olamaz");
		}
		else if(sayı==1) {
			System.out.println(sayı+" sayısı asal değildir");
		}
		else {
			for(int i= 2;i<sayı;i++){
				int sonuc=sayı%i;
			if(sonuc==0) {
				System.out.println(sayı+" sayısısı asal değildir");
				return;
			}
			else {
				System.out.println(sayı+" sayısı asaldır");
				return;
			}
			}
		}
		}
		}


