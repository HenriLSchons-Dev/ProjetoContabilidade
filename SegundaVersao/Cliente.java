import java.util.List;
import java.util.ArrayList;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    private List<ClientePj> empresas;
    private List<PrestacaoServico> prestacaoServicos;


    public Cliente(int id, String nome, String cpf, String telefone, String email, PrestacaoServico prestacaoServico, ClientePj empresas) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.prestacaoServicos = new ArrayList<>();
        this.empresas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        if(validarCpf() == true){
            this.cpf = cpf;
        }
        else{
            System.out.println("O cpf nao e valido");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validarCpf(){
         
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
    
}
