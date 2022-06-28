package demo.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

/**
 * Diálogo para registrar un consumo.
 * 
 */
public class DialogoRegistrarConsumo extends JDialog implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    private static final String REGISTRAR_CONSUMO = "Registrar consumo";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Campo clientes.
     */
    private JComboBox cmbClientes;

    /**
     * Campo concepto.
     */
    private JTextField txtConcepto;

    /**
     * Campo valor.
     */
    private JTextField txtValor;

    /**
     * Botón registrar consumo.
     */
    private JButton btnRegistrarConsumo;

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
     * Crea el diálogo y todos sus componentes.
     * @param pPrincipal Ventana principal de la aplicación. pPrincipal != null.
     * @param pClientes Lista de clientes para registrar el consumo.
     */
    public DialogoRegistrarConsumo( InterfazClub pPrincipal, ArrayList pClientes )
    {
        principal = pPrincipal;
        setTitle( "Registrar consumo" );
        setSize( 350, 250 );
        setLocationRelativeTo( principal );

        JPanel panelGeneral = new JPanel( );
        panelGeneral.setBorder( new CompoundBorder( new TitledBorder( "Datos socio" ), new EmptyBorder( 3, 3, 3, 3 ) ) );
        panelGeneral.setLayout( new BorderLayout( ) );
        add( panelGeneral );

        JPanel panelDatos = new JPanel( );
        panelDatos.setLayout( new GridLayout( 4, 2, 3, 3 ) );
        panelGeneral.add( panelDatos, BorderLayout.CENTER );

        JLabel lblCliente = new JLabel( "Cliente:" );
        panelDatos.add( lblCliente );

        cmbClientes = new JComboBox( );
        for( int i = 0; i < pClientes.size( ); i++ )
        {
            String nombre = ( String )pClientes.get( i );
            cmbClientes.addItem( nombre );
        }
        panelDatos.add( cmbClientes );

        JLabel lblConcepto = new JLabel( "Concepto:" );
        panelDatos.add( lblConcepto );

        txtConcepto = new JTextField( );
        panelDatos.add( txtConcepto );

        JLabel lblValor = new JLabel( "Valor" );
        panelDatos.add( lblValor );

        txtValor = new JTextField( );
        panelDatos.add( txtValor );

        panelDatos.add( new JLabel( ) );
        panelDatos.add( new JLabel( ) );

        btnRegistrarConsumo = new JButton( "Registrar" );
        btnRegistrarConsumo.setActionCommand( REGISTRAR_CONSUMO );
        btnRegistrarConsumo.addActionListener( this );
        panelGeneral.add( btnRegistrarConsumo, BorderLayout.SOUTH );
    }

    /**
     * Se encarga de procesar eventos ejecutados por el usuario.
     * @param pEvento Evento realizado por el usuario. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String actionCommand = pEvento.getActionCommand( );
        if( REGISTRAR_CONSUMO.equals( actionCommand ) )
        {
            String strConcepto = txtConcepto.getText( );
            String strValor = txtValor.getText( );
            String strNombre = ( String )cmbClientes.getSelectedItem( );
            double valor = 0;
            if( strConcepto == null || strConcepto.isEmpty( ) || strValor == null || strValor.isEmpty( ) )
            {
                JOptionPane.showMessageDialog( this, "Debe ingresar todos los datos.", "Registrar consumo", JOptionPane.ERROR_MESSAGE );
            }
            else
            {
                try
                {
                    valor = Double.parseDouble( strValor );
                    if( valor > 0 )
                    {
                        principal.registrarConsumo( strNombre, strConcepto, valor );
                        dispose( );
                    }
                    else
                    {
                        JOptionPane.showMessageDialog( this, "El valor a registrar debe ser mayor a cero.", "Registrar consumo", JOptionPane.ERROR_MESSAGE );

                    }
                }
                catch( Exception e )
                {
                    JOptionPane.showMessageDialog( this, "El valor a registrar debe ser un valor numérico.", "Registrar consumo", JOptionPane.ERROR_MESSAGE );
                }
            }
        }
    }
}
