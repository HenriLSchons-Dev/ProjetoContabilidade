import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        int opcao = -1;
        Cliente cliente;

        do{
        try{    
            System.out.println("=========Menu=========");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Novo Servico");
            System.out.println("3 - Lista de Clientes");
            System.out.println("4 - Financeiro");
            System.out.println("0 - Finalizar Sistema");
            System.out.print("Escolha a opcao:");

            opcao = ler.nextInt();
            ler.nextLine();

            switch(opcao){

                case 1:

                    System.out.println("=========CadastrarCliente=========");
                    System.out.println("1 - CPF");
                    System.out.println("2 - CNPJ");
                    System.out.println("3 - Voltar");

                    opcao = ler.nextInt();
                    ler.nextLine();

                        switch(opcao){

                            case 1: 
                                cliente = new Cliente(0, "", "", "", "");

                                break;
                            case 2:

                                break;
                            case 3:
                                break;
                        }

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Finalizando. . .");
                    break;
                default:
                    System.out.println("Opcao selecionada e invalida. Tente Novamente!");
                    break;
            }
        }
        catch(Exception e){

            System.out.println("Erro tente novamente. . .");
            ler.nextLine();
        }
        finally{}
        
        }while(opcao != 0);
    }
}