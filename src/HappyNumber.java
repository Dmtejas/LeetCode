public class HappyNumber {

    public static boolean isHappy(int n) {
        while(true) {
            int original = n;
            int flag  = 0;
            if(n == 1) {
                return true;
            }
            if(n < 4) {
                return false;
            }
            while(n != 0) {
                flag += (n%10) * (n%10);
                n/=10;
            }
            System.out.println(flag);
            if(flag == 1) {
                return true;
            }
            else if(flag == original) {
                return false;
            }
            else {
                n = flag;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(4));
    }
}
