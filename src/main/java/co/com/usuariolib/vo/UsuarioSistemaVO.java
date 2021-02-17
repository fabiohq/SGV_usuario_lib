package co.com.usuariolib.vo;

import java.io.Serializable;

public class UsuarioSistemaVO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String idUsuarioSistema;
	private String idRolFK;
	private String idPersonaFK;
	private String fechaIni;
	private String fechaFin;
	private String observacion;
	private int estado;
	
	public String getIdUsuarioSistema() {
		return idUsuarioSistema;
	}
	public void setIdUsuarioSistema(String idUsuarioSistema) {
		this.idUsuarioSistema = idUsuarioSistema;
	}
	public String getIdRolFK() {
		return idRolFK;
	}
	public void setIdRolFK(String idRolFK) {
		this.idRolFK = idRolFK;
	}
	public String getIdPersonaFK() {
		return idPersonaFK;
	}
	public void setIdPersonaFK(String idPersonaFK) {
		this.idPersonaFK = idPersonaFK;
	}
	public String getFechaIni() {
		return fechaIni;
	}
	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}	
}