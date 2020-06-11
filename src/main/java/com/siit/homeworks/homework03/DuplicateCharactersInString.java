package com.siit.homeworks.homework03;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String s = "aaabbbaccaddefgbeA' 12312 AEGVX";
        char x[]=s.toCharArray();
        int nr[]=new int[94];
        for(int i=0;i<x.length-1;i++)
            for(int j=i+1;j<x.length;j++) {
                if (x[i] == x[j])
                    nr[(int) x[i] - 32] = 1;
            }
        for (int i=0;i<94;i++) {
                if (nr[i] == 1)
                    System.out.println((char)(i+32));
        }
    }

}
