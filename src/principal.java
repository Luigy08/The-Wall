
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luigy
 */
public class principal extends javax.swing.JFrame {

    DefaultListModel model2 = new DefaultListModel();

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        cargar();
        hiloAbordar=new Habordar(this.pb_AA,emigrantes,deportados,this.lb_emigrantes,this.lb_nomA,angar,enVuelo,this.pb_AV,this.lb_destino);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_nuevoRegistro = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tf_nr_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cb_nr_nacionalidad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_nr_raza = new javax.swing.JComboBox<>();
        cb_nr_deportado = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        bt_NuevoRegistro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cb_nr_origen = new javax.swing.JComboBox<>();
        dc_nr_Fnacimiento = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jM_I_NuevoRegistro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("Nombre");

        jLabel2.setText("Nacionalidad");

        cb_nr_nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afgano", "Aleman", "Arabe", "Argentino", "Autraliano", "Belga", "Boliviano", "Brasileño", "Camboyano", "Canadiense", "Chileno", "Chino", "Colombiano", "Coreano", "Costarricense", "Cubano", "Danes", "Ecuatoriano", "Egipcop", "Salvadoreño", "Escoces", "Español", "Estonio", "Etiope", "Filipino", "Finlandes", "Frances", "Gales", "Griego", "Guatelmalteco", "Haitiano", "Holandes", "Hondureño", "Indones", "Ingles", "Iraqui", "irani", "Irlandes", "Israeli", "Italiano", "Japones", "Jordano", "Laosiano", "Letonia", "Lituania", "Malayo", "Marroqui", "Mexicano", "Nicaraguense", "Noruego", "Panameño", "Paraguayo", "Peruano", "Polaco", "Portugues", "Puertorriqueño", "Dominicano", "Rumano", "Ruso", "Suizo", "Tailandes", "Taiwanes", "Turco", "Ucraniano", "Uruguayo", "Venezolano", "Vietnamita" }));

        jLabel3.setText("Feha de nacimiento");

        jLabel4.setText("Raza");

        cb_nr_raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Americano", "Europeo", "Africano", "Asiatico", "Caucasico" }));

        cb_nr_deportado.setText("Deportado");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nuevo Registro");

        bt_NuevoRegistro.setText("AGREGAR");
        bt_NuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_NuevoRegistroActionPerformed(evt);
            }
        });

        jLabel6.setText("Pais de origen");

        cb_nr_origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistan", "Aleman", "Arabia Saudita", "Argentina", "Australia", "Belgica", "Bolivia", "Brasil", "Camboya", "Canada", "Chile", "Chile", "China", "Colombia", "Corea", "Costa Rica", "Cuba", "Dinamica", "Ecuador", "Egipto", "El Salvador", "Escocia", "España", "Estonia", "Etiopia", "Filipinas", "Finlandia", "Francia", "Gales", "Grecia", "Guatemala", "Haiti", "Holanda", "Honduras", "Indonesia", "Inglaterra", "Irak", "Iran", "Irlanda", "Israel", "Italia", "Japon", "Jordania", "Laos", "Letonia", "Lituania", "Malasia", "Marruecos", "Mexico", "Nicaragua", "Noruega", "Nueva Zelanda", "Panama", "PAraguay", "Peru", "Polonia", "Portugal", "Puerto Rico", "Republica Dominicana", "Rumania", "Rusia", "Suecia", "Suiza", "Tailandia", "Taiwan", "Turquia", "Ucrania", "Uruguay", "Venezuela", "Vietnam" }));

        javax.swing.GroupLayout jd_nuevoRegistroLayout = new javax.swing.GroupLayout(jd_nuevoRegistro.getContentPane());
        jd_nuevoRegistro.getContentPane().setLayout(jd_nuevoRegistroLayout);
        jd_nuevoRegistroLayout.setHorizontalGroup(
            jd_nuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_nuevoRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(123, 123, 123))
            .addGroup(jd_nuevoRegistroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jd_nuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_nuevoRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_nr_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_nuevoRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dc_nr_Fnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_nuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jd_nuevoRegistroLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_nr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_nuevoRegistroLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cb_nr_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(bt_NuevoRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cb_nr_deportado)
                    .addGroup(jd_nuevoRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_nr_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jd_nuevoRegistroLayout.setVerticalGroup(
            jd_nuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_nuevoRegistroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_nuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_nuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_nr_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_nuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_nr_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_nuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dc_nr_Fnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jd_nuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_nr_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_nr_deportado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_NuevoRegistro)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Inicio");

        jM_I_NuevoRegistro.setText("Nuevo registro");
        jM_I_NuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_I_NuevoRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(jM_I_NuevoRegistro);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_NuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_NuevoRegistroActionPerformed
        // TODO add your handling code here:

        persona p = new persona(this.tf_nr_nombre.getText(), this.cb_nr_nacionalidad.getSelectedItem().toString(),
                this.dc_nr_Fnacimiento.getDate(), this.cb_nr_raza.getSelectedItem().toString(),
                this.cb_nr_origen.getSelectedItem().toString(), this.cb_nr_deportado.isSelected());
        File archivo = new File("./personas.lu");
        try {
            if (!archivo.exists()) {
                FileOutputStream salida = new FileOutputStream(archivo);
                ObjectOutputStream objeto = new ObjectOutputStream(salida);
                objeto.writeObject(p);
                objeto.flush();
                objeto.close();
                salida.close();
            } else {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                persona temp;
                Cola lista=new Cola();
                try {
                    
                    while ((temp = (persona)objeto.readObject()) != null) {
                        lista.queue(temp);
                        
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
                
                lista.queue(p);
                FileOutputStream salida = new FileOutputStream(archivo);
                ObjectOutputStream objeto2 = new ObjectOutputStream(salida);
                while(!lista.isEmpty()){
                    objeto2.writeObject((persona)lista.Dequeue());
                }
                objeto2.flush();
                objeto2.close();
                salida.close();
            }
        } catch (Exception e) {
        }
        emigrantes.queue(p);
        this.tf_nr_nombre.setText("");
        this.cb_nr_deportado.setSelected(false);
        this.cb_nr_nacionalidad.setSelectedIndex(0);
        this.cb_nr_origen.setSelectedIndex(0);
        this.cb_nr_raza.setSelectedIndex(0);
        this.dc_nr_Fnacimiento.setDate(null);

    }//GEN-LAST:event_bt_NuevoRegistroActionPerformed

    private void jM_I_NuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_I_NuevoRegistroActionPerformed
        // TODO add your handling code here:
        this.dialog(jd_nuevoRegistro);

    }//GEN-LAST:event_jM_I_NuevoRegistroActionPerformed
    public void dialog(JDialog a) {
        a.setModal(true);
        a.pack();
        a.setLocationRelativeTo(this);
        a.setVisible(true);
    }

    public void cargar() {
        File archivo = null;
        try {
            archivo = new File("./personas.lu");
            //Leer lo que ya tiene el archivo y ponerlo en arrayList
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);

            persona cargando = new persona();
            try {
                while ((cargando = (persona) objeto.readObject()) != null) {
                    System.out.println(cargando);
                    emigrantes.queue(cargando);

                }
            } catch (EOFException e) {
                objeto.close();
                entrada.close();
            }

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_NuevoRegistro;
    private javax.swing.JCheckBox cb_nr_deportado;
    private javax.swing.JComboBox<String> cb_nr_nacionalidad;
    private javax.swing.JComboBox<String> cb_nr_origen;
    private javax.swing.JComboBox<String> cb_nr_raza;
    private com.toedter.calendar.JDateChooser dc_nr_Fnacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jM_I_NuevoRegistro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDialog jd_nuevoRegistro;
    private javax.swing.JTextField tf_nr_nombre;
    // End of variables declaration//GEN-END:variables
    Cola emigrantes=new Cola();
    Cola deportados=new Cola();
    Cola angar=new Cola();
    Avion enVuelo;
    Habordar hiloAbordar;
}
