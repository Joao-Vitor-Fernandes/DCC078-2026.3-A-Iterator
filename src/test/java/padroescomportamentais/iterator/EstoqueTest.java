package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {

    @Test
    void deveContarMedicamentosVencidosFarmacia() {
        Farmacia farmacia = new Farmacia(
                new Medicamento("Dipirona", true),
                new Medicamento("Amoxicilina", true),
                new Medicamento("Paracetamol", false),
                new Medicamento("Ibuprofeno", true)
        );
        assertEquals(3, Estoque.contarMedicamentosVencidosFarmacia(farmacia));
    }

    @Test
    void deveContarTotalMedicamentosFarmacia() {
        Farmacia farmacia = new Farmacia(
                new Medicamento("Dipirona", true),
                new Medicamento("Amoxicilina", true),
                new Medicamento("Paracetamol", false),
                new Medicamento("Ibuprofeno", true)
        );
        assertEquals(4, Estoque.contarTotalMedicamentosFarmacia(farmacia));
    }
}
