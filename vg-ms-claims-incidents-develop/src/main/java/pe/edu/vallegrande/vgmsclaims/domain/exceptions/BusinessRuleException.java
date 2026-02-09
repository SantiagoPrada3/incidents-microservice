package pe.edu.vallegrande.vgmsclaims.domain.exceptions;

/**
 * Excepción para violaciones de reglas de negocio (HTTP 400)
 */
public class BusinessRuleException extends DomainException {
    
    public BusinessRuleException(String message) {
        super("BUSINESS_RULE_VIOLATION", message);
    }
    
    public BusinessRuleException(String code, String message) {
        super(code, message);
    }
}
