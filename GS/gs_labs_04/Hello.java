public class Hello
{
	public static void main(String[] args)
	{
		System.out.println("Liczby calkowite:");
		int a[] = new int[5];
		a[0] = 5 + 5;
		a[1] = 5 - 2;
		a[2] = 5 * 2;
		a[3] = 5 / 2;
		a[4] = 5 % 2;
		
		for(int i = 0; i < 5; i++)
			System.out.println(a[i]);
		
		System.out.println("Liczby rzeczywiste:");
		double b[] = new double[5];
		b[0] = 5. + 5.2;
		b[1] = 5. - 2.2;
		b[2] = 5. * 2.2;
		b[3] = 5. / 2.;
		b[4] = 5. % 2.2;
		
		for(int i = 0; i < 5; i++)
			System.out.println(b[i]);
		
		System.out.println("Znaki:");
		char c[] = new char[5];
		c[0] = 'a' + 'a';
		c[1] = 'z' - 'a';
		c[2] = 'a' * 'a';
		c[3] = 'a' / 'a';
		c[4] = 'z' % 'a';
		
		for(int i = 0; i < 5; i++)
			System.out.println(c[i]);
	}
}