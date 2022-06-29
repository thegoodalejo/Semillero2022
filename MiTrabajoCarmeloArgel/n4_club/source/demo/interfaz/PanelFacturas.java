package demo.interfaz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import demo.mundo.Factura;

/**
 * Panel que administra las Facturas de los usuarios.
 */
@SuppressWarnings("serial")
public class PanelFacturas extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    private static final String PAGAR_FACTURA = "Pagar factura";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Scroll de facturas.
     */
    private JScrollPane scrollDesplazamiento;

    /**
     * Lista de facturas.
     */
    private JList listaFacturas;

    /**
     * Botón pagar factura.
     */
    private JButton btnPagarFactura;

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
     * Crea el panel de facturas
     * @param pPrincipal Instancia del panel contenedor. pPrincipal != null.
     */
    public PanelFacturas( InterfazClub pPrincipal )
    {
        principal = pPrincipal;
        setLayout( new BorderLayout( ) );
        setBorder( new TitledBorder( "Facturas" ) );

        scrollDesplazamiento = new JScrollPane( );
        // Lista donde se almacenaran las facturas
        listaFacturas = new JList( );
        listaFacturas.setSelectionMode( javax.swing.ListSelectionModel.SINGLE_SELECTION );
        // Scroll que desplegara la lista de facturas
        scrollDesplazamiento.setVerticalScrollBarPolicy( javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        scrollDesplazamiento.setViewportView( listaFacturas );
        add( scrollDesplazamiento, BorderLayout.CENTER );

        btnPagarFactura = new JButton( PAGAR_FACTURA);
        btnPagarFactura.setActionCommand( PAGAR_FACTURA );
        btnPagarFactura.addActionListener( this );
        btnPagarFactura.setEnabled( false );
        add( btnPagarFactura, BorderLayout.SOUTH );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------


    /**
     * Se encarga de procesar eventos ejecutados por el usuario.
     * @param pEvento Evento realizado por el usuario. pEvento != null-
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String actionCommand = pEvento.getActionCommand( );

        if( PAGAR_FACTURA.equals( actionCommand ) )
        {
            principal.pagarFactura( );
        }
    }

    /**
     * Indica si alguna factura seleccionada.
     * @return Retorna true si hay una factura seleccionada, false en caso contrario.
     */
    public boolean hayFacturaSeleccionada( )
    {
        return listaFacturas.getSelectedIndex( ) != -1;
    }

    /**
     * Retorna el índice de la factura seleccionada.
     * @return El índice de la factura seleccionada.
     */
    public int darPosicionFacturaSeleccionada( )
    {
        return listaFacturas.getSelectedIndex( );
    }

    /**
     * Actualiza la lista de facturas mostrada.
     * @param pFacturas La nueva lista con las facturas que se deben mostrar.
     */
    public void cambiarFacturas( ArrayList<Factura> pFacturas )
    {
        listaFacturas.removeAll( );
        listaFacturas.setListData( pFacturas.toArray( ) );
        if(!pFacturas.isEmpty( ))
        {
            listaFacturas.setSelectedIndex( 0 );
           btnPagarFactura.setEnabled( true );
        }
        else
        {
            btnPagarFactura.setEnabled( false );
        }
    }

}
