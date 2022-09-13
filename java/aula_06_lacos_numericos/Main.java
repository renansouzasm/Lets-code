package aula_06_lacos_numericos;

public class Main {
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            for (int x = 0; x <= 10; x++) {
                System.out.printf("%sx%s = %s\n", i, x, (x * i));
            }
            System.out.println("________");
        }
    }
}
