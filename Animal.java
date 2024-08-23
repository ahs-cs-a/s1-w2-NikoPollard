public class Animal {
    private String type;
    private int numLimbs;
    private boolean isMammal;
    private boolean isMostlyLand;
    private double weight;


    public Animal(String t){
        t = type;
    }

    public Animal(String t, double w){
        type = t;
        w = weight;
    }

    public Animal(boolean mammal, double w){
        isMammal = mammal;
        weight = w;
        numLimbs = 4;
    }

    public Boolean isMostlyLand(){
        return isMostlyLand;
    }
    
    public Boolean isMammal(){
        return isMammal;
    }

    public String getType(){
        return type;
    }

    public void setLimbs(int n){
        numLimbs = n;
    }

    public int limbs(){
        return numLimbs;
    }
}
