package com.company;
public class block6{
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 9, 4, 5, 15, 3};
        int arr2[] = twoProduct(arr, 45);

        System.out.print("["+arr2[0]+", ");
        System.out.println(arr2[1]+"]");

    }
    public static String hiddenAnagram(String str, String str2) {
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        str2 = str2.toLowerCase().replaceAll("[^a-z]", "");

        StringBuilder resultBuilder = new StringBuilder();
        boolean isResultFound = false;

        for (int i = 0; i < str.length() && !isResultFound; i++) {
            for (int j = i; j < str.length(); j++) {
                String symbol = String.valueOf(str.charAt(j));
                if (str2.contains(symbol)) {
                    resultBuilder.append(symbol);
                    str2 = str2.replace(symbol, "");
                    if (str2.isEmpty()) {
                        isResultFound = true;
                        break;
                    }
                }
                else { break; }
            }
        }
        return isResultFound ? resultBuilder.toString() : "notfound";
    }
    public static String[] collect(String str, int n) {
        int l = str.length() / n;
        String[] collection = new String[l];
        for (int i = 0; i < str.length(); i += n) {
            collection[i] = str.substring(i, i + n);
        }
        java.util.Arrays.sort(collection);
        return collection;
    }
    public static String nicoCipher(String input, String key) {
        int l = key.length();
        while (input.length() % l != 0) {
            input = input + ' ';
        }
        char[][] table = new char[l][l/l+1];
        for (int i = 0; i < l; i++) {
            table[i][0] = key.charAt(i);
        }
        for (int i = 0; i < input.length(); i++) {
            table[i%l][i/l+1] = input.charAt(i);
        }
        java.util.Arrays.sort(table, (a, b) -> Integer.compare(a[0], b[0]));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(table[i%l][i/l+1]);
        }
        return sb.toString();
    }
    public static int[] twoProduct(int[] arr, int n) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] * arr[i] == n) return new int[] {arr[j], arr[i]};
            }
        }
        return new int[0];
    }
    public static int[] isExact(int n) {
        try {
            return new int[] { n, isExact(n, 2) };
        } catch (Exception e) {
            return new int[0];
        }
    }

    private static int isExact(float n, float divider) {
        float result = n / divider;

        if (result > 1) return isExact(n / divider, ++divider);
        else if (result == 1) return (int)n;
        return (int)n;
    }

    public static String fractions(String num) {
        String arr[] = num.split(",");
        String frac = "";
        String per = "";
        int up;
        int down;
        for(int i = 0; arr[1].charAt(i) != '('; i++){
            frac += arr[1].charAt(i);
        }
        for(int i = frac.length()+1; i < arr[1].length()-1; i++){
            per += arr[1].charAt(i);
        }
        down = (int)Math.pow(10, (frac+per).length()) - (int)Math.pow(10, frac.length());
        up = Integer.parseInt(frac+per)-Integer.parseInt("0"+frac);
        for(int i = 2; i <= up; i++){
            if(up % i == 0 && down % i == 0){
                up = up / i;
                down = down/i;
                i--;
            }
        }
        up += Integer.parseInt(arr[0])*down;
        return up+"/"+down;
    }
    public static String pilish_string(String str) {
        if(str == ""){return str;}
        String res = "";
        String pi = "314159265358979";
        int k = 0;
        boolean flag = false;
        for(int i = 0; i < pi.length(); i++){
            for(int j = 0; j < pi.charAt(i)-48; j++){
                if(k == str.length()-1){
                    res += str.charAt(k);
                    flag = true;
                }
                else{
                    res += str.charAt(k);
                    k++;
                }
            }
            if(flag){break;}
            res += " ";
        }
        return res;
    }
    public static String generateNonConsecutive(int N){
        String res = "";
        for(int i = 0; i < Math.pow(2, N); i++){
            boolean flag1 = false;
            boolean flag2 = false;
            String num = Integer.toBinaryString(i);
            for(int j = 0; j < num.length(); j++){
                if(num.charAt(j) == '1' && flag1 == true){
                    flag2 = true;
                    break;
                }
                else if(num.charAt(j) == '1'){flag1 = true;}
                else{ flag1 = false;}
            }
            if(!flag2){
                for(int j = num.length(); j < N; j++){
                    num = "0"+num;
                }
                res += num + " ";
            }
        }
        return res;
    }
    public static String isValid(String str) {
        int arr[] = new int[26];
        str = str.toLowerCase();
        int num = 0;
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)-97]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > num ){num = arr[i]; }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                if(num - arr[i] != 0 && num - arr[i] != 1){return "NO";}
            }
        }
        return "YES";
    }
    public static int[][] sumsUp(int[] nums) {
        java.util.ArrayList<int[]> pairs = new java.util.ArrayList<>(nums.length-1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (nums[i] + nums[j] == 8) {
                    if (nums[i] > nums[j]) {
                        pairs.add(new int[]{nums[j], nums[i]});
                    }
                    else {
                        pairs.add(new int[]{nums[i], nums[j]});
                    }
                }
            }
        }
        return pairs.toArray(new int[pairs.size()][2]);
    }
}
