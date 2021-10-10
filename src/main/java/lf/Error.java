package lf;

public enum Error {
    OK("sentença válida: "),
    OPERATOR("operador aritmético: "),
    SENTENCE_INVALID("ERRO - sentença inválida: "),
    SYMBOL_INVALID("ERRO - símbolo(s) inválido(s): ");

    private final String message;

    Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
