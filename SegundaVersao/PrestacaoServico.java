import java.util.List;
import java.util.ArrayList;

public class PrestacaoServico {
    
    private int id;
    private String data;
    private double valorTotal;

    private ClientePj clientePj;
    private Cliente cliente;
    private List<Servico> servicos;
    private List<Documento> documentos;

    public PrestacaoServico(int id, String data, double valorTotal, ClientePj clientePj, Cliente cliente, Servico servicos) {

        this.id = id;
        this.data = data;
        this.valorTotal = valorTotal;
        this.clientePj = clientePj;
        this.cliente = cliente;
        this.servicos = new ArrayList<>();
        this.documentos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ClientePj getClientePj() {
        return clientePj;
    }

    public void setClientePj(ClientePj clientePj) {
        this.clientePj = clientePj;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarServico(Servico servico){

        servicos.add(servico);
    }

    public void adicionarDocumento(Documento documento){

        documentos.add(documento);
    }


}