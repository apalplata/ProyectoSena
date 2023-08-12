package co.com.amarie.models.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras")
public class Compra {

	@Id
	@Column(name = "id_compra")
	private int id;
	@Column(name = "proveedor")
	private String proveedor;
	@Column(name = "fecha_hora")
	private Date fechaHora;
	@Column(name = "valor")
	private double valor;
	
	public Compra() {
		
	}

	public Compra(int id, String proveedor, Date fechaHora, double valor) {
		this.id = id;
		this.proveedor = proveedor;
		this.fechaHora = fechaHora;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}	
}
