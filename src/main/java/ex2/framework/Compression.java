package ex2.framework;

public abstract class Compression {

    public final int[] compresser(int[] data) {
        if (data == null || data.length == 0) {
            return new int[0];
        }
        int[] prepare = preparer(data.clone());
        return encoder(prepare);
    }

    protected abstract int[] preparer(int[] data);

    protected abstract int[] encoder(int[] data);
}