package co.edu.personasapi.domain;

import jakarta.persistence.*;

@Entity
@Table(name="Solicitud")
public class solicitud {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_s;
	
        /*id_pr = id producto*/
	@Column
	private int id_pr;
	
        /*id_p = id persona*/
	@Column
	private int id_p;

	public int getId_s() {
		return id_s;
	}

	public void setId_s(int id_s) {
		this.id_s = id_s;
	}

	public int getId_pr() {
		return id_pr;
	}

	public void setId_pr(int id_pr) {
		this.id_pr = id_pr;
	}

	public int getId_p() {
		return id_p;
	}

	public void setId_p(int id_p) {
		this.id_p = id_p;
	}
	
	
	
}
