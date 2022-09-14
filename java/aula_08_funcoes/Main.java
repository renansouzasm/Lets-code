package aula_08_funcoes;

public class Main {
    public static void main(String args[]) {
        int a, b ,resultado;
        a = 3;
        b = 2;

        resultado = soma(a, b);
        System.out.println(resultado);
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
