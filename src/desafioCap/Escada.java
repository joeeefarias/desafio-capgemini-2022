package desafioCap;

public class Escada {

    public void gerarEscada(int num) {

        // Gera a escada baseado na entrada
        int n = num;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
