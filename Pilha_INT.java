import java.util.*;

public class Pilha_INT {

    //definição do NO
    private static class NO{
        public  int dado;
        public NO prox;
    }

    //definição do retornos dos métodos POP e TOP
    private static class Retorno{
        public  int item;
        public final int N = 8;
        int dados[] = new int[N];
        public  boolean ok;
    }
    //definição do ponteiro topo da pilha
    private static NO topo;

    public void INIT() {
        topo = null;
    }

    public boolean IsEmpty() {
        return topo == null;
    }

    public void PUSH(int item) {
        NO novo = new NO();
        novo.dado = item;
        novo.prox = topo;
        topo = novo;
    }

    public Retorno POP() {
        Retorno saida = new Retorno();
        if(!IsEmpty()) {
            saida.item = topo.dado;
            topo = topo.prox;
            saida.ok = true;
        }
        else
            saida.ok = false;
        return saida;
    }

    public Retorno TOP() {
       Retorno saida = new Retorno();
        if(!IsEmpty()) {
            saida.item = topo.dado;
            saida.ok = true;
        }
        else
            saida.ok = false;
        return saida;
    }


    public static void main(String[] args) {

        Pilha_INT s = new Pilha_INT();
        Retorno res = new Retorno();
        Scanner entrada = new Scanner(System.in);
        int resto, num;

//inicia a pilha fazendo topo = null
        s.INIT();

        System.out.print("Digite valor número na base 10: ");
        num = entrada.nextInt();

// fazendo divisões sucessivas e empilhando os valores do
// resto até que num seja zero
        while (num > 0) {
            resto = num % 2;
            s.PUSH(resto);
            num = num/2;
        }

/* escrevendo o resto na ordem inversa que foram obtidos
usando a propriedade LIFO da pilha*/
        System.out.println("Numero em binario: ");
        do {
            res = s.POP();
            if (res.ok)
                System.out.print(" "+ res.item);
        } while (res.ok);
        entrada.close();
    }
}
