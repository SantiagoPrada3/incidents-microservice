package pe.edu.vallegrande.vgmsclaims.domain.exceptions;

/**
 * Excepción para queja no encontrada
 */
public class ComplaintNotFoundException extends NotFoundException {
    
    public ComplaintNotFoundException(String id) {
        super("Queja", id);
    }
}
