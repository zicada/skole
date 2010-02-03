package oppgavesett3;

/*
 * Konto.java
 *
 */


/**
 * Klassen Konto beskriver en bankkonto med mulighet for innskudd og uttak. 
 */
public class Konto {
    
    private long kontonr; 
    private String navn; 
    private double saldo; 
    
    /**      
     *  @param kontonr Kontoens nummer
     *  @param navn Kontoens navn
     *  @param startSaldo Kontoens saldo 
     */
    public Konto(long kontonr, String navn, double startSaldo) {
        this.kontonr = kontonr; 
        this.navn = navn; 
        saldo = startSaldo; 
    }
    
    /**
     * Metode som henter ut kontonummer
     * @return Kontoens kontonummer 
     */
    public long finnKontonr(){
        return kontonr; 
    }
    
    /**
     * Metode som henter navn 
     * @return Kontoens navn
     */
    public String finnNavn(){
        return navn; 
    }
    
    
    /**
     * Metode som henter saldo på kontoen
     * @return Saldo på kontoen
     */
    public double finnSaldo(){
        return saldo;
    }
    
    /**
     * Metode som setter inn et bestemt beløp på kontoen
     * @param belop Beløpet som skal settes inn 
     */
    public void innskudd(double belop){
        saldo = saldo+belop;
    }
    
    
    /**
     * Metode som tar ut et bestemt beløp fra  kontoen
     * @param belop Beløpet som skal tas ut 
     */
    public void uttak(double belop){
        saldo = saldo - belop; 
    }
}
