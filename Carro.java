public class Carro {

    // atributos
    public String marca, modelo, cor;
    public int qtdPortas, anoFabricacao;
    public double peso, veloc;
    // construtor e destrutor
    public Carro() {
        
        marca = "N/A";
        modelo = "N/A";
        cor = "N/A";
        qtdPortas = 0;
        anoFabricacao = 0;
        peso = 0.0;
        veloc = 0.0;
    }
    // métodos
    public double acelerar(double aceleracao) {
        veloc = veloc + aceleracao;
        return veloc;
    }

    public void freiar(double reduzir) {
        veloc = veloc - reduzir;
    }

    public void buzinar() {
        System.out.println("BIBIBIBI");
    }

    public void Exibir() {
        System.out.println(marca+" "+modelo+" "+cor+" "+anoFabricacao+" "+qtdPortas+" "+peso+" "+veloc);
    }
}