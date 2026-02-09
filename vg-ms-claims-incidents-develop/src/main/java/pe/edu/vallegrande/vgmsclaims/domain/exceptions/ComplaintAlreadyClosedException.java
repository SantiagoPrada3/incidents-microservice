package pe.edu.vallegrande.vgmsclaims.domain.exceptions;

/**
 * Excepción para queja ya cerrada
 */
public class ComplaintAlreadyClosedException extends ConflictException {
    
    public ComplaintAlreadyClosedException(String id) {
        super("COMPLAINT_ALREADY_CLOSED", 
              String.format("La queja con ID '%s' ya está cerrada", id));
    }
}
