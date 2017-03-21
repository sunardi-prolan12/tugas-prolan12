public class Variable {
	private int a;
	private boolean menikah;
	private char _nama;
		
		public static final String JUDUL = "Belajar Java Yuks";
		public static String judul2 = "Belajar Java Yuks";
		
public static void main(String [] args){
	Variable var = new Variable();
	final int a=12;

	var.a=1;
	
	//a=11; -> tidak bisa di lakukan

	double aa,b,c;
	String nama="nama saya";
	byte bb = 1,B =12;
	System.out.println(JUDUL);
	System.out.println(judul2);
	}

public void tesVariable(){
	System.out.println(a);
	System.out.println(menikah);
	System.out.println(JUDUL);
	System.out.println(judul2);
	}
}

class AksesVariableStatic {
	public void aksesVariableStatic(){
		System.out.println(Variable.JUDUL);
		
//Variable.JUDUL ="Belajar hal lain" -> Tidak Bisa dimasukkan
}
}