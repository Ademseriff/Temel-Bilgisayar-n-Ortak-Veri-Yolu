
public class _19010310039_TR_register {
	_19010310039_Veri_Yolu veri_yolu = new _19010310039_Veri_Yolu();
	public  static String tr = "0000000000000000";
	_19010310039_TR_register(){
		
		
	}
	public void  TR_Load (){
		tr= veri_yolu.veri_yolu;
		System.out.println("y�kleme i�lemi tamam yeni TR register yeni deger ");
		System.out.println(tr);
		
	}
	public void TR_INR(int a) {
		int z = Integer.parseInt(tr); 
		int f=ondal�k_al(z);
		int toplam = f+a;
		String sonu� =Integer.toBinaryString(toplam);
		while(sonu�.length()<16) {
			sonu�= "0"+sonu�;
			
		}
		tr=sonu�;
		System.out.println(tr);
		
	}
	public void TR_Clear() {
		String clear = "0000000000000000";
		tr =clear;
		System.out.println("TR CLEAR GIRISI AKTIF : ");
		System.out.println(tr);
		
	}
	public void veri_yolu_aktar() {
		veri_yolu.sag_gelen(tr);
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
