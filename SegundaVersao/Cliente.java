import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    private List<ClientePj> empresas;
    private List<PrestacaoServico> prestacaoServicos;


    public Cliente(int id, String nome, String cpf, String telefone, String email) {
        setId(id);
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setEmail(email);
        this.prestacaoServicos = new ArrayList<>();
        this.empresas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Nome vazio");
        } else {
            this.nome = nome;
        }
    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone.matches("\\d{11}")){
            this.telefone = telefone;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@") && email.contains(".")){
            this.email = email;
        }
    }

    public void adicionarEmpresa(ClientePj clientePj){
        empresas.add(clientePj);
    }

    public void adicionarPrestacao(PrestacaoServico prestacaoServico){
        prestacaoServicos.add(prestacaoServico);
    }

    public void listaEmpresas(){
        if(empresas.size() == 0){
            System.out.println("Nao ha empresas cadastradas neste cliente");
        }
        else{
            System.out.println("=======Empresas=======");

            for(int i = 0; i < empresas.size(); i++){
                empresas.get(i).getRazaoSocial();
            }
        }
    }
    
    public ClientePj buscarEmpresa(int id){

        for(int i = 0; i < empresas.size(); i++){

            if(empresas.get(i).getId() == id){

                return empresas.get(i);
            }
        }
        return null;
    }
    
}
