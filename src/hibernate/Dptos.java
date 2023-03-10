package hibernate;
// Generated 20 ene 2023 12:04:50 by Hibernate Tools 6.1.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Dptos generated by hbm2java
 */
public class Dptos implements java.io.Serializable {

	private byte idD;
	private String nom;
	private Character bloque;
	private Float pto;
	private Set empleadoses = new HashSet(0);

	public Dptos() {
	}

	public Dptos(byte idD, String nom) {
		this.idD = idD;
		this.nom = nom;
	}

	public Dptos(byte idD, String nom, Character bloque, Float pto, Set empleadoses) {
		this.idD = idD;
		this.nom = nom;
		this.bloque = bloque;
		this.pto = pto;
		this.empleadoses = empleadoses;
	}

	public byte getIdD() {
		return this.idD;
	}

	public void setIdD(byte idD) {
		this.idD = idD;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Character getBloque() {
		return this.bloque;
	}

	public void setBloque(Character bloque) {
		this.bloque = bloque;
	}

	public Float getPto() {
		return this.pto;
	}

	public void setPto(Float pto) {
		this.pto = pto;
	}

	public Set getEmpleadoses() {
		return this.empleadoses;
	}

	public void setEmpleadoses(Set empleadoses) {
		this.empleadoses = empleadoses;
	}

}
