public class Lista_Encadeada_2Nos {
    private static class Node{
        public int dado;
        public Node prox;
    }

    public static void main(String[] args) {
        //inicia lista vazia, atribuindo null ao ponteiro lista
        Node lista = null;
        System.out.println("Valor ponteiro lista = " + lista);
        for(int i = 1; i<=2; i++){
            //Novo nó é alocado na lista:
            Node novo = new Node();
            novo.dado = i+4;
            novo.prox = lista;
            lista = novo;
        }
        System.out.println("Dado do nó apontado por lista = "+lista.dado );
        System.out.println("Atributos do nó apontado por prox = "+lista.prox.dado );
    }
}
