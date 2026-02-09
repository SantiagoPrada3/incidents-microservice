package pe.edu.vallegrande.vgmsclaims.domain.exceptions;

/**
 * Excepción para incidente ya resuelto
 */
public class IncidentAlreadyResolvedException extends ConflictException {
    
    public IncidentAlreadyResolvedException(String id) {
        super("INCIDENT_ALREADY_RESOLVED", 
              String.format("El incidente con ID '%s' ya está resuelto", id));
    }
}
