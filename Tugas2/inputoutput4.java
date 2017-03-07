import java.util.Scanner;

public class inputoutput4{
public static void main (String[]argv){

Scanner input = new Scanner(System.in);
	String nama;
	char jenisKelamin;
	int tinggiBadan;
	boolean menikah;
System.out.print("Masukkan Nama :");
nama = input.nextLine();


System.out.print("Masukkan Jenis Kelamin :");
JenisKelamin = input.next().charAt(0);


System.out.print("Masukkan Tinggi badan :");
tinggiBadan = input.nexInt();


System.out.print("Masukkan Status Menikah :");
menikah = input.nextBoolean();

}
}