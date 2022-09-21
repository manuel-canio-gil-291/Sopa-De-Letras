package main;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class GuardarCargarPartida {
    public static void writeFile(String partida) {
        Scanner sc = new Scanner(System.in);
        FileWriter file = null;
        PrintWriter pw = null;
        try{
            file = new FileWriter("ultimaPartidaGuardada.txt");
            pw = new PrintWriter(file);
            pw.println(partida);
            System.out.println("\nPartida guardada en -> ultimaPartidaGuardada.txt\n\n");
        }catch(Exception e){
            System.err.println(e.getMessage()+ "\n" +e.getCause());
        }finally{
            try{
                pw.close();
                file.close();
            }catch(Exception e) {
                System.err.println(e.getMessage()+ "\n" + e.getCause());
            }
        }
    }
}
