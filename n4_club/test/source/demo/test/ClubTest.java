package demo.test;

import java.util.ArrayList;

import org.junit.Test;

import demo.mundo.Club;
import demo.mundo.Factura;
import demo.mundo.Socio;
import demo.mundo.Socio.Tipo;

import static org.junit.Assert.*;

/**
 * Clase que modela las pruebas para el Club
 */
public class ClubTest
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es un socio de prueba
     */
    private Socio socio;
    /**
     * 
     * /** Es un club de prueba
     */
    private Club club;
    /**
     * Método para configuración de escenario
     */
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    public void setupEscenario0( )
    {

        club = new Club( );
        socio = new Socio( "1", "nombre1", Tipo.REGULAR );
    }
    /**
     * Método para configuración de escenario
     */
    public void setupEscenario1( )
    {

        club = new Club( );
        socio = new Socio( "2", "nombre2", Tipo.VIP );
    }

    /**
     * Método para probar afiliación socio no existente
     */
    @Test
    public void testAfiliarSocioNoExiste( )
    {
        setupEscenario0( );
        try
        {
            club.afiliarSocio( "1", "nombre1", Tipo.REGULAR );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
        Socio socio2 = club.buscarSocio( "1" );
        assertEquals( socio.darNombre( ), socio2.darNombre( ) );

    }
    /**
     * Método para probar afiliación socio no existente
     */
    @Test
    public void testAfiliarSocioExiste( )
    {
        setupEscenario0( );

        try
        {
            club.afiliarSocio( "3", "nombre3", Tipo.REGULAR );
            club.afiliarSocio( "3", "nombre3", Tipo.REGULAR );
            fail( "El socio esta repetido" );
        }
        catch( Exception e )
        {
            //Debe generar excepción
        }

    }
    /**
     * Método para probar afiliación socio no existente
     */
    @Test
    public void testBuscarSocio( )
    {
        setupEscenario1( );
        try
        {
            club.afiliarSocio( "2", "nombre2", Tipo.VIP );
        }
        catch( Exception e )
        {

            e.printStackTrace( );
        }
        Socio socio2 = club.buscarSocio( "2" );
        assertEquals( socio.darNombre( ), socio2.darNombre( ) );
    }

    /**
     * Método para probar que devuelve la lista de autorizados de un socio correctamente.
     */
    @Test
    public void testDarAutorizadosSocio1( )
    {
        setupEscenario1( );

        try
        {
            club.afiliarSocio( socio.darCedula( ), socio.darNombre( ), socio.darTipo( ) );

            club.agregarAutorizadoSocio( socio.darCedula( ), "nombreAutorizado1" );
            club.agregarAutorizadoSocio( socio.darCedula( ), "nombreAutorizado2" );
            club.agregarAutorizadoSocio( socio.darCedula( ), "nombreAutorizado3" );

            ArrayList<String> autorizados = club.darAutorizadosSocio( socio.darCedula( ) );

            if( autorizados.size( ) < 4 )
            {
                fail( "No agrego a todos los autorizados" );
            }

            for( int i = 1; i < autorizados.size( ); i++ )
            {
                String nombreAutorizado = ( String )autorizados.get( i );
                assertEquals( "El autorizado no es el correcto", nombreAutorizado, "nombreAutorizado" + i );
            }
        }
        catch( Exception e )
        {
            fail( e.getMessage( ) );
        }
    }

    /**
     * Método para probar que lanza excepciones cuando intenta devolver la lista de autorizados de un socio correctamente.
     */
    @Test
    public void testDarAutorizadosSocio2( )
    {
        setupEscenario1( );

        // Cuando intenta agregar un autorizado a un socio inexistente en el club
        try
        {
            club.agregarAutorizadoSocio( socio.darCedula( ), "nombreAutorizado1" );
            fail( "Debería lanzar la excepción de no encontrar el socio" );
        }
        catch( Exception e )
        {
            // Debería pasar por acá
        }
    }

    /**
     * Método para probar que agrega un autorizado a un socio
     */
    @Test
    public void testAgregarAutorizado1( )
    {
        setupEscenario1( );

        try
        {
            club.afiliarSocio( socio.darCedula( ), socio.darNombre( ), socio.darTipo( ) );

            int numAutorizadosAntes = club.darAutorizadosSocio( socio.darCedula( ) ).size( );
            club.agregarAutorizadoSocio( socio.darCedula( ), "nombreAutorizado" );
            int numAutorizadosDespues = club.darAutorizadosSocio( socio.darCedula( ) ).size( );

            assertEquals( "La cantidad de autorizados debe ser incrementado", numAutorizadosAntes + 1, numAutorizadosDespues );
        }
        catch( Exception e )
        {
            fail( e.getMessage( ) );
        }
    }

    /**
     * Método para probar que lanza las excepciones cuando intenta agrega un autorizado a un socio
     */
    @Test
    public void testAgregarAutorizado2( )
    {
        setupEscenario1( );

        // Cuando el socio no existe
        try
        {
            club.agregarAutorizadoSocio( socio.darCedula( ), "nombreAutorizado" );
            fail( "El socio no existe en el club" );
        }
        catch( Exception e )
        {
            // Debe lanzar la excepción
        }

        try
        {
            club.afiliarSocio( socio.darCedula( ), socio.darNombre( ), socio.darTipo( ) );
            club.agregarAutorizadoSocio( socio.darCedula( ), "nombreAutorizado" );
        }
        catch( Exception e1 )
        {
            fail( "Debería poder agregar el socio: " + e1.getMessage( ) );
        }

        // Cuando intenta agregar a un autorizado con el mismo nombre del socio
        try
        {
            club.agregarAutorizadoSocio( socio.darCedula( ), socio.darNombre( ) );
            fail( "Debería lanzar excepción de no poder agregar un autorizado con el mismo nombre de socio" );
        }
        catch( Exception e )
        {
            // Debe lanzar la excepción
        }

        // Cuando intenta agregar a un autorizado que ya existía
        try
        {
            club.agregarAutorizadoSocio( socio.darCedula( ), "nombreAutorizado" );
            fail( "Debería lanzar excepción de no poder agregar un autorizado ya existente en la lista" );
        }
        catch( Exception e )
        {
            // Debe lanzar la excepción
        }
    }

    /**
     * Prueba que registra correctamente el consumo para un socio.
     */
    @Test
    public void testRegistrarConsumo1( )
    {
        setupEscenario1( );

        try
        {
            club.afiliarSocio( socio.darCedula( ), socio.darNombre( ), socio.darTipo( ) );
            club.agregarAutorizadoSocio( socio.darCedula( ), "A" );
        }
        catch( Exception e1 )
        {
            fail( "Debería poder agregar el socio: " + e1.getMessage( ) );
        }

        try
        {
            int numFacturasAntes = club.darFacturasSocio( socio.darCedula( ) ).size( );
            club.registrarConsumo( socio.darCedula( ), "A", "concepto", 1000 );
            int numFacturasDespues = club.darFacturasSocio( socio.darCedula( ) ).size( );

            assertEquals( "El número de facturas debió incrementar en una", numFacturasAntes + 1, numFacturasDespues );
        }
        catch( Exception e )
        {
            fail( e.getMessage( ) );
        }
    }

    /**
     * Prueba que al registrar un consumo lanza las excepciones correctas
     */
    @Test
    public void testRegistrarConsumo2( )
    {
        setupEscenario1( );

        // Cuando el socio no existe
        try
        {
            club.registrarConsumo( socio.darCedula( ), "nombreAutorizado", "concepto", 1000 );
            fail( "El socio no existe en el club" );
        }
        catch( Exception e )
        {
            // Debe lanzar la excepción
        }
    }

    /**
     * Método que prueba que este retornando correctamente la lista de facturas
     */
    @Test
    public void testDarFacturas1( )
    {
        setupEscenario1( );

        try
        {
            club.afiliarSocio( socio.darCedula( ), socio.darNombre( ), socio.darTipo( ) );
            club.agregarAutorizadoSocio( socio.darCedula( ), "A" );

            club.registrarConsumo( socio.darCedula( ), "A", "concepto1", 1000 );
            club.registrarConsumo( socio.darCedula( ), "A", "concepto2", 1000 );
            club.registrarConsumo( socio.darCedula( ), "A", "concepto3", 1000 );
            club.registrarConsumo( socio.darCedula( ), "A", "concepto4", 1000 );

            ArrayList<Factura> facturas = club.darFacturasSocio( socio.darCedula( ) );
            for( int i = 0; i < facturas.size( ); i++ )
            {
                Factura factura = ( Factura )facturas.get( i );
                assertEquals( "El nombre del cliente de la factura no es correcto", "A", factura.darNombre( ) );
                assertEquals( "El concepto de la factura no es correcto", "concepto" + ( i + 1 ), factura.darConcepto( ) );
                assertEquals( "El valor de la factura no es correcto", 1000, factura.darValor( ), 0.01 );
            }
        }
        catch( Exception e )
        {
            fail( e.getMessage( ) );
        }
    }

    /**
     * Prueba que al retornar una lista de facturas lanza las excepciones correctas
     */
    @Test
    public void testDarFacturas2( )
    {
        setupEscenario1( );

        // Cuando el socio no existe
        try
        {
            club.darFacturasSocio( socio.darCedula( ) );
            fail( "El socio no existe en el club" );
        }
        catch( Exception e )
        {
            // Debe lanzar la excepción
        }
    }

    /**
     * Método que prueba que para la factura de un socio del club
     */
    @Test
    public void testPagarFacturaSocio1( )
    {
        setupEscenario1( );

        try
        {
            club.afiliarSocio( socio.darCedula( ), socio.darNombre( ), socio.darTipo( ) );
            club.agregarAutorizadoSocio( socio.darCedula( ), "A" );

            club.registrarConsumo( socio.darCedula( ), "A", "concepto1", 1000 );
            club.registrarConsumo( socio.darCedula( ), "A", "concepto2", 1000 );
            club.registrarConsumo( socio.darCedula( ), "A", "concepto3", 1000 );
            club.registrarConsumo( socio.darCedula( ), "A", "concepto4", 1000 );

            int facturasSinPagarAntes = club.darFacturasSocio( socio.darCedula( ) ).size( );
            club.pagarFacturaSocio( socio.darCedula( ), 0 );
            int facturasSinPagarDespues = club.darFacturasSocio( socio.darCedula( ) ).size( );

            assertEquals( "El número de facturas debió disminuir", facturasSinPagarAntes - 1, facturasSinPagarDespues );
        }
        catch( Exception e )
        {
            fail( e.getMessage( ) );
        }
    }

    /**
     * Método que prueba que lanza excepción al intentar pagar la factura de un socio del club
     */
    @Test
    public void testPagarFacturaSocio2( )
    {
        setupEscenario1( );

        // Cuando el socio no existe
        try
        {
            club.pagarFacturaSocio( socio.darCedula( ), 0 );
            fail( "El socio no existe en el club" );
        }
        catch( Exception e )
        {
            // Debe lanzar la excepción
        }
    }
}