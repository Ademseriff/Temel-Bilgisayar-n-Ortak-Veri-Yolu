
public class _19010310039_Veri_Yolu {
	public  static String veri_yolu = "0000000000000000";
	
    public void sag_gelen(String a) {
    	if(a.length()<16) {
    		a = "0"+a;
    	}
    	
    		veri_yolu=a;
        	System.out.println("veri yolundaki deger "+veri_yolu);
    	
    
		
	}

}
