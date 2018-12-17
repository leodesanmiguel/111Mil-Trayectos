/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolist;;


import java.util.List;
import javax.swing.table.AbstractTableModel;
//import ejemplolist.Vehiculo;

/**
 *
 * @author Leo
 */
public abstract class DetalleVihiculo extends AbstractTableModel {
    private static final String[] COLUMNAS={"Modelo", "Marca", "Disponible"};
    
    private List<Vehiculo> Vehiculos;
    
    public DetalleVihiculo(){
    } 
    
    public DetalleVihiculo(List<Vehiculo> vehiculos){
        super();
        this.Vehiculos = vehiculos;
    }
    
    @Override
    public int getRowCount(){
        return Vehiculos == null ? 0: Vehiculos.size();
    }
    @Override
    public int getColumnCount(){
        return COLUMNAS.length;
    }
    
    @Override 
    public Object getValueAt(int rowIndex, int columnIndex){
        Object retorno=null;
        
        Vehiculo vehiculo = Vehiculos.get(rowIndex);
        switch (columnIndex) {

            case 0:
                retorno = vehiculo.getModelo();
                break;
            case 1:
                retorno = vehiculo.getMarca();
                break;
            case 2:
                retorno = vehiculo.getDisponible();
                break;
        }
        return retorno;
    }
    
    @Override
    public String getColumnName(int index) {
        return COLUMNAS[index];
    }

    public void setVehiculos(List<Vehiculo> detalles) {
        this.Vehiculos = detalles;
    }
}
