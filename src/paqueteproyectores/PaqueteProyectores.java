package paqueteproyectores;

public class PaqueteProyectores {
    private int codPaqueteDeProyectores;
    private String destinatario;
    private String destino;
    private float costoEnvio;
    private boolean enTransito;

    public PaqueteProyectores(int codPaqueteDeProyectores, String destinatario, String destino, float costoEnvio) {
        this.codPaqueteDeProyectores = codPaqueteDeProyectores;
        this.destinatario = destinatario;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
    }

    public int getCodPaqueteDeProyectores() {
        return codPaqueteDeProyectores;
    }

    public void setCodPaqueteDeProyectores(int codPaqueteDeProyectores) {
        this.codPaqueteDeProyectores = codPaqueteDeProyectores;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public boolean isEnTransito() {
        return enTransito;
    }

    public void setEnTransito(boolean enTransito) {
        this.enTransito = enTransito;
    }
    
    
}
