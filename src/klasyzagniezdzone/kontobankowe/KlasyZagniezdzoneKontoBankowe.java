
package klasyzagniezdzone.kontobankowe;
/**
 * 
 * @author pawelstradomski
 */

public class KlasyZagniezdzoneKontoBankowe {

    
    public static void main(String[] args) {
        
        KontoBankowe mojeKonto = new KontoBankowe(1000);
        System.out.println(mojeKonto.getStanKonta());
        
        mojeKonto.start(5);
        System.out.println(mojeKonto.getStanKonta());
        
    }
    

}
class KontoBankowe
{

    public KontoBankowe(double stanKonta) 
    {
        this.stanKonta = stanKonta;
    }
    
    double getStanKonta()
    {
        return this.stanKonta;
    }
    void start(double stopa)
    {
        Odsetki mojeOdsetki = new Odsetki(stopa);
        mojeOdsetki.zmienStanKonta(stopa);
        
    }
    
    private double stanKonta;
    
    
    class Odsetki
    {

        public Odsetki(double stopa) 
        {
            this.stopa = stopa;
            
        }
        void zmienStanKonta(double stopa)
        {
            double odsetki = (stanKonta * this.stopa) / 100;
            stanKonta += odsetki;
        }
        
        private double stopa;
    }
}
