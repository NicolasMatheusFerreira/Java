public class TesteEncapsulamento {
    public static void main(String[] args) {
       Conta c = new Conta();
       /* 
       c.nome = "Nicolas";
       c.cpf = "084.145.976-29";
       c.setSaldo(200);
       */
       System.out.println("Nome: "+c.nome+" CPF: "+c.cpf+" Saldo: R$ "+c.getSaldo());
    }
}
