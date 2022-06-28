package demo.test;

import org.junit.Before;
import org.junit.Test;

import demo.mundo.Factura;

import static org.junit.Assert.*;

/**
 * Clase que modela las pruebas para una factura.
 */
public class FacturaTest
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * La factura a probar.
     */
    private Factura factura;

    // -----------------------------------------------------------------
    // Escenarios
    // -----------------------------------------------------------------

    /**
     * Escenario con una factura.
     */
    @Before
    public void setupEscenario1( )
    {
        factura = new Factura( "Jorge Bejarano", "Piña colada", 10000 );
    }
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * 
     */
    @Test
    public void testFactura( )
    {
        assertEquals( "El nombre no es el esperado.", "Jorge Bejarano", factura.darNombre( ) );
        assertEquals( "El concepto no es el esperado.", "Piña colada", factura.darConcepto( ) );
        assertEquals( "El valor no es el esperado", 10000, factura.darValor( ), .2 );
    }
}
