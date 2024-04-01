import java.util.Scanner;
public class Desafio {
    public static class Node{
        public int dado;
        public Node prox;
    }

    public Node ini;
    public Node fim;

    public void INIT(){
        ini = null;
        fim = null;
    }
    public boolean IsEmpty(){
        return (ini == null && fim == null);
    }

    public void ENQUEUE(int item){
        Node novo = new Node();
        novo.prox = null;
        novo.dado = item;
        if(IsEmpty()){
            ini = novo;
        }else{
            fim.prox = novo;
        }
        fim = novo;
    }
    public class Retorno{
        public int dado;
        public boolean ok;
    }
    public Retorno DEQUEUE(){
        Retorno saida = new Retorno();
        if(IsEmpty()){
            saida.ok = false;
        }else{
            saida.dado = ini.dado;
            ini = ini.prox;
            saida.ok = true;
            if(ini == null){
                fim = null;
            }
        }
        return saida;
    }

    public Retorno First(){
        Retorno saida = new Retorno();
        if(IsEmpty()){
            saida.ok = false;
        }else{
            saida.ok = true;
            saida.dado = ini.dado;
        }
        return saida;

    }

    public static void main(String args[]){
        Desafio fila = new Desafio();
        Scanner entrada = new Scanner(System.in);
        int item, resp;
        int opcao = 0;
        fila.INIT();
        do {
            System.out.println("MENU");
            System.out.println("1 - Submete processo");
            System.out.println("2 - Processa");
            System.out.println("3 - Sair");
            opcao = entrada.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Escreva o PID do processo");
                    item = entrada.nextInt();
                    fila.ENQUEUE(item);
                    break;
                case 2:
                    Retorno resultado = fila.First();
                    System.out.println("Processo em execução: " + resultado.dado);
                    resultado = fila.DEQUEUE();
                    System.out.println("Processo concluido? (1 - SIM/2 - NÃO): ");
                    resp = entrada.nextInt();
                    if(resp == 1){

                        System.out.println("Processo concluido: "+resultado.dado);
                    }else{
                        fila.ENQUEUE(resultado.dado);
                    }
                    break;
                case 3:

                        System.out.println("Fim da execução:");
                        while (!fila.IsEmpty()){
                           resultado = fila.DEQUEUE();
                           System.out.println("Processo finalizado! " +resultado.dado);

                    }
                    break;
                default:
                    System.out.println("Opção inválida\n");
            }
        }while (opcao !=3);
        entrada.close();
    }

}
