public class Endereco {
    
    private String cep;

    public Endereco(){

    }

    public Endereco(String cep) {
        setCep(cep);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(validarCep(cep)){
            this.cep = cep;
        }
    }

    public boolean validarCep(String cep) {
        if(cep.matches("\\d{9}") && cep.contains("-")){
            this.cep = cep;
            return true;
        }

        if(cep == null || cep.trim().isEmpty()){
            System.out.println("Cep em branco");
        }
        return false;
    }
}