public class BodyOfWater {
    private String name;
    private Double largestDiameter;
    private Double avgDepth;
    private Boolean isSaltWater;

    public BodyOfWater(String n, Double ld, Double ad, Boolean s){
        name = n;
        largestDiameter = ld;
        avgDepth = ad;
        isSaltWater = s;
    }

    public BodyOfWater(String n, Double ad){
        name = n;
        avgDepth = ad;
    }

    public String name(){
        return name;
    }

    public Double largestDiameter(){
        return largestDiameter;
    }

    public Double avgDepth(){
        return avgDepth;
    }

    public Boolean isSaltWater(){
        return isSaltWater;
    }

    public void setName(String n){
        name = n;
    }

    public void setLargestDiameter(Double ld){
        largestDiameter = ld;
    }

}
