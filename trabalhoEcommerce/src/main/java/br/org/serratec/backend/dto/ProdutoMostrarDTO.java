package br.org.serratec.backend.dto;

import java.time.LocalDate;

import br.org.serratec.backend.model.Categoria;
import br.org.serratec.backend.model.Produto;

public class ProdutoMostrarDTO {
	private Long id;
	private String nome;
	private String url;
	private Double valorUnitario;
	private Categoria categoria;
	private String descricao;
	private LocalDate DataCadastro;
	private Integer qntEstoque;

	public ProdutoMostrarDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoMostrarDTO(Produto produto) {
		super();
		this.id = produto.getId();
		this.nome = produto.getNome();
		this.valorUnitario = produto.getValorUnitario();
		this.categoria = produto.getCategoria();
		this.descricao = produto.getDescricao();
		this.DataCadastro = produto.getDataCadastro();
		this.qntEstoque = produto.getQtdEstoque();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public Integer getQntEstoque() {
		return qntEstoque;
	}

	public void setQntEstoque(Integer qntEstoque) {
		this.qntEstoque = qntEstoque;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataCadastro() {
		return DataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		DataCadastro = dataCadastro;
	}

}
