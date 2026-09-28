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

    public ClientePj(int id, String cnpj, String razaoSocial, String nomeFantasia, double faturamentoMensal, String cnae, Cliente cliente, Endereco endereco, PrestacaoServico prestacaoServico) {
        this.id = id;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.faturamentoMensal = faturamentoMensal;
        this.cnae = cnae;
        this.cliente = cliente;
        this.endereco = endereco;
        this.prestacaoServico = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public double getFaturamentoMensal() {
        return faturamentoMensal;
    }

    public void setFaturamentoMensal(double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
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

    public boolean validarCNPJ(){

    }

    public void adicionarPrestacao(PrestacaoServico prestacaoServico){

        prestacaoServicos.add(prestacaoServico);
    }
}
