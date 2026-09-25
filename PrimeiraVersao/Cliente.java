public class Cliente {
    
    private String nome;
    private String email;
    private String telefone;
    private String cadastro;
    private boolean ativo;
    private Endereco endereco;

    public Cliente(){

    }

    public Cliente(String nome, String email, String telefone, String cadastro, boolean ativo) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setCadastro(cadastro);
        setAtivo(ativo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Nome em branco");
        } else {
            this.nome = nome;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone != null && telefone.matches("\\d{11}")){
            this.telefone = telefone;
        }
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        if(cadastro == null || cadastro.trim().isEmpty()){
            System.out.println("Cadastro vazio");
        } else {
            this.cadastro = cadastro;
        }
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}