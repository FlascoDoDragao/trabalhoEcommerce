package br.org.serratec.backend.dto;

import br.org.serratec.backend.model.Categoria;
import br.org.serratec.backend.model.Produto;

public class ProdutoMostrarDTO {
	private String nome;
	private String url;
	private Integer qntEstoque;
	private Double valorUnitario;
	private Categoria categoria;
	
	
	public ProdutoMostrarDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoMostrarDTO(Produto produto) {
		super();
		this.nome = produto.getNome();
		this.qntEstoque = produto.getQntEstoque();
		this.valorUnitario = produto.getValorUnitario();
		this.categoria = produto.getCategoria();
	}

	
	public Integer getQntEstoque() {
		return qntEstoque;
	}

	public void setQntEstoque(Integer qntEstoque) {
		this.qntEstoque = qntEstoque;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}