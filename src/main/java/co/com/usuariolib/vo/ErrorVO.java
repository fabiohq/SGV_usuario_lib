package co.com.usuariolib.vo;

public class ErrorVO extends VO{

	public ErrorVO() {}
	
	public ErrorVO(String id,String descripcion) {
		this.id = id;
		this.descripcion = descripcion;		
	}
	
	private static final long serialVersionUID = 1L;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
