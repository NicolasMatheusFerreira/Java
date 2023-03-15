public class Conta {
    
    // atributos
    public String nome;
    public String cpf;
    private double saldo;

    public Conta() {
        nome = "N/A";
        cpf = "N/A";
        saldo = 0.0;
    }

    public Conta(String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }
    // Métodos getters e setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
}
