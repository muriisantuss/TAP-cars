import veiculos.veiculoFactory;
import veiculos.veiculos;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        veiculos carro = veiculoFactory.criarVeiculos("carro", "honda", "civic", 2020, 4);
        veiculos caminhao = veiculoFactory.criarVeiculos("caminhao", "Scania", "R440", 2022, 1000);
        veiculos moto = veiculoFactory.criarVeiculos("moto", "Honda", "CB500", 2023, 10000);
        
        System.out.println();
        carro.exibirDetalhes();
        caminhao.exibirDetalhes();
        moto.exibirDetalhes();
        System.out.println();
    }
}
