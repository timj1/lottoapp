package com.company;

import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class LottoApp {
    // Create while or for loop that iterates until
    // jackpot (seven correct) is won. Calculate the years
    // went by
    public static void main(String [] args) throws Exception {
        
        int howmany = -1;
        int howmanyTmp = 0;
        Set<Integer> userLotto = getUserLotto();
        int weeks = 0;
        do {

            //System.out.println("user lotto " + userLotto.toString());
            Set<Integer> randomLotto = getRandomLotto();
            //System.out.println("random lotto " + randomLotto.toString());
            weeks++;
            howmany = checkHowMany(userLotto, randomLotto);

            if(howmany > howmanyTmp) {
                System.out.println("Correct numbers " + howmany);
                howmanyTmp = howmany;
            }

        } while(howmany < 7);

        System.out.println("It took " + weeks/52.0 + " years!");
    }
    
    // calculates how many same numbers are found from userlotto 
    // and randomlotto.
    // returns the number.
    public static int checkHowMany(Set<Integer> userLotto, Set<Integer> randomLotto) {
        TreeSet<Integer> userCheck = new TreeSet<>(userLotto);
        TreeSet<Integer> randomCheck = new TreeSet<>(randomLotto);
        int correctNumbers = 0;
        for(int checkU : userCheck) {
            
            if(randomCheck.add(checkU)) {
                //System.out.println("Unique number");
            } else {
                //System.out.println("Correct number");
                correctNumbers++;
            }         
        }

        return correctNumbers;
    }
    
    // Add seven unique random numbers between 1 - 40 to lottoNumbers
    public static Set<Integer> getRandomLotto() {
        TreeSet<Integer> lottoNumbers = new TreeSet<>();

        for(int i=0; i<7; i++) {
            int randomNumber = (int) (Math.random() * 40) + 1;

            if(lottoNumbers.add(randomNumber)) {
                //System.out.println("Success when adding, it was unique");
            } else {
                //System.out.println("Fail when adding, already in TreeSet");
                i--;
            }
        }

        return lottoNumbers;
    }
    // Add numbers 1,2,3,4,5,6,7 to lottoNumbers
    // This is user given lotto numbers, for now just return numbers,
    // later on you can ask these from the end user
    public static Set<Integer> getUserLotto() {
        TreeSet<Integer> lottoNumbers = new TreeSet<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Give 7 lotto numbers 1-40:");
        for(int i=0; i<7; i++) {
            try{
                int number = Integer.parseInt(input.nextLine());
                
                if(number > 0 && number <= 40) {
                    if(lottoNumbers.add(number)) {
                        System.out.println("Number added " + lottoNumbers.size());
                    } else {
                        System.out.println("Only unique numbers");
                        i--;
                    }
                } else {
                    System.out.println("Only numbers between 1-40");
                    i--;
                }
            } catch(Exception e) {
                System.out.println("Only numbers");
                i--;
            }
        }

        System.out.println("Calculate started with numbers: " + lottoNumbers);
        return lottoNumbers;
    }
}