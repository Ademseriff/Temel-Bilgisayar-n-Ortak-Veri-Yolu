import java.util.Scanner;

public class _19010310039_okuma_iþlemleri {
	_19010310039_AR_register ar = new _19010310039_AR_register();
	_19010310039_DR_register dr = new _19010310039_DR_register();
	_19010310039_PC_register pc = new _19010310039_PC_register();
	_19010310039_AC_register ac = new _19010310039_AC_register();
	_19010310039_TR_register tr = new _19010310039_TR_register();
	_19010310039_IR_register ýr = new _19010310039_IR_register();
	_19010310039_OUTR_register outr = new _19010310039_OUTR_register();
	_19010310039_Encoder encoder = new _19010310039_Encoder();
	_19010310039_Veri_Yolu veri_yolu = new _19010310039_Veri_Yolu();
	_19010310039_Memory  memory = new _19010310039_Memory();
	_19010310039_okuma_iþlemleri(String a){
		
		String[] strArray = new String[6];
		strArray = a.split(" ");
		String b =strArray[0];
		
		//LOAD ÝÞLEMÝ 
		for (int i = 1; i < strArray.length; i++) {
			
	
		    if(!strArray[0].equals(strArray[2]) && (strArray.length==3)) {

				if(strArray[i].equals("TR")) {
					encoder.encoder_1(strArray[i]);
					tr.veri_yolu_aktar();
				}
				else if(strArray[i].equals("AC")) {
					encoder.encoder_1(strArray[i]);
					ac.veri_yolu_aktar();
				}
				else if(strArray[i].equals("DR")) {
					encoder.encoder_1(strArray[i]);
					dr.veri_yolu_aktar();
				}
				else if(strArray[i].equals("AR")) {
					encoder.encoder_1(strArray[i]);
					ar.veri_yolu_aktar();
				}
				else if(strArray[i].equals("M[AR]")) {
					encoder.encoder_1(strArray[i]);
					memory.memory_read(ar.ar);
				}
				
				
				
			}
		     else if(!strArray[0].equals(strArray[2]) ) {
				
				if(strArray[i].equals("TR")) {
					if(strArray[i+1].equals("+")) {
						
						int gönder = Integer.valueOf(strArray[i+2]);
						tr.TR_INR(gönder);
					}
					
					encoder.encoder_1(strArray[i]);
					tr.veri_yolu_aktar();
					
				}
				else if(strArray[i].equals("AC")) {
					if(strArray[i+1].equals("+")) {
						
						int gönder = Integer.valueOf(strArray[i+2]);
						ac.AC_INR(gönder);
					}
					encoder.encoder_1(strArray[i]);
					ac.veri_yolu_aktar();
				}
				else if(strArray[i].equals("DR")) {
					if(strArray[i+1].equals("+")) {
						
						int gönder = Integer.valueOf(strArray[i+2]);
						dr.DR_INR(gönder);
					}
					encoder.encoder_1(strArray[i]);
					dr.veri_yolu_aktar();
				}
				else if(strArray[i].equals("AR")) {
					if(strArray[i+1].equals("+")) {
						
						int gönder = Integer.valueOf(strArray[i+2]);
						ar.AR_INR(gönder);
					}
					encoder.encoder_1(strArray[i]);
					ar.veri_yolu_aktar();
				}
			}
		
		}
		
		
		for (int i = 1; i < strArray.length; i++) {
			if (strArray[2].equals("0")) {
				if(b.equals("AR")) {
					ar.AR_Clear();
				}
				else if(b.equals("PC")) {
					pc.PC_Clear();
				}
				else if(b.equals("DR")) {
					dr.DR_Clear();
				}
				else if(b.equals("AC")) {
					ac.AC_Clear();
				}
				else if(b.equals("TR")) {
					tr.TR_Clear();
				}
			}
		}
		
		
		for (int i = 1; i < strArray.length; i++) {
			if(strArray[0].equals(strArray[2])) {
				
			
			if(strArray[i].equals("TR")) {
				if(strArray[i+1].equals("+")) {
					//System.out.println(strArray[i+2]);
					int gönder = Integer.valueOf(strArray[i+2]);
					System.out.println("arttýrma iþlemi yapýlýyor..");
					tr.TR_INR(gönder);
				}
		   }
		 	
			 if(strArray[i].equals("AC")) {
				if(strArray[i+1].equals("+")) {
					
					int gönder = Integer.valueOf(strArray[i+2]);
					System.out.println("arttýrma iþlemi yapýlýyor..");
					ac.AC_INR(gönder);
				}
		}
			
			if(strArray[i].equals("DR")) {
				if(strArray[i+1].equals("+")) {
					
					System.out.println("arttýrma iþlemi yapýlýyor..");
					int gönder = Integer.valueOf(strArray[i+2]);
					dr.DR_INR(gönder);
				}
		    }
			if(strArray[i].equals("AR")) {
				if(strArray[i+1].equals("+")) {
					
					int gönder = Integer.valueOf(strArray[i+2]);
					System.out.println("arttýrma iþlemi yapýlýyor..");
					ar.AR_INR(gönder);
				}
			
		}
		}}
		
		
		if(!b.equals(strArray[2]) &&( (strArray[2].equals("AC"))|| (strArray[2].equals("PC"))|| (strArray[2].equals("DR"))|| (strArray[2].equals("TR"))|| (strArray[2].equals("IR")|| (strArray[2].equals("M[AR]"))|| (strArray[2].equals("AR"))))) {
			
		
		    if(b.equals("DR")) {
			     dr.DR_Load();
			
		     }
		    if(b.equals("TR")) {
			   tr.TR_Load();
			
		     }
            if(b.equals("IR")) {
			   ýr.IR_Load();
			
		     }
            if(b.equals("AC")) {
			   ac.AC_Load();
			
		    }
            if(b.equals("PC")) {
		     	pc.PC_Load();
			
		    }
           if(b.equals("AR")) {
			    ar.AR_Load();
			
		   }
           if(b.equals("OUTR")) {
			    outr.OUTR_Load();
			
		  }
           if(b.equals("M[AR]")) {
			    memory.memory_write();
			
		  }
	   }
	
}}
