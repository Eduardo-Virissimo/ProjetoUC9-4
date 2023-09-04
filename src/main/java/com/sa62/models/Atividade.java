package com.sa62.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Atividade")
public class Atividade {
	@Id
//	@GeneratedValue
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String atividade;
	private String responsavel;
	private LocalDate inicio;
	private LocalDate fim;
	private Long dependencia;
	
	
	public Atividade() {
		super();
	}


	/**
	 * @param id
	 * @param atividade
	 * @param responsavel
	 * @param inicio
	 * @param fim
	 * @param dependencia
	 */
	public Atividade(Long id, String atividade, String responsavel, LocalDate inicio, LocalDate fim, Long dependencia) {
		super();
		this.id = id;
		this.atividade = atividade;
		this.responsavel = responsavel;
		this.inicio = inicio;
		this.fim = fim;
		this.dependencia = dependencia;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getAtividade() {
		return atividade;
	}


	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}


	public String getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


	public LocalDate getInicio() {
		return inicio;
	}


	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}


	public LocalDate getFim() {
		return fim;
	}


	public void setFim(LocalDate fim) {
		this.fim = fim;
	}


	public Long getDependencia() {
		return dependencia;
	}


	public void setDependencia(Long dependencia) {
		this.dependencia = dependencia;
	}
	
	
	
}
