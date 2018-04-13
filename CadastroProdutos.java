package Modelo;

public class CadastroProdutos {

	private String name;
	private Integer quantidade;
	private Float valor;
	private Float valorTotal;
	
	public CadastroProdutos (String nome, int quantidade, float valor) {
		this.name = nome;
		this.quantidade = quantidade;
		this.valor = valor;
		this.valorTotal = valor * quantidade;
	}
	
	public String toString() {
		return "Nome: " + name + "; quantidade.: " + quantidade + "; Preço: "
				+ valor + "; ValorTotal: " + valorTotal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuant() {
		return quantidade;
	}
	public void setQuant(int quantidade) {
		this.quantidade = quantidade;
		this.valorTotal = quantidade*valor;
	}
	public Float getValor() {
		return valor*quantidade;
	}
	public void setValor(Float valor) {
		this.valor = valor;
		this.valorTotal = quantidade*valor;
	}
	public Float getvalorTotal() {
		return valorTotal;
	}
}	
