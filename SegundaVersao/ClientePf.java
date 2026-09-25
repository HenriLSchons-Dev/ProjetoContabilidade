public class ClientePf extends Cliente{


    ClientePf(String nome, String email, String telefone, String cadastro, boolean ativo) {
        super(nome, email, telefone, cadastro, ativo);
    }

    private String cpf;
    private String dataNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(validarCPF(cpf)){
            this.cpf = cpf;
        }
    }

    public boolean validarCPF(String cpf) {

        if (cpf == null) {
            return false;
        }

        cpf = cpf.replace(".", "").replace("-", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (!cpf.matches("\\d{11}")) {
            return false;
        }

        if (cpf.chars().distinct().count() == 1) {
            return false;
        }

        int soma = 0;

        for (int i = 0; i < 9; i++) {
            int numero = Character.getNumericValue(cpf.charAt(i));
            soma += numero * (10 - i);
        }

        int resto = soma % 11;
        int primeiroDigito;

        if (resto < 2) {
            primeiroDigito = 0;
        } else {
            primeiroDigito = 11 - resto;
        }

        if (primeiroDigito != Character.getNumericValue(cpf.charAt(9))) {
            return false;
        }

        soma = 0;

        for (int i = 0; i < 10; i++) {
            int numero = Character.getNumericValue(cpf.charAt(i));
            soma += numero * (11 - i);
        }

        resto = soma % 11;
        int segundoDigito;

        if (resto < 2) {
            segundoDigito = 0;
        } else {
            segundoDigito = 11 - resto;
        }

        return segundoDigito == Character.getNumericValue(cpf.charAt(10));
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataDenascimento(String dataNascimento) {
        if(dataNascimento == null || dataNascimento.trim().isEmpty()){
            System.out.println("Data de nascimento inexistente");
        } else {
            this.dataNascimento = dataNascimento;
        }
    }
    
}