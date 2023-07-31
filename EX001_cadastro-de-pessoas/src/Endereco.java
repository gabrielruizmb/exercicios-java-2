public class Endereco {
    private String rua;
    private int numero;

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getRua() {
        return rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
}
