package com.punyweblab.funfacts;

import java.util.Random;

/**
 * Created by jefrycruz on 10/24/14.
 */
public class BackgroundColor {

     String[] mColors = {
             "#41FFB8",
             "#4191FF",
             "#8C41FF",
             "#FF4149",
             "#FF8C8E",
             "#8CCFFF",
             "#9D8181"
     };

     public String getColor(){
         Random randomGenerator = new Random();
         int randomNumber = randomGenerator.nextInt(mColors.length);
         String mColor = mColors[randomNumber];

         return mColor;
     }

}
