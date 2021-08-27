package arvores.binarias;

public class ARVORE {
    public int dado;
    public ARVORE direita;
    public ARVORE esquerda;

    private static void mostraEmOrdem(ARVORE ponteiro) {
        if (ponteiro != null) {
            mostraEmOrdem(ponteiro.esquerda);
            System.out.println(" " + ponteiro.dado);
            mostraEmOrdem(ponteiro.direita);
        }
    }
}
