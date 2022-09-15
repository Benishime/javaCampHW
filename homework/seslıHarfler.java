package homework;



public class seslıHarfler {

	public static void main(String[] args) {
		// Sesli harfler:A I O U E İ Ö Ü
		// Kalın sesli harfler:A I O U
		// İnce sesli harfler:E İ Ö Ü
		char harf='E';
		switch(harf) {
		case'E':
		case'İ':
		case'Ö':
		case'Ü':
			System.out.println(harf+" = İnce sesli");
			break;
			default:
				System.out.println(harf+" = Kalın sesli");
		}	
		}		
		}


