
public class _19010310039_Decoder {
	
	void Decoder_2(String a ) {
		int dönüþmüþ_sayi=Integer.parseInt(a,2);  
		System.out.println("x"+dönüþmüþ_sayi+" sinyali 1 yapýldý");
		
    }
   void Decoder_1(String a) {
	   if(a.equals("1000000")){
		   Decoder_2("001");
	   }
	   else if(a.equals("0100000")) {
		   Decoder_2("010");
	   }
	   else if(a.equals("0010000")) {
    	   Decoder_2("011");
	   }
       else if(a.equals("0001000")) {
    	   Decoder_2("100");
	   }
       else  if(a.equals("0000100")) {
    	   Decoder_2("101");
	   }
       else if(a.equals("0000010")) {
    	   System.out.println("x6 sinyali 1 yapýldý");
    	   Decoder_2("110");
	   }
       else if(a.equals("0000001")) {
    	   System.out.println("x7 sinyali 1 yapýldý");
    	   Decoder_2("111");
	   }
       if (a.equals("0000000")) {
    	   System.out.println("YOL BOÞ ");
	   }
       
	   
   }
}
