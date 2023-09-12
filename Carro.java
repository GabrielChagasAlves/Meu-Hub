

public class Carro {

private String Modelo;
private String Marca;
private int AnoDeFabricacao;
private String cor;

    public Carro() {
    }

    public Carro(String Modelo) {
        this.Modelo = Modelo;
    }

    public Carro(String Modelo, String Marca, int AnoDeFabricacao, String cor) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.AnoDeFabricacao = AnoDeFabricacao;
        this.cor = cor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAnoDeFabricacao() {
        return AnoDeFabricacao;
    }

    public void setAnoDeFabricacao(int AnoDeFabricacao) {
        this.AnoDeFabricacao = AnoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
