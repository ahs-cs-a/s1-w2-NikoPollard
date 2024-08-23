public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b1 = new BodyOfWater("Pacific", 19800., 4.28, true);
        BodyOfWater b2 = new BodyOfWater("Atlantic", 3.338);

        System.out.println(b1.name());
        System.out.println(b1.largestDiameter());
        System.out.println(b1.avgDepth());
        System.out.println(b1.isSaltWater());

        System.out.println(b2.name());
        System.out.println(b2.largestDiameter());
        System.out.println(b2.avgDepth());
        System.out.println(b2.isSaltWater());

        b2.setName("Lies");
        System.out.println(b2.name());
    }
}
