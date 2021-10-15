package com.company;

public class block2 {
    public static  int oppositeHouse(int n_house, int n_street){ // 1 задание
        int n_house_opposite = 0;
        int last_house = n_street*2;//номер последнего дома

        if (n_house%2==0){//операция, если задан чётный дом
           int i = last_house;
           n_house_opposite++;
            while (i>n_house){
                i -= 2;
                n_house_opposite+=2;
            }
        }
        else{//операция, когда дан нечётный дом
            n_house_opposite=last_house;
            int i = 1;
            while(i!=n_house){
                i += 2;
                n_house_opposite-=2;

            }
        }
        return n_house_opposite;
    }

    public static String nameShuffle(String n2_str){//2 задание
        String mod_str= "";
        String name = "";//имя
        int i=0;
        while (n2_str.charAt(i) != ' '){// определяем имя
            name+=n2_str.charAt(i);
            i++;
        }
        i++;//прорускаем пробел
        for (int j=i;j<n2_str.length();j++){
            mod_str+=n2_str.charAt(j);
        }
        mod_str+=" "+name;// присоединяем имя к фамилии

        return mod_str;
    }

    public static double discount(double price, double proc){ //     3 задание
        double res_dis = price*(proc/100);//определяем скидку
        return price-res_dis;//находим результат
    }


    public static double differenceMaxMin(double[] argss){//4 задание
        double min =999999999;
        double max= -999999999;
        double diff = 0;
        for (int i = 0; i< argss.length;i++){
            if (argss[i]>=max){
                max = argss[i];//поиск максимума
            }
            if (argss[i]<=min){
                min = argss[i];// поиск минимума
            }
        }
        diff = max-min;//поиск разницы
        return diff;
    }


    public static int equal(int a, int b, int c){ // 5 задание
        int res_equal = 0;
        if (a==b && a==c && b==c){// если все 3 одинаковые
            res_equal=3;
        }
        else if (a==b || a==c || b==c) {//если толко 2 одинаковых
            res_equal=2;
        }
        return res_equal;
    }
    public static String reverse(String string_n6){//задание 6
        return new StringBuilder(string_n6).reverse().toString();//переворачиваем строку

        }

    public static int programmers(int salary_1, int salary_2, int salary_3){    // 7 задание
        int min_val = salary_1;
        int max_val = salary_1;
        if (salary_2>max_val){
            max_val = salary_2;
        }
        if (salary_3>max_val){
            max_val = salary_3;
        }
        //поиск максимальной зарплаты
        if (salary_2<min_val){
            min_val = salary_2;
        }
        if (salary_3<min_val){
            min_val = salary_3;
        }
        //поиск минимальной зарплаты
        int res_prog = max_val-min_val;//поиск разницы
        return res_prog;
    }
    public static boolean getXO(String string_n8){//задание 8
        int count_of_o = 0 ;
        int count_of_x = 0 ;
        string_n8 = string_n8.toLowerCase();// делаем все буквы прописными
        for(int i = 0 ; i<string_n8.length(); i++){
           if (string_n8.charAt(i)=='o'){
                count_of_o++;//поиск колличества букв 'o'
            }
            if (string_n8.charAt(i)=='x' ){
                count_of_x++;//поиск колличества букв 'x'
            }
        }
        if (count_of_o==0 && count_of_x==0){//если букв нет
            return true;
        }
        else if (count_of_o == count_of_x){// если колличество одинаковое
            return true;
        }
        else {// если колличество разное
            return false;
        }
    }
    public static String bomb(String bomb_check){//9 задание
        bomb_check = bomb_check.toLowerCase();// делаем все буквы прописными
        if (bomb_check.contains("bomb")){//ищем наличие слова "bomb" в строке
            return "DUCK!";
        }
        else {
            return  "Relax, there's no bomb";
        }
    }
    public static boolean sameAscii(String str_10_a, String str_10_b){//10 задание
     int sum_ascii_a = 0;
     int sum_ascii_b = 0;
        for(int i = 0; i<str_10_a.length();i++){
         sum_ascii_a += str_10_a.charAt(i);//поиск суммы ascii кодов первой  строки
     }
        for(int i = 0; i<str_10_b.length();i++){
            sum_ascii_b += str_10_b.charAt(i);//поиск суммы ascii кодов второй  строки
        }

        return (sum_ascii_a==sum_ascii_b);// возвращаем результат
    }

    public static void main(String[] args) {
        // write your code here

        // Задание 1
        System.out.println("Заданчччячччяе 1");
        System.out.println(oppositeHouse(1,3));
        System.out.println(oppositeHouse(5,46));
        System.out.println(oppositeHouse(2,3));

        // Задание 2
        System.out.println("Задание 2");
        System.out.println(nameShuffle("Donald Trump"));
        System.out.println(nameShuffle("Rosie O'Donnel"));

        // Задание 3
        System.out.println("Задание 3");
        System.out.println(discount(89,20));
        System.out.println(discount(100,75));
        System.out.println(discount(1500,50));

        // Задание 4
        System.out.println("Задание 4");
        double[] array = {4.0, 1.0, 4.0, -50.0,32.0};
        System.out.println( differenceMaxMin(array));

        // Задание 5
        System.out.println("Задание 5");
        System.out.println(equal(3,4,3));
        System.out.println(equal(3,3,3));



        // Задание 6
        System.out.println("Задание 6");
        System.out.println(reverse("Hello world"));

        // Задание 7
        System.out.println("Задание 7");
        System.out.println(programmers(147,33,526));
        System.out.println(programmers(1,5,9));

        // Задание 8
        System.out.println("Задание 8");
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("oooxx"));

        // Задание 9
        System.out.println("Задание 9");
        System.out.println(bomb("There is a bomb"));
        System.out.println(bomb("There is no boom"));

        // Задание 10
        System.out.println("Задание 10");
        System.out.println(sameAscii("a","a"));
        System.out.println(sameAscii("as","a"));
        System.out.println(sameAscii("AA","B@"));
    }

}
