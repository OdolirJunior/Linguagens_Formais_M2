package enums;

public enum Messages {

    OK("\nSentença válida: "),
    OPERATOR("\nOperador aritmético: "),
    SENTENCE_INVALID("\nERRO - Sentença inválida: "),
    SYMBOL_INVALID("\nERRO - Símbolo(s) inválido(s): ");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
