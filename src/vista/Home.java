/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 *
 * @author Marcelo Esperguel
 */

public class Home extends JFrame{
    
    private JButton registrarVentaButton;
    private JButton verReporteButton;

    public Home() {
        super("Inicio");
        initComponents();
     //Codigo aquí
    
    registrarVentaButton.addActionListener( (evt)-> {
    accionregistrarVentaButton(evt);
     });
    
    verReporteButton.addActionListener( (evt)-> {
    accionverReporteButton(evt);
     });
    
    }
    private void accionregistrarVentaButton(ActionEvent e){
        
     RegistrarVenta v = new RegistrarVenta();
     v.setVisible(true);
    
    
    }
    private void accionverReporteButton(ActionEvent e){
        
     Reporte r = new Reporte();
     r.setVisible(true);
    }

    private void initComponents() {

        registrarVentaButton = new javax.swing.JButton();
        verReporteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registrarVentaButton.setText("Registrar Venta");

        verReporteButton.setText("Ver Reporte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrarVentaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(verReporteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(registrarVentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verReporteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }
}
