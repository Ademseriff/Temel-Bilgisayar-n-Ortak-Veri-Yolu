
public class _19010310039_AR_register {
	_19010310039_Veri_Yolu veri_yolu = new _19010310039_Veri_Yolu();
	public  static String ar = "000000000000";
	_19010310039_AR_register(){
		
	}
	public void  AR_Load (){
		String veri_yolu_deger=veri_yolu.veri_yolu;
		int z = Integer.parseInt(veri_yolu_deger); 
		int f=ondal�k_al(z);
		String sonu� =Integer.toBinaryString(f);
		while(sonu�.length()<12) {
			sonu�= "0"+sonu�;
			
		}
		ar = sonu�;
		System.out.println("AR REG�STER YEN� DEGER "+ar);
	}
	public void AR_INR(int a) {
		int z = Integer.parseInt(ar); 
		int f=ondal�k_al(z);
		int toplam = f+a;
		String sonu� =Integer.toBinaryString(toplam);
		while(sonu�.length()<12) {
			sonu�= "0"+sonu�;
			
		}
		ar=sonu�;
		System.out.println(ar);
		
	}
	public void AR_Clear() {
		String ar = "000000000000";
		System.out.println("AR G�R���N CLEAR G�R��� AKT�F: "+ar);
		System.out.println(ar);
		
	}
	public void veri_yolu_aktar() {
		veri_yolu.sag_gelen(ar);
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
