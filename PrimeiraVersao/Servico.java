public class Servico {
    
    private int id;
    private String nomeServico;
    private String area;
    private String descricao;
    private double valorBase;
    private String periodicidade;

    public Servico(){

    }

    public Servico(int id, String nomeServico, String area, String descricao, double valorBase, String periodicidade) {
        setId(id);
        setNomeServico(nomeServico);
        setArea(area);
        setDescricao(descricao);
        setValorBase(valorBase);
        setPeriodicidade(periodicidade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        if(nomeServico == null || nomeServico.trim().isEmpty()){
            System.out.println("Nome em branco");
        } else {
            this.nomeServico = nomeServico;
        }
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if(area == null || area.trim().isEmpty()){
            System.out.println("Area inexistente");
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

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        if(valorBase > 0){
            this.valorBase = valorBase;
        }
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        if(periodicidade == null || periodicidade.trim().isEmpty()){
            System.out.println("Periodicidade inexistente");
        } else {
            this.periodicidade = periodicidade;
        }
    }
}