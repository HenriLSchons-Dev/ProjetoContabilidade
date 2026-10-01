import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        int opcao = -1, tipo;
        int auxiliar2, i;
        boolean auxiliar3;
        String auxiliar1;
        double FaturamentoTotal = 0;
        Cliente cliente;
        ClientePj empresa;
        PrestacaoServico pServico;
        Servico servico;
        Documento documento;

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

                    System.out.println("=========Cadastrar Cliente=========");
                    System.out.println("1 - CPF");
                    System.out.println("2 - CNPJ");
                    System.out.println("3 - Voltar");

                    tipo = ler.nextInt();
                    ler.nextLine();

                        switch(tipo){

                            case 1: 
                                cliente = new Cliente(0, "0", "", "", "");
                                
                                System.out.print("Nome: ");
                                cliente.setNome(ler.nextLine());

                                System.out.print("Cpf: ");
                                cliente.setCpf(ler.nextLine());

                                System.out.print("Telefone: ");
                                cliente.setTelefone(ler.nextLine());

                                System.out.print("Email: ");
                                cliente.setEmail(ler.nextLine());

                                System.out.print("ID: ");
                                cliente.setId(ler.nextInt());
                                ler.nextLine();

                                clientes.add(cliente);

                                break;
                            case 2:
                                
                                auxiliar3 = false;

                                System.out.println("==Selecione o cliente para vincular a empresa==");

                                for(i = 0; i < clientes.size(); i++){

                                    System.out.println("ID: " + clientes.get(i).getId());
                                    System.out.println("Nome: " + clientes.get(i).getNome() + "\n");

                                }
                                System.out.print("Digite o id do Cliente: ");
                                auxiliar2 = ler.nextInt();
                                ler.nextLine();

                                for(i = 0; i < clientes.size(); i++){

                                    if(clientes.get(i).getId() == auxiliar2){

                                        empresa = new ClientePj(0,"","","",0,"");

                                        System.out.print("Id: ");
                                        empresa.setId(ler.nextInt());
                                        ler.nextLine();

                                        System.out.print("CNPJ: ");
                                        empresa.setCnpj(ler.nextLine());

                                        System.out.print("Razao Social: ");
                                        empresa.setRazaoSocial(ler.nextLine());

                                        System.out.print("Nome Fantasia: ");
                                        empresa.setNomeFantasia(ler.nextLine());

                                        System.out.print("Faturamento Mensal: ");
                                        empresa.setFaturamentoMensal(ler.nextDouble());
                                        ler.nextLine();

                                        System.out.print("CNAE: ");
                                        empresa.setCnae(ler.nextLine());

                                        clientes.get(i).adicionarEmpresa(empresa);

                                        auxiliar3 = true;
                                    }
                                }

                                if (auxiliar3 == false) {
                                    
                                    System.out.println("Este Id e invalido");
                                    
                                }

                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Opcao invalida");
                                break;
                        }

                    break;
                case 2:
                    System.out.println("=========Novo Servico=========");
                    System.out.println("1 - Para um CPF");
                    System.out.println("2 - Para um CNPJ");
                    System.out.println("3 - Voltar");
                        
                    tipo = ler.nextInt();
                    ler.nextLine();
                        
                        switch(tipo){

                            case 1:

                                auxiliar3 = false;

                                System.out.println("==Selecione o cliente para vincular o Servico==");

                                for(i = 0; i < clientes.size(); i++){

                                    System.out.println("ID: " + clientes.get(i).getId());
                                    System.out.println("Nome: " + clientes.get(i).getNome() + "\n");

                                }
                                System.out.print("Digite o id do Cliente: ");
                                auxiliar2 = ler.nextInt();
                                ler.nextLine();

                                for(i = 0; i < clientes.size(); i++){

                                    if(clientes.get(i).getId() == auxiliar2){

                                        pServico = new PrestacaoServico(0, "", 0);
                                        servico = new Servico("", "", "", 0);
                                        documento = new Documento("", "", "");

                                        System.out.println("=====Servico=====");

                                        System.out.println("Qual o tipo de Servico: ");
                                        servico.setTipo(ler.nextLine());

                                        System.out.println("Qual a area: ");
                                        servico.setArea(ler.nextLine());

                                        System.out.println("O que sera feito: ");
                                        servico.setDescricao(ler.nextLine());

                                        System.out.println("Qual o valor cobrado: ");
                                        servico.setValor(ler.nextDouble());
                                        ler.nextLine();

                                        System.out.println("=====Documento=====");

                                        System.out.println("Qual o tipo de documento: ");
                                        documento.setTipo(ler.nextLine());

                                        System.out.println("Data de emissao do documento: ");
                                        documento.setDataEmissao(ler.nextLine());

                                        System.out.println("Qual orgao publico emitiu o documento: ");
                                        documento.setOrgaoPublico(ler.nextLine());

                                        System.out.println("=====Emissao da Prestacao de servico=====");

                                        pServico.adicionarServico(servico);
                                        pServico.adicionarDocumento(documento);

                                        System.out.println("ID da operacao: ");
                                        pServico.setId(ler.nextInt());
                                        ler.nextLine();

                                        System.out.println("Data que foi realizada: ");
                                        pServico.setData(ler.nextLine());

                                        System.out.println("Valor do servico: " + pServico.faturamentoServico());
                                        pServico.setValorTotal(pServico.faturamentoServico());

                                        System.out.println("Servico prestado resgistado!");
                                        
                                        clientes.get(i).adicionarPrestacao(pServico);

                                        auxiliar3 = true;

                                    }
                                }
                                if(auxiliar3 == false){
                                    System.out.println("ID selecionado não existe");
                                }

                                break;
                            case 2:

                                auxiliar3 = false;

                                System.out.println("==Selecione o cliente para vincular o Servico==");

                                for(i = 0; i < clientes.size(); i++){

                                    System.out.println("ID: " + clientes.get(i).getId());
                                    System.out.println("Nome: " + clientes.get(i).getNome() + "\n");

                                }
                                System.out.print("Digite o id do Cliente: ");
                                auxiliar2 = ler.nextInt();
                                ler.nextLine();

                                for(i = 0; i < clientes.size(); i++){

                                    if(clientes.get(i).getId() == auxiliar2){

                                        auxiliar3 = true;

                                        System.out.println("==Selecione a empresa para vincular o Servico==");
                                        clientes.get(i).listaEmpresas();

                                        System.out.print("Digite o id da Empresa: ");
                                        auxiliar2 = ler.nextInt();
                                        ler.nextLine();

                                        empresa = clientes.get(i).buscarEmpresa(auxiliar2);

                                        if(empresa == null){

                                            System.out.println("Esta empresa nao existe");

                                        }
                                        else{

                                            pServico = new PrestacaoServico(0, "", 0);
                                            servico = new Servico("", "", "", 0);
                                            documento = new Documento("", "", "");

                                            System.out.println("=====Servico=====");

                                            System.out.println("Qual o tipo de Servico: ");
                                            servico.setTipo(ler.nextLine());

                                            System.out.println("Qual a area: ");
                                            servico.setArea(ler.nextLine());

                                            System.out.println("O que sera feito: ");
                                            servico.setDescricao(ler.nextLine());

                                            System.out.println("Qual o valor cobrado: ");
                                            servico.setValor(ler.nextDouble());
                                            ler.nextLine();

                                            System.out.println("=====Documento=====");

                                            System.out.println("Qual o tipo de documento: ");
                                            documento.setTipo(ler.nextLine());

                                            System.out.println("Data de emissao do documento: ");
                                            documento.setDataEmissao(ler.nextLine());

                                            System.out.println("Qual orgao publico emitiu o documento: ");
                                            documento.setOrgaoPublico(ler.nextLine());

                                            System.out.println("=====Emissao da Prestacao de servico=====");

                                            pServico.adicionarServico(servico);
                                            pServico.adicionarDocumento(documento);

                                            System.out.println("ID da operacao: ");
                                            pServico.setId(ler.nextInt());
                                            ler.nextLine();

                                            System.out.println("Data que foi realizada: ");
                                            pServico.setData(ler.nextLine());

                                            System.out.println("Valor do servico: " + pServico.faturamentoServico());
                                            pServico.setValorTotal(pServico.faturamentoServico());

                                            empresa.adicionarPrestacao(pServico);

                                            System.out.println("Servico prestado resgistado!");

                                        }

                                        break;
                                    }
                                }

                                if(auxiliar3 == false){
                                    System.out.println("ID selecionado não existe");
                                }

                                break;

                            case 3:
                                break;
                            default:
                                System.out.println("Opcao invalida");
                                break;
                        }

                    break;
                case 3:

                    System.out.println("=========Lista de Cliente=========");

                        for(i = 0; i < clientes.size(); i++){

                            clientes.get(i).mostraDados();

                        }

                    break;
                case 4:
                    System.out.println("=========Financeiro=========");

                    FaturamentoTotal = 0;

                    for(i = 0; i < clientes.size(); i++){

                        FaturamentoTotal = FaturamentoTotal + clientes.get(i).faturamentoCPF();

                    }
                    for(i = 0; i < clientes.size(); i++){

                        FaturamentoTotal = FaturamentoTotal + clientes.get(i).faturamentoCNPJ();

                    }

                    System.out.println("O Faturamento total atual: " + FaturamentoTotal);

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