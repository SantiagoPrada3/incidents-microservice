package pe.edu.vallegrande.vgmsclaims.domain.exceptions;

/**
 * Excepción para incidente no encontrado
 */
public class IncidentNotFoundException extends NotFoundException {
    
    public IncidentNotFoundException(String id) {
        super("Incidente", id);
    }
}
