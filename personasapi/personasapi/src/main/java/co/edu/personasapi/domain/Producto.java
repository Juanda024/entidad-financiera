package co.edu.personasapi.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pr;
	
	@Column
	private String nombre_pr;
	
	@Column
	private String tipo_pr;

	public int getId_pr() {
		return id_pr;
	}

	public void setId_pr(int id_pr) {
		this.id_pr = id_pr;
	}

	public String getNombre_pr() {
		return nombre_pr;
	}

	public void setNombre_pr(String nombre_pr) {
		this.nombre_pr = nombre_pr;
	}

	public String getTipo_pr() {
		return tipo_pr;
	}

	public void setTipo_pr(String tipo_pr) {
		this.tipo_pr = tipo_pr;
	}
	
	
	
}
