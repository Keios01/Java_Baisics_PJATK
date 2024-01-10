public class Labs6 {
    public static void main(String [] args){

        //first pair
        double a = 7d;
        double d = 3d;

        //second pair
        double b = 2d;
        double e = 4d;

        //third pair
        double c = 1d;
        double f = 2d;

        double x;
        double y;

        double w, wX, wY;

        //first - second
        w = (a * e) - (b * d);
        //third - second
        wX = (c * e) - (b * f);
        //first - third
        wY = (a * f) - (c * d);

        //Camer's rule
        x = wX/w;
        y = wY/w;

        System.out.println(w + " " + wX + " " + wY);
        System.out.println("x = " + x + "  y = " + y);

    }
}