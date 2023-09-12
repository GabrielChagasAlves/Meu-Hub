

public class Pessoa {
    
 String Nome;
 String Cpf;
 char Sexo;
 int Idade;

    public Pessoa() {
    }
 
    public Pessoa(String Nome, String Cpf, char Sexo, int Idade) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Sexo = Sexo;
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    public String imprimir() {
        return "Nome: "+Nome+
               "\nCPF: "+Cpf+
                "\nSexo"+Sexo+
                "\nIdade"+getIdade();
               
    }
}
