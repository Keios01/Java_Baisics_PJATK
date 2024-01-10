import java.util.Scanner;

public class Zbiory
{
	public static void main(String[] args)
	{
		// ZADANIE I
		{
			int wrt = -4;
		
			// SPOSÓB 1
			if(((wrt>-15 && wrt<=-10) || (wrt>-5 && wrt<0) || (wrt>5 && wrt<10))
				&& ((wrt<=-13) || (wrt>-8 && wrt<=-3))
				&& (wrt>=-4))
			{
				System.out.println("OK");
			}
			
			
			// SPOSÓB 2
			if((wrt>-15 && wrt<=-10) || (wrt>-5 && wrt<0) || (wrt>5 && wrt<10))
				if((wrt<=-13) || (wrt>-8 && wrt<=-3))
					if(wrt>=-4)
						System.out.println("OK");
					
			// SPOSÓB 3
			if(wrt>=-4 && wrt<=-3)
				System.out.println("OK");
		}
		
		// ZADANIE II
		{
			int a = 3;
			int b = 4;
			
			// Oryginalne wyrażenie
			System.out.println(!(a < b) && !(a > b));
			
			// Proste wyrażenie
			System.out.println((a >= b) && (a <= b));
			
			System.out.println((a == b));
		}
		
		// ZADANIE III
/* 		{
			Scanner scan = new Scanner(System.in);
			int miesiac = scan.nextInt();
			int rok = scan.nextInt();
			switch (miesiac)
			{
				case 2 ->
				{
					if (rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0))
						System.out.println(29);
					else
						System.out.println(28);
				}
				case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
				case 4, 6, 9, 11 -> System.out.println(30);
				default -> System.out.println("Bledne dane");
			}
		}
 */
		// ZADANIE IV
/* 		{
			Scanner scanner = new Scanner(System.in);
			char ch = scanner.next().charAt(0);
			if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
			{
				boolean samogloska = switch (ch)
				{
					case 'a', 'e', 'i', 'o', 'u', 'y' -> { yield true; }
					case 'A', 'E', 'I', 'O', 'U', 'Y' -> { yield true; }
					default -> { yield false; }
				};
				System.out.println(samogloska?"Samogloska":"Spolgloska");
			}
		} */
		
		// ZADANIE V
/* 		{
			Scanner scanner = new Scanner(System.in);
			double zmienna1 = scanner.nextDouble();
			int zmienna1Int = (int)(zmienna1 * 100); // dokładność do 2 miejsc po przecinku

			double zmienna2 = scanner.nextDouble();
			int zmienna2Int = (int)(zmienna2 * 100);

			if(zmienna1Int == zmienna2Int)
				System.out.println("Sa takie same");
		} */

		// ZADANIE VI
/* 		{
			Scanner scanner = new Scanner(System.in);
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int C = scanner.nextInt();

			int biggest;

			if(A + B + C == 180)
			{
				System.out.println("Może istnieć");
				if(A < 90 && B < 90 && C < 90)
					System.out.println("Jest też ostrokątny");
			}
			else
			{
				System.out.println("NIE moze istniec!");
			}
		} */
	}
}