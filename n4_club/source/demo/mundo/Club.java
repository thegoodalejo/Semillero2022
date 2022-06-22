package demo.mundo;

import java.util.ArrayList;

import demo.mundo.Socio.Tipo;

/**
 * Clase que modela un club.
 */
public class Club
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Cantidad m�xima de socios VIP que acepta el club.
     */
    public final static int MAXIMO_VIP = 3;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Lista de socios del club.
     */
    private ArrayList<Socio> socios;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    /**
     * Constructor de la clase. <br>
     * <b>post: </b> Se inicializ� la lista de socios.
     */
    public Club( )
    {
        socios = new ArrayList<Socio>( );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna los socios afiliados al club.
     * @return Lista de socios.
     */
    public ArrayList<Socio> darSocios( )
    {
        return socios;
    }

    /**
     * Afilia un nuevo socio al club. <br>
     * <b>pre: </b> La lista de socios est� inicializada. <br>
     * <b>post: </b> Se ha afiliado un nuevo socio en el club con los datos dados.
     * @param pCedula C�dula del socio a afiliar. pCedula != null && pCedula != "".
     * @param pNombre Nombre del socio a afiliar. pNombre != null && pNombre != "".
     * @param pTipo Es el tipo de subscripci�n del socio. pTipo != null.
     * @throws Exception <br>
     *         1. Si un socio con la misma c�dula ya estaba afiliado al club. <br>
     *         2. Si el socio a registrar desea una subscripci�n VIP pero el club ha alcanzado el l�mite.
     */
    public void afiliarSocio( String pCedula, String pNombre, Tipo pTipo ) throws Exception
    {
    	
    	
        // Revisar que no haya ya un socio con la misma c�dula
        
        // Revisar que no se haya alcanzado el l�mite de subscripciones VIP
        
        // Se crea el objeto del nuevo socio (todav�a no se ha agregado al club)
        Socio socio = new Socio(pCedula, pNombre, pTipo); 
        socios.add(socio);

            
        // Se agrega el nuevo socio al club
        
    }

    /**
     * Retorna el socio con la c�dula dada. <br>
     * <b> pre:<b> La lista de socios est� inicializada.<br>
     * @param pCedulaSocio C�dula del socio buscado. pCedulaSocio != null && pCedulaSocio != "".
     * @return El socio buscado, null si el socio buscado no existe.
     */
    public Socio buscarSocio( String pCedulaSocio )
    {
        Socio elSocio = null;
        boolean encontre = false;
        int numSocios = socios.size( );
        for( int i = 0; i < numSocios && !encontre; i++ )
        {
            Socio s = socios.get( i );
            if( s.darCedula( ).equals( pCedulaSocio ) )
            {
                elSocio = s;
                encontre = true;
            }
        }

        return elSocio;
    }

    /**
     * Retorna la cantidad de socios VIP que tiene el club.<br>
     * <b> pre: </b> La lista de socios est� inicializada.
     * @return N�mero de socios VIP.
     */
    public int contarSociosVIP( )
    {
        int conteo = 0;
		//Cuento socios VIP
        return conteo;
    }

    /**
     * Retorna la lista de autorizados del socio con la c�dula dada.<br>
     * <b> pre: </b> La lista de socios est� inicializada.<br>
     * El socio buscado existe.
     * @param pCedulaSocio La c�dula del socio. pCedulaSocio != null && pCedulaSocio != "".
     * @return La lista de autorizados del socio.
     */
    public ArrayList<String> darAutorizadosSocio( String pCedulaSocio )
    {
        Socio s = buscarSocio( pCedulaSocio );
        ArrayList<String> autorizados = new ArrayList<String>( );

        autorizados.add( s.darNombre( ) );
        autorizados.addAll( s.darAutorizados( ) );

        return autorizados;
    }

    /**
     * Agrega una nueva persona autorizada por el socio con la c�dula dada. <br>
     * <b>pre:<b/> El socio con la c�dula dada existe. <b>post: </b> Se agreg� el nuevo autorizado..
     * @param pCedulaSocio La c�dula del socio al cual se va a agregar el autorizado. pCedulaSocio != null && pCedulaSocio != "".
     * @param pNombreAutorizado El nombre de la persona a autorizar. pNombreAutorizado != null && poNmbre != "".
     * @throws Exception <br>
     *         1. Dispara una excepci�n si el nombre del socio es igual al de autorizado. <br>
     *         2. Dispara una excepci�n si el autorizado ya exist�a en la lista de autorizados de este socio. <br>
     *         3. Dispara una excepci�n si el socio no tiene fondos para financiar un nuevo autorizado.
     */
    public void agregarAutorizadoSocio( String pCedulaSocio, String pNombreAutorizado ) throws Exception
    {
        Socio s = buscarSocio( pCedulaSocio );
        s.agregarAutorizado( pNombreAutorizado );

    }

    /**
     * Elimina la persona autorizada por el socio con la c�dula dada.
     * @param pCedulaSocio La c�dula del socio que autoriz� a la persona a eliminar.pCedulaSocio!= null && pCedulaSocio! ""
     * @param pNombreAutorizado El nombre del autorizado a eliminar. pNombreAutorizado!= null && pNombreAutorizado!=""
     * @throws Exception Dispara una excepci�n si el el autorizado a eliminar tiene una factura sin pagar asociada.
     */
    public void eliminarAutorizadoSocio( String pCedulaSocio, String pNombreAutorizado ) throws Exception
    {
        Socio s = buscarSocio( pCedulaSocio );
        s.eliminarAutorizado( pNombreAutorizado );
    }

    /**
     * Registra un consumo a un socio o a su autorizado. <br>
     * <b>post: </b> Se agreg� una nueva factura al vector del socio.
     * @param pCedulaSocio La c�dula del socio. pCedulaSocio != null && pCedulaSocio != "".
     * @param pNombreCliente El nombre la persona que realiz� en consumo. pNombreCliente != null && pNombreCliente != "".
     * @param pConcepto El concepto del consumo. pConcepto != null && pConcepto != "".
     * @param pValor El valor del consumo. pValor >= 0.
     * @throws Exception Dispara una excepci�n en caso de que el socio no tenga fondos suficientes para asumir este consumo.
     */
    public void registrarConsumo( String pCedulaSocio, String pNombreCliente, String pConcepto, double pValor ) throws Exception
    {
        Socio s = buscarSocio( pCedulaSocio );
        s.registrarConsumo( pNombreCliente, pConcepto, pValor );
    }

    /**
     * Retorna la lista de facturas de un socio. <br>
     * <b>pre:<b> Existe el socio con la c�dula dada.
     * @param pCedulaSocio La c�dula del socio. pCedulaSocio != null && pCedulaSocio != "".
     * @return La lista de facturas del socio.
     */
    public ArrayList<Factura> darFacturasSocio( String pCedulaSocio )
    {
        return buscarSocio( pCedulaSocio ).darFacturas( );
    }
    /**
     * Realiza el pago de la factura de un socio. <br>
     * <b>post: </b> Se borr� la factura del vector del socio. <br>
     * @param pCedulaSocio La c�dula del socio. pCedulaSocio != null && pCedulaSocio != "".
     * @param pFacturaIndice El �ndice de la factura a pagar. pFacturaIndice >= 0.
     * @throws Exception Dispara una excepci�n en caso de que el usuario no tenga fondos suficientes.
     */
    public void pagarFacturaSocio( String pCedulaSocio, int pFacturaIndice ) throws Exception
    {
        Socio s = buscarSocio( pCedulaSocio );
        s.pagarFactura( pFacturaIndice );

    }

    /**
     * Aumenta los fondos de un socio en la cantidad dada. <br>
     * <b>post: </b> Los fondos del socio aumentaron en el valor especificado.
     * @param pCedulaSocio La c�dula del socio. pCedulaSocio != null && pCedulaSocio != "".
     * @param pValor Valor por el cual se desean aumentar los fondos. pValor >= 0.
     * @throws Exception Dispara una excepci�n en caso de que el valor especificado genere una cantidad de fondos no permitida para el socio.
     */
    public void aumentarFondosSocio( String pCedulaSocio, double pValor ) throws Exception
    {
        Socio s = buscarSocio( pCedulaSocio );
        s.aumentarFondos( pValor );
    }

    // -----------------------------------------------------------------
    // M�todos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * Extensi�n 1.
     * @return Resultado extensi�n 1.
     */
    public String metodo1( )
    {
        return "respuesta1";
    }

    /**
     * Extensi�n 2.
     * @return Resultado extensi�n 2.
     */
    public String metodo2( )
    {
        return "respuesta2";
    }
}