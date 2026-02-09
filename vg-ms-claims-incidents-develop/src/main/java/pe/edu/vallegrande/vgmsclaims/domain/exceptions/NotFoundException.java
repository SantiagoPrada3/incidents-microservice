package pe.edu.vallegrande.vgmsclaims.domain.exceptions;

/**
 * Excepción para recursos no encontrados (HTTP 404)
 */
public class NotFoundException extends DomainException {
    
    public NotFoundException(String message) {
        super("NOT_FOUND", message);
    }
    
    public NotFoundException(String resourceType, String id) {
        super("NOT_FOUND", String.format("%s con ID '%s' no encontrado", resourceType, id));
    }
}
