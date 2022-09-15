package homework;

public class reCapDemo2 {

	public static void main(String[] args) {
		double[]list = {1.2,5.6,3.4,8.6};
		double toplam = 0;
		double max=0.0;
		for(double s:list) {
			toplam = toplam +s;
			if(s>max) {
				max=s;
			}	
		}
		System.out.println(max);
		System.out.println(toplam);

	}

}
