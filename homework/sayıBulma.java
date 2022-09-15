package homework;

public class sayıBulma {

	public static void main(String[] args) {
		int[] sayılar = new int [] {1,2,3,5,6,7,8};
		int aranacak=200000; 
		boolean varmı=false;
		for(int sayı:sayılar) {
			if(sayı==aranacak) {
				varmı=true;
			}
			}
		if (varmı==true) {
			System.out.println(aranacak+" sayısı mevcuttur");
		}
		else if(varmı=false){
			System.out.println(aranacak+" sayısı mevcut değilsir");	
		}
		
		}

	}


