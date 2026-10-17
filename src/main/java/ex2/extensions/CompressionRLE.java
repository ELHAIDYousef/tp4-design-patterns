package ex2.extensions;

import ex2.framework.Compression;

import java.util.ArrayList;
import java.util.List;

public class CompressionRLE extends Compression {

    @Override
    protected int[] preparer(int[] data) {
        return data;
    }

    @Override
    protected int[] encoder(int[] data) {
        List<Integer> out = new ArrayList<>();
        int valeur = data[0];
        int compteur = 1;
        for (int i = 1; i < data.length; i++) {
            if (data[i] == valeur) {
                compteur++;
            } else {
                out.add(valeur);
                out.add(compteur);
                valeur = data[i];
                compteur = 1;
            }
        }
        out.add(valeur);
        out.add(compteur);
        return out.stream().mapToInt(Integer::intValue).toArray();
    }
}