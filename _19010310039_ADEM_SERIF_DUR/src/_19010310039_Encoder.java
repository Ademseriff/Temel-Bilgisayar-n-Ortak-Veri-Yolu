
public class _19010310039_Encoder {
	_19010310039_Decoder decoder = new _19010310039_Decoder();
	String AR = "1000000";
	String PC = "0100000";
	String DR = "0010000";
	String AC = "0001000";
	String IR = "0000100";
	String TR = "0000010";
	String BELLEK = "0000001";
	
	void encoder_1(String a){
	   if(a.equals("AR")) {
			decoder.Decoder_1(AR);
			
		}
	   else if(a.equals("PC")) {
		   decoder.Decoder_1(PC);
		}
	   else  if(a.equals("DR")) {
		   decoder.Decoder_1(DR);
		}
	   else if(a.equals("AC")) {
		   decoder.Decoder_1(AC);
		}
	   else if(a.equals("IR")) {
		   decoder.Decoder_1(IR);
		}
	   else if(a.equals("TR")) {
		   decoder.Decoder_1(TR);
		}
	   else if(a.equals("M[AR]")) {
		   System.out.println("bellek read giriþi aktif");
		   decoder.Decoder_1(BELLEK);
		}
	}

}
