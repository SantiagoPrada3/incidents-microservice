package pe.edu.vallegrande.vgmsclaims.domain.exceptions;

/**
 * Excepción para conflictos de estado (HTTP 409)
 */
public class ConflictException extends DomainException {
    
    public ConflictException(String message) {
        super("CONFLICT", message);
    }
    
    public ConflictException(String code, String message) {
        super(code, message);
    }
}
