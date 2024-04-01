public class Lista_Simples_2_nos{
    private  static class NO {
        public double dado;
        public NO prox;
    }
    public static void main(String[] args) {
        NO lista= null;
        System.out.println("Valor ponteiro lista= "+ lista);
        for(int i=1; i<=2;i++) {
            NO novo= new NO();
            novo.dado= i+4;
            novo.prox= lista;
            lista= novo;
        }
        System.out.println("Dado do NO apontado por lista= "+lista.dado);
        System.out.println("Dado do NO apontado por prox " +lista.prox.dado);}
}