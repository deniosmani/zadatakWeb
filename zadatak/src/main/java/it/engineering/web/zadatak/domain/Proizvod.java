package it.engineering.web.zadatak.domain;

import java.io.Serializable;
import java.util.Objects;

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
	@Column(name="IdPDV")
	private int IdPdv;
	public Proizvod(int sifra, String naziv, double cenaBez, String jedinica, double cenaSa, int idPdv) {
		super();
		this.sifra = sifra;
		this.naziv = naziv;
		this.cenaBez = cenaBez;
		this.jedinica = jedinica;
		this.cenaSa = cenaSa;
		IdPdv = idPdv;
	}
	@Override
	public String toString() {
		return "Proizvod [sifra=" + sifra + ", naziv=" + naziv + ", cenaBez=" + cenaBez + ", jedinica=" + jedinica
				+ ", cenaSa=" + cenaSa + ", IdPdv=" + IdPdv + "]";
	}
	public Proizvod() {
		super();
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCenaBez() {
		return cenaBez;
	}
	public void setCenaBez(double cenaBez) {
		this.cenaBez = cenaBez;
	}
	public String getJedinica() {
		return jedinica;
	}
	public void setJedinica(String jedinica) {
		this.jedinica = jedinica;
	}
	public double getCenaSa() {
		return cenaSa;
	}
	public void setCenaSa(double cenaSa) {
		this.cenaSa = cenaSa;
	}
	public int getIdPdv() {
		return IdPdv;
	}
	public void setIdPdv(int idPdv) {
		IdPdv = idPdv;
	}
	@Override
	public int hashCode() {
		return Objects.hash(IdPdv, cenaBez, cenaSa, jedinica, naziv, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proizvod other = (Proizvod) obj;
		return IdPdv == other.IdPdv && Double.doubleToLongBits(cenaBez) == Double.doubleToLongBits(other.cenaBez)
				&& Double.doubleToLongBits(cenaSa) == Double.doubleToLongBits(other.cenaSa)
				&& Objects.equals(jedinica, other.jedinica) && Objects.equals(naziv, other.naziv)
				&& sifra == other.sifra;
	}
	
}
