import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        HashMap<String, Integer> Clientes = new HashMap<String, Integer>();

        Scanner leitor = new Scanner(System.in);
        Integer condicao = 1;
        Integer decisao = 1;

        //CADASTRO CLIENTE
        while(condicao == 1) {

            System.out.print("Digite aqui seu nome: ");
            String nome = leitor.next();

            System.out.print("Sua idade: ");
            Integer idade = leitor.nextInt();

            Clientes.put(nome, idade);

            System.out.print("\nDeseja contiunar? digite 1 para sim e 0 para não: ");
            condicao = leitor.nextInt();

        }

        System.out.println("\n1 - Adicionar cliente \n2 - Deletar cliente\n3 - Atualizar cliente");
        System.out.print("\nEscolha a operação que você deseja: ");
        decisao = leitor.nextInt();

        //ADCIONANDO CLIENTE
        if(decisao == 1){

            System.out.println("Todos os clientes atualmente cadastrados no momento\n" + Clientes);

            System.out.println("\nDigite o novo valor do nome + sua idade");
            String novoValorNome = leitor.next(); Integer novaIdade = leitor.nextInt();
            Clientes.put(novoValorNome, novaIdade);

            System.out.println("Novo map: " + Clientes);

            //DELETANDO CLIENTE
        } else if (decisao == 2) {
            System.out.println("Todos os clientes atualmente cadastrados no momento\n");
            System.out.println(Clientes);

            System.out.print("Digite o nome do cliente que você quer deletar: ");
            String nomeEscolha = leitor.next();
            Clientes.remove(nomeEscolha);

            System.out.println("\nNovo map");
            System.out.println(Clientes);

        }

    }


}