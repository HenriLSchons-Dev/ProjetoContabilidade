public class Servico {
    
    private String tipo;
    private String area;
    private String descricao;
    private double valor;

    private PrestacaoServico prestacaoServico;

    public Servico(String tipo, String area, String descricao, double valor, PrestacaoServico prestacaoServico) {
        this.tipo = tipo;
        this.area = area;
        this.descricao = descricao;
        this.valor = valor;
        this.prestacaoServico = prestacaoServico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public PrestacaoServico getPrestacaoServico() {
        return prestacaoServico;
    }

    public void setPrestacaoServico(PrestacaoServico prestacaoServico) {
        this.prestacaoServico = prestacaoServico;
    }


}