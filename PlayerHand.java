
public class PlayerHand
{
    public String playerKarte;
    public int playerValue;

    public PlayerHand(String pPlayerKarte, int pPlayerValue)
    {
        playerKarte = pPlayerKarte;
        playerValue = pPlayerValue;
    }
    
    public String GibPlayerKarte()
    {
        return playerKarte;
    }
    
    public int GibPlayerValue()
    {
        return playerValue;
    }
}
