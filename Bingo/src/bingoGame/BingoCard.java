package bingoGame;

import java.util.ArrayList;
import java.util.Random;

public class BingoCard {
    //1列目
    public static String numB1;
    public static String numI1;
    public static String numN1;
    public static String numG1;
    public static String numO1;

    //2列目
    public static String numB2;
    public static String numI2;
    public static String numN2;
    public static String numG2;
    public static String numO2;

    //3列目
    public static String numB3;
    public static String numI3;
    public static String numN3;
    public static String numG3;
    public static String numO3;

    //4列目
    public static String numB4;
    public static String numI4;
    public static String numN4;
    public static String numG4;
    public static String numO4;

    //5列目ok
    public static String numB5;
    public static String numI5;
    public static String numN5;
    public static String numG5;
    public static String numO5;



    public static String getNumB1() {
        return numB1;
    }

    public static void setNumB1(String numB1) {
        BingoCard.numB1 = numB1;
    }

    public static String getNumI1() {
        return numI1;
    }

    public static void setNumI1(String numI1) {
        BingoCard.numI1 = numI1;
    }

    public static String getNumN1() {
        return numN1;
    }

    public static void setNumN1(String numN1) {
        BingoCard.numN1 = numN1;
    }

    public static String getNumG1() {
        return numG1;
    }

    public static void setNumG1(String numG1) {
        BingoCard.numG1 = numG1;
    }

    public static String getNumO1() {
        return numO1;
    }

    public static void setNumO1(String numO1) {
        BingoCard.numO1 = numO1;
    }



    public static String getNumB2() {
        return numB2;
    }

    public static void setNumB2(String numB2) {
        BingoCard.numB2 = numB2;
    }

    public static String getNumI2() {
        return numI2;
    }

    public static void setNumI2(String numI2) {
        BingoCard.numI2 = numI2;
    }

    public static String getNumN2() {
        return numN2;
    }

    public static void setNumN2(String numN2) {
        BingoCard.numN2 = numN2;
    }

    public static String getNumG2() {
        return numG2;
    }

    public static void setNumG2(String numG2) {
        BingoCard.numG2 = numG2;
    }

    public static String getNumO2() {
        return numO2;
    }

    public static void setNumO2(String numO2) {
        BingoCard.numO2 = numO2;
    }

    public static String getNumB3() {
        return numB3;
    }

    public static void setNumB3(String numB3) {
        BingoCard.numB3 = numB3;
    }

    public static String getNumI3() {
        return numI3;
    }

    public static void setNumI3(String numI3) {
        BingoCard.numI3 = numI3;
    }

    public static String getNumN3() {
        return numN3;
    }

    public static void setNumN3(String numN3) {
        BingoCard.numN3 = numN3;
    }

    public static String getNumG3() {
        return numG3;
    }

    public static void setNumG3(String numG3) {
        BingoCard.numG3 = numG3;
    }

    public static String getNumO3() {
        return numO3;
    }

    public static void setNumO3(String numO3) {
        BingoCard.numO3 = numO3;
    }

    public static String getNumB4() {
        return numB4;
    }

    public static void setNumB4(String numB4) {
        BingoCard.numB4 = numB4;
    }

    public static String getNumI4() {
        return numI4;
    }

    public static void setNumI4(String numI4) {
        BingoCard.numI4 = numI4;
    }

    public static String getNumN4() {
        return numN4;
    }

    public static void setNumN4(String numN4) {
        BingoCard.numN4 = numN4;
    }

    public static String getNumG4() {
        return numG4;
    }

    public static void setNumG4(String numG4) {
        BingoCard.numG4 = numG4;
    }

    public static String getNumO4() {
        return numO4;
    }

    public static void setNumO4(String numO4) {
        BingoCard.numO4 = numO4;
    }

    public static String getNumB5() {
        return numB5;
    }

    public static void setNumB5(String numB5) {
        BingoCard.numB5 = numB5;
    }

    public static String getNumI5() {
        return numI5;
    }

    public static void setNumI5(String numI5) {
        BingoCard.numI5 = numI5;
    }

    public static String getNumN5() {
        return numN5;
    }

    public static void setNumN5(String numN5) {
        BingoCard.numN5 = numN5;
    }

    public static String getNumG5() {
        return numG5;
    }

    public static void setNumG5(String numG5) {
        BingoCard.numG5 = numG5;
    }

    public static String getNumO5() {
        return numO5;
    }

    public static void setNumO5(String numO5) {
        BingoCard.numO5 = numO5;
    }

    public static void main() {

            //1列に５つ、縦に数字をランダムに表示
            ArrayList<Integer> arrayB = new ArrayList<>();
            ArrayList<Integer> arrayI = new ArrayList<>();
            ArrayList<Integer> arrayN = new ArrayList<>();
            ArrayList<Integer> arrayG = new ArrayList<>();
            ArrayList<Integer> arrayO = new ArrayList<>();

            for (int i = 1; i<= 15; i++) {
                arrayB.add(i);
                arrayI.add(i + 15);
                arrayN.add(i + 30);
                arrayG.add(i + 45);
                arrayO.add(i + 60);


            };


            //一行目　数字を５つ出力
            String getNumB1 = getNum(arrayB);
            String getNumI1 = getNum(arrayI);
            String getNumN1 = getNum(arrayN);
            String getNumG1 = getNum(arrayG);
            String getNumO1 = getNum(arrayO);

            setNumB1(getNumB1);
            setNumI1(getNumI1);
            setNumN1(getNumN1);
            setNumG1(getNumG1);
            setNumO1(getNumO1);





            //2行目　数字を５つ出力

            String getNumB2 = getNum(arrayB);
            String getNumI2 = getNum(arrayI);
            String getNumN2 = getNum(arrayN);
            String getNumG2 = getNum(arrayG);
            String getNumO2 = getNum(arrayO);

            setNumB2(getNumB2);
            setNumI2(getNumI2);
            setNumN2(getNumN2);
            setNumG2(getNumG2);
            setNumO2(getNumO2);

            //3行目　数字を５つ出力
            String getNumB3 = getNum(arrayB);
            String getNumI3 = getNum(arrayI);
            String getNumN3 = getNum(arrayN);
            String getNumG3 = getNum(arrayG);
            String getNumO3 = getNum(arrayO);


            setNumB3(getNumB3);
            setNumI3(getNumI3);
            setNumN3(getNumN3);
            setNumG3(getNumG3);
            setNumO3(getNumO3);


            //4行目　数字を５つ出力
            String getNumB4 = getNum(arrayB);
            String getNumI4 = getNum(arrayI);
            String getNumN4 = getNum(arrayN);
            String getNumG4 = getNum(arrayG);
            String getNumO4 = getNum(arrayO);


            setNumB4(getNumB4);
            setNumI4(getNumI4);
            setNumN4(getNumN4);
            setNumG4(getNumG4);
            setNumO4(getNumO4);

            //5行目　数字を５つ出力
            String getNumB5 = getNum(arrayB);
            String getNumI5 = getNum(arrayI);
            String getNumN5 = getNum(arrayN);
            String getNumG5 = getNum(arrayG);
            String getNumO5 = getNum(arrayO);


            setNumB5(getNumB5);
            setNumI5(getNumI5);
            setNumN5(getNumN5);
            setNumG5(getNumG5);
            setNumO5(getNumO5);


}

        //
        private static String getNum(ArrayList<Integer> array) {
            //result初期化
            int result = 0;

            //randomメソッド呼び出し
            Random rnd = new Random();

            //arrayリストの数から-1をrndNumに代入
            int rndNum = array.size() - 1;


            //randomの数字を生成
            int rndBall = (rnd.nextInt(rndNum));    // 0-14

            //resultにrandomで出た数字インデックス番号を代入
            result = array.get(rndBall);

            //rndで出た値をremoveする時にindexNOがずれるので-1する
            //rndで出た値をremove
            array.remove(rndBall);

            //戻り値をgetNum返す
            //return result;
            //一桁の数字に0をつける
            return String.format("%02d", result);
        }
}
