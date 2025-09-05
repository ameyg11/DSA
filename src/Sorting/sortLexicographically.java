package Sorting;

/*
Give an array of names of the fruits; you are supposed to sort it in lexicographical order using
the selection sort
Input : ["papaya","lime","watermelon","apple","mango","kiwi"]
["apple ,
" "kiwi","lime","mango","papaya","watermelon"]
Output:
*/

import java.util.Arrays;

public class sortLexicographically {

    static String[] sortedLex(String[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i].charAt(0) > arr[j].charAt(0)){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] arr = {"papaya","lime","watermelon","apple","mango","kiwi","able","abale"};

        System.out.print(Arrays.toString(sortedLex(arr)));

    }
}
