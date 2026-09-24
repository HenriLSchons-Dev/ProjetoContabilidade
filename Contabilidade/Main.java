import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Cliente[] clientes = new Cliente[50];
        int quantidadeClientes = 0;

        Colaborador[] colaboradores = new Colaborador[50];
        int quantidadeColaboradores = 0;

        Servico[] servicos = new Servico[50];
        int quantidadeServicos = 0;

        PrestacaoServico[] prestacoes = new PrestacaoServico[50];
        int quantidadePrestacoes = 0;

        int opcao;
        int i;
        int j;

        String nome, email, telefone, cadastro, cep, resposta;
        boolean ativo, validar, continuarDocumento;
        int tipoClienteOpcao;
        String cpf, dataNascimento;
        String cnpj, razaoSocial, nomeFantasia, cnae, porte;
        double faturamentoAnual;
        int matricula;
        String cargo;
        int idServico;
        String areaServico, descricaoServico, periodicidade;
        double valorBase;
        String dataInicio, dataFim, status;
        double valorPrestacao;
        int indiceCliente, indiceColaborador, indiceServico;
        String tipoDocumento, arquivoDocumento, competenciaDocumento;

        Endereco endereco;
        ClientePf clientePf;
        ClientePj clientePj;
        Colaborador colaborador;
        Servico servico;
        PrestacaoServico prestacao;
        Documento documento;

        opcao = -1;

        while (opcao != 0) {

            System.out.println();
            System.out.println("===== SISTEMA DE CONTABILIDADE =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar colaborador");
            System.out.println("3 - Cadastrar servico");
            System.out.println("4 - Cadastrar prestacao de servico");
            System.out.println("5 - Listar prestacoes de servico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println();
                    System.out.println("Tipo de cliente:");
                    System.out.println("1 - Pessoa Fisica");
                    System.out.println("2 - Pessoa Juridica");
                    System.out.print("Escolha: ");
                    tipoClienteOpcao = ler.nextInt();
                    ler.nextLine();

                    System.out.print("Nome: ");
                    nome = ler.nextLine();

                    System.out.print("Email: ");
                    email = ler.nextLine();

                    System.out.print("Telefone: ");
                    telefone = ler.nextLine();

                    System.out.print("Data de cadastro: ");
                    cadastro = ler.nextLine();

                    System.out.print("Cliente ativo? (S ou N): ");
                    resposta = ler.nextLine();

                    switch (resposta.charAt(0)) {
                        case 'S':
                        case 's':
                            ativo = true;
                            break;
                        default:
                            ativo = false;
                            break;
                    }

                    System.out.print("CEP: ");
                    cep = ler.nextLine();

                    System.out.print("Endereco validado? (S ou N): ");
                    resposta = ler.nextLine();

                    switch (resposta.charAt(0)) {
                        case 'S':
                        case 's':
                            validar = true;
                            break;
                        default:
                            validar = false;
                            break;
                    }

                    endereco = new Endereco(cep);

                    switch (tipoClienteOpcao) {

                        case 1:

                            System.out.print("CPF: ");
                            cpf = ler.nextLine();

                            System.out.print("Data de nascimento: ");
                            dataNascimento = ler.nextLine();

                            clientePf = new ClientePf(nome, email, telefone, cadastro, ativo);
                            clientePf.setCpf(cpf);
                            clientePf.setDataDenascimento(dataNascimento);
                            clientePf.setEndereco(endereco);

                            clientes[quantidadeClientes] = clientePf;
                            quantidadeClientes++;
                            break;

                        case 2:

                            System.out.print("CNPJ: ");
                            cnpj = ler.nextLine();

                            System.out.print("Razao social: ");
                            razaoSocial = ler.nextLine();

                            System.out.print("Nome fantasia: ");
                            nomeFantasia = ler.nextLine();

                            System.out.print("CNAE: ");
                            cnae = ler.nextLine();

                            System.out.print("Porte: ");
                            porte = ler.nextLine();

                            System.out.print("Faturamento anual: ");
                            faturamentoAnual = ler.nextDouble();
                            ler.nextLine();

                            clientePj = new ClientePj(nome, email, telefone, cadastro, ativo);
                            clientePj.setCnpj(cnpj);
                            clientePj.setRazaoSocial(razaoSocial);
                            clientePj.setNomeFantasia(nomeFantasia);
                            clientePj.setCnae(cnae);
                            clientePj.setPorte(porte);
                            clientePj.setFaturamntoAnual(faturamentoAnual);
                            clientePj.setEndereco(endereco);

                            clientes[quantidadeClientes] = clientePj;
                            quantidadeClientes++;
                            break;

                        default:
                            System.out.println("Tipo de cliente invalido!");
                            break;
                    }

                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:

                    System.out.print("Matricula: ");
                    matricula = ler.nextInt();
                    ler.nextLine();

                    System.out.print("Nome do colaborador: ");
                    nome = ler.nextLine();

                    System.out.print("Cargo: ");
                    cargo = ler.nextLine();

                    colaborador = new Colaborador(matricula, nome, cargo);
                    colaboradores[quantidadeColaboradores] = colaborador;
                    quantidadeColaboradores++;

                    System.out.println("Colaborador cadastrado com sucesso!");
                    break;

                case 3:

                    System.out.print("Id do servico: ");
                    idServico = ler.nextInt();
                    ler.nextLine();

                    System.out.print("Nome do servico: ");
                    nome = ler.nextLine();

                    System.out.print("Area: ");
                    areaServico = ler.nextLine();

                    System.out.print("Descricao: ");
                    descricaoServico = ler.nextLine();

                    System.out.print("Valor base: ");
                    valorBase = ler.nextDouble();
                    ler.nextLine();

                    System.out.print("Periodicidade: ");
                    periodicidade = ler.nextLine();

                    servico = new Servico(idServico, nome, areaServico, descricaoServico, valorBase, periodicidade);
                    servicos[quantidadeServicos] = servico;
                    quantidadeServicos++;

                    System.out.println("Servico cadastrado com sucesso!");
                    break;

                case 4:

                    if (quantidadeClientes == 0 || quantidadeColaboradores == 0 || quantidadeServicos == 0) {

                        System.out.println("Cadastre pelo menos 1 cliente, 1 colaborador e 1 servico antes de continuar.");

                    } else {

                        System.out.println("Clientes cadastrados:");
                        for (i = 0; i < quantidadeClientes; i++) {
                            System.out.println(i + " - " + clientes[i].getNome());
                        }
                        System.out.print("Escolha o indice do cliente: ");
                        indiceCliente = ler.nextInt();
                        ler.nextLine();

                        System.out.println("Colaboradores cadastrados:");
                        for (i = 0; i < quantidadeColaboradores; i++) {
                            System.out.println(i + " - " + colaboradores[i].getNomeColaborador());
                        }
                        System.out.print("Escolha o indice do colaborador: ");
                        indiceColaborador = ler.nextInt();
                        ler.nextLine();

                        System.out.println("Servicos cadastrados:");
                        for (i = 0; i < quantidadeServicos; i++) {
                            System.out.println(i + " - " + servicos[i].getNomeServico());
                        }
                        System.out.print("Escolha o indice do servico: ");
                        indiceServico = ler.nextInt();
                        ler.nextLine();

                        System.out.print("Data de inicio: ");
                        dataInicio = ler.nextLine();

                        System.out.print("Data de fim: ");
                        dataFim = ler.nextLine();

                        System.out.print("Valor: ");
                        valorPrestacao = ler.nextDouble();
                        ler.nextLine();

                        System.out.print("Status: ");
                        status = ler.nextLine();

                        prestacao = new PrestacaoServico(dataInicio, dataFim, valorPrestacao, status);
                        prestacao.setCliente(clientes[indiceCliente]);
                        prestacao.setColaborador(colaboradores[indiceColaborador]);
                        prestacao.setServico(servicos[indiceServico]);

                        continuarDocumento = true;
                        while (continuarDocumento) {

                            System.out.print("Deseja adicionar um documento? (S ou N): ");
                            resposta = ler.nextLine();

                            switch (resposta.charAt(0)) {
                                case 'S':
                                case 's':

                                    System.out.print("Tipo do documento: ");
                                    tipoDocumento = ler.nextLine();

                                    System.out.print("Arquivo: ");
                                    arquivoDocumento = ler.nextLine();

                                    System.out.print("Competencia: ");
                                    competenciaDocumento = ler.nextLine();

                                    documento = new Documento(tipoDocumento, arquivoDocumento, competenciaDocumento);
                                    prestacao.adicionarDocumento(documento);
                                    break;

                                default:
                                    continuarDocumento = false;
                                    break;
                            }
                        }

                        prestacoes[quantidadePrestacoes] = prestacao;
                        quantidadePrestacoes++;

                        System.out.println("Prestacao de servico cadastrada com sucesso!");
                    }
                    break;

                case 5:

                    if (quantidadePrestacoes == 0) {

                        System.out.println("Nenhuma prestacao de servico cadastrada ainda.");

                    } else {

                        for (i = 0; i < quantidadePrestacoes; i++) {

                            prestacao = prestacoes[i];

                            System.out.println();
                            System.out.println("===== PRESTACAO " + i + " =====");
                            System.out.println("Cliente: " + prestacao.getCliente().getNome());

                            if (prestacao.getCliente() instanceof ClientePj) {
                                System.out.println("CNPJ: " + ((ClientePj) prestacao.getCliente()).getCnpj());
                            } else if (prestacao.getCliente() instanceof ClientePf) {
                                System.out.println("CPF: " + ((ClientePf) prestacao.getCliente()).getCpf());
                            }

                            System.out.println("Endereco: " + prestacao.getCliente().getEndereco().getCep());
                            System.out.println("Colaborador responsavel: " + prestacao.getColaborador().getNomeColaborador());
                            System.out.println("Servico: " + prestacao.getServico().getNomeServico());
                            System.out.println("Periodo: " + prestacao.getDataInicio() + " a " + prestacao.getDataFim());
                            System.out.println("Valor: R$ " + prestacao.getValor());
                            System.out.println("Status: " + prestacao.getStatus());

                            System.out.println("Documentos:");
                            for (j = 0; j < prestacao.getQuantidadeDocumentos(); j++) {
                                System.out.println("- " + prestacao.getDocumentos()[j].getTipo()
                                        + " (" + prestacao.getDocumentos()[j].getArquivo()
                                        + ") - competencia " + prestacao.getDocumentos()[j].getCompetencia());
                            }
                        }
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }

        System.out.println("Encerrando o sistema...");
    }
}