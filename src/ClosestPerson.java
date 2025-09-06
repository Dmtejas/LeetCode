public class ClosestPerson {

    public static int findClosest(int x, int y, int z) {
        int xCloseness = (z-x);
        int absXCloseness = Math.abs(xCloseness);

        int yCloseness = (z-y);
        int absYCloseness = Math.abs(yCloseness);

        if(absXCloseness < absYCloseness) {
            return 1;
        } else if(absXCloseness == absYCloseness) {
            return 0;
        }
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(findClosest(2, 7, 4));
    }
}
