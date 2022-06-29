package demo.interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import demo.mundo.Socio;

/**
 * Panel para ver la lista de socios y consultar sus consumos.
 */
@SuppressWarnings("serial")
public class PanelListaSocios extends JPanel implements ListSelectionListener, ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    /**
     * Constante para el comando agregar.
     */
    private final static String AFILIAR = "Afiliar socio";
    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Scroll de socios.
     */
    private JScrollPane scrollSocios;

    /**
     * La lista de socios.
     */
    private JList socios;

    /**
     * Botón para agregar un nuevo socio.
     */
    private JButton btnAfiliar;

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
     * Crea el Panel donde se organizarán los objetos para mostrar las personas.
     * @param pPrincipal Instancia de la clase Interfaz. pPrincipal != null.
     */
    public PanelListaSocios( InterfazClub pPrincipal )
    {
        principal = pPrincipal;
        setLayout( new BorderLayout( ) );
        setBorder( new TitledBorder( "Socios" ) );
        setPreferredSize( new Dimension( 300, 0 ) );

        socios = new JList( );

        scrollSocios = new JScrollPane( socios );
        socios.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
        socios.addListSelectionListener( this );
        scrollSocios.setVerticalScrollBarPolicy( javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        scrollSocios.setHorizontalScrollBarPolicy( javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        add( scrollSocios, BorderLayout.CENTER );

        btnAfiliar = new JButton( AFILIAR );
        btnAfiliar.setActionCommand( AFILIAR );
        btnAfiliar.addActionListener( this );
        add( btnAfiliar, BorderLayout.SOUTH );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Retorna el valor de la cédula del socio seleccionado.
     * @return Cédula del socio seleccionado.
     */
    public String darCedulaSocioSeleccionado( )
    {
        String cadena = "";
        if( socios.getSelectedValue( ) != null )
        {
            Socio actual = ( Socio )socios.getSelectedValue( );
            cadena = actual.darCedula( );
        }
        return cadena;
    }

    /**
     * Actualiza la lista con los socios enviados por parámetro.
     * @param pLista Lista de socios.
     */
    public void refrescar( ArrayList<Socio> pLista )
    {
        socios.setListData( pLista.toArray( ) );
        if(!pLista.isEmpty( ))
        {
            socios.setSelectedIndex( 0 );
        }
    }

    /**
     * Cambia el socio actualmente seleccionado.
     * @param pSocio Socio actual. pSocio != null.
     */
    public void cambiarActual( Socio pSocio)
    {
        socios.setSelectedValue( pSocio, true );
    }
    /**
     * Manejo de los eventos del cambio de valor en la lista de socios.
     * @param pEvento Cambio de elemento que generó el evento.
     */
    public void valueChanged( ListSelectionEvent pEvento )
    {
        if( socios.getSelectedValue( ) != null )
        {
            principal.actualizar();
        }
    }

    /**
     * Se encarga de procesar eventos ejecutados por el usuario.
     * @param pEvento Evento realizado por el usuario. pEvento != null.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );
        if( comando.equals( AFILIAR ) )
        {
            DialogoAfiliarSocio dialogo = new DialogoAfiliarSocio( principal );
            dialogo.setVisible( true );
        }
    }
}
