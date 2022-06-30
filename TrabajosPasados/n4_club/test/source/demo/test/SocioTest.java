package demo.test;

import java.util.ArrayList;

import org.junit.Test;

import demo.mundo.Factura;
import demo.mundo.Socio;
import demo.mundo.Socio.Tipo;

import static org.junit.Assert.*;

/**
 * Clase que modela las pruebas para el socio.
 */
public class SocioTest
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es un socio de prueba
     */
    private Socio socio;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    /**
     * Método para configuración de escenario
     */
    public void setupEscenario0( )
    {
        socio = new Socio( "1", "nombre1", Tipo.REGULAR );
    }
    /**
     * Método para configuración de escenario
     */
    public void setupEscenario1( )
    {

        socio = new Socio( "2", "nombre2", Tipo.VIP );
    }
    /**
     * Método para probar los autorizados
     */
    @Test
    public void testAgregarAutorizado( )
    {
        setupEscenario0( );
        String nombre = "nombre2";
        boolean esta = false;
        try
        {

            socio.agregarAutorizado( nombre );
            ArrayList<String> lista = socio.darAutorizados( );
            int indice = lista.size( );
            for( int i = 0; i < indice; i++ )
            {
                String autorizado = ( String )lista.get( i );
                if( autorizado.equals( nombre ) )
                {
                    esta = true;
                }
            }
            assertEquals( esta, true );
        }
        catch( Exception e )
        {

            fail( "falla! " + e.getLocalizedMessage( ) );
        }

    }

    /**
     * Método para probar los autorizados
     */
    @Test
    public void testAgregarAutorizadoigualSocio( )
    {
        setupEscenario1( );
        String nombre = "nombre2";
        try
        {
            socio.agregarAutorizado( nombre );
            fail( "El socio es el mismo autorizado" );
        }
        catch( Exception e )
        {
            assertTrue( "control de duplicados correcta ", true );
        }
    }
    /**
     * Método para probar la eliminación de autorizados
     */
    @Test
    public void testEliminarAutorizado( )
    {
        setupEscenario0( );
        String nombre = "nombre2";
        try
        {
            socio.agregarAutorizado( nombre );
            ArrayList<String> lista1 = socio.darAutorizados( );

            assertEquals( lista1.size( ), 1 );
            socio.eliminarAutorizado( nombre );
            ArrayList<String> lista = socio.darAutorizados( );

            assertEquals( lista.size( ), 0 );
        }
        catch( Exception e )
        {
            fail( "falla! " + e.getLocalizedMessage( ) );
        }

    }
    /**
     * Método para probar el registro de Facturas
     */
    @Test
    public void testRegistroFacturas( )
    {
        setupEscenario1( );
        String nombre = "nombre";
        String concepto = "concepto";
        double valor = 1.0;

        try
        {
            socio.registrarConsumo( nombre, concepto, valor );
        }
        catch( Exception e )
        {
            fail( "Debería poder registrar el consumo" );
        }
        valor = 999999;
        try
        {
            socio.registrarConsumo( nombre, concepto, valor );
            fail( "No debería poder registrar el consumo" );
        }
        catch( Exception e )
        {
            //Debe generar excepción
        }
        ArrayList<Factura> listaFacturas = socio.darFacturas( );
        assertEquals( listaFacturas.size( ), 1 );

    }
    /**
     * Método para probar la eliminación de Facturas
     */
    @Test
    public void testEliminacionFacturas( )
    {
        setupEscenario0( );
        String nombre = "nombre";
        String concepto = "concepto";
        double valor = 1.0;
        try
        {
            socio.registrarConsumo( nombre, concepto, valor );
        }
        catch( Exception e )
        {
            fail( "Debería poder registrar el consumo" );
        }
        ArrayList<Factura> listaFacturas1 = socio.darFacturas( );
        assertEquals( listaFacturas1.size( ), 1 );
        try
        {
            socio.pagarFactura( 0 );
        }
        catch( Exception e )
        {
            fail( "Debería poder pagar la factura" );
        }
        ArrayList<Factura> listaFacturas2 = socio.darFacturas( );
        assertEquals( listaFacturas2.size( ), 0 );

    }
    /**
     * Método para probar la adición de Facturas
     */
    @Test
    public void testAgregacionFacturas( )
    {
        setupEscenario1( );
        String nombre = "nombre";
        String concepto = "concepto";
        Factura factura = null;
        double valor = 1.0;
        boolean esta = false;
        try
        {
            socio.registrarConsumo( nombre, concepto, valor );
        }
        catch( Exception e )
        {
            fail( "Debería poder registrar el consumo" );
        }
        ArrayList<Factura> listaFacturas = socio.darFacturas( );
        int indice = listaFacturas.size( );
        for( int i = 0; i < indice; i++ )
        {
            factura = ( Factura )listaFacturas.get( i );
            if( factura.darConcepto( ).equals( concepto ) )
            {
                esta = true;
            }
        }
        assertEquals( esta, true );

    }

}
