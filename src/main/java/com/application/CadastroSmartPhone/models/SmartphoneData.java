package com.application.CadastroSmartPhone.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name = "CADASTROGERAL")
public class SmartphoneData implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID idSmartphone;
	@Column(name = "marca", nullable = false,  length = 50)
	private String marca;	
	@Column(name = "modelo",nullable = false,  length = 50)
	private String modelo;	
	@Column(name = "cor",nullable = false,  length = 20)
	private String cor;	
	@Column(name = "tela",length = 10)
	private String tela;
		
	public UUID getIdSmartphone() {
		return idSmartphone;
	}
	public void setIdSmartphone(UUID idSmartphone) {
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	

}
