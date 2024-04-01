public class Lista_Simples_exercicio7 {

    private static class NO {
        public int dado;
        public NO prox;
    }

    public static void main(String[] args) {

        NO lista = null;
        System.out.println("Valor ponteiro lista= " + lista);


        NO novo1 = new NO();
        novo1.dado= 2;
        novo1.prox = lista;
        lista = novo1;

        NO novo2 = new NO();
        novo2.dado= 5;
        novo2.prox = null;
        lista.prox = novo2;


    }
}
