
public class _19010310039_PC_register {
	_19010310039_Veri_Yolu veri_yolu = new _19010310039_Veri_Yolu();
	public  static String pc = "000000000000";
	_19010310039_PC_register(){
		
		
	}
	public void  PC_Load (){
		String veri_yolu_deger=veri_yolu.veri_yolu;
		int z = Integer.parseInt(veri_yolu_deger); 
		int f=ondalýk_al(z);
		String sonuç =Integer.toBinaryString(f);
		while(sonuç.length()<12) {
			sonuç= "0"+sonuç;
			
		}
		pc = sonuç;
		System.out.println("PC REGÝSTER YENÝ DEGER "+pc);
	}
	public void PC_INR(int a) {
		int z = Integer.parseInt(pc); 
		int f=ondalýk_al(z);
		int toplam = f+a;
		String sonuç =Integer.toBinaryString(toplam);
		while(sonuç.length()<12) {
			sonuç= "0"+sonuç;
			
		}
		pc=sonuç;
		System.out.println(pc);
		
	}
	public void PC_Clear() {
		String clear = "000000000000";
		pc=clear;
		System.out.println("PC clear giriþi aktif :");
		System.out.println(pc);
		
	}
	public void veri_yolu_aktar() {
		veri_yolu.sag_gelen(pc);
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
