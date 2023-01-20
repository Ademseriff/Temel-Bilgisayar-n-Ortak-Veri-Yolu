import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   
		_19010310039_Memory m = new _19010310039_Memory();
		m.Memory_1();
		
		String bitirme="H";
		String kontrol ;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Lütfen mikro iþlemi giriniz: ");
			String a = sc.nextLine();
			new _19010310039_okuma_iþlemleri(a);
			System.out.println("DEVAM ETMEK ÝSTÝYOR MUSUN (E-H)");
			kontrol= sc.nextLine();
		}while(!kontrol.equals(bitirme));
		
		System.out.println("----UYGULAMA SONA ERDÝ------");
		
		
		
		

}}
