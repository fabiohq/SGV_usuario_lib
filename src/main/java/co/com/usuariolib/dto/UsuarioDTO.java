package co.com.usuariolib.dto;

import co.com.usuariolib.vo.CorreoVO;
import co.com.usuariolib.vo.DireccionVO;
import co.com.usuariolib.vo.ErrorVO;
import co.com.usuariolib.vo.IdentificacionVO;
import co.com.usuariolib.vo.PersonaVO;
import co.com.usuariolib.vo.RolVO;
import co.com.usuariolib.vo.TelefonoVO;

public class UsuarioDTO {
	
	private PersonaVO persona;
	private RolVO rol;
	private TelefonoVO telefono;
	private DireccionVO direccion;
	private CorreoVO correo;
	private IdentificacionVO identificacion;
	private ErrorVO error;
	
	public PersonaVO getPersona() {
		return persona;
	}
	public void setPersona(PersonaVO persona) {
		this.persona = persona;
	}
	public RolVO getRol() {
		return rol;
	}
	public void setRol(RolVO rol) {
		this.rol = rol;
	}
	public TelefonoVO getTelefono() {
		return telefono;
	}
	public void setTelefono(TelefonoVO telefono) {
		this.telefono = telefono;
	}
	public DireccionVO getDireccion() {
		return direccion;
	}
	public void setDireccion(DireccionVO direccion) {
		this.direccion = direccion;
	}
	public CorreoVO getCorreo() {
		return correo;
	}
	public void setCorreo(CorreoVO correo) {
		this.correo = correo;
	}
	public IdentificacionVO getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(IdentificacionVO identificacion) {
		this.identificacion = identificacion;
	}
	public ErrorVO getError() {
		return error;
	}
	public void setError(ErrorVO error) {
		this.error = error;
	}
		
}