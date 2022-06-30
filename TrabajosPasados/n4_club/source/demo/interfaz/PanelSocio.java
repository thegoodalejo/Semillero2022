package demo.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import demo.mundo.Socio;
import demo.mundo.Socio.Tipo;

/**
 * Panel con la información de un socio
 */
public class PanelSocio extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    /**
     * Constante para la acción de registrar consumo.
     */
    private final static String REGISTRAR_CONSUMO = "Registrar consumo";

    /**
     * Constante para la acción de aumentar fondos.
     */
    private final static String AUMENTAR_FONDOS = "Aumentar fondos";

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------
    /**
     * Campo de texto con la cédula del socio.
     */
    private JTextField txtCedula;

    /**
     * Campo de texto con el nombre del socio.
     */
    private JTextField txtNombre;

    /**
     * Campo de texto con los fondos del socio.
     */
    private JTextField txtFondos;

    /**
     * Campo de texto para el tipo de suscripción.
     */
    private JTextField txtTipoSuscripcion;

    /**
     * Botón para registrar consumo.
     */
    private JButton btnRegistrarConsumo;

    /**
     * Botón para aumentar fondos.
     */
    private JButton btnAumentarFondos;
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Ventana principal de la aplicación.
     */
    private InterfazClub principal;
    
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
    /**
     * Construye el panel y todos sus componentes
     * @param pPrincipal Ventana principal de la aplicación.
     */
    public PanelSocio( InterfazClub pPrincipal )
    {
        setBorder( new TitledBorder( "Datos socio" ) );
        setLayout( new BorderLayout( ) );
        principal = pPrincipal;

        JPanel panelDatos = new JPanel( );
        panelDatos.setLayout( new GridLayout( 6, 2, 5, 5 ) );
        add( panelDatos, BorderLayout.CENTER );

        JLabel lblCedula = new JLabel( "Cédula:" );
        panelDatos.add( lblCedula );

        txtCedula = new JTextField( );
        txtCedula.setEditable( false );
        panelDatos.add( txtCedula );

        JLabel lblNombre = new JLabel( "Nombre:" );
        panelDatos.add( lblNombre );

        txtNombre = new JTextField( );
        txtNombre.setEditable( false );
        panelDatos.add( txtNombre );

        JLabel lblFondos = new JLabel( "Fondos disponibles:" );
        panelDatos.add( lblFondos );

        txtFondos = new JTextField( );
        txtFondos.setEditable( false );
        panelDatos.add( txtFondos );

        JLabel lblTipoSuscripcion = new JLabel( "Tipo suscripción:" );
        panelDatos.add( lblTipoSuscripcion );

        txtTipoSuscripcion = new JTextField( );
        txtTipoSuscripcion.setEditable( false );
        panelDatos.add( txtTipoSuscripcion );

        panelDatos.add( new JLabel( ) );

        btnRegistrarConsumo = new JButton( REGISTRAR_CONSUMO );
        btnRegistrarConsumo.setEnabled( false );
        btnRegistrarConsumo.setActionCommand( REGISTRAR_CONSUMO );
        btnRegistrarConsumo.addActionListener( this );
        panelDatos.add( btnRegistrarConsumo );

        panelDatos.add( new JLabel( ) );

        btnAumentarFondos = new JButton( AUMENTAR_FONDOS );
        btnAumentarFondos.setEnabled( false );
        btnAumentarFondos.setActionCommand( AUMENTAR_FONDOS );
        btnAumentarFondos.addActionListener( this );
        panelDatos.add( btnAumentarFondos );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    /**
     * Actualiza el panel con la información del socio recibido.
     * @param pSocio Socio a mostrar. pSocio != null.
     */
    public void actualizar( Socio pSocio )
    {
        txtCedula.setText( pSocio.darCedula( ) );
        txtNombre.setText( pSocio.darNombre( ) );
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( "$###,###.##" );
        txtFondos.setText( df.format( pSocio.darFondos( ) ) );
        Tipo tipoSuscripcion = pSocio.darTipo( );
        switch( tipoSuscripcion )
        {
            case REGULAR:
                txtTipoSuscripcion.setText( "Regular" );
                break;
            case VIP:
                txtTipoSuscripcion.setText( "VIP" );
                break;
        }
        btnAumentarFondos.setEnabled( true );
        btnRegistrarConsumo.setEnabled( true );
    }
    
    /**
     * Se encarga de procesar eventos ejecutados por el usuario.
     * @param pEvento Evento realizado por el usuario. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );

        if( comando.equals( REGISTRAR_CONSUMO ) )
        {
            DialogoRegistrarConsumo dialogo = new DialogoRegistrarConsumo( principal, principal.darAutorizadosSocio( ) );
            dialogo.setVisible( true );
        }
        else if( comando.equals( AUMENTAR_FONDOS ) )
        {
            principal.aumentarFondos( );
        }

    }
}
