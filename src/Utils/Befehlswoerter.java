package Utils;
/*
 * Diese Klasse h�lt eine Aufz�hlung aller Befehlsw�rter, die dem
 * Spiel bekannt sind. Mit ihrer Hilfe werden eingetippte Befehle
 * erkannt.
 *
 * @author  Michael K�lling und David J. Barnes
 * @version 2008.03.30
 */

public class Befehlswoerter
{
    // ein konstantes Array mit den g�ltigen Befehlsw�rtern
    private static final String gueltigeBefehle[] = {
            "go", "quit", "help", "look", "take", "drop", "eat", "attack", "map", "use"
    };

    /**
     * Konstruktor - initialisiere die Befehlsw�rter.
     */
    public Befehlswoerter()
    {
        // nichts zu tun momentan...
    }

    /**
     * Pr�fe, ob eine gegebene Zeichenkette ein g�ltiger
     * Befehl ist.
     * @return 'true', wenn die gegebene Zeichenkette ein g�ltiger
     * Befehl ist, 'false' sonst.
     */
    public boolean istBefehl(String eingabe)
    {
        for(int i = 0; i < gueltigeBefehle.length; i++) {
            if(gueltigeBefehle[i].equals(eingabe))
                return true;
        }
        // Wenn wir hierher gelangen, wurde die Eingabe nicht
        // in den Befehlsw�rtern gefunden.
        return false;
    }
    
    public String getAlleGueltigenBefehle()
    {
    	StringBuffer befehle = new StringBuffer();
    	for(String befehl : gueltigeBefehle)
    		befehle.append(befehl + " ");
    	return befehle.toString();
    }
}
