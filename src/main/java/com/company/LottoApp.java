package com.company;

import java.util.Set;
import java.util.TreeSet;

public class LottoApp {
    // Create while or for loop that iterates until
    // jackpot (seven correct) is won. Calculate the years
    // went by
    public static void main(String [] args) throws Exception {
        System.out.println("Hello me!");
    }
    
    // calculates how many same numbers are found from userlotto 
    // and randomlotto.
    // returns the number.
    public static int checkHowMany(Set<Integer> userLotto, Set<Integer> randomLotto) {
        return -1;
    }
    
    // Add seven unique random numbers between 1 - 40 to lottoNumbers
    public static Set<Integer> getRandomLotto() {
        TreeSet<Integer> lottoNumbers = new TreeSet<>();
        
        
        return lottoNumbers;
    }
    // Add numbers 1,2,3,4,5,6,7 to lottoNumbers
    // This is user given lotto numbers, for now just return numbers,
    // later on you can ask these from the end user
    public static Set<Integer> getUserLotto() {
        TreeSet<Integer> lottoNumbers = new TreeSet<>();
        return lottoNumbers;
    }
}