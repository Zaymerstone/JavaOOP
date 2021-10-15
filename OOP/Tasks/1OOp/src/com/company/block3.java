package com.company;
import java.util.ArrayList;
import java.util.HashMap;

public class block3 {
   // public static
   public static HashMap<String, Integer> millionsRounding(HashMap<String, Integer> a){// задание 1
       ArrayList<Integer> values = new ArrayList<>(a.values());
       int eachPop=0;
       int i=0;
       ArrayList<String> keys = new ArrayList<>(a.keySet());
       for (Integer value : values) {
           eachPop = (int)(Math.round(value/1E6)*1E6);
           a.replace(keys.get(i), eachPop);
           i++;
       }
       return a;
   }

    //}
    public static double[] otherSides(double shortr){//2 задание
        double[] result_3;
        double shortest = shortr;
        result_3 = new double[2];
        double gip = shortest*2;
        double third = Math.sqrt((Math.pow(gip,2))-(Math.pow(shortest,2)));
        result_3[0]=gip;
        result_3[1] = third;
        return result_3;
    }
    public static String rps(String gamer1, String gamer2){// 3 задание
        if (gamer1=="бумага"&&gamer2=="камень" || gamer1=="ножницы" && gamer2=="бумага"|| gamer1=="камень" && gamer2=="ножницы"){
            return "Победил 1 игрок";
        }
        else if (gamer1==gamer2){
            return "Ничья";
        }
        else {
            return "Победил 2 игрок";
        }
    }
    public static int warOfNumbers(int[] mas){// 4 задание
        int sum_of_ch = 0;
        int sum_of_nech = 0;
        for (int i = 0; i<mas.length;i++){
            if (mas[i]%2==0){
                sum_of_ch+=mas[i];
            }
            else {
                sum_of_nech+=mas[i];
            }
        }

        return Math.abs(sum_of_ch-sum_of_nech);
    }

    public static String reverseCase(String str){//задание 5
        char[] charStr = str.toCharArray();
        for (int i=0; i<charStr.length; i++){
            if (charStr[i] >= 'a' & charStr[i] <= 'z' | charStr[i] >= 'а' & charStr[i] <= 'я' ){
                charStr[i] = Character.toUpperCase(charStr[i]);
            }
            else{
                charStr[i] = Character.toLowerCase(charStr[i]);
            }
        }
        return new String(charStr);
    }

    public static String inatorInator(String word){// 6 задание
        String res= "";
        ArrayList<Character> charArray = new ArrayList<>();
        charArray.add('a');
        charArray.add('e');
        charArray.add('i');
        charArray.add('o');
        charArray.add('u');
        charArray.add('y');
        int count_of_bukvi = word.length();
        String copy = word;
        copy.toLowerCase();
        if(charArray.contains(copy.charAt(word.length()-1))){

            word+="-inator"+count_of_bukvi+"000";
        }
        else {
            word+="inator "+count_of_bukvi+"000";

        }
        return word;
    }

    public static boolean doesBrickFit(int a, int b, int c, int w, int h){//7 задание
        return (w == a && h == b) || (h == a && a == b) || (w == b && h == c)
                || (w == c && h == a) || (w==c && h == b) || (w==a && h==c);
    }

    public static double totalDistance(double litr, double rashod, int passag, boolean kondik){//8 задание
        return litr*100/(rashod * (kondik ? 1.1 : 1) * (1+ passag*0.05));
    }
    public static double mean(int[] intes){// 9 задание
        int sum_of = 0;
        int count_of = 0;
        for (int i = 0;i<intes.length;i++){
            sum_of+=intes[i];
            count_of++;
        }
        return (double) sum_of/count_of;
    }

    public static boolean parityAnalysis(int chis){//10 задание
        boolean chetnost_1 = false;
        boolean chetnost_2 = false;
        int sum_of_chis = 0;
        if (chis%2==0){
            chetnost_1 = true;
        }
        while (chis>0){
            sum_of_chis += chis%10;
            chis=chis/10;
        }
        if (sum_of_chis%2==0){
            chetnost_2 = true;
        }
        return chetnost_1 == chetnost_2;
    }

    public static void main(String[] args) {
        //задание 1
        System.out.println("Задание 1");


        //задание 2
        System.out.println("Задание 2");

        double[] zad_2=otherSides(1);
        for (int i = 0; i<zad_2.length;i++){
            System.out.print(zad_2[i]+" ");
        }
        //Задание 3
        System.out.println("Задание 3");
        System.out.println(rps("камень","бумага"));
        System.out.println(rps("бумага","бумага"));
        System.out.println(rps("бумага","камень"));

        //задание 4
        System.out.println("Задание 4");
        int[] chetvertoe={2,8,7,5};
        int[] chetvertoe1={12,90,75};
        System.out.println(warOfNumbers(chetvertoe));
        System.out.println(warOfNumbers(chetvertoe1));

        //5
        System.out.println("Задание 5");
        System.out.println(reverseCase("Happy Birthday"));
        //6
        System.out.println("Задание 6");
        System.out.println(inatorInator("ShrinK"));
        System.out.println(inatorInator("EvilClone"));
        //7
        System.out.println("Задание 7");
        System.out.print(doesBrickFit(1,2,1,1,1));

        //задание 8
        System.out.println("Задание 8");
        System.out.println(totalDistance(70,7,0,false));
        System.out.println(totalDistance(36.1,8.6,3,true));

        // задание 9
        System.out.println("Задание 9");
        int[] array = {2,3,2,3};
        int[] array1 = {3,3,3,3};
        System.out.println(mean(array));
        System.out.println(mean(array1));

        // задание 10
        System.out.println("Задание 10");
        System.out.println(parityAnalysis(243));
        System.out.println(parityAnalysis(12));
        System.out.println(parityAnalysis(3));
    }
}
