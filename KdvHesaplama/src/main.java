import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		double tutar,kdvOran = 0.18,kdvTutar,kdvliTutar;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ucret Tutarýný Giriniz.");
		
		tutar = scanner.nextDouble();		
		
		if(tutar >=0 && tutar <=1000) {
			kdvOran = 0.18;
			kdvTutar = tutar*kdvOran;		
			kdvliTutar = tutar+kdvTutar;
			
			System.out.println("KDV'li Tutarý :"+kdvliTutar);
			
		}else if(tutar > 1000) {
			kdvOran = 0.8;
			kdvTutar = tutar*kdvOran;		
			kdvliTutar = tutar+kdvTutar;
			
			System.out.println("KDV'li Tutarý :"+kdvliTutar);
		}else {
			System.out.println("Negatif sayi girdiniz :");
		}
		
		

	}

}
