public class Documento {

    private String tipo;
    private String dataEmissao;
    private String orgaoPublico;

    public Documento(){

    }

    public Documento(String tipo, String dataEmissao, String orgaoPublico){
        setTipo(tipo);
        setDataEmissao(dataEmissao);
        setOrgaoPublico(orgaoPublico);;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo == null || tipo.trim().isEmpty()){
            System.out.println("Tipo vazio");
        } else {
            this.tipo = tipo;
        }
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        if(dataEmissao == null || dataEmissao.trim().isEmpty()){
            System.out.println("Data da emissao vazio");
        } else {
            this.dataEmissao = dataEmissao;
        }
    }

    public String getOrgaoPublico() {
        return orgaoPublico;
    }

    public void setOrgaoPublico(String orgaoPublico) {
        this.orgaoPublico = orgaoPublico;
    }

}