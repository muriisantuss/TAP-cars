package veiculos.classes;

import veiculos.veiculos;

public class carro implements veiculos {
  private String marca;
  private String modelo;
  private int ano;
  private int portas;

  public carro(String marca, String modelo, int ano, int portas) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.portas = portas;
  }

  @Override
  public void exibirDetalhes() {
    System.out.println("Carro - marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano + ", Portas: "
        + this.portas);
  }
}
