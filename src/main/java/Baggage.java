
public class Baggage {

    private String resultado;

    public Baggage(int n){
        this.resultado = "";
        this.ordenar(n,0);
        System.out.println(resultado);
    }


    private void ordenar(int n, int desface){
        if (n == 3) {
            this.resultado += ("2 to -1") + "\n";
            this.resultado += ("5 to 2") + "\n";
            this.resultado += ("3 to -3") + "\n";


        } else if (n == 4) {
            this.resultado += ((6  + desface) + " to " + (-1 + desface)) + "\n";
            this.resultado += ((3  + desface) + " to " + (6  + desface)) + "\n";
            this.resultado += ((0  + desface) + " to " + (3  + desface)) + "\n";
            this.resultado += ((7  + desface) + " to " + (0  + desface)) + "\n";


        } else if (n == 5) {
            this.resultado += ((8  + desface) + " to " + (-1  + desface)) + "\n";
            this.resultado += ((3  + desface) + " to " + (8  + desface)) + "\n";
            this.resultado += ((6  + desface) + " to " + (3  + desface)) + "\n";
            this.resultado += ((0  + desface) + " to " + (6  + desface)) + "\n";
            this.resultado += ((9  + desface) + " to " + (0  + desface)) + "\n";


        } else if (n == 6) {
            this.resultado += ((10 + desface) + " to " + (-1 + desface)) + "\n";
            this.resultado += ((7  + desface) + " to " + (10 + desface)) + "\n";
            this.resultado += ((2  + desface) + " to " + (7  + desface)) + "\n";
            this.resultado += ((6  + desface) + " to " + (2  + desface)) + "\n";
            this.resultado += ((0  + desface) + " to " + (6  + desface)) + "\n";
            this.resultado += ((11 + desface) + " to " + (0  + desface)) + "\n";


        } else if (n == 7) {
            this.resultado += ((8  + desface) + " to " + (-1 + desface)) + "\n";
            this.resultado += ((5  + desface) + " to " + (8  + desface)) + "\n";
            this.resultado += ((12 + desface) + " to " + (5  + desface)) + "\n";
            this.resultado += ((3  + desface) + " to " + (12 + desface)) + "\n";
            this.resultado += ((9  + desface) + " to " + (3  + desface)) + "\n";
            this.resultado += ((0  + desface) + " to " + (9  + desface)) + "\n";
            this.resultado += ((13 + desface) + " to " + (0  + desface)) + "\n";


        } else {
            this.resultado += ((2*n - 2 + desface) + " to " + (-1 + desface)) + "\n";
            this.resultado += (3 + desface + " to " + (2*n - 2 + desface)) + "\n";
            ordenar(n - 4, 4 + desface);
            this.resultado += ((0 + desface) + " to " + (2*n - 5 + desface)) + "\n";
            this.resultado += ((2*n - 1 + desface) + " to " + (0  + desface)) + "\n";

        }
    }


}
