import java.util.*;
public class Fila_INT2 {
    private static class Node{
        public int dado;
        public Node prox;
    }

    private static Node fim;
    private static Node ini;

    private static class Retorno{
        public int item;
        public boolean ok;
    }

    public void INIT(){
        ini = null;
        fim = null;
    }

    public boolean IsEmpty(){
        return ini == null && fim == null;
    }

    public void ENQUEUE(int valor){
        Node node = new Node();
        node.dado = valor;
        node.prox = null;
        if(IsEmpty()){
            ini = node;
        }else{
            fim.prox = node;
        }
        fim = node;
    }

    public Retorno DEQUEUE(){
        Retorno saida = new Retorno();
        if(!IsEmpty()){
            saida.item = ini.dado;
            ini = ini.prox;
            if(ini==null){
                fim = null;
            }
            saida.ok = true;
        }else{
            saida.ok = false;
        }
        return saida;
    }

    public static void main(String[] args) {
        Fila_INT2 fila = new Fila_INT2();
        Retorno res = new Retorno();
        Scanner entrada = new Scanner(System.in);

        int item,opcao;

        do{
            System.out.println("Digite um número para a fila: ");
            item = entrada.nextInt();
            fila.ENQUEUE(item);
            System.out.println("Digite 0 para sair");
            opcao = entrada.nextInt();
        }while (opcao!=0);

        do{
            res = fila.DEQUEUE();
            if(res.ok){
                System.out.println("Dado retirado: " +res.item);
            }
        }while (res.ok);
        entrada.close();
    }
}
