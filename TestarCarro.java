public class TestarCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.Exibir();
        
        carro1.marca = "Porsche";
        carro1.modelo = "Boxster";
        carro1.cor = "Branco";
        carro1.anoFabricacao = 2023;
        carro1.qtdPortas = 2;
        carro1.peso = 1.365;
        carro1.veloc = 0.0;

        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.cor);
        System.out.println(carro1.anoFabricacao);
        System.out.println(carro1.qtdPortas);
        System.out.println(carro1.peso);
        System.out.println(carro1.veloc);
        
        /* 
        carro1.acelerar(30.6);        
        carro1.buzinar();
        carro1.freiar(15.3);
        carro1.Exibir();        
        */
    }
}
