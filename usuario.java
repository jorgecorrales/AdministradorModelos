public class usuario { 
	
	private int usuario_id = 0;
	private String  nombre = null;
	private String  apellido = null;
	private String  login = null; 
	private String  password = null;
	private String  status = null;
	private String  tipoUsuario = null;
	
	
	public setUsuarioId (int usuario_id){
		
		this.usuario_id = usuario_id;
	}
	
	public setNombre(String nombre){
		this.nombre = nombre;		
	
	}
	
	public setApellido(String apellido){
		this.apellido = apellido;		
	
	}
	
	public setLogin(String login){
		this.login = login;		
	
	}
	
	public setPassword(String password){
		this.password = password;		
	
	}
	
	public setStatus(String status){
		this.status = status;		
	
	}
	
	public setTipoUsuario(String tipoUsuario){
		this.tipoUsuario = tipoUsuario;		
	
	}
	
	
	public getUsuarioId(){
		
		return usuario_id;
	}
	
	public getNombre(){
		
		return nombre;
	}
	
	public getApellido(){
		
		return apellido;
	}
	
	public getLogin(){
		
		return login;
	}
	
	public getPassword(){
		
		return password;
	}
	
	public getStatus(){
		
		return status;
	}
	
	public getTipoUsuario(){
		
		return tipoUsuario;
	}
	
		
	
}
