
public class _19010310039_OUTR_register {
	_19010310039_Veri_Yolu veri_yolu = new _19010310039_Veri_Yolu();
	public  static String outr = "00000000";
	_19010310039_OUTR_register(){
	
		
	}
	public void OUTR_Load(){
		String veri_yolu_deger=veri_yolu.veri_yolu;
		int z = Integer.parseInt(veri_yolu_deger); 
		int f=ondalýk_al(z);
		String sonuç =Integer.toBinaryString(f);
		while(sonuç.length()<8) {
			sonuç= "0"+sonuç;
			
		}
		outr = sonuç;
		System.out.println("OUTR REGÝSTER YENÝ DEGER "+outr);
	}
	public void veri_yolu_aktar() {
		veri_yolu.sag_gelen(outr);
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
