import java.util.Scanner;

public class main
{
    static Scanner key = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println((char)12);
        /* WÖS : Variablen- und Methodennamen sollten immer mit einem
         *       kleinen Buchstaben beginnen. Klassen hingegen mit einem
         *       Großbuchstaben.
         *       Ein Objekt Eurer Klasse Karten soll ja eine Spielkarte
         *       modellieren - Singular. Es wäre däher einfacher zu ver-
         *       stehen, wenn diese Klasse Karte heißt.
         *       Euer Array karten würde dann auch etwas sinnvoller aus
         *       mehreren Objekten vom Typ Karte bestehen.
         */
        Karten[] Karten = new Karten[52];
        //alle Herz Karten
        Karten[0] = new Karten("Herz 2", 2);
        Karten[1] = new Karten("Herz 3", 3);
        Karten[2] = new Karten("Herz 4", 4);
        Karten[3] = new Karten("Herz 5", 5);
        Karten[4] = new Karten("Herz 6", 6);
        Karten[5] = new Karten("Herz 7", 7);
        Karten[6] = new Karten("Herz 8", 8);
        Karten[7] = new Karten("Herz 9", 9);
        Karten[8] = new Karten("Herz 10", 10);
        Karten[9] = new Karten("Herz Jude", 10);
        Karten[10] = new Karten("Herz Dame", 10);
        Karten[11] = new Karten("Herz König", 10);
        Karten[12] = new Karten("Herz Ass", 11);
        //alle Karo Karten
        Karten[13] = new Karten("Karo 2", 2);
        Karten[14] = new Karten("Karo 3", 3);
        Karten[15] = new Karten("Karo 4", 4);
        Karten[16] = new Karten("Karo 5", 5);
        Karten[17] = new Karten("Karo 6", 6);
        Karten[18] = new Karten("Karo 7", 7);
        Karten[19] = new Karten("Karo 8", 8);
        Karten[20] = new Karten("Karo 9", 9);
        Karten[21] = new Karten("Karo 10", 10);
        Karten[22] = new Karten("Karo Jude", 10);
        Karten[23] = new Karten("Karo Dame", 10);
        Karten[24] = new Karten("Karo König", 10);
        Karten[25] = new Karten("Karo Ass", 11);
        //alle Kreuz Karten
        Karten[26] = new Karten("Kreuz 2", 2);
        Karten[27] = new Karten("Kreuz 3", 3);
        Karten[28] = new Karten("Kreuz 4", 4);
        Karten[29] = new Karten("Kreuz 5", 5);
        Karten[30] = new Karten("Kreuz 6", 6);
        Karten[31] = new Karten("Kreuz 7", 7);
        Karten[32] = new Karten("Kreuz 8", 8);
        Karten[33] = new Karten("Kreuz 9", 9);
        Karten[34] = new Karten("Kreuz 10", 10);
        Karten[35] = new Karten("Kreuz Jude", 10);
        Karten[36] = new Karten("Kreuz Dame", 10);
        Karten[37] = new Karten("Kreuz König", 10);
        Karten[38] = new Karten("Kreuz Ass", 11);
        //alle Pik Karten
        Karten[39] = new Karten("Pik 2", 2);
        Karten[40] = new Karten("Pik 3", 3);
        Karten[41] = new Karten("Pik 4", 4);
        Karten[42] = new Karten("Pik 5", 5);
        Karten[43] = new Karten("Pik 6", 6);
        Karten[44] = new Karten("Pik 7", 7);
        Karten[45] = new Karten("Pik 8", 8);
        Karten[46] = new Karten("Pik 9", 9);
        Karten[47] = new Karten("Pik 10", 10);
        Karten[48] = new Karten("Pik Jude", 10);
        Karten[49] = new Karten("Pik Dame", 10);
        Karten[50] = new Karten("Pik König", 10);
        Karten[51] = new Karten("Pik Ass", 11);
        //------------------------------------------------------------------------
        //alle Spieler + karte/value + W/L
        PlayerStats[] PlayerStats = new PlayerStats[3];
        //                               PlayerName, Wins, Lose
        PlayerStats[0] = new PlayerStats("Player 1",  0  ,  0  );
        PlayerStats[1] = new PlayerStats("Player 2",  0  ,  0  );
        PlayerStats[2] = new PlayerStats("Player 3",  0  ,  0  );
        //------------------------------------------------------------------------
        //PlayerHand
        PlayerHand[] PlayerHand = new PlayerHand[3];
        //                             Karte, Value
        PlayerHand[0] = new PlayerHand( ""  ,   0  );
        PlayerHand[1] = new PlayerHand( ""  ,   0  );
        PlayerHand[2] = new PlayerHand( ""  ,   0  );
        //------------------------------------------------------------------------
        //Mittel Karten
        Mitte[] Mitte = new Mitte[3];
        //                   Karte, Value
        Mitte[0] = new Mitte(  ""  ,  0  );
        Mitte[1] = new Mitte(  ""  ,  0  );
        Mitte[2] = new Mitte(  ""  ,  0  );
        //------------------------------------------------------------------------
        //Willkommens Ansprache
        System.out.println("                 Willkommen                ");
        System.out.println("Spiel Starten[1] -  oder - Spiel Beenden[2]");
        int startBeenden = 0;
        while(startBeenden != 1 || startBeenden != 2 )  
        {
            startBeenden = key.nextInt();
            //Start
            if(startBeenden == 1)
            {
                System.out.println("Okey, Los gehts !"); break;
            }
            //Beenden
            else if(startBeenden == 2)
            {
                System.out.println("Okey, Tschüss"); break;
            }
            //Falsche eingabe
            else
            {
                System.out.println("Diese auswahl gab es nicht !"); break;
            }
        }
        //------------------------------------------------------------------------
        //Mischen + austeilen
        System.out.println("mischen[1] - oder - austeilen[2]");
        
        /* WÖS : Innerhalb einer for-Schleife sind Variablen-Deklerationen schlecht,
         *       da bei jedem Schleifendurchlauf wieder eine neue Variable angelegt
         *       wird, auch wenn diese denselben Namen hat. Es wird daher immer und 
         *       immer wieder Speicherplatz reserviert und verbraucht.
         */
        
        int mischenAusteilen = 0;
        Karten tempKarte;
        int zufall;
        
        while(mischenAusteilen != 2) 
        {
            mischenAusteilen = key.nextInt();
            //Mischen
            if(mischenAusteilen == 1)
            {
                
                for(int j = 0; j < Karten.length; j++)
                {
                    zufall = (int)(Math.random()*Karten.length);
                    
                    /* WÖS: Ihr habt ein korrektes Array aus Objekten vom Typ Karte(n)
                     *      angelegt. Wenn ihr beiden in einer Reihe steht und ich Euch 
                     *      "mischen" möchte, dann würde man Euch als Objekte einfach 
                     *      "umstellen" und nicht erst anfangen Eure Kleidung zu tauschen
                     *      und die Haare erst blond und dann braun zu färben.
                     */
                    
                    tempKarte = Karten[j];
                    Karten[j] = Karten[zufall];
                    Karten[zufall] = tempKarte;
                    System.out.println("mischen[1] - oder - austeilen[2]"); break;
                }
            }
            //Austeilen
            else if(mischenAusteilen == 2)
            {
                
            }
            //Falsche eingabe
            else
            {
                System.out.println("Diese Auswahl gab es nicht !"); 
                System.out.println("mischen[1] - oder - austeilen[2]"); break;
            }
        }
        //------------------------------------------------------------------------
        //Stapelauswahl
        zufall = (int)(Math.random()*PlayerStats.length);
        System.out.println("Der" + PlayerStats[zufall].GibName() + "darf zwischen zwei verschiedenen Stapeln auswählen");
        System.out.println("Linker Stapel[1] - oder - Rechter Stapel[2]");
        int rechtsLinks = key.nextInt();
        for(int i = rechtsLinks ; i < 2 || i > 1 ; i = 1)
        {
            //Linker Stapel
            if(rechtsLinks == 1)
            {
                
            }
            //Rechter Stapel
            else if(rechtsLinks == 2)
            {
                
            }
            //Falsche eingabe
            else
            {
                System.out.println("Diese auswahl gab es nicht !"); 
            }
        }
    }
}    
