
public class _19010310039_PC_register {
	_19010310039_Veri_Yolu veri_yolu = new _19010310039_Veri_Yolu();
	public  static String pc = "000000000000";
	_19010310039_PC_register(){
		
		
	}
	public void  PC_Load (){
		String veri_yolu_deger=veri_yolu.veri_yolu;
		int z = Integer.parseInt(veri_yolu_deger); 
		int f=ondal�k_al(z);
		String sonu� =Integer.toBinaryString(f);
		while(sonu�.length()<12) {
			sonu�= "0"+sonu�;
			
		}
		pc = sonu�;
		System.out.println("PC REG�STER YEN� DEGER "+pc);
	}
	public void PC_INR(int a) {
		int z = Integer.parseInt(pc); 
		int f=ondal�k_al(z);
		int toplam = f+a;
		String sonu� =Integer.toBinaryString(toplam);
		while(sonu�.length()<12) {
			sonu�= "0"+sonu�;
			
		}
		pc=sonu�;
		System.out.println(pc);
		
	}
	public void PC_Clear() {
		String clear = "000000000000";
		pc=clear;
		System.out.println("PC clear giri�i aktif :");
		System.out.println(pc);
		
	}
	public void veri_yolu_aktar() {
		veri_yolu.sag_gelen(pc);
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
