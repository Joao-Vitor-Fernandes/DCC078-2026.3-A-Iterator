package padroescomportamentais.iterator;

import java.util.Iterator;

public class Estoque {

    public static Integer contarMedicamentosVencidosFarmacia(Farmacia farmacia) {
        int quantidade = 0;
        for (Medicamento medicamento : farmacia) {
            if (medicamento.isVencido()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalMedicamentosFarmacia(Farmacia farmacia) {
        int quantidade = 0;
        for (Iterator<Medicamento> m = farmacia.iterator(); m.hasNext(); ) {
            quantidade++;
            m.next();
        }
        return quantidade;
    }
}