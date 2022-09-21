package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tabla {
    private int tamanio;
    private List<List<Character>> tablero;
    private char letra;
    private Map<Character, Integer> contadorLetrasMap;
    
    public Tabla(int tamanio) throws TableroException {
        this.tamanio = tamanio;
        if(tamanio <= 0) {
            throw new TableroException("Tamanio del tablero no valido, debe ser mayor que 0");
        }

        this.tablero = new ArrayList<List<Character>>();
        this.contadorLetrasMap = new HashMap<Character, Integer>();
    }

    public void generarTablero() {
        for(int i = 0; i < this.tamanio; i++) {
            this.tablero.add(new ArrayList<Character>());
        }
    }

    public void mostrarResumenDeLetras() {
        this.recorrerTablero();

        int n = 0;

        for(Character i : this.contadorLetrasMap.keySet()) {
            if(n != this.contadorLetrasMap.size() - 1) {
                System.out.println(i + "=" + this.contadorLetrasMap.get(i) + ", ");
            }
            else
            {
                System.out.println(i + "=" + this.contadorLetrasMap.get(i));
            }
            n++;
        }
    }

    private void recorrerTablero(){
        for(int i = 0; i < this.letra; i++) {
            for(int j = 0; j < this.letra; j++) {
                this.letra = this.tablero.get(i).get(j);

                if(this.letra != '*') this.contadorLetras(letra);
            }
        }
    }

    private void contadorLetras(char letra) {
        if(!this.contadorLetrasMap.containsKey(letra)) {
            this.contadorLetrasMap.put(letra, 1);
        }
        else {
            this.contadorLetrasMap.put(letra, this.contadorLetrasMap.get(letra) + 1);
        }
    }
}
