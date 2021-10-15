package com.company;

public class block1 {
    public static int convert(int min){ //1 задание
        int sec= min*60;
        return sec;
    }
    public static int points(int po2, int po3){  //2 задание
        int result = po2*2+po3*3;
        return result;
    }
    public static int footballPoints(int wins, int draws, int loses){ // 3 задание
        int total_points = wins*3+draws;
        return total_points;
    }
    public static boolean divisibleByFive(double a){        //четвёртое задание
       // if (a%5==0){
         //   return true;
        //}
        //else {
          //  return false;
        //}
        return a%5==0;
    }
    public static boolean and(boolean a1, boolean b1){    // 5 задание
        return a1&b1;
    }
    public static int howManyWalls(int n, int w, int h){    // 6 задание
        int res_walls = n/(w*h);
        return res_walls;
    }
    public static int squared(int b) {       // 7 задание

        return b * b;// исправленная ошибка
    }
    public static boolean profitableGamble(double prob, double prize, double pay){  // 8 задание

        return prob*prize>pay;
    }
    public static int frames(int min, int fps){ // 9 задание
        int res_frames = (min*60)*fps;
        return res_frames;
    }
    public static int mod(int mod_a, int mod_b){// 10 задание
        int c_mod = mod_a/mod_b;
        int res_mod = mod_a-(c_mod*mod_b);
        return res_mod;
    }
    public static void main(String[] args) {
	// write your code here
        //1
        System.out.println("Задание 1");
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(2));


        //2
        System.out.println("Задание 2");
        System.out.println(points(13, 12));
        System.out.println(points(17, 12));
        System.out.println(points(38, 8));

        //3
        System.out.println("Задание 3");
        System.out.println(footballPoints(3, 4, 2));
        System.out.println(footballPoints(5, 0, 2));
        System.out.println(footballPoints(0, 0, 1));

        //4
        System.out.println("Задание 4");
        System.out.println(divisibleByFive(5));
        System.out.println(divisibleByFive(-55));

        //5
        System.out.println("Задание 5");
        System.out.println(and(true, false));
        System.out.println(and(true, true));
        System.out.println(and(false, true));
        System.out.println(and(false, false));

        //6
        System.out.println("Задание 6");
        System.out.println(howManyWalls(54, 1, 43));
        System.out.println(howManyWalls(46, 5, 4));
        System.out.println(howManyWalls(100, 4, 5));
        System.out.println(howManyWalls(10, 15, 12));
        System.out.println(howManyWalls(41, 3, 6));


        //7
        System.out.println("Задание 7");
        System.out.println(squared(5));
        System.out.println(squared(9));
        System.out.println(squared(100));

        //8
        System.out.println("Задание 8");
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));

        //9
        System.out.println("Задание 9");
        System.out.println(frames(1, 1));
        System.out.println(frames(10, 1));
        System.out.println(frames(10, 25));

        //10
        System.out.println("Задание 10");
        System.out.println(mod(5, 2));
        System.out.println(mod(218, 5));
        System.out.println(mod(6, 3));
    }
}
