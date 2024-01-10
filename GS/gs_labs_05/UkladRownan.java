public class UkladRownan
{
    public static void main(String[] args)
    {
        double  a = 1, b = 2, c = 8,
                d = 2, e = -1, f = 1;
       
        double  W, Wx, Wy;
        double  x, y;

        W  = a * e - d * b;
        Wx = c * e - f * b;
        Wy = a * f - d * c;

        x  = Wx / W;
        y  = Wy / W;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}