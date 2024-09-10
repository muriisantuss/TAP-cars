package veiculos.classes;

import veiculos.veiculos;

public class moto implements veiculos {
  private String marca;
  private String modelo;
  private int ano;
  private int cilindradas;

  public moto(String marca, String modelo, int ano, int cilindradas) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.cilindradas = cilindradas;
  }

  @Override
  public void exibirDetalhes() {
    System.out
        .println("Moto - marca: " + this.marca + ", modelo: " + this.modelo + ", ano: " + this.ano + ", cilindradas: "
            + this.cilindradas);
  }

}
