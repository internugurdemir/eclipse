
public class MainV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);

		System.out.println("Hello world");
		
		
		DortIslem asd=new DortIslem();

		System.out.println(asd.Cikar(20, 10));
		System.out.println(asd.Topla(20, 10));
		
		/*
		 * byte	1 byte	Stores whole numbers from -128 to 127
		 * short	2 bytes	Stores whole numbers from -32,768 to 32,767
		 * int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
		 * long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		 * float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		 * double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
		 * boolean	1 bit	Stores true or false values
		 * char	2 bytes	Stores a single character/letter or ASCII values
		 */
		
	}

}
