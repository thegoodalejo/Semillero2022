package demo.mundo;

import java.util.ArrayList;

/**
 * Clase que modela un socio.
 */
public class Socio
{
    // -----------------------------------------------------------------
    // Enumeraciones
    // -----------------------------------------------------------------

    /**
     * Enumeraciones para los tipos de suscripción.
     */
    public enum Tipo
    {
        /**
         * Representa el socio VIP.
         */
        VIP,
        /**
         * Representa el socio regular.
         */
        REGULAR;

		boolean equalsIgnoreCase(String string) {
			// TODO Auto-generated method stub
			return false;
		}
    }
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Dinero base con el que empiezan todos los socios regulares.
     */
    public final static double FONDOS_INICIALES_REGULARES = 50000;

    /**
     * Dinero base con el que empiezan todos los socios VIP.
     */
    public final static double FONDOS_INICIALES_VIP = 100000;

    /**
     * Dinero máximo que puede tener un socio regular en sus fondos.
     */
    public final static double MONTO_MAXIMO_REGULARES = 1000000;

    /**
     * Dinero máximo que puede tener un socio VIP en sus fondos.
     */
    public final static double MONTO_MAXIMO_VIP = 5000000;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Cédula del socio.
     */
    private String cedula;

    /**
     * Nombre del socio.
     */
    private String nombre;

    /**
     * Dinero que el socio tiene disponible.
     */
    private double fondos;

    /**
     * Tipo de subscripción del socio.
     */
    private Tipo tipoSubscripcion;

    /**
     * Facturas que tiene por pagar el socio.
     */
    private ArrayList<Factura> facturas;

    /**
     * Nombres de las personas autorizadas para este socio.
     */
    private ArrayList<String> autorizados;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------
    /**
     * Crea un socio del club. <br>
     * <b>post: </b> Se creó un objeto socio con los valores pasados por parámetro.<br>
     * El vector de facturas y el vector de autorizados fueron inicializados. <br>
     * Se inicializaron los fondos disponibles en FONDOS_INICIALES.
     * @param pCedula Corresponde a la cédula del socio nuevo. pCedula != null && pCedula != "".
     * @param pNombre Corresponde al nombre del socio nuevo. pNombre != null && pNombre != "".
     * @param pTipo Corresponde al tipo de subscripción del socio. pTipo pertenece {Tipo.VIP, Tipo.REGULAR}.
     */
    public Socio( String pCedula, String pNombre, Tipo pTipo )
    {
        cedula = pCedula;
        nombre = pNombre;
        tipoSubscripcion = pTipo;

        switch( tipoSubscripcion )
        {
            case VIP:
                fondos = FONDOS_INICIALES_VIP;
                break;
            default:
                fondos = FONDOS_INICIALES_REGULARES;
        }

        facturas = new ArrayList<Factura>( );
        autorizados = new ArrayList<String>( );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Retorna el nombre del socio. <br>
     * @return El nombre del socio.
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Retorna la cédula del socio. <br>
     * @return La cédula del socio.
     */
    public String darCedula( )
    {
        return cedula;
    }

    /**
     * Retorna los fondos disponibles del socio. <br>
     * @return Los fondos del socio.
     */
    public double darFondos( )
    {
        return fondos;
    }

    /**
     * Retorna el tipo de subscripción del socio. <br>
     * @return El tipo de subscripción del socio.
     */
    public Tipo darTipo( )
    {
        return tipoSubscripcion;
    }

    /**
     * Retorna la lista de facturas. <br>
     * @return Retorna una lista con todas las facturas pendientes de pago del socio.
     */
    public ArrayList<Factura> darFacturas( )
    {
        return facturas;
    }

    /**
     * Retorna la lista de autorizados por el socio. <br>
     * @return La lista con los nombres de los autorizados por este socio.
     */
    public ArrayList<String> darAutorizados( )
    {
        return autorizados;
    }

    /**
     * Indica si un autorizado pertenece o no a lista del socio. <br>
     * <b>pre: </b> La lista de autorizados ha sido inicializada. <br>
     * @param pNombreAutorizado Nombre del autorizado a buscar. pNombreAutorizado != null && pNombreAutorizado != "".
     * @return True si en la lista existe un autorizado con el nombre dado, false de lo contrario.
     */
    private boolean existeAutorizado( String pNombreAutorizado )
    {
        boolean encontro = false;

        for( int i = 0; i < autorizados.size( ) && !encontro; i++ )
        {
            String a = autorizados.get( i );
            if( a.equals( pNombreAutorizado ) )
            {
                encontro = true;
            }
        }
        return encontro;
    }
    
    /**
     * Indica si un autorizado tiene una factura asociada.<br>
     * <b>pre: </b> La lista de facturas ha sido inicializada. <br>
     * @param pNombreAutorizado Nombre del autorizado a verificar. pNombreAutorizado != null && pNombreAutorizado != "".
     * @return True si el autorizado tiene factura asociada, false de lo contrario.
     */
    private boolean tieneFacturaAsociada( String pNombreAutorizado)
    {
        boolean tiene = false;
        for( int i = 0; i < facturas.size( ) && !tiene; i++ )
        {
            Factura factura = facturas.get( i );
            if( factura.darNombre( ).equals( pNombreAutorizado ) )
            {
                tiene = true;
            }
        }
        
        return tiene;
    }

    /**
     * Aumenta los fondos disponibles del socio.
     * @param pFondos Valor por adicionar a los fondos. pFondos > 0.
     * @throws Exception Dispara excepción si los fondos del socio excederían el límite establecido al realizar la transacción.
     */
    public void aumentarFondos( double pFondos ) throws Exception
    {
        if( tipoSubscripcion == Tipo.VIP && pFondos + fondos > MONTO_MAXIMO_VIP )
        {
            throw new Exception( "Con este monto se excederían los fondos máximos de un socio VIP, ingrese una cantidad menor" );
        }
        else if( tipoSubscripcion == Tipo.REGULAR && pFondos + fondos > MONTO_MAXIMO_REGULARES )
        {
            throw new Exception( "Con este monto se excederían los fondos máximos de un socio regular, ingrese una cantidad menor" );
        }
        else
        {
            fondos = fondos + pFondos;
        }
    }

    /**
     * Registra un nuevo consumo para el socio, realizado por él mismo o por una de sus personas autorizadas. <br>
     * <b>pre: </b> La lista de facturas ha sido inicializada. <br>
     * El nombre pertenece a la lista de autorizados.<br>
     * <b>post: </b> Se agregó una nueva factura .
     * @param pNombre El nombre de la persona que realizó el consumo. pNombre != null && pNombre != "".
     * @param pConcepto Es la descripción del consumo. pConcepto != null && pConcepto != "".
     * @param pValor Es el valor del consumo. pValor >= 0.
     * @throws Exception Dispara excepción si el socio no tiene fondos suficientes para esta factura.
     */
    public void registrarConsumo( String pNombre, String pConcepto, double pValor ) throws Exception
    {

        if( pValor > fondos )
        {
            throw new Exception( "El socio no posee fondos suficientes para este consumo" );
        }
        else
        {
            Factura nuevaFactura = new Factura( pNombre, pConcepto, pValor );
            facturas.add( nuevaFactura );
        }
    }

    /**
     * Agrega una nueva persona autorizada al socio. <br>
     * <b>pre: </b> La lista de autorizados ha sido inicializada. <br>
     * <b>post: </b> Se agregó un nuevo autorizado.
     * @param pNombreAutorizado Es el nombre de la nueva persona autorizada para el socio. pNombreAutorizado != null.
     * @throws Exception <br>
     *         1. Dispara una excepción si el nombre del socio es igual al de nombre.<br>
     *         2. Dispara una excepción si el autorizado ya existía en la lista de autorizados de este socio. <br>
     *         3. Dispara una excepción si el socio no tiene fondos para financiar un nuevo autorizado.
     */
    public void agregarAutorizado( String pNombreAutorizado ) throws Exception
    {
        // Verificar que el nombre del socio no es el mismo del que se quiere autorizar
        if( pNombreAutorizado.equals( darNombre( ) ) )
        {
            throw new Exception( "No puede agregar el socio como autorizado." );
        }

        // Verificar que el socio posee fondos para financiar un nuevo autorizado
        if( fondos == 0 )
        {
            throw new Exception( "El socio no tiene fondos para financiar un nuevo autorizado." );
        }
        // Si el nombre no existía entonces lo agregamos
        if( !existeAutorizado( pNombreAutorizado ) )
        {
            autorizados.add( pNombreAutorizado );
        }
        else
        {
            throw new Exception( "El autorizado ya existe." );
        }
        //Verificar que no sea menor de edad
        
    }

    /**
     * Elimina el autorizado del socio con el nombre dado. <br>
     * <b>pre: </b> La lista de autorizados ha sido inicializada. <br>
     * <b>post: </b> Se eliminó un socio, con nombre igual a alguno de los vinculados.
     * @param pNombreAutorizado Nombre del autorizado. pNombreAutorizado != null.
     * @throws Exception Dispara una excepción si el autorizado tiene una factura asociada.
     */
    public void eliminarAutorizado( String pNombreAutorizado ) throws Exception
    {
        boolean encontro = false;
        int numAutorizados = autorizados.size( );
        if(tieneFacturaAsociada( pNombreAutorizado )){
            throw new Exception( pNombreAutorizado + " tiene una factura sin pagar.");
        }
        for( int i = 0; i < numAutorizados && !encontro; i++ )
        {
            String a = autorizados.get( i );
            if( a.equals( pNombreAutorizado ) )
            {
                encontro = true;
                autorizados.remove( i );
            }
        }
    }

    /**
     * Paga la factura con el índice dado. <br>
     * <b>pre: </b> La lista de facturas ha sido inicializada. <br>
     * <b>post: </b> Se borró la factura de la lista de facturas.
     * @param pIndiceFactura Posición de la factura a eliminar. facturaIndice >= 0.
     * @throws Exception Si el socio no tiene fondos suficientes para pagar la factura.
     */
    public void pagarFactura( int pIndiceFactura ) throws Exception
    {
        Factura factura = facturas.get( pIndiceFactura );
        if( factura.darValor( ) > fondos )
        {
            throw new Exception( "El socio no posee fondos suficientes para pagar esta factura" );
        }
        else
        {
            fondos = fondos - factura.darValor( );
            facturas.remove( pIndiceFactura );
        }
    }

    /**
     * Retorna la cadena que representa al socio.
     * @return Cadena de caracteres con la información del socio con el siguiente formato: <cédula> - <nombre>.
     */
    public String toString( )
    {
        String socio = cedula + " - " + nombre;
        return socio;
    }

}