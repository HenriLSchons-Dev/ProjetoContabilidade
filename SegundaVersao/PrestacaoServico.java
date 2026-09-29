import java.util.ArrayList;
import java.util.List;

public class PrestacaoServico {
    
    private int id;
    private String data;
    private double valorTotal;

    private ClientePj clientePj;
    private Cliente cliente;
    private List<Servico> servicos;
    private List<Documento> documentos;

    public PrestacaoServico(int id, String data, double valorTotal, ClientePj clientePj, Cliente cliente, Servico servicos) {
        setId(id);
        setData(data);
        setValorTotal(valorTotal);
        setClientePj(clientePj);
        setCliente(cliente);
        this.servicos = new ArrayList<>();
        this.documentos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(data == null || data.trim().isEmpty()){
            System.out.println("Data vazia");
        } else {
            this.data = data;
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        if(valorTotal >= 0){
            this.valorTotal = valorTotal;
        }
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