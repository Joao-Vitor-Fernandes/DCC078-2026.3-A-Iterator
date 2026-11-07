package padroescomportamentais.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Farmacia implements Iterable<Medicamento> {

    private List<Medicamento> medicamentos = new ArrayList<Medicamento>();

    public Farmacia(Medicamento... medicamentos) {
        this.medicamentos = Arrays.asList(medicamentos);
    }

    @Override
    public Iterator<Medicamento> iterator() {
        return medicamentos.iterator();
    }

}