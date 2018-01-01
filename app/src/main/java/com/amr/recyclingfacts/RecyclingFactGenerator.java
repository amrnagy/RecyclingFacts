package com.amr.recyclingfacts;

import android.content.Context;

import java.util.Random;

/**
 * Created by Amr on 12/19/2017.
 */

public class RecyclingFactGenerator {

    String facts[];

    public RecyclingFactGenerator(Context context)
    {
        facts = context.getResources().getStringArray(R.array.facts);
    }
    public  String generateFact()
    {
        Random randomGen = new Random();
        int randomNumber = randomGen.nextInt(facts.length);
        String fact = facts[randomNumber];
        return fact;
    }
}
