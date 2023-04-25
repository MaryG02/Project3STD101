package TestFor1_3;
import Part1_3.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SoundMaker> soundMakers = new ArrayList<>();

        soundMakers.add(new Cat());
        soundMakers.add(new Dog());
        soundMakers.add(new Cow());
        soundMakers.add(new Pig());
        soundMakers.add(new Bee());
        soundMakers.add(new Cricket());
        soundMakers.add(new Frog());

        for (SoundMaker soundMaker: soundMakers){
            soundMaker.makeSound();
        }
    }
}

