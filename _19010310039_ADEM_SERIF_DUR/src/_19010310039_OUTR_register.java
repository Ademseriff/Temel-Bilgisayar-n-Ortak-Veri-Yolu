
public class _19010310039_OUTR_register {
	_19010310039_Veri_Yolu veri_yolu = new _19010310039_Veri_Yolu();
	public  static String outr = "00000000";
	_19010310039_OUTR_register(){
	
		
	}
	public void OUTR_Load(){
		String veri_yolu_deger=veri_yolu.veri_yolu;
		int z = Integer.parseInt(veri_yolu_deger); 
		int f=ondal�k_al(z);
		String sonu� =Integer.toBinaryString(f);
		while(sonu�.length()<8) {
			sonu�= "0"+sonu�;
			
		}
		outr = sonu�;
		System.out.println("OUTR REG�STER YEN� DEGER "+outr);
	}
	public void veri_yolu_aktar() {
		veri_yolu.sag_gelen(outr);
	}
	
	public static int ondal�k_al(int ikili_sayi){  
	    int ondalik_sayi = 0;  
	    int i = 0;  
	    while(true){  
	      if(ikili_sayi == 0){  
	        break;  
	      } 
	      else {  
	          int ge�ici = ikili_sayi%10;  
	          ondalik_sayi += ge�ici*Math.pow(2, i);  
	          ikili_sayi = ikili_sayi/10;  
	          i++;  
	       }  
	    }  
	    return ondalik_sayi;  
	}

}
