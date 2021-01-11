package bingoGame;

import java.util.ArrayList;

public class BingoCheck {


        public static void main(String[] args) {



            BingoBall b = new BingoBall();
            BingoCard  c = new BingoCard();

            c.main();


            // 1回目
            int ball1 = b.Ball();

            ArrayList<Integer> box = new ArrayList<>();
            box.add(ball1);

            print(ball1,box);



            // 2回目
            box.add(compare(b,box));

            // 3回目
            box.add(compare(b,box));

            // 4回目
            box.add(compare(b,box));
            box.add(compare(b,box));
            box.add(compare(b,box));
            box.add(compare(b,box));
            box.add(compare(b,box));
            box.add(compare(b,box));
            box.add(compare(b,box));


}
        public static void print(int ball,ArrayList<Integer> box) {
            System.out.println("ball[" + box.size() + "]:" + ball);

            //1列目
            String b1 = check(ball,BingoCard.getNumB1());
            String i1 = check(ball,BingoCard.getNumI1());
            String n1 = check(ball,BingoCard.getNumN1());
            String g1 = check(ball,BingoCard.getNumG1());
            String o1 = check(ball,BingoCard.getNumO1());
            BingoCard.setNumB1(b1);
            BingoCard.setNumI1(i1);
            BingoCard.setNumN1(n1);
            BingoCard.setNumG1(g1);
            BingoCard.setNumO1(o1);
            System.out.print(b1+"  ");
            System.out.print(i1+"  ");
            System.out.print(n1+"  ");
            System.out.print(g1+"  ");
            System.out.println(o1);


            //2列目
            System.out.print(check(ball,BingoCard.getNumB2())+"  ");
            System.out.print(check(ball,BingoCard.getNumI2())+"  ");
            System.out.print(check(ball,BingoCard.getNumN2())+"  ");
            System.out.print(check(ball,BingoCard.getNumG2())+"  ");
            System.out.println(check(ball,BingoCard.getNumO2()));

            //3列目
            System.out.print(check(ball,BingoCard.getNumB3())+"  ");
            System.out.print(check(ball,BingoCard.getNumI3())+" ");
            System.out.print("FREE ");
            System.out.print(check(ball,BingoCard.getNumG3())+"  ");
            System.out.println(check(ball,BingoCard.getNumO3()));

            //4列目
            System.out.print(check(ball,BingoCard.getNumB4())+"  ");
            System.out.print(check(ball,BingoCard.getNumI4())+"  ");
            System.out.print(check(ball,BingoCard.getNumN4())+"  ");
            System.out.print(check(ball,BingoCard.getNumG4())+"  ");
            System.out.println(check(ball,BingoCard.getNumO4()));

            //5列目
            System.out.print(check(ball,BingoCard.getNumB5())+"  ");
            System.out.print(check(ball,BingoCard.getNumI5())+"  ");
            System.out.print(check(ball,BingoCard.getNumN5())+"  ");
            System.out.print(check(ball,BingoCard.getNumG5())+"  ");
            System.out.println(check(ball,BingoCard.getNumO5()));
        }

        public static int compare(BingoBall b, ArrayList<Integer> box) {
            int boxSize = box.size(); // 最初は1。compareを呼び出すことで増えていく。
            int ball = b.Ball();
            for (int i = 0; i < boxSize; i++) {
                if(box.get(i) ==  ball) {
                    ball = compare(b,box);
                }
            }
            return ball;
        }
        public static String check(int ball,String getNum) {

            String result = null;
            if (ball == Integer.valueOf(getNum)) {
                result = "XX";
            }else{
                result = getNum;
            }
            return result;
        }
        public static void sheet() {


        }
}