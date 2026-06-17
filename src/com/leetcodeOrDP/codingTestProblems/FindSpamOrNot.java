package com.leetcodeOrDP.codingTestProblems;

import java.util.*;


//extsin): an array of text strings to classify spamWords(k): an array of words considered spam indicators Classify each text as
// "spam" or "not spam" using these rules: A text is "spam" if it contains at least 2 occurrences of words that appear in spamWords.
// A text is "not spam" if it contains fewer than 2 such occurrences. Matching is case-insensitive. Words are separated by single
// spaces (treat each token as a word). Each occurrence counts, including repeated spam words in the same text
// (for example, "paid paid" counts as 2). Only consider words that exactly match a spam word (no partial matches).

public class FindSpamOrNot {

    public static List<String> getSpamORNot(List<String> texts, List<String> spamWords){

        Set<String> set = new HashSet<>();

        for(String str: spamWords){
            set.add(str.toLowerCase());
        }

        List<String> result = new ArrayList<>();

        for(String text: texts){
            int count =0;
            String words[] = text.toLowerCase().split(" ");

            for(String word: words){
                if(set.contains(word)){
                    count++;
                }
            }
            if(count >= 2){
                result.add("spam");
            }else{
                result.add("not_spam");
            }
        }

        return result;

    }


    public static  void main(String args[]){

        List<String> texts = Arrays.asList("free prize worth millions", "ten tips for a carefree lifestyle");

        List<String> spamWords = Arrays.asList("free", "money", "win", "millions");

        System.out.println(getSpamORNot(texts, spamWords));

    }

}
