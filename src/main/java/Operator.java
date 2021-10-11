public enum Operator {
    ADD("+"),
    SUB("-"),
    DIV("/"),
    MULT("*");

    private final String operator;

    Operator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
