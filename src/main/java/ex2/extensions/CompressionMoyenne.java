package ex2.extensions;

import ex2.framework.Compression;

import java.util.Arrays;

public class CompressionMoyenne extends Compression {

    @Override
    protected int[] preparer(int[] data) {
        if (data.length % 2 == 0) {
            return data;
        }
        int[] pair = Arrays.copyOf(data, data.length + 1);
        pair[data.length] = data[data.length - 1];
        return pair;
    }

    @Override
    protected int[] encoder(int[] data) {
        int[] result = new int[data.length / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = (data[2 * i] + data[2 * i + 1]) / 2;
        }
        return result;
    }
}