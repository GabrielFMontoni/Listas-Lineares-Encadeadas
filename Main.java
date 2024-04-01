
public class Main {

    //Declaração Node
    private static class Node{
        public int dado;
        public Node prox;
    }

    public static void main(String[] args) {
        //inicia lista vazia, atribuindo null ao ponteiro lista
        Node lista = null;
        System.out.println("Valor ponteiro lista = " + lista);

        //Novo nó é alocado na lista:
        Node novo = new Node();
        novo.dado = 5;
        novo.prox = lista;
        lista = novo;

        System.out.println("Atributos do nó apontado por lista = "+lista.dado + " " + lista.prox);

    }
}