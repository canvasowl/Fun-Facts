package com.punyweblab.funfacts;

import java.util.Random;

/**
 * Created by jefrycruz on 10/23/14.
 */
public class FactBook {

    public String getFact(){

        String[] facts = {
                "The human brain takes in 11 million bits of information every second but is aware of only 40.",
                "If you drilled a tunnel straight through the Earth and jumped in, it would take you exactly 42 minutes and 12 seconds to get to the other side.",
                "A medium-sized cumulus cloud weighs about the same as 80 elephants.",
                "Gorillas and potatoes have two more chromosomes than humans do.",
                "Human saliva contains a painkiller called opiorphin that is six times more powerful than morphine.",
                "In an average lifetime, human skin completely replaces itself 900 times.",
                "The air in an average-sized room weighs about 100 pounds.",
                "Lava can flow as fast as a sprinting greyhound.",
                "A red blood cell can make a complete circuit of your body in 20 seconds.",
                "The strongest creatures on Earth are gonorrhea bacteria. They can pull 100,000 times their own body weight."
        };

        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);

        fact = facts[randomNumber];

        return fact;
    }
}
