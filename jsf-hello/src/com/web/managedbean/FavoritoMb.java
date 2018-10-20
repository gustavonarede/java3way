package com.web.managedbean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
@SessionScoped
@ManagedBean (name = "favorito")
public class FavoritoMb implements Serializable {

	private String nomeCompleto;
	private Date dataNascimento;
	
	private String comida;
	private String bebida;
	private String esporte;
	
	 public void montarNomeCompleto() {
		 nomeCompleto = "Adriano";
	 }
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public String getEsporte() {
		return esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	
	public String salvar() {
		return "favoritos.xhtml";
	}
	public void padrao() {
		this.bebida = "Agua";
		this.comida ="Carne";
		this.esporte = "Corrida";
	}
}
