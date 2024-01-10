public class Math
{
	public static void main(String[] args)
	{
		{
			System.out.println("\nZad 4");
			int x = 5;
			System.out.println((x=4) * x);
		}
		
		{
			System.out.println("\nZad 5");
			System.out.println((((1+2*3+4)/(5-6))+78)/(9-(10/11)));
			
			System.out.println(((1+2*3+4)/(5-6)+78)/(9-10./11)); // 737 / 89
		}
		
		{
			System.out.println("\nZad 7");
			double x = 1, d = 1e-16, y = x + d;
			System.out.println(d > 0);
			System.out.println("d = " + d); // pomocnik
			System.out.println(x < y);
			System.out.println("x = " + x); // pomocnik
			System.out.println("y = " + y); // pomocnik
			System.out.println(x == y);
			System.out.println(x > y);
		}
		
		{
			System.out.println("\nZad 8");
			// 10 - 2 - 6 = 2
			int a = 10, b = 5, c = 1, res;
			res = a - ++c - ++b;
			System.out.println("Wynik: " + res);
		}
	}
}