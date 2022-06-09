package com.survivalcoding;

public class Word {
    public static void main(String[] args) {
        Word word = new Word("Hello World");
        System.out.println(word.isVowel(0)); // false
        System.out.println(word.isVowel(1)); // true
    }

    private String letters;

    public Word(String letters) {
        this.letters = letters.toLowerCase();
    }

    // i 번째 글자가 모음인지 // a, i, u, e, o
    public boolean isVowel(int i) {
        return "aiueo".contains(letters.substring(i, i + 1));
    }

}
