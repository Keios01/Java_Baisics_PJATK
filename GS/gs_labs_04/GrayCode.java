public class GrayCode
{
	public static void main(String[] args)
	{
		int size = 2;
		int a[] = {0b0, 0b1};
		int b[] = new int[size * 2];

		for(int n = 0; n < 4; n++)
		{
			/*	copy table a[] to 1st half of table b[],
				it will have leading 0s; */
			for(int i = 0; i < size; i++)
				b[i] = a[i];

			/*	copy inverted table a[] to 2nd half of table b[],
				prepend 1s - use "+ size" (for example size == 2 == 0b10)*/
			for(int i = 0; i < size; i++)
				b[i + size] = a[size - i - 1] + size;

			size *= 2;
			a = b;
			b = new int[size * 2];
		}

		for(int i = 0; i < (size); i++)
		{
			System.out.println
			(
				String.format("%2d", a[i]) // adds padding to single digit numbers
				+ " - "
				+ "00000".substring(Integer.toBinaryString(a[i]).length()) // prevent values like 00010 from displaying as 10
				+ Integer.toBinaryString(a[i])
			);
		}
	}
}

// Brudnopis

/*
	0 - 0000 + 1
	1 - 0001 + 10
	2 - 0011 - 1
	3 - 0010 + 10
	4 - 0110 + 1
	5 - 0111 - 10
	6 - 0101 - 1
	7 - 0100 + 100
	8 - 1100 + 1
	9 - 1101 + 10
	10- 1111 - 1
	11- 1110 - 100
	12- 1010 + 1
	13- 1011 - 10
	14- 1001 - 1
	15- 1000 - 100

	To mi nic nie daje
*/

/*
	0 - 0000	1
	1 - 0001	2
	2 - 0011	1
	3 - 0010	3
	4 - 0110	1
	5 - 0111	2
	6 - 0101	1
	7 - 0100	4
	8 - 1100	1
	9 - 1101	2
	10- 1111	1
	11- 1110	3
	12- 1010	1
	13- 1011	2
	14- 1001	1
	15- 1000	4

	To mi wiele nie daje
*/

/*
	To działa
	https://en.wikipedia.org/wiki/Gray_code#Constructing_an_n-bit_Gray_code

	0
	1

	00
	01
	11
	10

	000
	001
	011
	010
	110
	111
	101
	100

	0000
	0001
	0011
	0010
	0110
	0111
	0101
	0100
	1100
	1101
	1111
	1110
	1010
	1011
	1001
	1000
	*/
