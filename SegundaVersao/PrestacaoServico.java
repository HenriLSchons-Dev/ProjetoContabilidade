public class PrestacaoServico {
    
    private String dataInicio;
    private String dataFim;
    private double valor;
    private String status;

    private Cliente cliente;
    private Colaborador colaborador;
    private Servico servico;
    private Documento[] documentos = new Documento[10];
    private int quantidadeDocumentos = 0;

    public PrestacaoServico(){
        
    }

    public PrestacaoServico(String dataInicio, String dataFim, double valor, String status) {
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setValor(valor);
        setStatus(status);
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        if(dataInicio == null || dataInicio.trim().isEmpty()){
            System.out.println("Data de inicio vazia");
        } else {
            this.dataInicio = dataInicio;
        }
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        if(dataFim == null || dataFim.trim().isEmpty()){
            System.out.println("Data de finalizacao vazia");
        } else {
            this.dataFim = dataFim;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor >= 0) {
            this.valor = valor;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(status == null || status.trim().isEmpty()){
            System.out.println("Status em branco");
        } else {
            this.status = status;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void adicionarDocumento(Documento documento) {
        documentos[quantidadeDocumentos] = documento;
        quantidadeDocumentos++;
    }

    public Documento[] getDocumentos() {
        return documentos;
    }

    public int getQuantidadeDocumentos() {
        return quantidadeDocumentos;
    }
}