
public class _19010310039_Memory {
	_19010310039_Veri_Yolu yol = new _19010310039_Veri_Yolu();
	public static String[][] Memory_ram = new String[4096][2];
	public String[][] Memory_1(){
		
		for(int i=4095;i>=0;i--) {
			  for(int j=0;j<2;j++) {
				  String a=Integer.toBinaryString(i);
				  String b = "0000";
				  if(j==0) {
					  
					  Memory_ram[i][j]=b;
				  }
				  if(j==1) {
					  Memory_ram[i][j]=a;
					  if(i<=2047 && i>=1024) {
						  a= "0"+a;
						  Memory_ram[i][j]=a;
					  }
					  else if(i<=1023 && i>=512) {
						  a= "00"+a;
						  Memory_ram[i][j]=a;
					  }
					  else if(i<=511 && i>=256) {
						  a= "000"+a;
						  Memory_ram[i][j]=a;
					  }
					  else if(i<=255 && i>=128) {
						  a= "0000"+a;
						  Memory_ram[i][j]=a;
					  }
					  else if(i<=127 && i>=64) {
						  a= "00000"+a;
						  Memory_ram[i][j]=a;
					  }
					  
					  
					  else if(i<=63 && i>=32) {
						  a= "000000"+a;
						  Memory_ram[i][j]=a;
					  }
					  else if(i<=31 && i>=16) {
						  a= "0000000"+a;
						  Memory_ram[i][j]=a;
					  }
					  else if(i<=15 && i>=8) {
						  a= "00000000"+a;
						  Memory_ram[i][j]=a;
					  }
					  else if(i<=15 && i>=8) {
						  a= "000000000"+a;
						  Memory_ram[i][j]=a;
					  }
					  else if(i<=7 && i>=4) {
						  a= "000000000"+a;
						  Memory_ram[i][j]=a;
					  }
					  else if(i<=3 && i>=2) {
						  a= "0000000000"+a;
						  Memory_ram[i][j]=a;
					  }
					  else if(i<=1 && i>=0) {
						  a= "00000000000"+a;
						  Memory_ram[i][j]=a;
					  }
					  
					  
				  }
				  
				  System.out.print(Memory_ram[i][j]);
			  }
			  
			 System.out.println();
		}
		
		System.out.println("!!! Bellek OLUSTURULDU !!!");
	
		return Memory_ram;
		
	}
	public void memory_read(String a) {
		for(int i=4095;i>=0;i--) {
			
		if(Memory_ram[i][1].equals(a)) {
			//String a =Memory_ram;
			String veri_yolu =Memory_ram[i][0]+Memory_ram[i][1];
			yol.sag_gelen(veri_yolu);
			
		}
		
		}
		
	}
	public void memory_write() {
		String veri_yolu_deger= yol.veri_yolu;
		
		for(int i=4095;i>=0;i--) {
			String memory =Memory_ram[i][0]+Memory_ram[i][1];
			if(memory.equals(veri_yolu_deger)) {

				int z = Integer.parseInt(veri_yolu_deger); 
				int f= ondalýk_al(z);
				String sonuç =Integer.toBinaryString(f);
				while(sonuç.length()<12) {
					sonuç= "0"+sonuç;
					
				}
				Memory_ram[i][0]="0000";
				Memory_ram[i][1] = sonuç;
				System.out.println("yazma iþlemi tamam: konumdaki yeni deðer :"+Memory_ram[i][0]+Memory_ram[i][1]);

			}
			
			}
		
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
