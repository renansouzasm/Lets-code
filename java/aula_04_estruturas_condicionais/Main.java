package aula_04_estruturas_condicionais;

public class Main {
    public static void main(String args[]) {
        int nota = 90;
        String graduacao;

        // A 80 B 70 C 60 D 0
        if (nota >= 80) {
            graduacao = "A";
        } else if (nota >= 70) {
            graduacao = "B";
        } else if (nota >= 60) {
            graduacao = "C";
        } else if (nota >= 0) {
            graduacao = "D";            
        } else {
            graduacao = null;
        }

        switch (graduacao) {
            case "A":
            case "B":
                graduacao = "Aluno aprovado!";
                break;
            case "C":
            case "D":
                graduacao = "Não aprovado.";
                break;
            default:
                graduacao = "Graduação inválida";
        }

        System.out.println(graduacao);
    }
}
