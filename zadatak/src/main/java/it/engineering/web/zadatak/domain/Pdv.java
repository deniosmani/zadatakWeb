package it.engineering.web.zadatak.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Id;

import javax.persistence.Entity;

import javax.persistence.Column;
@Entity
public class Pdv implements Serializable {
	@Id
	@Column(name="IdPDV")
	private int idPdv;
	@Column(name="oznaka")
	private char oznaka;
	@Column(name="iznos")
	private double iznos;
	public int getIdPdv() {
		return idPdv;
	}
	public void setIdPdv(int idPdv) {
		this.idPdv = idPdv;
	}
	public char getOznaka() {
		return oznaka;
	}
	public void setOznaka(char oznaka) {
		this.oznaka = oznaka;
	}
	public double getIznos() {
		return iznos;
	}
	public void setIznos(double iznos) {
		this.iznos = iznos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idPdv, iznos, oznaka);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pdv other = (Pdv) obj;
		return idPdv == other.idPdv && Double.doubleToLongBits(iznos) == Double.doubleToLongBits(other.iznos)
				&& oznaka == other.oznaka;
	}
	@Override
	public String toString() {
		return "Pdv [idPdv=" + idPdv + ", oznaka=" + oznaka + ", iznos=" + iznos + "]";
	}
	public Pdv(int idPdv, char oznaka, double iznos) {
		super();
		this.idPdv = idPdv;
		this.oznaka = oznaka;
		this.iznos = iznos;
	}
	public Pdv() {
		super();
	}
	
}
