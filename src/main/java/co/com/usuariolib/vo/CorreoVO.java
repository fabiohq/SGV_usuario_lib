package co.com.usuariolib.vo;

public class CorreoVO extends VO{

	private static final long serialVersionUID = 1L;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdPersonaPK() {
		return idPersonaFK;
	}
	public void setIdPersona(String idPersonaFK) {
		this.idPersonaFK = idPersonaFK;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
