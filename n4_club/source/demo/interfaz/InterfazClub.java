package demo.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import demo.mundo.Club;
import demo.mundo.Socio.Tipo;

/**
 * Ventana principal de la interfaz del club.
 */
@SuppressWarnings("serial")
public class InterfazClub extends JFrame
{

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Panel con el banner de la aplicación.
     */
    private PanelImagen panelImagen;

    /**
     * Panel autorizados.
     */
    private PanelAutorizados panelAutorizadosSocio;

    /**
     * Panel con la lista de socios.
     */
    private PanelListaSocios panelListaSocios;

    /**
     * Panel con la información del socio actual.
     */
    private PanelSocio panelSocio;

    /**
     * Panel de facturas.
     */
    private PanelFacturas panelFacturas;

    /**
     * Panel con las opciones de extensión.
     */
    private PanelOpciones panelOpciones;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Club principal.
     */
    private Club club;

    // -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    /**
     * Método que inicializa todos los paneles e inicializa el club.
     */
    public InterfazClub( )
    {
        setTitle( "Club" );
        setSize( 960, 550 );
        setDefaultCloseOperation( javax.swing.JFrame.EXIT_ON_CLOSE );

        club = new Club( );

        setLayout( new BorderLayout( ) );

        panelImagen = new PanelImagen( );
        add( panelImagen, BorderLayout.NORTH );

        JPanel panelCentro = new JPanel( );
        panelCentro.setLayout( new BorderLayout( ) );
        add( panelCentro, BorderLayout.CENTER );

        panelListaSocios = new PanelListaSocios( this );
        panelCentro.add( panelListaSocios, BorderLayout.WEST );

        panelSocio = new PanelSocio( this );
        panelCentro.add( panelSocio, BorderLayout.CENTER );

        JPanel panelDerecha = new JPanel( );
        panelDerecha.setLayout( new GridLayout( 2, 1 ) );
        add( panelDerecha, BorderLayout.EAST );

        panelFacturas = new PanelFacturas( this );
        panelDerecha.add( panelFacturas );

        panelAutorizadosSocio = new PanelAutorizados( this );
        panelDerecha.add( panelAutorizadosSocio );

        panelOpciones = new PanelOpciones( this );
        add( panelOpciones, BorderLayout.SOUTH );

        setLocationRelativeTo( null );
        setResizable( false );
    }
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Afilia el socio con la información recibida por parámetro.
     * @param pCedula Cédula del socio. pCedula != null && pCedula != "".
     * @param pNombre Nombre del socio. pNombre != null && pNombre != "".
     * @param pTipo Tipo de subscripción. pNombre = {Tipo.REGULAR, Tipo.VIP}.
     */
    public void afiliarSocio( String pCedula, String pNombre, Tipo pTipo )
    {
    	
        try
        {
         club.afiliarSocio( pCedula, pNombre, pTipo );
          
        	  panelListaSocios.refrescar( club.darSocios( ) );

              actualizar( );
            
          
          
        }
        catch( Exception e )
        {
            e.printStackTrace( );
            JOptionPane.showMessageDialog( this, e.getMessage( ), "Afiliar socio", JOptionPane.ERROR_MESSAGE );
        }
    }

    /**
     * Agrega un autorizado con la información dada por el usuario.
     */
    public void agregarAutorizado( )
    {
        String nombreAutorizado = JOptionPane.showInputDialog( this, "Ingrese el nombre del autorizado:", "Agregar autorizado", JOptionPane.QUESTION_MESSAGE );
        String cedulaSocio = panelListaSocios.darCedulaSocioSeleccionado( );
        if( nombreAutorizado != null && !nombreAutorizado.isEmpty( ) )
        {
            try
            {
                // Se agrega el autorizado y se actualiza la información del panel
                club.agregarAutorizadoSocio( cedulaSocio, nombreAutorizado );
                ArrayList<String> autorizados = new ArrayList<String>( club.darAutorizadosSocio( cedulaSocio ) );
                panelAutorizadosSocio.cambiarAutorizados( autorizados );
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog( this, e.getMessage( ), "Error", JOptionPane.ERROR_MESSAGE );
            }
        }
    }

  
    /**
     * Paga la factura actualmente seleccionada.
     */
    public void pagarFactura( )
    {
        try
        {
            String cedula = panelListaSocios.darCedulaSocioSeleccionado( );
            int facturaIndice = panelFacturas.darPosicionFacturaSeleccionada( );

            club.pagarFacturaSocio( cedula, facturaIndice );
            actualizar( );
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( this, e.getMessage( ), "Error", JOptionPane.ERROR_MESSAGE );
        }
    }

    /**
     * Aumenta los fondos del socio actual.
     */
    public void aumentarFondos( )
    {
        String cedula = panelListaSocios.darCedulaSocioSeleccionado( );
        String respuesta = JOptionPane.showInputDialog( this, "Ingrese el valor a aumentar:", "Aumentar fondos", JOptionPane.QUESTION_MESSAGE );
        double valor = 0;
        try
        {
            valor = Double.parseDouble( respuesta );
            try
            {
                if( valor > 0 )
                {
                    club.aumentarFondosSocio( cedula, valor );
                    actualizar( );
                }
                else
                {
                    JOptionPane.showMessageDialog( this, "El valor a aumentar debe ser mayor a cero", "Aumentar fondos", JOptionPane.ERROR_MESSAGE );

                }
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog( this, e.getMessage( ), "Aumentar fondos", JOptionPane.ERROR_MESSAGE );
            }

        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( this, "El valor a aumentar debe ser un valor numérico", "Aumentar fondos", JOptionPane.ERROR_MESSAGE );
        }
    }

    /**
     * Actualiza la interfaz
     */
    public void actualizar( )
    {
        String cedula = panelListaSocios.darCedulaSocioSeleccionado( );
        panelSocio.actualizar( club.buscarSocio( cedula ) );
        panelFacturas.cambiarFacturas( club.darFacturasSocio( cedula ) );
        panelAutorizadosSocio.cambiarAutorizados( club.darAutorizadosSocio( cedula ) );
    }

    /**
     * Registra un nuevo consumo para un socio determinado.
     * @param pNombre Nombre del cliente a quien se le registrará el consumo.
     * @param pConcepto Concepto del pago. pConcepto != null && pConcepto != "".
     * @param pValor Valor del pago. pValor >0.
     */
    public void registrarConsumo( String pNombre, String pConcepto, double pValor )
    {
        try
        {
            String cedula = panelListaSocios.darCedulaSocioSeleccionado( );
            club.registrarConsumo( cedula, pNombre, pConcepto, pValor );
            actualizar( );
            JOptionPane.showMessageDialog( this, "Se registró el consumo exitósamente", "Registrar consumo", JOptionPane.INFORMATION_MESSAGE );

        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( this, e.getMessage( ), "Registrar consumo", JOptionPane.ERROR_MESSAGE );
        }
    }

    /**
     * Retorna la lista de autorizados del socio actual.
     * @return Lista de autorizados del socio.
     */
    public ArrayList<String> darAutorizadosSocio( )
    {
        return club.darAutorizadosSocio( panelListaSocios.darCedulaSocioSeleccionado( ) );
    }

    /**
     * Este método sirve para verificar que una cédula que tenga solamente dígitos.
     * @param pCedula La cédula que se quiere verificar. pCedula != null.
     * @return Retorna true si la cadena tiene solamente dígitos, false en caso contrario.
     */
    private boolean verificarNumero( String pCedula )
    {
        boolean resultado = false;
        try
        {
            Integer.parseInt( pCedula );
            resultado = true;
        }
        catch( Exception e )
        {
            resultado = false;
        }

        return resultado;
    }

    // -----------------------------------------------------------------
    // Métodos de extensión
    // -----------------------------------------------------------------

    /**
     * Solicita el cálculo de algún resultado.
     */
    public void reqFuncOpcion1( )
    {
        String resultado = club.metodo1( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Solicita el cálculo de algún resultado.
     */
    public void reqFuncOpcion2( )
    {
        String resultado = club.metodo2( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Ejecuta la aplicación.
     * @param pArgs Parámetros de la ejecución. No son necesarios.
     */
    public static void main( String[] pArgs )
    {
        try
        {
            // Unifica la interfaz para Mac y para Windows.
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

            InterfazClub interfaz = new InterfazClub( );
            interfaz.setVisible( true );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
    }
}
