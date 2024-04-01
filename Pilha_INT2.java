import java.util.*;
public class Pilha_INT2 {
    private static class Node{
        public int dado;
        public Node prox;
    }

    //Retornos POP e TOP
    private static class Retorno{
        public int item;
        public boolean ok;
    }

    private static Node topo;

    public void INIT(){
        topo = null;
    }

    public boolean IsEmpty() {
        return topo==null;
    }

    public void PUSH(int valor){
        Node novo = new Node();
        novo.dado = valor;
        novo.prox = topo;
        topo = novo;
    }

    public Retorno POP(){
        Retorno saida = new Retorno();
        if(!IsEmpty()){
            saida.item = topo.dado;
            topo = topo.prox;
            saida.ok = true;
        }else{
            saida.ok = false;
        }
        return saida;
    }

    public Retorno TOP(){
        Retorno saida = new Retorno();
        if(!IsEmpty()){
            saida.item = topo.dado;
            saida.ok = true;
        }else{
            saida.ok = false;
        }
        return saida;
    }

    public static void main(String[] args) {
        Pilha_INT2 pilha = new Pilha_INT2();
        Scanner entrada = new Scanner(System.in);

        int item;
        int opcao;

        Retorno res = new Retorno();

        pilha.INIT();
        res = pilha.TOP();
        if(res.ok)
            System.out.println("Execução do TOP: "+res.item);
        else
            System.out.println("Pilha vazia!");

        do{
            System.out.println("Digite valor inteiro para dado:");
            item = entrada.nextInt();
            pilha.PUSH(item);
            System.out.println("Digite 0 para sair");
            opcao = entrada.nextInt();
        }while (opcao != 0);


        res = pilha.TOP();
        if(res.ok)
            System.out.println("Execução do TOP: "+res.item);

        do {
            res = pilha.POP();
            if(res.ok){
                System.out.println("Dado retirado: " + res.item);
            }
        }while (res.ok);

        entrada.close();
    }

}
