package demo.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import demo.mundo.Socio;
import demo.mundo.Socio.Tipo;

/**
 * Diálogo para agregar un nuevo socio al club.
 */
public class DialogoAfiliarSocio extends JDialog implements ActionListener
{
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Constante para el comando Regular.
     */
    private static final String TIPO_REGULAR = "Regular";

    /**
     * Constante para el comando VIP.
     */
    private static final String TIPO_VIP = "VIP";

    /**
     * Constante para el comando Afiliar.
     */
    private static final String AFILIAR = "AFILIAR";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Campo de texto de la cédula del nuevo socio.
     */
    private JTextField txtCedula;

    /**
     * Campo de texto del nombre del nuevo socio.
     */
    private JTextField txtNombre;

    /**
     * Combobox para el tipo de la suscripción.
     */
    private JComboBox<String> cmbTipoSuscripcion;

    /**
     * Botón para afiliar el socio.
     */
    private JButton botonAfiliar;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Instancia del la clase principal de la interfaz.
     */
    private InterfazClub principal;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el diálogo con todos sus componentes.
     * @param pPrincipal Ventana principal de la aplicación. pPrincipal != null.
     */
    public DialogoAfiliarSocio( InterfazClub pPrincipal )
    {
        principal = pPrincipal;
        setTitle( "Afiliar nuevo socio" );
        setSize( 350, 250 );
        setLocationRelativeTo( principal );

        JPanel panelGeneral = new JPanel( );
        panelGeneral.setBorder( new CompoundBorder( new TitledBorder( "Datos socio" ), new EmptyBorder( 3, 3, 3, 3 ) ) );
        panelGeneral.setLayout( new BorderLayout( ) );
        add( panelGeneral );

        JPanel panelDatos = new JPanel( );
        panelDatos.setLayout( new GridLayout( 4, 2, 3, 3 ) );
        panelGeneral.add( panelDatos, BorderLayout.CENTER );

        JLabel etiquetaNombre = new JLabel( "Nombre completo:" );
        panelDatos.add( etiquetaNombre );

        txtNombre = new JTextField( );
        panelDatos.add( txtNombre );

        JLabel etiquetaCedula = new JLabel( "Cédula:" );
        panelDatos.add( etiquetaCedula );

        txtCedula = new JTextField( );
        panelDatos.add( txtCedula );

        JLabel etiquetaTipo = new JLabel( "Tipo suscripción: " );
        panelDatos.add( etiquetaTipo );

        cmbTipoSuscripcion = new JComboBox<String>( );
        cmbTipoSuscripcion.addItem( TIPO_REGULAR );
        cmbTipoSuscripcion.addItem( TIPO_VIP );
        panelDatos.add( cmbTipoSuscripcion );

        panelDatos.add( new JLabel( ) );
        panelDatos.add( new JLabel( ) );

        botonAfiliar = new JButton( "Afiliar" );
        botonAfiliar.setActionCommand( AFILIAR );
        botonAfiliar.addActionListener( this );
        panelGeneral.add( botonAfiliar, BorderLayout.SOUTH );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Se encarga de procesar eventos ejecutados por el usuario.
     * @param pEvento Evento realizado por el usuario. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String actionCommand = pEvento.getActionCommand( );

        if( AFILIAR.equals( actionCommand ) )
        {
            String strNombre = txtNombre.getText( );
            String strCedula = txtCedula.getText( );
            String strTipoSuscripcion = ( String )cmbTipoSuscripcion.getSelectedItem( );
            Tipo tipoSuscripcion = null;
            switch( ( strTipoSuscripcion ) )
            {
                case ( TIPO_REGULAR ):
                    tipoSuscripcion = Tipo.REGULAR;
                    break;
                case ( TIPO_VIP ):
                    tipoSuscripcion = Tipo.VIP;
                    break;
            }

            // Valida los campos vacíos
            if( strNombre == null || strNombre.isEmpty( ) || strCedula == null || strCedula.isEmpty( ) )
            {
                JOptionPane.showMessageDialog( this, "Debe ingresar todos los datos.", "Afiliar socio", JOptionPane.ERROR_MESSAGE );
            }
            else
            {
                
            	principal.afiliarSocio( strCedula, strNombre, tipoSuscripcion);
                dispose( );
            }
        }

    }

}
