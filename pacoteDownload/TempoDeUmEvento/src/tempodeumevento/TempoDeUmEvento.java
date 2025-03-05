/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tempodeumevento;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class TempoDeUmEvento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int diaIni = 0;
        int diaFin = 0;
        int horaIni = 0;
        int minIni = 0;
        int segIni = 0;
        int horaFin = 0;
        int minFin = 0;
        int segFin = 0;
        
        System.out.print("Dia ");
        diaIni = teclado.nextInt();        
        horaIni = teclado.nextInt();         
        teclado.next();
        minIni = teclado.nextInt();         
        teclado.next();
        segIni = teclado.nextInt();
        
        System.out.print("Dia ");
        diaFin = teclado.nextInt();
        horaFin = teclado.nextInt();
        teclado.next();
        minFin = teclado.nextInt();
        teclado.next();
        segFin = teclado.nextInt();
        
        int inicioSeg = (diaIni * 86400) + (horaIni * 3600) + (minIni * 60) + segIni;
        int fimSeg = (diaFin * 86400) + (horaFin * 3600) + (minFin * 60) + segFin;
        
        int tempoTotal = fimSeg - inicioSeg;
        
        int dias = tempoTotal/86400;
        tempoTotal %= 86400;
        int horas = tempoTotal/3600;
        tempoTotal %= 3600;
        int minutos = tempoTotal/60;
        int segundos = tempoTotal %= 60;
        
        System.out.println(dias + " dias(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
    
}
