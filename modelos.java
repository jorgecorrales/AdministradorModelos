public class modelos {
    
    private int modeloId, alto, ancho;
    private String nombre;
    private String marca;
    private Boolean soportaJuegos;
    private Boolean soportaRepiquesReales;
    private Boolean soportaPolifonicos;
    private Boolean videos;
    private Boolean soportaEfectos;
    private Boolean soportaTemas;
    private String modelo
    
    
 //Setters
   
    public void setModeloId (int modeloId){
        
        this.modeloId = modeloId;        
        
    }
    
    
    public void setAlto (int alto){
        
        this.alto = alto;        
        
    }
    
    public void setAncho (int ancho){
        
        this.ancho = ancho;        
        
    }
    

   public void setNombre (int nombre){
        
        this.nombre = nombre;        
        
    }


   public void setMarca (String marca){
        
        this.marca = marca;        
        
    }    

  public void setSoportaJuegos (Boolean soportaJuegos){
        
        this.soportaJuegos = soportaJuegos;        
        
    }

  public void setSoportaPolifonicos (Boolean soportaPolifonicos){
        
        this.soportaPolifonicos = soportaPolifonicos;        
        
    }

  public void setVideos (Boolean videos){
        
        this.soportavideos = videos;        
        
    }

  public void setSoportaEfectos (Boolean soportaEfectos){
        
        this.soportaEfectos = soportaEfectos;        
        
    }

  public void setSoportaTemas (Boolean soportaTemas){
        
        this.soportaTemas = soportaTemas;        
        
    }

 public void setModelos (Boolean modelos){
        
        this.modelos = modelos;        
        
    }


//Getters

   
   public int getModeloId(){
        
        return modeloId;
    
    } 

   public int getAlto(){
        
        return alto;
    
    } 

   public int getAncho(){
        
        return ancho;
    
    } 
    
    public String getNombre(){
        
        return nombre;
    
    }
    
    public String getMarca(){
        
        return marca;
    
    }
    
    public Boolean getSoportaJuegos(){

	return soportaJuegos;
    }

    public Boolean getSoportaRepiquesReales(){

	return soportaRepiquesReales;
    }

    public Boolean getSoportaPolifonicos(){

	return soportaPolifonicos;
    }

    public Boolean getVideos(){

	return videos;
    }

    public Boolean getSoportaEfectos(){

	return soportaEfectos;
    }

   public Boolean getSoportaTemas(){

	return soportaTemas;
    }

   public String getModelo(){

	return modelo;
    }
   
}

