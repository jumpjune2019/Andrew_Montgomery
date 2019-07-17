public class HeadOrTail {
​
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HeadOrTailLambda flipTheCoin = () -> ((int) (Math.random()*2 +1));
        if(1 == flipTheCoin.flipCoin()) {
            System.out.println("Coin Flip Program");
            System.out.println("The coin flip is: heads ");
        }else if(2 == flipTheCoin.flipCoin()) {
            System.out.println("Coin Flip Program");
            System.out.println("The coin flip is: tails");
        }
    }
​
}