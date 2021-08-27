package algoritmos.de.ordenacao.bubblesort;

public class Bubblesort {

    public static int N = 8;

    public static void main(String[] args) {
        int vector[] = new int[]{10, 1, 342, 0, 87, 33, 45, 99};

        System.out.println("Ordenando o vetor com Bubblesort");
        for (int i = 0; i < vector.length - 1; i++) {
            int aux;
            for (int j = 0; j < N-i-1; j++) {
                if (vector[j] > vector[j+1]) {
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(i+1 + " - " + vector[i]);
        }
    }
}
