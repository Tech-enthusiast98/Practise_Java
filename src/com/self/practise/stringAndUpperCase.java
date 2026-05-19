package com.self.practise;

public class stringAndUpperCase {

    public static String stringReformat(String s, int k) {
        // Write your code here
        StringBuilder res= new StringBuilder();
        String s2= s.replace("-","").toUpperCase();
        int len = s2.length()%k;
        if(len>0) {
            res.append(s2.substring(0, len));
            if (s2.length() > len) {
                res.append("-");
            }
        }
        for (int i = len; i < s2.length(); i += k) {
            res.append(s2, i, i + k);
            if (i + k < s2.length()) {
                res.append("-");
            }
        }
        return res.toString();

    }

    public static void main(String[] args) {
       String val = stringReformat("A1-ijklmno-pqr",3);
        System.out.println(val);
    }
}
