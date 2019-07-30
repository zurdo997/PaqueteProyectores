package paqueteproyectores;

import java.util.ArrayList;

public class GestorDePaquetesDeProyectores {
    private ArrayList<PaqueteProyectores> paquetes = new ArrayList<>();
    private String nombreEmpresa;

    public GestorDePaquetesDeProyectores(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    public void agregarPaquete(PaqueteProyectores paqueteNuevo) {
        
    }
}
