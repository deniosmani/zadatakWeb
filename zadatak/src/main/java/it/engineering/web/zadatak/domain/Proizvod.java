package it.engineering.web.zadatak.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import jakarta.persistence.Column;

@Entity
public class Proizvod implements Serializable{

	@Id
	@Column(name="sifra")
	private int sifra;
	@Column(name="naziv")
	private String naziv;
	@Column(name="cenaBez")
	private double cenaBez;
	@Column(name="jedinica")
	private String jedinica;
	@Column(name="cenaSa")
	private double cenaSa;
	private Pdv pdv;
}
