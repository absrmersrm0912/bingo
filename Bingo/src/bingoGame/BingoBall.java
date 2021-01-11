package bingoGame;

import java.util.Random;

public class BingoBall {

    public static int Ball() {
         //bingoball取り出し
         //ランダムに数字が出る1～７５
        Random rnd = new Random();
        int rndBall = (rnd.nextInt(75) + 1); // 0+1から74+1  1から75

        //同じ数字出ないように処理ok
        return rndBall;
    }
}
