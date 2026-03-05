package JPA.libraryapi.exception;

public class RegistroDuplicado extends RuntimeException{
    public RegistroDuplicado(String message) {
        super(message);
    }
}
