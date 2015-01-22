package com.punyweblab.funfacts;

import java.util.Random;

/**
 * Created by jefrycruz on 10/24/14.
 */
public class BackgroundColor {

     String[] mColors = {
             "#178931",
             "#861458",
             "#179215"
     };

     public String getColor(){
         Random randomGenerator = new Random();
         int randomNumber = randomGenerator.nextInt(mColors.length);
         String mColor = mColors[randomNumber];

         return mColor;
     }

}
