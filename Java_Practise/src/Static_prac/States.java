package Static_prac;

public class States {
    
    public static void main(String[] args) {
       
        int n = 10000;
        
        Country TN;
        TN = new Country(n);
        TN = new Country(n+10);
        Country KR = new Country();
        int m=0;
        Country TL = new Country(n);
        Country Goa = new Country(n,m);
        
        TN.states="Chennai";
        KR.states="Thiru";
        System.out.println(Country.capital);
        Country.capital="Mumbai";
       
        
               
    }
    
}
