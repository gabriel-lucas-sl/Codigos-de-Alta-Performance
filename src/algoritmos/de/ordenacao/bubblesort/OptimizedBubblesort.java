package algoritmos.de.ordenacao.bubblesort;

public class OptimizedBubblesort {

    public static void main(String[] args) {

        int vector[] = new int[]{10, 1, 342, 0, 87, 33, 45, 99};

        boolean change = true;
        for (int i = 0; i < vector.length - 1 && change == true; i++) {
            int aux;
            change = false;
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j+1]) {
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                    change = true;
                }
            }
        }
        for (int n = 0; n < vector.length; n++) {
            System.out.println(n+1 + " - " + vector[n]);
        }
    }

}
