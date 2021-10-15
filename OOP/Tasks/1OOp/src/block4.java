import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
public class block4 {
    public static String sevenBoom(int[] mas){// задание 1+
        int [] mas_1 = mas;
        for (int i = 0; i<mas_1.length;i++){
            while (mas_1[i]>0){
                if (mas_1[i]%10==7){
                    return "boom";
                }
                mas_1[i]/=10;
            }

        }
        return "there is no number 7";
    }
    public static boolean cons(int[] zad_2){//Задание 2+
        int[] zad_2_copy = zad_2;
        Arrays.sort(zad_2_copy);
        //for (int i = 0;i< zad_2_copy.length;i++) {
          //  System.out.println(zad_2_copy[i]);
        //}
        for (int i = 1;i< zad_2_copy.length;i++){
            if (zad_2_copy[i]!=zad_2_copy[i-1]+1){
                return false;
            }
        }
        return true;
    }
    public static String unmix(String abs){//3 задание+
        char[] abs_char = abs.toCharArray();
        for (int i=1; i< abs_char.length; i+=2){
            char tech = abs_char[i];
            abs_char[i] = abs_char[i-1];
            abs_char[i-1] = tech;
        }
        return new String(abs_char);
    }


    public static StringBuilder noYelling(String n4) {//задание 4+
        StringBuilder copy = new StringBuilder(n4);
        int i =copy.length()-1;
        char last = copy.charAt(i);
        while (copy.charAt(i)==last && copy.charAt(i-1)==last){
            copy.deleteCharAt(i);
            i--;
        }
        return copy;
    }

    public static String xPronounce(String original){//задание 5+
        String[] splitStr = original.split(" ");
        for (int i=0; i < splitStr.length; i++) {
            if(splitStr[i].equals("x")) {
                splitStr[i] = "ecks";
            }
            if(splitStr[i].equals("X")) {
                splitStr[i] = "Ecks";
            }
            if (splitStr[i].startsWith("x")) {
                splitStr[i] = splitStr[i].replaceFirst("x","z");
            }
            if (splitStr[i].startsWith("X")) {
                splitStr[i] = splitStr[i].replaceFirst("X","Z");
            }
            splitStr[i] = splitStr[i].replace("x","cks");

        }

        return String.join(" ", splitStr);
    }

    public static int largestGap(int[] zad_6){//задание 6+
    Arrays.sort(zad_6);
    int largestgap = 0;
    for (int i=1;i< zad_6.length;i++){
        if (zad_6[i]-zad_6[i-1]>largestgap){
            largestgap = zad_6[i]-zad_6[i-1];
        }
    }
    return largestgap;
    }

    public static int personalFunction(int zad7){//задание 7 +
        int zad_7_copy = zad7;
        int zad7_rev=0;
        int count=0 ;
        int[] array={};
        while (zad_7_copy>0){
                array = Arrays.copyOf(array, array.length+1);
                array[count] = zad_7_copy%10;
                zad_7_copy/=10;
                count++;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            zad7_rev += array[i]*Math.pow(10, array[i]);
        }
        if (zad7-zad7_rev>=0) {
            return zad7 - zad7_rev;
        }
        return 0;
    }


    public static String commonLastVowel(String zad_8){//задание 8+
        zad_8 = zad_8.toLowerCase().replaceAll("[,.!?:;-]+", "");
        List<String> s = Arrays.asList("euioay".split(""));
        String[] w = zad_8.split(" ");
        HashMap<Integer, String> map = new HashMap<>();
        int k = 0;
        for (String t : w) {
            String v = t.substring(t.length() - 1);
            if (s.contains(v)) {
                map.put(k, v);
                k++;
            }
        }
        return map.get(k - 1);
    }

    public static int memeSum(int ch1,int ch2){//9 задание+
        int ch_res=0;
        int count_zeroes=0;
        int ch_tech;
        ch_tech=ch1%10+ch2%10;
        ch_res+=ch_tech;
        ch1/=10;
        ch2/=10;
        if (ch_tech>=10){
            count_zeroes += 2;
        }
        else {
            count_zeroes++;
        }

        while(ch1>0){
            ch_res = (int) Math.pow(10,count_zeroes) *(ch1%10+ch2%10)+ch_res;
            if (ch1%10+ch2%10>=10){
                count_zeroes+=2;
            }
            else {
                count_zeroes++;

            }

            ch1/=10;
            ch2/=10;
        }
        if (ch2>0){
            while (ch2>0) {
                ch_res = (int) Math.pow(10, count_zeroes) * (ch2 % 10) + ch_res;
                count_zeroes++;
                ch2 /= 10;
            }
        }
    return ch_res;
    }

    public static String unrepeated(String zad_10){//10 задание+
        String copy="";
        String abcd="";
        boolean flag = false;
        for (int i = 0; i<zad_10.length();i++){

              for (int j=0;j<abcd.length();j++){
                  if (zad_10.charAt(i)==abcd.charAt(j)){
                      flag=true;
                  }
              }
                if(flag==false){

                  copy+=zad_10.charAt(i);
                  abcd+=zad_10.charAt(i);
              }


        }
    return copy;
    }


    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int[] pervoe={2,8,7,5};
        int[] pervoe1={12,90,75};
        int[] pervoe2={12,90,5};
        System.out.println(sevenBoom(pervoe));
        System.out.println(sevenBoom(pervoe1));
        System.out.println(sevenBoom(pervoe2));

        // 2 задание
        System.out.println("Задание 2");
        int[] vtoroe={5,1,4,3,2};
        int[] vtoroe1={5,1,4,3,2,8};
        int[] vtoroe2={5,6,7,8,9,9};
        int[] vtoroe3={5,6,7,8,9};
        System.out.println(cons(vtoroe));
        System.out.println(cons(vtoroe1));
        System.out.println(cons(vtoroe2));
        System.out.println(cons(vtoroe3));

        // 3 задание
        System.out.println("Задание 3");
        System.out.println(unmix("hTsii  s aimex dpus rtni.g"));
        System.out.println(unmix("lPaeesh le pemu mnxit ehess rtnisg"));

        //4
        System.out.println("Задание 4");
        System.out.println(noYelling("What went wrong?????????"));
        System.out.println(noYelling("I just!!! can!!! not!!! believe!!! it!!!"));

        //5
        System.out.println("Задание 5");
        System.out.println(xPronounce("Inside the box was a xylophone"));
        System.out.println(xPronounce("The x ray is excellent"));
        System.out.println(xPronounce("OMG x box unboxing video x D"));
        //6
        System.out.println("Задание 6");
        int[] gap1= {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        System.out.println(largestGap(gap1));

        //7
        System.out.println("Задание 7");
        System.out.println(personalFunction(832));
        System.out.println(personalFunction(51));
        System.out.println(personalFunction(7977));
        System.out.println(personalFunction(198));

        //8
        System.out.println("Задание 8");
        System.out.println(commonLastVowel("Hello World!"));
        System.out.println(commonLastVowel("Watch the characters dance!"));
        System.out.println(commonLastVowel("OOI UUI EEI AAI"));

        //9
        System.out.println("Задание 9");
        System.out.println(memeSum(26, 39));
        System.out.println(memeSum(1222, 30277));

        //10
        System.out.println("Задание 10");
        System.out.println(unrepeated("teshahset"));
        System.out.println(unrepeated("aaaaa"));
        System.out.println(Math.pow(10,2));
    }
}
