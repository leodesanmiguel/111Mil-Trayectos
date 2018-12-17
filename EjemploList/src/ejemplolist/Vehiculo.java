/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolist;

/**
 *
 * @author Leo
 */
public class Vehiculo {
    private String modelo;
    private Marca Marca;
    private boolean Disponible;
    
    /*Constructor por defecto*/
    public Vehiculo(){
    }
    
    /*Constructor con todos los detalles */
    public Vehiculo(String modelo, Marca marca, boolean disponible){
        this.modelo = modelo;
        this.Marca = marca;
        this.Disponible = disponible;
    }
    
    
//MODELO           
    public String getModelo(){
        return modelo;        
    }  
    public void setModelo(String modelo) {
        this.modelo= modelo;
    }
//MARCA
    public Marca getMarca(){
        return Marca;        
    }
    public void setMarca(Marca marca) {
        this.Marca= marca;
    }
//DISPONIBLE
    public boolean getDisponible(){
        return Disponible;      
    }
    public void setDisponible(boolean Disponible) {
        this.Disponible= Disponible;
    }    
    
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("\n Modelo: ").append(modelo).append("\n Marca: ").append(Marca.getNombre()).append("\n Disponible: ").append(Disponible);
        return sb.toString();
    }
}
