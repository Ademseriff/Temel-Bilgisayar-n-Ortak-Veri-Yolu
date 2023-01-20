
public class _19010310039_DR_register {
	_19010310039_Veri_Yolu veri_yolu = new _19010310039_Veri_Yolu();
	public  static String dr = "0000000000000000";
	_19010310039_DR_register(){
	
	}
	public void  DR_Load (){
		dr= veri_yolu.veri_yolu;
		System.out.println("y�kleme i�lemi tamam yeni DR register yeni deger ");
		System.out.println(dr);
	}
	public void DR_INR(int a) {
		int z = Integer.parseInt(dr);;
		int f=ondal�k_al(z);
		int toplam = f+a;
		String sonu� =Integer.toBinaryString(toplam);
		while(sonu�.length()<16) {
			sonu�= "0"+sonu�;
			
		}
		dr=sonu�;
		System.out.println(dr);
		
	}
	public void DR_Clear() {
		String clear = "0000000000000000";
		dr =clear;
		System.out.println("G�R���N CLEAR G�R��� AKT�F:");
		System.out.println(dr);
		
	}
	public void veri_yolu_aktar() {
		veri_yolu.sag_gelen(dr);
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






