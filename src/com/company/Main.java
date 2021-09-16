package com.company;
public class Main {
    public static void main(String[] args) {
        String word = "Anna";
        word = word.toLowerCase();
        char c = 'a';
        int counter = 0;
        int counter1 = 0;
        for(String var5 = ""; c <= 'z'; ++c) {
            int index1 = word.indexOf(c);
            int index2 = word.indexOf(c, index1 + 1);
            int index3 = word.indexOf(c, index2 + 1);
            if (index1 != -1 && index2 != -1 && index3 == -1) {
                ++counter;
            } else if (index3 != -1 || index1 != -1 && index2 == -1) {
                ++counter1;
            }
        }
        if (counter1 == 0 && counter > 0) {
            System.out.println("Succes! Det er en doubloon");
        } else {
            System.out.println("Desværre. Prøv et andet ord.");
        }
    }
}
