package co.com.amarie.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mat_primas")
public class MatPrimas {

	@Id
	@Column(name = "id")
	private int id_mp;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "costo")
	private double costo;
	@Column(name = "existencias")
	private int existencias;
	
	public MatPrimas() {
	
	}

	public MatPrimas(int id_mp, String nombre, double costo, int existencias) {
		
		this.id_mp = id_mp;
		this.nombre = nombre;
		this.costo = costo;
		this.existencias = existencias;
	}

	public int getId_mp() {
		return id_mp;
	}

	public void setId_mp(int id_mp) {
		this.id_mp = id_mp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	
}
