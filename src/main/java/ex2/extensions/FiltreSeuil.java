package ex2.extensions;

import ex2.framework.Filtre;

public class FiltreSeuil implements Filtre {

    @Override
    public int[] filter(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = (data[i] >= 128) ? 255 : 0;
        }
        return result;
    }
}