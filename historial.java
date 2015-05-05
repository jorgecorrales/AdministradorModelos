public class usuario { 
	
	private int usuario_id = 0;
	private String  nombre = null;
	private String  apellido = null;
	private String  login = null; 
	private String  password = null;
	private String  status = null;
	private String  tipoUsuario = null;
	
	
	// setters

	public void setUsuarioId (int usuario_id){
		
		this.usuario_id = usuario_id;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;		
	
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;		
	
	}
	
	public void setLogin(String login){
		this.login = login;		
	
	}
	
	public void setPassword(String password){
		this.password = password;		
	
	}
	
	public void setStatus(String status){
		this.status = status;		
	
	}
	
	public void setTipoUsuario(String tipoUsuario){
		this.tipoUsuario = tipoUsuario;		
	
	}
	

	//getter
	
	public int getUsuarioId(){
		
		return usuario_id;
	}
	
	public String getNombre(){
		
		return nombre;
	}
	
	public String getApellido(){
		
		return apellido;
	}
	
	public String getLogin(){
		
		return login;
	}
	
	public String getPassword(){
		
		return password;
	}
	
	public String getStatus(){
		
		return status;
	}
	
	public String getTipoUsuario(){
		
		return tipoUsuario;
	}
	
		
	
}
