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
    // M�todos
    // -----------------------------------------------------------------
    /**
     * M�todo para configuraci�n de escenario
     */
    public void setupEscenario0( )
    {
        socio = new Socio( "1", "nombre1", Tipo.REGULAR );
    }
    /**
     * M�todo para configuraci�n de escenario
     */
    public void setupEscenario1( )
    {

        socio = new Socio( "2", "nombre2", Tipo.VIP );
    }
    /**
     * M�todo para probar los autorizados
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
     * M�todo para probar los autorizados
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
     * M�todo para probar la eliminaci�n de autorizados
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
     * M�todo para probar el registro de Facturas
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
            fail( "Deber�a poder registrar el consumo" );
        }
        valor = 999999;
        try
        {
            socio.registrarConsumo( nombre, concepto, valor );
            fail( "No deber�a poder registrar el consumo" );
        }
        catch( Exception e )
        {
            //Debe generar excepci�n
        }
        ArrayList<Factura> listaFacturas = socio.darFacturas( );
        assertEquals( listaFacturas.size( ), 1 );

    }
    /**
     * M�todo para probar la eliminaci�n de Facturas
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
            fail( "Deber�a poder registrar el consumo" );
        }
        ArrayList<Factura> listaFacturas1 = socio.darFacturas( );
        assertEquals( listaFacturas1.size( ), 1 );
        try
        {
            socio.pagarFactura( 0 );
        }
        catch( Exception e )
        {
            fail( "Deber�a poder pagar la factura" );
        }
        ArrayList<Factura> listaFacturas2 = socio.darFacturas( );
        assertEquals( listaFacturas2.size( ), 0 );

    }
    /**
     * M�todo para probar la adici�n de Facturas
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
            fail( "Deber�a poder registrar el consumo" );
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
