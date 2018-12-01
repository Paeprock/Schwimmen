
public class Mitte
{
    private String mitteKarte;
    private int mitteValue;
    
    public Mitte(String pMitteKarte, int pMitteValue)
    {
        mitteKarte = pMitteKarte;
        mitteValue = pMitteValue;
    }
    
    public String GibMitteKarte()
    {
        return mitteKarte;
    }
    
    public int GibMitteValue()
    {
        return mitteValue;
    }
}
