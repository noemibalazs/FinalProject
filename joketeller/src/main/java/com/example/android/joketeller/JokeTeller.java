package com.example.android.joketeller;

import java.util.Random;

public class JokeTeller {

    public String getJoke(){

        String [] jokes = {"Q: What did the 0 say to the 8? A: Nice belt!",
                "Q: What's the difference between a straight woman and a bisexual woman? A: 4 drinks." ,
                "A naked woman robbed a bank. Nobody could remember her face.",
                "Q: Dad, how do stars die? A: Usually an overdose.",
                "Q: Why do the French eat snails? A: They don’t like fast food.",
                "My husband and I had very happy twenty years. After that we met.",
                "Q: Do you do dangerous sports? A: Well, sometimes I talk back at my wife.",
                "Q: Anton, do you think I am a bad mother? A: My name is Paul!",
                "Q: Which plant rules the garden? A: The dande-lion." };

        Random random = new Random();

        String joke = jokes[random.nextInt(jokes.length)];

        return joke;
    }

}
