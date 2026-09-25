public class Documento {

    private String tipo;
    private String arquivo;
    private String competencia;

    public Documento(){
        
    }

    public Documento(String tipo, String arquivo, String competencia) {
        setTipo(tipo);
        setArquivo(arquivo);
        setCompetencia(competencia);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo == null || tipo.trim().isEmpty()){
            System.out.println("Tipagem vazia");
        } else {
            this.tipo = tipo;
        }
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        if(arquivo == null || arquivo.trim().isEmpty()){
            System.out.println("Arquivo vazio");
        } else {
            this.arquivo = arquivo;
        }
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        if(competencia == null || competencia.trim().isEmpty()){
            System.out.println("Competencia vazia");
        } else {
            this.competencia = competencia;
        }
    }  
}