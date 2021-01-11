package bingoGame;

import java.util.ArrayList;

public class BingoCheck2 {


        public static void main(String[] args) {



            BingoBall b = new BingoBall();
            BingoCard  c = new BingoCard();

            c.main();


            // 1回目
            int ball = b.Ball();

            ArrayList<Integer> box = new ArrayList<>();
            box.add(ball);

            print(ball,box);


            // 2回目
            ball = compare(b,box);
            box.add(ball);
            print(ball,box);

            // 3回目
            ball = compare(b,box);
            box.add(ball);
            print(ball,box);

            // 4回目
            ball = compare(b,box);
            box.add(ball);
            print(ball,box);

            // 5回目
            ball = compare(b,box);
            box.add(ball);
            print(ball,box);


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
            String b2 = check(ball,BingoCard.getNumB2());
            String i2 = check(ball,BingoCard.getNumI2());
            String n2 = check(ball,BingoCard.getNumN2());
            String g2 = check(ball,BingoCard.getNumG2());
            String o2 = check(ball,BingoCard.getNumO2());
            BingoCard.setNumB2(b2);
            BingoCard.setNumI2(i2);
            BingoCard.setNumN2(n2);
            BingoCard.setNumG2(g2);
            BingoCard.setNumO2(o2);
            System.out.print(b2+"  ");
            System.out.print(i2+"  ");
            System.out.print(n2+"  ");
            System.out.print(g2+"  ");
            System.out.println(o2);


            //3列目
            String b3 = check(ball,BingoCard.getNumB3());
            String i3 = check(ball,BingoCard.getNumI3());
            String n3 = check(ball,BingoCard.getNumN3());
            String g3 = check(ball,BingoCard.getNumG3());
            String o3 = check(ball,BingoCard.getNumO3());
            BingoCard.setNumB3(b3);
            BingoCard.setNumI3(i3);
            BingoCard.setNumN3(n3);
            BingoCard.setNumG3(g3);
            BingoCard.setNumO3(o3);
            System.out.print(b3+"  ");
            System.out.print(i3+" ");
            System.out.print("FREE ");
            System.out.print(g3+"  ");
            System.out.println(o3);


            //4列目
            String b4 = check(ball,BingoCard.getNumB4());
            String i4 = check(ball,BingoCard.getNumI4());
            String n4 = check(ball,BingoCard.getNumN4());
            String g4 = check(ball,BingoCard.getNumG4());
            String o4 = check(ball,BingoCard.getNumO4());
            BingoCard.setNumB4(b4);
            BingoCard.setNumI4(i4);
            BingoCard.setNumN4(n4);
            BingoCard.setNumG4(g4);
            BingoCard.setNumO4(o4);
            System.out.print(b4+"  ");
            System.out.print(i4+"  ");
            System.out.print(n4+"  ");
            System.out.print(g4+"  ");
            System.out.println(o4);

            //5列目ok
            String b5 = check(ball,BingoCard.getNumB5());
            String i5 = check(ball,BingoCard.getNumI5());
            String n5 = check(ball,BingoCard.getNumN5());
            String g5 = check(ball,BingoCard.getNumG5());
            String o5 = check(ball,BingoCard.getNumO5());
            BingoCard.setNumB5(b5);
            BingoCard.setNumI5(i5);
            BingoCard.setNumN5(n5);
            BingoCard.setNumG5(g5);
            BingoCard.setNumO5(o5);
            System.out.print(b5+"  ");
            System.out.print(i5+"  ");
            System.out.print(n5+"  ");
            System.out.print(g5+"  ");
            System.out.println(o5);

            System.out.println("--------------------");
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
            //System.out.println("getNum = " + getNum);

            if(getNum.substring(getNum.length()-1).equals("x")) {
                //result = getNum+"x";
                result = getNum;
            } else {
                if (ball == Integer.valueOf(getNum)) {
                    result = getNum+"x";
                }else{
                    result = getNum;
                }
            }

            return result;
        }
        public static void sheet() {


        }
}