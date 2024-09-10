package veiculos;

import veiculos.classes.caminhao;
import veiculos.classes.carro;
import veiculos.classes.moto;

public class veiculoFactory {
  public static veiculos criarVeiculos(String tipo, String marca, String modelo, int ano, int variavel) {
    switch (tipo.toLowerCase()) {
      case "carro":
        return new carro(marca, modelo, ano, variavel);
      case "moto":
        return new moto(marca, modelo, ano, variavel);
      case "caminhao":
        return new caminhao(marca, modelo, ano, variavel);
      default:
      throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
    }
  }
}
