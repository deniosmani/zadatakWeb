package it.engineering.web.zadatak.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Mesto implements Serializable {
	@Id
	@Column(name="IdM")
	private int idM;
	@Column(name="PttBroj")
	private int pttBroj;
	@Override
	public String toString() {
		return "Mesto [idM=" + idM + ", pttBroj=" + pttBroj + ", naziv=" + naziv + "]";
	}
	@Column(name="Naziv")
	private String naziv;
	public Mesto(int idM, int pttBroj, String naziv) {
		super();
		this.idM = idM;
		this.pttBroj = pttBroj;
		this.naziv = naziv;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idM, naziv, pttBroj);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesto other = (Mesto) obj;
		return idM == other.idM && Objects.equals(naziv, other.naziv) && pttBroj == other.pttBroj;
	}
	public int getIdM() {
		return idM;
	}
	public void setIdM(int idM) {
		this.idM = idM;
	}
	public int getPttBroj() {
		return pttBroj;
	}
	public void setPttBroj(int pttBroj) {
		this.pttBroj = pttBroj;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Mesto() {
		super();
	}
}
