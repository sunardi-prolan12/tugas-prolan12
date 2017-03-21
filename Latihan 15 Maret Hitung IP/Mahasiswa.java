import java.util.Scanner;
public class Mahasiswa
{

	public static void main(String[] args)
	{
		
    	        System.out.println("");
    	        System.out.println("	(-999 Untuk Menghitung)");
		Mahasiswa ipmhs = new Mahasiswa();
		Scanner input = new Scanner(System.in);
		float ip,totalip = 0,rata = 0;
		int jmlMhs = 0,jmlMhLls = 0,jmlipsalah = 0,jmlMhtdk = 0;
		System.out.print("Masukkan IP Mahasiswa : ");
			ip = input.nextFloat();
			while(ip != -999)
			{
			if(ipmhs.iswithinRange(ip, 0, 4) == 1 )
			{
			jmlMhs++;
			totalip = totalip +ip;	
	
				if (ip >= 2.75)
				{ if (ip <= 4.00){
					jmlMhLls++;
				   }
				}else if (ip >= 0.00) 
				{ if (ip <= 2.74){
					jmlMhtdk++;
			   }
			}	
			rata = totalip / jmlMhs;
			}
			if (ip >= 4.01) 
			{
				jmlipsalah++;
			}else if (ip <= -0.01){
				jmlipsalah++;
			}
			System.out.print("Masukkan IP Mahasiswa : ");
			    ip = input.nextFloat();			
		} 
		
    	        System.out.println("");
		System.out.println("             KETERANGAN                 ");
		System.out.println("Banyak Mahasiswa                   = " + jmlMhs);
		System.out.println("Data IP salah di abaikan           = " +jmlipsalah);
		System.out.println("");
		System.out.println("Banyaknya Yang lulus               = " + jmlMhLls);
		System.out.println("Banyaknya Yang tidak lulus         = " + jmlMhtdk);
    	        System.out.println("");
		System.out.println("rata rata                          = " + rata);
	}

	int iswithinRange (float x, float min, float max)
	{
		if(x >= min && x <= max)
		{
			return 1;
		}else
		{
			return 0;
		}
	}
}