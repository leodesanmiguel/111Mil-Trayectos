package poo_campos_clases;

public class Campo {
    private String NombreCampo;
    private Short Superficie;
    
     /**
     * Constructor por Defecto
     */
    public Campo(){
    }

    public Campo(String NombreCampo_, short Superficie_) {
        this.NombreCampo = NombreCampo_;
        this.Superficie = Superficie_;
    }

     public String getNombreCampo() {
        return NombreCampo;
    }    

     public void setNombreCampo(String NombreCampo_) {
        this.NombreCampo = NombreCampo_;
    }

     public Short getSuperficie() {
        return Superficie;
    }    

     public void setSuperficie(Short Superficie_) {
        this.Superficie = Superficie_;
    }
    
    
    
    
    public boolean ValidarNombreCampo() {
        /*
            Deberá buscar en la base si el nombre de campo
            Esta vigente o no.
            Por ahora si...
        */
        return true;
     }

    

    public boolean ValidarSuperficie() {
        /*
            Buscar la cantidad de hectareas de los lotes y
            verificar si coincide o no.
        */
        return true;
    }

    public void IngresarSuperficie(short Super) {
        this.Superficie = Super;
    }

}
