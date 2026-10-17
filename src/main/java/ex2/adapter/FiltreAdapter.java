package ex2.adapter;

import ex2.ancien.ImplNonStandard;
import ex2.framework.Filtre;

public class FiltreAdapter implements Filtre {

    private final ImplNonStandard impl = new ImplNonStandard();
    private final String filterName;

    public FiltreAdapter() {
        this("eclaircir");
    }

    public FiltreAdapter(String filterName) {
        this.filterName = filterName;
    }

    @Override
    public int[] filter(int[] data) {
        return impl.appliquerFiltre(filterName, data);
    }
}