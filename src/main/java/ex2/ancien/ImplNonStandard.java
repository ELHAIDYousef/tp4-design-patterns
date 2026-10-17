package ex2.ancien;

public class ImplNonStandard {

    public int[] appliquerFiltre(String filterName, int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            switch (filterName) {
                case "eclaircir" -> result[i] = Math.min(255, data[i] + 50);
                case "assombrir" -> result[i] = Math.max(0, data[i] - 50);
                default -> throw new IllegalArgumentException("Filtre inconnu : " + filterName);
            }
        }
        return result;
    }
}