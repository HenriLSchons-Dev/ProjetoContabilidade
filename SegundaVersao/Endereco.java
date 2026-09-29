public class Endereco {
    
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep) {
        setRua(rua);
        setNumero(numero);
        setBairro(bairro);
        setCidade(cidade);
        setEstado(estado);
        setCep(cep);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if(rua == null || rua.trim().isEmpty()){
            System.out.println("Rua vazia");
        } else {
            this.rua = rua;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if(numero == null || numero.trim().isEmpty()){
            System.out.println("Numero vazio");
        } else {
            this.numero = numero;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if(bairro == null || bairro.trim().isEmpty()){
            System.out.println("Bairro vazio");
        } else {
            this.bairro = bairro;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if(cidade == null || cidade.trim().isEmpty()){
            System.out.println("Cidade vazia");
        } else {
            this.cidade = cidade;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(estado == null || estado.trim().isEmpty()){
            System.out.println("Estado vazio");
        } else {
            this.estado = estado;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(cep == null || cep.trim().isEmpty()){
            System.out.println("cep vazia");
        } else {
            this.cep = cep;
        }
    }

    public boolean validarCep(String cep) {

        if (cep == null) {
            return false;
        }

        cep = cep.replace("-", "");

        if (!cep.matches("\\d{8}")) {
            return false;
        }

        return true;
    }

}