package com.marson.cursomc22.domain;

import java.io.Serializable;

public class Categoria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer idCategoria ;
	private String nomeCategoria ;
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public Categoria(Integer idCategoria, String nomeCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCategoria == null) ? 0 : idCategoria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (idCategoria == null) {
			if (other.idCategoria != null)
				return false;
		} else if (!idCategoria.equals(other.idCategoria))
			return false;
		return true;
	}
	
	
	
	
}