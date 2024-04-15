import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            try (Scanner lector = new Scanner(System.in)) {
                System.out.println("Tabla inicial");
                int tablaInicial = lector.nextInt();
                System.out.println("Tabla final");
                int tablaFinal = lector.nextInt();
                for (int i = tablaInicial; i <= tablaFinal; i++) {
                    for (int j = 1; j <=10; j++) {
                System.out.println( i + "\tx\t " + j + " = " + (i * j ) );
    
                    }
                System.out.println("------------------");
                    lector.close();

            }
    }  
    }
}
