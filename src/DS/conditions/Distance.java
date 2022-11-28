package DS.conditions;

public class Distance {
    static double distance(int x1,int x2,int y1, int y2){
         return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static void main(String[] args) {
        double dist = distance(3,4,4,3);
        System.out.println("distance: "+dist);
    }
}
