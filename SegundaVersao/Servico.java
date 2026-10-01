public class Servico {
    
    private String tipo;
    private String area;
    private String descricao;
    private double valor;

    public Servico(String tipo, String area, String descricao, double valor) {
        setTipo(tipo);
        setArea(area);
        setDescricao(descricao);
        setValor(valor);
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if(area == null || area.trim().isEmpty()){
            System.out.println("Area vazia");
        } else {
            this.area = area;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao == null || descricao.trim().isEmpty()){
            System.out.println("Descricao vazia");
        } else {
            this.descricao = descricao;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor >= 0){
            this.valor = valor;
        }
    }

}