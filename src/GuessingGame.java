class Guess {
    private int guess;

    public Guess(int guess) { this.guess = guess; }

    public int guess(int val) {
        if(val > guess) {
            return -1;
        } else if(val < guess) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class GuessingGame {
    public static void main(String[] args) {
        Guess obj = new Guess(20); //It's a secret actually
        int start = 0;
        int end = 10;
        while(start <= end) {
            int mid = start + (end - start) /2;
            if(obj.guess(mid) == 0) {
                //return the value
            } else if(obj.guess(mid) == -1) {
                //Change the start to mid + 1
            } else  {
                //Do it accordingly
            }
        }
        //return -1 saying the guessed number is not in the range of a picked number
    }
}
