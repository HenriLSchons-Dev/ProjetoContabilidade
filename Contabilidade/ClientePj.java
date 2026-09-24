public class ClientePj extends Cliente{
    ClientePj(String nome, String email, String telefone, String cadastro, boolean ativo) {

        super(nome, email, telefone, cadastro, ativo);
    }

    private String cnpj; 
    private String razaoSocial;
    private String nomeFantasia;
    private String cnae;
    private String porte;
    private double faturamentoAnual;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        if(validarCNPJ(cnpj)){
            this.cnpj = cnpj;
        }
    }

    public boolean validarCNPJ(String cnpj) {

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

        int[] pesosPrimeiroDigito = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0;

        for (int i = 0; i < 12; i++) {
            int numero = Character.getNumericValue(cnpj.charAt(i));
            soma += numero * pesosPrimeiroDigito[i];
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

        int[] pesosSegundoDigito = {
            6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2
        };

        soma = 0;

        for (int i = 0; i < 13; i++) {
            int numero = Character.getNumericValue(cnpj.charAt(i));
            soma += numero * pesosSegundoDigito[i];
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
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        if(razaoSocial == null || razaoSocial.trim().isEmpty()){
            System.out.println("Razao social vazia");
        } else {
            this.razaoSocial = razaoSocial;
        }
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        if(nomeFantasia == null || nomeFantasia.trim().isEmpty()){
            System.out.println("Nome fantasia vazio");
        } else {
            this.nomeFantasia = nomeFantasia;
        }
    }

    public String getCnae() {
        return this.cnae;
    }

    public void setCnae(String cnae) {
        if(cnae == null || cnae.trim().isEmpty()){
            System.out.println("Cnae nao preenchido");
        } else {
            this.cnae = cnae;
        }
    }

    public String getPorte() {
        return this.porte;
    }

    public void setPorte(String porte) {
        if(porte == null || porte.trim().isEmpty()){
            System.out.println("Porte nao preenchido");
        } else {
            this.porte = porte;
        }
    }

    public double getFaturamntoAnual() {
        return this.faturamentoAnual;
    }

    public void setFaturamntoAnual(double faturamentoAnual) {
        if(faturamentoAnual >= 0){
            this.faturamentoAnual = faturamentoAnual;
        }
    }
}