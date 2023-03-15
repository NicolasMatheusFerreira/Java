public class TestePessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        System.out.println(p1.getNome());
        System.out.println(p1.getCor());
        System.out.println(p1.getIdade());
        System.out.println(p1.getPeso());
        System.out.println(p1.getAltura());

        p1.setNome("Nicolas");
        p1.setIdade(21);
        p1.setPeso(55.6);
        p1.setAltura(1.77);

        System.out.println(p1.getNome());
        System.out.println(p1.getCor());
        System.out.println(p1.getIdade());
        System.out.println(p1.getPeso());
        System.out.println(p1.getAltura());
    }
}
