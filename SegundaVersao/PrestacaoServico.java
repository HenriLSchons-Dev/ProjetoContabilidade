import java.util.ArrayList;
import java.util.List;

public class PrestacaoServico {
    
    private int id;
    private String data;
    private double valorTotal;

    private List<Servico> servicos;
    private List<Documento> documentos;

    public PrestacaoServico(int id, String data, double valorTotal) {

        setId(id);
        setData(data);
        setValorTotal(valorTotal);

        this.servicos = new ArrayList<>();
        this.documentos = new ArrayList<>();
    }

    public double faturamentoServico(){

        double total = 0;

        for(int i = 0; i < servicos.size(); i++){

            total = total + servicos.get(i).getValor();

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

    public void adicionarServico(Servico servico){
        servicos.add(servico);
    }

    public void adicionarDocumento(Documento documento){
        documentos.add(documento);
    }

}