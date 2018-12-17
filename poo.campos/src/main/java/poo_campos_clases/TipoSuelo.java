package poo_campos_clases;

public class TipoSuelo {

    private String NroSuelo;

    public TipoSuelo(String NroSuelo) {
        this.NroSuelo = NroSuelo;
    }
    
    public String getNroSuelo() {
        return NroSuelo;
    }
    
    public void setNroSuelo(String NroSuelo_) {
        this.NroSuelo = NroSuelo_;
    }
            
    public void AsignarTipoSuelo() {
    }
    
    @Override
    public String toString(){
        return NroSuelo;
    }
}
