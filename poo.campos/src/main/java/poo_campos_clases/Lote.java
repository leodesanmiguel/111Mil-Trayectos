package poo_campos_clases;

public class Lote {

    private String NroLote;

    private Short SuperficieLote;

    public Lote() {
        
    }

    public Lote(String nLote, short Superficie_) {
        this.NroLote = nLote;
        this.SuperficieLote = Superficie_;
    }

     public String getNroLote() {
        return NroLote;
    }    

     public void setNroLote(String NroLote_) {
        this.NroLote = NroLote_;
    }
    
    public Short getSuperficie() {
        return SuperficieLote;
    }    

     public void setSuperficie(Short Superficie_) {
        this.SuperficieLote = Superficie_;
    }

    

     public boolean ValidarNroLote() {
        /*
            Deberá buscar en la base si el nombre de campo
            Esta vigente o no.
            Por ahora si...
        */
        return true;
     }


    public void IngresarSuperficie() {
    }

    public void MostrarDatosLote() {
    }

    public void EditarLote() {
    }

    public void QuitarLote() {
    }
}
