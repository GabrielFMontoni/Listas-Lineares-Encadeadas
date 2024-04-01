import java.util.Scanner;
public class Pilha_CHAR {
    public static class Node{
        public char dado;
        public Node prox;
    }

    public Node topo;

    public void init(){
        topo = null;
    }

    public boolean isEmpty(){
       return (topo == null);
    }

    public void push(char item){
        Node novo = new Node();
        novo.prox = topo;
        novo.dado = item;
        topo = novo;
    }

    public char top(){
        if(isEmpty()){
            return ' ';
        }else{
            return(topo.dado);
        }
    }

    public char pop(){
        if(!isEmpty()){
            char elem = topo.dado;
            topo = topo.prox;
            return(elem);
        }
        return ' ';
    }

    public void mostra(){
        Node aux = topo;
        while(aux!=null){
            System.out.println(aux.dado);
            aux=aux.prox;
        }
    }


    public static void main(String args[]){
        Pilha_CHAR pilha = new Pilha_CHAR();
        Scanner entrada = new Scanner(System.in);

        char item;
        char comp[] = new char[20];
        int aux = 0;



            System.out.println("Topo: " + pilha.top());
            System.out.println("Digite uma palavra: ");
            String palavra = entrada.nextLine();
            for(int i = 0; i<palavra.length(); i++){
                item = palavra.charAt(i);
                comp[aux] = item;
                aux++;
                pilha.push(item);
            }
            pilha.mostra();

            aux = 0;
            while (!pilha.isEmpty()){
                item = pilha.pop();

                if(item != comp[aux]){
                    System.out.println("Não palindromo");
                    entrada.close();

                    return;
                }
                aux++;
            }
            System.out.println("Palindromo");

            entrada.close();

    }

}
