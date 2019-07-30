package paqueteproyectores;

import java.util.ArrayList;

public class GestorDePaquetesDeProyectores extends PaqueteProyectores {
    private ArrayList<PaqueteProyectores> paquetes = new ArrayList<>();
    private String nombreEmpresa;

    public GestorDePaquetesDeProyectores(String nombreEmpresa, int codPaqueteDeProyectores, String destinatario, String destino, float costoEnvio) {
        super(codPaqueteDeProyectores, destinatario, destino, costoEnvio);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
}
