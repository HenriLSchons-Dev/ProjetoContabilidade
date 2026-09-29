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


}