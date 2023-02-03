public class Pessoa {
    
    // atributos
    private String nome, cor;
    private int idade;
    private double peso, altura;    

    // construtor
    public Pessoa() {
        nome = "N/A";
        cor = "N/A";
        idade = 0;
        peso = 0.0;
        altura = 0.0;
    }
    
    public void setNome(String nome) {
        this.nome = nome;        
    }
    public String getNome() {
        return nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
}
