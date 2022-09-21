package main;

import java.util.ArrayList;
import java.util.List;

public class SopaLetras {
    
    private int n;
    private List<Character> x;
    private List<List<Character>> tablero = new ArrayList<List<Character>>();
    private Tabla contadorLetrasMap;

    public SopaLetras() throws Exception{
        double num=Math.floor(Math.random()*10);
        n = (int)num;
        if(n > 0) {
            for(int i = 0; i < n; i++) {
                this.tablero.add(new ArrayList<Character>());
                for(int j = 0; j < n; j++) {
                    this.tablero.get(i).add('*');
                }
                this.tablero.get(0).get(0);
            }
        }else{
            throw new Exception();
        }
    }

    public int getN() {
        return n;
    }

    public List<Character> getX() {
        return x;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setX(List<Character> x) {
        this.x = x;
    }

    public void colocarPalabraHorizontal(String palabra, Coordenada coordenada) throws TableroException {
        if(palabra == null || palabra.isEmpty()) {
            throw new TableroException("Palabra nula o vacia");
        }
        else if(palabra.length() > this.n) {
            throw new TableroException("El tamanio de la palabra es superior a la dimension");
        }
        else if(coordenada.getFila() > n) {
            throw new TableroException("El numero de la fila es superior a la dimension");
        }
        else if(coordenada.getColumna() > n) {
            throw new TableroException("El numero de la columna es superior a la dimension");
        }
        else if(coordenada.getSentido()==Sentido.NORMAL) {
            if(this.n - (coordenada.getColumna() + palabra.length()) < 0) {
                throw new TableroException("El tamanio de la palabra en sentido normal supera el limite establecido");
            }
            this.colocarPalabraHorizontalSentidoNormal(palabra,coordenada);
        }
        else if(coordenada.getSentido()==Sentido.INVERSO) {
            if(this.n - (coordenada.getColumna() + palabra.length()) < 0) {
                throw new TableroException("El tamanio de la palabra en sentido inverso supera el limite establecido");
            }
            this.colocarPalabraHorizontalSentidoInverso(palabra, coordenada);
        }
    }

    public void colocarPalabraHorizontalSentidoNormal(String palabra, Coordenada coordenada) {
        char letra = ' ';
        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(i);
            tablero.get(coordenada.getFila()).set(coordenada.getColumna()+i, letra);
        }
    }

    public void colocarPalabraHorizontalSentidoInverso(String palabra, Coordenada coordenada) {
        char letra = ' ';
        for(int i = palabra.length(); i > 0; i--) {
            letra = palabra.charAt(i);
            tablero.get(coordenada.getFila()).set(coordenada.getColumna()+i, letra);
        }
    }

    public void colocarPalabraVertical(String palabra, Coordenada coordenada) throws TableroException {
        if(palabra == null || palabra.isEmpty()) {
            throw new TableroException("Palabra nula o vacia");
        }
        else if(palabra.length() > this.n) {
            throw new TableroException("El tamanio de la palabra es superior a la dimension");
        }
        else if(coordenada.getFila() > n) {
            throw new TableroException("El numero de la fila es superior a la dimension");
        }
        else if(coordenada.getColumna() > n) {
            throw new TableroException("El numero de la columna es superior a la dimension");
        }
        else if(coordenada.getSentido()==Sentido.NORMAL) {
            if(this.n - (coordenada.getColumna() + palabra.length()) < 0) {
                throw new TableroException("El tamanio de la palabra en sentido normal supera el limite establecido");
            }
            this.colocarPalabraVerticalSentidoNormal(palabra,coordenada);
        }
        else if(coordenada.getSentido()==Sentido.INVERSO) {
            if(this.n - (coordenada.getColumna() + palabra.length()) < 0) {
                throw new TableroException("El tamanio de la palabra en sentido inverso supera el limite establecido");
            }
            this.colocarPalabraVerticalSentidoInverso(palabra, coordenada);
        }
    }

    public void colocarPalabraVerticalSentidoNormal(String palabra, Coordenada coordenada) {
        char letra = ' ';
        for(int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(i);
            tablero.get(coordenada.getFila()+1).set(coordenada.getColumna(), letra);
        }
    }

    public void colocarPalabraVerticalSentidoInverso(String palabra, Coordenada coordenada) {
        char letra = ' ';
        for(int i = palabra.length(); i > 0; i--) {
            letra = palabra.charAt(i);
            tablero.get(coordenada.getFila()+1).set(coordenada.getColumna(), letra);
        }
    }

    public void enviarDatosAFichero() {

    }

    public void cargarDatosDeFichero() {

    }

    @Override
    public String toString() {
        return "SopaLetras [n=" + n + ", tablero=" + tablero + ", x=" + x + "]";
    }
}