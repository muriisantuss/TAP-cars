package veiculos.classes;

import veiculos.veiculos;

public class caminhao implements veiculos {
  private String marca;
  private String modelo;
  private int ano;
  private int cargaMax;

  public caminhao(String marca, String modelo, int ano, int cargaMax) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.cargaMax = cargaMax;
  }

  @Override
  public void exibirDetalhes() {
    System.out.println("Caminhão - marca: " + this.marca + ", modelo: " + this.modelo + ", ano: " + this.ano
        + ", carga máxima: " + this.cargaMax);

  }

}
