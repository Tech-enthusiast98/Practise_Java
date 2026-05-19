package com.self.practise;


public class LookAndSaySequence {

    public static String lookAndSaySequence(int n) {
        if(n==1){
            return "1";
        }
        else if( n==2){
            return "11";
        }
        String res = "11";
        for(int i =3;i<=n;i++){
            res +='$';
            int len = res.length();
            int count =1;
            StringBuilder temp = new StringBuilder();
            for(int j =1;j<len;j++){
                if (res.charAt(j) != res.charAt(j-1)){
                    temp.append(count).append(res.charAt(j-1));
                    count =1;
                } else{
                    count++;
                }
            }
            res = temp.toString();
        }

        return res;
    }


    public static void main(String[] args) {
        System.out.println(lookAndSaySequence(6));
    }
 }
