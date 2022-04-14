package it.engineering.web.zadatak.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Column;
@Entity
public class Proizvodjac implements Serializable{
	@Id
	@Column(name="pib")
	private int pib;
	@Column(name="maticni broj")
	private int maticniBroj;
	@Column(name="adresa")
	private String adresa;
	@Column(name="IdM")
	private int idM;
	public int getPib() {
		return pib;
	}
	public void setPib(int pib) {
		this.pib = pib;
	}
	public int getMaticniBroj() {
		return maticniBroj;
	}
	public void setMaticniBroj(int maticniBroj) {
		this.maticniBroj = maticniBroj;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getIdM() {
		return idM;
	}
	public void setIdM(int idM) {
		this.idM = idM;
	}
	@Override
	public int hashCode() {
		return Objects.hash(adresa, idM, maticniBroj, pib);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proizvodjac other = (Proizvodjac) obj;
		return Objects.equals(adresa, other.adresa) && idM == other.idM && maticniBroj == other.maticniBroj
				&& pib == other.pib;
	}
	@Override
	public String toString() {
		return "Proizvodjac [pib=" + pib + ", maticniBroj=" + maticniBroj + ", adresa=" + adresa + ", idM=" + idM + "]";
	}
	public Proizvodjac(int pib, int maticniBroj, String adresa, int idM) {
		super();
		this.pib = pib;
		this.maticniBroj = maticniBroj;
		this.adresa = adresa;
		this.idM = idM;
	}
	public Proizvodjac() {
		super();
	}
	
}
