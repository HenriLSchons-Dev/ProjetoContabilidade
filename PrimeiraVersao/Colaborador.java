public class Colaborador {
    
    private int matricula;
    private String nomeColaborador;
    private String cargo;

    public Colaborador(){

    }

    public Colaborador(int matricula, String nomeColaborador, String cargo) {
        setMatricula(matricula);
        setNomeColaborador(nomeColaborador);
        setCargo(cargo);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula > 0){
            this.matricula = matricula;
        }
    }

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        if(nomeColaborador == null || nomeColaborador.trim().isEmpty()){
            System.out.println("Colaborador em branco");
        } else {
            this.nomeColaborador = nomeColaborador;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if(cargo == null || cargo.trim().isEmpty()){
            System.out.println("Cargo em branco");
        } else {
            this.cargo = cargo;
        }
    }
}