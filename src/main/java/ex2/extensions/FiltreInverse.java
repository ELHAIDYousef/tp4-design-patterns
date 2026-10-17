package ex2.extensions;

import ex2.framework.Filtre;

public class FiltreInverse implements Filtre {

    @Override
    public int[] filter(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = 255 - data[i];
        }
        return result;
    }
}