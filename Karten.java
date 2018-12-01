
public class Karten
{
    private String karte;
    private int value;
    
    public Karten(String pKarte, int pValue)
    {
        karte = pKarte;
        value = pValue;
    }
    
    public String GibKarte()
    {
        return karte;
    }
    
    public int GibValue()
    {
        return value;
    }
}
