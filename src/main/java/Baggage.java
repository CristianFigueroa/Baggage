public class Baggage {

    public Baggage(int n){
        //System.out.println("------------------------------------------------------");
        ordenar(n,0);
    }


    private void ordenar(int n, int desface){
        System.out.println("DESFACE :"+desface);
        if (n == 3) {
            System.out.println("2 to -1");
            System.out.println("5 to 2");
            System.out.println("3 to -3");


        } else if (n == 4) {
            System.out.println((6  + desface) + " to " + (-1 + desface));
            System.out.println((3  + desface) + " to " + (6  + desface));
            System.out.println((0  + desface) + " to " + (3  + desface));
            System.out.println((7  + desface) + " to " + (0  + desface));


        } else if (n == 5) {
            System.out.println((8  + desface) + " to " + (-1  + desface));
            System.out.println((3  + desface) + " to " + (8  + desface));
            System.out.println((6  + desface) + " to " + (3  + desface));
            System.out.println((0  + desface) + " to " + (6  + desface));
            System.out.println((9  + desface) + " to " + (0  + desface));


        } else if (n == 6) {
            System.out.println((10 + desface) + " to " + (-1 + desface));
            System.out.println((7  + desface) + " to " + (10 + desface));
            System.out.println((2  + desface) + " to " + (7  + desface));
            System.out.println((6  + desface) + " to " + (2  + desface));
            System.out.println((0  + desface) + " to " + (6  + desface));
            System.out.println((11 + desface) + " to " + (0  + desface));


        } else if (n == 7) {
            System.out.println((8  + desface) + " to " + (-1 + desface));
            System.out.println((5  + desface) + " to " + (8  + desface));
            System.out.println((12 + desface) + " to " + (5  + desface));
            System.out.println((3  + desface) + " to " + (12 + desface));
            System.out.println((9  + desface) + " to " + (3  + desface));
            System.out.println((0  + desface) + " to " + (9  + desface));
            System.out.println((13 + desface) + " to " + (0  + desface));


        } else {
            System.out.println((2*n - 2 + desface) + " to " + (-1 + desface));
            System.out.println(3 + desface + " to " + (2*n - 2 + desface));
            System.out.println("------------------------------------------------------");
            ordenar(n - 4, 4 + desface);
            System.out.println("------------------------------------------------------");
            System.out.println((0 + desface) + " to " + (2*n - 5 + desface));
            System.out.println((2*n - 1 + desface) + " to " + (0  + desface));

        }
    }


}
