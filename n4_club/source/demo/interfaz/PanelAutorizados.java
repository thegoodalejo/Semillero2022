package demo.interfaz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;

/**
 * Panel que administra los usuarios autorizados.
 */
@SuppressWarnings("serial")
public class PanelAutorizados extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    /**
     * Constante para el comando agregar autorizado.
     */
    private final static String AGREGAR_AUTORIZADO = "Agregar autorizado";
    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Scroll de autorizados.
     */
    private JScrollPane scrollAutorizados;

    /**
     * Lista de autorizados.
     */
    private JList listaAutorizados;

    /**
     * Botón para agregar el autorizado.
     */
    private JButton btnAgregarAutorizado;

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------
    /**
     * Ventana principal de la aplicación.
     */
    private InterfazClub principal;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel para el manejo de socios Autorizados.
     * @param pPrincipal Ventana principal de la aplicación. pPrincipal != null.
     */
    public PanelAutorizados( InterfazClub pPrincipal )
    {
        principal = pPrincipal;

        setLayout( new BorderLayout( ) );
        setBorder( new TitledBorder( "Autorizados" ) );


        // Lista Autorizados
        listaAutorizados = new JList( new DefaultListModel( ) );
        listaAutorizados.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
        
        // Scroll Desplazamiento
        scrollAutorizados = new JScrollPane( listaAutorizados );
        scrollAutorizados.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
        scrollAutorizados.setHorizontalScrollBarPolicy( JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );

        
        JPanel contenedor = new JPanel( );
        contenedor.setLayout( new BorderLayout( ) );
        contenedor.add( scrollAutorizados, BorderLayout.CENTER );
        add( contenedor, BorderLayout.CENTER );

        btnAgregarAutorizado = new JButton( AGREGAR_AUTORIZADO );
        btnAgregarAutorizado.setActionCommand( AGREGAR_AUTORIZADO );
        btnAgregarAutorizado.addActionListener( this );
        btnAgregarAutorizado.setEnabled( false );
        add( btnAgregarAutorizado, BorderLayout.SOUTH );

    }

    /**
     * Actualiza la lista de autorizados.
     * @param pAutorizados La nueva lista con los autorizados que se deben mostrar.
     */
    public void cambiarAutorizados( ArrayList pAutorizados )
    {
        listaAutorizados.removeAll( );
        listaAutorizados.setListData( pAutorizados.toArray( ) );
        btnAgregarAutorizado.setEnabled( true );
       
    }

    /**
     * Se encarga de procesar eventos ejecutados por el usuario.
     * @param pEvento Evento realizado por el usuario. pEvento != null-
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );
        if( comando.equals( AGREGAR_AUTORIZADO ) )
        {
            principal.agregarAutorizado( );
        }

    }
}
