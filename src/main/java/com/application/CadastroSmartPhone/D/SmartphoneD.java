package com.application.CadastroSmartPhone.D;

import javax.validation.constraints.NotBlank;

public class SmartphoneD {
	
	@NotBlank
	private String idSmartphone;
	@NotBlank
	private String marca;	
	@NotBlank
	private String modelo;	
	@NotBlank
	private String cor;	
	@NotBlank
	private String tela;
	
	public String getIdSmartphone() {
		return idSmartphone;
	}
	public void setIdSmartphone(String idSmartphone) {
		this.idSmartphone = idSmartphone;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTela() {
		return tela;
	}
	public void setTela(String tela) {
		this.tela = tela;
	}
	
	
	

}
