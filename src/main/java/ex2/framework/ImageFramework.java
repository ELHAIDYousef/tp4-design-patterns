package ex2.framework;

public class ImageFramework {

    private Filtre filtre;
    private Compression compression;

    public void setFiltre(Filtre filtre) {
        this.filtre = filtre;
    }

    public void setCompression(Compression compression) {
        this.compression = compression;
    }

    public int[] filter(int[] data) {
        if (filtre == null) {
            throw new IllegalStateException("Aucun filtre choisi");
        }
        return filtre.filter(data);
    }

    public int[] compresser(int[] data) {
        if (compression == null) {
            throw new IllegalStateException("Aucune compression choisie");
        }
        return compression.compresser(data);
    }
}