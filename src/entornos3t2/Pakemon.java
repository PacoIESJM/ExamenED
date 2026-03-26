/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @url https://github.com/PacoIESJM/ExamenED.git 
 * url de git hub
 */
package entornos3t2;

/**
 *
 * @author PACO
 */
/**
 * 
 * @author manuel.tabmur
 */
/**
 * 
 * @version final
 */
/**
 * 
 * Clase que instancia pakemon con distintos metodos para capturar pokemon etc
 */
 /* Manuel Taboada Murillo*/
public class Pakemon {
    /** @atribute nombre jugador //nombre del jugador, se pide al crear el juego */
    private String nombreJugador; 
    /** @atribute juego pasado indica si se ha pasado el juego o aún no */
    private boolean juegoPasado; 
    private int pakemonCapturados; //indica los pakemon que tiene el jugador en su poder
    private int pakeballs; //disponibles para capturar pakemons

    
    public Pakemon(String nombreIn) {
        if (nombreIn.equals("")) {
            this.nombreJugador = "Vago/a";
        } else {
            this.nombreJugador = nombreIn;
        }
        this.juegoPasado = false;
        this.pakemonCapturados = 0;
    }

    /**
     * @param nombrePakemon nombre del pokemon
     * @return devuelve true o false
     */
    public boolean capturarPakemon(String nombrePakemon) {
        if (this.pakeballs == 0) {
            System.out.println("No se puede capturar");
            return false;
        } else if (nombrePakemon.equals("Mew")) {
            System.out.println("Casi imposible, majo");
            return false;
        } else {
            System.out.println("¡Capturado!");
            this.pakeballs--;
            return true;

        }
    }
    
    
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }

    /**
     * 
     * @param claveFin  entero qeu supone la clave fin
     * @return 
     */
    public String decirClaveFinal(int claveFin) {
        if (claveFin == 1223424345) {
            return "¡Has ganado!";
        } else {
            return "¡Chicos, hay que estudiar más!";
        }
    }
    
    /**
     * 
     * @return nombreJugador nombre del jugador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }
    /**
     * 
     * @param nombreJugador 
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    /**
     * 
     * @return juegoPasado juego pasado
     */
    public boolean isJuegoPasado() {
        return juegoPasado;
    }
    /**
     * 
     * @param juegoPasado debe ser true o false
     */
    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }
    /**
     * 
     * @return pakemonCapturdos devuelve los pokemon capturados
     */
    public int getPakemonCapturados() {
        return pakemonCapturados;
    }
    /**
     * 
     * @param pakemonCapturados 
     */
    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }
    /**
     * 
     * @return pakeballs devuelve los pakeball
     */
    public int getPakeballs() {
        return pakeballs;
    }
    /**
     * 
     * @param pakeballs 
     */
    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
