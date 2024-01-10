public class CzesciWspolne
{
    public static int compare(int point1, int point2)
    {
        if( point1 > point2 )
            return point1;
        else
            return point2;
    }

    public static void main(String[] args)
    {
        int Ax1 = -2, Ay1 =  1,
            Ax2 =  3, Ay2 = -4,
            Bx1 = -1, By1 =  2,
            Bx2 =  4, By2 = -3;

        int Cx1 = compare(Ax1, Bx1), Cy1 = compare(Ay1, By1),
            Cx2 = compare(Ax2, Bx2), Cy2 = compare(Ay2, By2);

        System.out.println
        ( 
            Cx1 + ", " + Cy1 + "\n" +
            Cx2 + ", " + Cy2
        );
    }
}