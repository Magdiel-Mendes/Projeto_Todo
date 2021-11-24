package com.Magdiel.Tudo.Domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String titulo;
    private String descricao;
    private LocalDateTime dateParaFinalizar;
    private Boolean finalizado = false;
    public Todo() {
    	super();
    }
	public Todo(Integer id, String titulo, String descricao, LocalDateTime dateParaFinalizar, Boolean finalizado) {	
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dateParaFinalizar = dateParaFinalizar;
		this.finalizado = finalizado;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getDateParaFinalizar() {
		return dateParaFinalizar;
	}
	public void setDateParaFinalizar(LocalDateTime dateParaFinalizar) {
		this.dateParaFinalizar = dateParaFinalizar;
	}
	public Boolean getFinalizado() {
		return finalizado;
	}
	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(id, other.id);
	}
	
    
}
