package main;

public final class Coordenada {
    private final int fila;
    private final int columna;
    private final Sentido sentido;

    public Coordenada(int fila, int columna, Sentido sentido) throws TableroException {
        this.fila = fila;
        this.columna = columna;
        this.sentido = sentido;

        if(fila < 0) {
            throw new TableroException();
        }
        if(columna < 0) {
            throw new TableroException();
        }
    }

    protected int getFila() {
        return this.fila;
    }

    protected int getColumna() {
        return this.columna;
    }

    protected Sentido getSentido() {
        return this.sentido;
    }

}
