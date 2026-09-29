public class Documento {

    private String tipo;
    private String dataEmissao;
    private String orgaoPublico;

    private Servico servico;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getOrgaoPublico() {
        return orgaoPublico;
    }

    public void setOrgaoPublico(String orgaoPublico) {
        this.orgaoPublico = orgaoPublico;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }


}