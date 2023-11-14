import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerTest {

    @Test
    public void testParseInt() {
        // Prueba de conversión de String a Integer
        String numberStr = "42";
        Integer result = Integer.parseInt(numberStr);

        // Verificación de la conversión
        assertNotNull(result);
        assertEquals(42, result); // Comprobación de que el resultado es igual a 42
    }

    @Test
    public void testParseIntWithInvalidInput() {
        // Prueba con entrada no válida
        String invalidStr = "abc";
        Integer result = null;

        // Manejo de excepciones
        try {
            result = Integer.parseInt(invalidStr);
        } catch (NumberFormatException e) {
            // La conversión debe lanzar una NumberFormatException al intentar convertir una cadena no numérica
            assertNull(result);
            assertNotNull(e);
            assertEquals("For input string: \"abc\"", e.getMessage());
        }
    }
}
