public class UkladRownan
{
    public static void main(String[] args)
    {
        double a = 7, b = 2, c = 1,
               d = 3, e = 4, f = 2;
        
        double W, Wx, Wy;
        double x, y;

        W  = a * e - b * d;
        Wx = c * e - f * b;
        Wy = a * f - d * c;

        x = Wx / W;
        y = Wy / W;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}