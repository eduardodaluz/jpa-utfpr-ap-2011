package model;

public enum EstadoMovimento {

    ENTRADA, SAIDA;

    @Override
    public String toString() {
        switch (this) {
            case ENTRADA:
                return "Entrada";
            case SAIDA:
                return "Saída";
            default:
                return "";
        }
    }
}
