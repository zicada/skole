package oppgavesett3;

/** 
 * Flaske.java
 */


/**
 * Klassen Flaske beskriver en vannflaske. 
 */
public class Flaske {
     
    /** Flaskens kapasitet  (målt i liter) */ 
    private int kapasitet; 
    
    /** Flaskens vannmengde (målt i liter) */ 
    private int vannmengde;
    
    /**  @param kapasitet Flaskens maksimumskapasitet, målt i liter*/
    public Flaske(int kapasitet) {
        this.kapasitet = kapasitet; 
        vannmengde=0; 
    }
        
    /** 
     * Metode som viser nåværende vannmengde på flasken. 
     * @return Antall liter vann som er på flasken for øyeblikket. 
     */
    public int hentVannmengde(){ 
        return vannmengde;
    }
    
    /**  
     * Metode som viser hvor mye ledig plass det er på flasken. 
     * @return Antall liter vann som kan fylles på flasken før den er full. 
     */ 
    public int ledigPlass(){ 
        return kapasitet -vannmengde;
    }
    
    /** Metode som fyller flasken full. */ 
    public void fyllFull() {
        vannmengde = kapasitet;
    }
    
    /** Metode som tømmer flasken */ 
    public void tom(){
        vannmengde = 0;
    }
    
    
    private void reduserMengde(int reduksjon){
        vannmengde = vannmengde-reduksjon; 
    }
    
    /** Metode som heller vann fra flasken som er gitt som parameter til denne flasken. 
     *  Mengden vann som helles over fra den ene flasken til den andre er  begrenset 
     *  enten av kapasiteten til flasken som tar imot vannet eller vannmengden på flasken det helles fra. 
     *
     * @param fraFlaske Flasken det helles fra. 
     */ 
    public void hellOver(Flaske fraFlaske){
        if(ledigPlass() >= fraFlaske.hentVannmengde()){
            vannmengde += fraFlaske.hentVannmengde();
            fraFlaske.tom();
        }
        else{            
            fraFlaske.reduserMengde(this.ledigPlass());
            fyllFull();
        }            
    }
}