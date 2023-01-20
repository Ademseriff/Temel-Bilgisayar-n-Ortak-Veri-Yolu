
public class _19010310039_DR_register {
	_19010310039_Veri_Yolu veri_yolu = new _19010310039_Veri_Yolu();
	public  static String dr = "0000000000000000";
	_19010310039_DR_register(){
	
	}
	public void  DR_Load (){
		dr= veri_yolu.veri_yolu;
		System.out.println("yükleme iþlemi tamam yeni DR register yeni deger ");
		System.out.println(dr);
	}
	public void DR_INR(int a) {
		int z = Integer.parseInt(dr);;
		int f=ondalýk_al(z);
		int toplam = f+a;
		String sonuç =Integer.toBinaryString(toplam);
		while(sonuç.length()<16) {
			sonuç= "0"+sonuç;
			
		}
		dr=sonuç;
		System.out.println(dr);
		
	}
	public void DR_Clear() {
		String clear = "0000000000000000";
		dr =clear;
		System.out.println("GÝRÝÞÝN CLEAR GÝRÝÞÝ AKTÝF:");
		System.out.println(dr);
		
	}
	public void veri_yolu_aktar() {
		veri_yolu.sag_gelen(dr);
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






