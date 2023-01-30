package hibernate;
// Generated 20 ene 2023 12:04:50 by Hibernate Tools 6.1.5.Final

import java.sql.Date;

/**
 * Empleados generated by hbm2java
 */
public class Empleados implements java.io.Serializable {

	private Short idE;
	private Dptos dptos;
	private String apellido;
	private String dir;
	private Date fechaAlta;
	private Date fechaBaja;
	private float salario;

	public Empleados() {
	}

	public Empleados(Dptos dptos, String apellido, String dir, Date fechaAlta, float salario) {
		this.dptos = dptos;
		this.apellido = apellido;
		this.dir = dir;
		this.fechaAlta = fechaAlta;
		this.salario = salario;
	}

	public Empleados(Dptos dptos, String apellido, String dir, Date fechaAlta, Date fechaBaja, float salario) {
		this.dptos = dptos;
		this.apellido = apellido;
		this.dir = dir;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.salario = salario;
	}

	public Short getIdE() {
		return this.idE;
	}

	public void setIdE(Short idE) {
		this.idE = idE;
	}

	public Dptos getDptos() {
		return this.dptos;
	}

	public void setDptos(Dptos dptos) {
		this.dptos = dptos;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDir() {
		return this.dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public float getSalario() {
		return this.salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}