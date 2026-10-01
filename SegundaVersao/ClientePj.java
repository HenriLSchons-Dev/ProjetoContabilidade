    import java.util.List;
    import java.util.ArrayList;

    public class ClientePj {

        private int id;
        private String cnpj; 
        private String razaoSocial;
        private String nomeFantasia;
        private double faturamentoMensal;
        private String cnae;

        private Cliente cliente;
        private Endereco endereco;

        private List<PrestacaoServico> prestacaoServicos;

        public ClientePj(int id, String cnpj, String razaoSocial, String nomeFantasia, double faturamentoMensal, String cnae) {
            setId(id);
            setCnpj(cnpj);
            setRazaoSocial(razaoSocial);
            setNomeFantasia(nomeFantasia);
            setFaturamentoMensal(faturamentoMensal);
            setCnae(cnae);

            this.prestacaoServicos = new ArrayList<>();
        }

        public double faturamentoEmpresa(){

            double total = 0;

            for(int i = 0; i < prestacaoServicos.size(); i++){

                total = total + prestacaoServicos.get(i).faturamentoServico();

            }

            return total;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            if(id > 0){
                this.id = id;
            }
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
        if (validarCnpj(cnpj)) {
            this.cnpj = cnpj;
        } else {
            System.out.println("CNPJ inválido");
        }
    }

        public boolean validarCnpj(String cnpj) {
            
            if (cnpj == null) {
                return false;
            }

            cnpj = cnpj.replace(".", "").replace("/", "").replace("-", "");

            if (cnpj.length() != 14) {
                return false;
            }

            if (!cnpj.matches("\\d{14}")) {
                return false;
            }

            if (cnpj.chars().distinct().count() == 1) {
                return false;
            }


            int soma = 0;

            int[] pesosPrimeiro = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

            for (int i = 0; i < 12; i++) {
                int numero = Character.getNumericValue(cnpj.charAt(i));
                soma += numero * pesosPrimeiro[i];
            }

            int resto = soma % 11;

            int primeiroDigito;

            if (resto < 2) {
                primeiroDigito = 0;
            } else {
                primeiroDigito = 11 - resto;
            }

            if (primeiroDigito != Character.getNumericValue(cnpj.charAt(12))) {
                return false;
            }
            
            soma = 0;

            int[] pesosSegundo = {
                6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2
            };

            for (int i = 0; i < 13; i++) {
                int numero = Character.getNumericValue(cnpj.charAt(i));
                soma += numero * pesosSegundo[i];
            }

            resto = soma % 11;

            int segundoDigito;

            if (resto < 2) {
                segundoDigito = 0;
            } else {
                segundoDigito = 11 - resto;
            }

            return segundoDigito == Character.getNumericValue(cnpj.charAt(13));
        }

        public String getRazaoSocial() {
            return razaoSocial;
        }

        public void setRazaoSocial(String razaoSocial) {
            if(razaoSocial == null || razaoSocial.trim().isEmpty()){
                System.out.println("Razao social vazia");
            } else {
                this.razaoSocial = razaoSocial;
            }
        }

        public String getNomeFantasia() {
            return nomeFantasia;
        }

        public void setNomeFantasia(String nomeFantasia) {
            if(nomeFantasia == null || nomeFantasia.trim().isEmpty()){
                System.out.println("Nome fantasia vazio");
            } else {
                this.nomeFantasia = nomeFantasia;
            }
        }

        public double getFaturamentoMensal() {
            return faturamentoMensal;
        }

        public void setFaturamentoMensal(double faturamentoMensal) {
            if(faturamentoMensal >= 0){
                this.faturamentoMensal = faturamentoMensal;
            }
        }

        public String getCnae() {
            return cnae;
        }

        public void setCnae(String cnae) {
            if(cnae == null || cnae.trim().isEmpty()){
                System.out.println("CNAE vazio");
            } else {
                this.cnae = cnae;
            }
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }

        public void adicionarPrestacao(PrestacaoServico prestacaoServico){
            prestacaoServicos.add(prestacaoServico);
        }
    }
