
public class _19010310039_IR_register {
	_19010310039_Veri_Yolu veri_yolu = new _19010310039_Veri_Yolu();
	public  static String ýr = "0000000000000000";
	_19010310039_IR_register(){
	}
	public void IR_Load(){
		ýr= veri_yolu.veri_yolu;
		System.out.println("yükleme iþlemi tamam IR register yeni deger ");
		System.out.println(ýr);
	}
	public void veri_yolu_aktar() {
		veri_yolu.sag_gelen(ýr);
	}
}
