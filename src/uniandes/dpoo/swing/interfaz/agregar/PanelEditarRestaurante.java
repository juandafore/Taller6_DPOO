package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    private JTextField txtNombre;

    private JComboBox<String> cbbCalificacion;

    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        txtNombre = new JTextField( 15 );
        JPanel pNombre = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        pNombre.add( new JLabel( "Nombre" ) );
        pNombre.add( txtNombre );

        cbbCalificacion = new JComboBox<String>( new String[]{ "1", "2", "3", "4", "5" } );
        JPanel pCalificacion = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        pCalificacion.add( new JLabel( "Calificación" ) );
        pCalificacion.add( cbbCalificacion );

        cbbVisitado = new JComboBox<String>( new String[]{ "No", "Sí" } );
        JPanel pVisitado = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        pVisitado.add( new JLabel( "Visitado" ) );
        pVisitado.add( cbbVisitado );

        setLayout( new GridLayout( 3, 1 ) );
        add( pNombre );
        add( pCalificacion );
        add( pVisitado );
    }

    public boolean getVisitado( )
    {
        return "Sí".equals( cbbVisitado.getSelectedItem( ) );
    }

    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    public String getNombre( )
    {
        return txtNombre.getText( );
    }
}
