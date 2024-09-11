import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JLabel labNombre;
    private JTextField txtNombre;
    private JLabel labAPat;
    private JTextField txtAPat;
    private JTextField txtAMat;
    private JLabel labMaterno;
    private JLabel labCorreo;
    private JTextField txtCorreo;
    private JLabel labTelefono;
    private JTextField txtTelefono;
    private JCheckBox chkdiscapacidad;
    private JButton btnAceptar;
    private JButton btnCancelar;
    private JTextField txtCURP;


    public Principal() {
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//j
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrar();
            }
        });
    }
    private void Borrar()
    {
        txtNombre.setText("");
        txtAPat.setText("");
        txtAMat.setText("");
        txtCURP.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        chkdiscapacidad.setSelected(false);
    }
    //Yocelin
}
