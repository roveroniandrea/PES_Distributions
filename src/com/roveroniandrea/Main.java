package com.roveroniandrea;

import com.roveroniandrea.pes.Binomial;
import com.roveroniandrea.pes.Distribution;

public class Main {
    public static void main(String[] args) throws Exception {
        Binomial bin = new Binomial(10, (float)0.2);
        System.out.println(bin.getProb(4, Distribution.EventOperator.LessEqual));
    }
}
