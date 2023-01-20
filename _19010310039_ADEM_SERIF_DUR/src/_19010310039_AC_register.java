
public class _19010310039_AC_register {
	_19010310039_Veri_Yolu veri_yolu = new _19010310039_Veri_Yolu();
	public  static String ac = "0000000000000000";
	_19010310039_AC_register(){
	}
	public void  AC_Load (){
		ac= veri_yolu.veri_yolu;
		System.out.println("yükleme iþlemi tamam yeni AC register yeni deger ");
		System.out.println(ac);
		
	}
	public void AC_INR(int a) {
		int z = Integer.parseInt(ac); 
		int f=ondalýk_al(z);
		int toplam = f+a;
		String sonuç =Integer.toBinaryString(toplam);
		while(sonuç.length()<16) {
			sonuç= "0"+sonuç;
			
		}
		ac=sonuç;
		System.out.println(ac);
		
	}
	public void AC_Clear() {
		String clear = "0000000000000000";
		ac =clear;
		System.out.println("AC CLEAR GÝRÝÞÝ AKTÝF");
		System.out.println(ac);
		
	}
	public void veri_yolu_aktar() {
		veri_yolu.sag_gelen(ac);
	}
	
	public static int ondalýk_al(int ikili_sayi){  
	    int ondalik_sayi = 0;  
	    int i = 0;  
	    while(true){  
	      if(ikili_sayi == 0){  
	        break;  
	      } 
	      else {  
	          int geçici = ikili_sayi%10;  
	          ondalik_sayi += geçici*Math.pow(2, i);  
	          ikili_sayi = ikili_sayi/10;  
	          i++;  
	       }  
	    }  
	    return ondalik_sayi;  
	}

}
