
package Tpackage;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Field extends javax.swing.JFrame {

    public Field() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        setsize = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        fonts = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton1.setText("Capital Letters");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 100, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 650, 542));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 670, 542));

        jButton2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton2.setText("Small Letters");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 100, -1));

        jButton4.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton4.setText("Capitalize F.Letter");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 110, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nyamari Text Converter");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton5.setText("Clear");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 66, 20));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton6.setText("Clear");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1286, 610, 60, 20));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tpackage/cool-background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -30, 1280, 690));

        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 60, 20));

        jButton3.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton3.setText("Text To Bold");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 630, 90, -1));

        jButton8.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton8.setText("Text To Italics");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 630, 90, -1));

        jButton9.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton9.setText("Print/Save Output");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 640, -1, 20));

        jButton10.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton10.setText("Normal Letters");
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, 100, -1));

        jSpinner1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, 130, -1));

        setsize.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        setsize.setText("Set Size");
        setsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setsizeActionPerformed(evt);
            }
        });
        getContentPane().add(setsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 630, 90, -1));

        jComboBox1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", "Times New Roman", "Courier New", "Verdana", "Tahoma", "Comic Sans MS", "Georgia", "Impact", "Lucida Sans Unicode", "Trebuchet MS", "Arial Black", "Palatino Linotype", "Book Antiqua", "Arial Narrow", "Garamond", "Century Gothic", "Lucida Console", "Lucida Sans", "Microsoft Sans Serif", "Monotype Corsiva", "Symbol" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 130, -1));

        fonts.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        fonts.setText("Set Font");
        fonts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontsActionPerformed(evt);
            }
        });
        getContentPane().add(fonts, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "Red", "Green", "Blue", "Yellow", "Orange", "Purple", "Cyan", "Magenta", "Pink", "Gray", "Dark Gray", "Light Gray", "White" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 120, -1));

        jButton11.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton11.setText("Select");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 80, -1));

        jButton12.setFont(new java.awt.Font("Serif", 1, 10)); // NOI18N
        jButton12.setText("<<~Align");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 610, 90, 20));

        jButton13.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jButton13.setText("WorkOn ~>>");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // To uppercase
    String text = jTextArea2.getText();
    String result = text.toUpperCase();
    jTextArea2.setText(result);
    jTextArea2.setCaretPosition(jTextArea2.getDocument().getLength());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // To lowercase
    String text = jTextArea2.getText();
    String result = text.toLowerCase();
    jTextArea2.setText(result);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // To capital each letter at start of sentence
    String text = jTextArea2.getText();
    StringBuilder sb = new StringBuilder();
    boolean capitalizeNext = true;
    for (char c : text.toCharArray()) {
        if (capitalizeNext && Character.isLetter(c)) {
            sb.append(Character.toUpperCase(c));
            capitalizeNext = false;
        } else {
            sb.append(c);
        }
        if (c == '.') {
            capitalizeNext = true;
        }
    }
    jTextArea2.setText(sb.toString());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // clear jTextArea1
        jTextArea1.setText(" ");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // clear jTextArea2
        jTextArea2.setText(" ");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // To bold
    String text = jTextArea2.getText();
    
    // Set text to bold
    Font font = jTextArea2.getFont();
    Font boldFont = new Font(font.getFontName(), Font.BOLD, font.getSize());
    
    // Set bold text to jTextArea2
    jTextArea2.setFont(boldFont);
    jTextArea2.setText(text);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // To italics
    String text = jTextArea2.getText();
    
    // Set text to italics
    Font font = jTextArea2.getFont();
    Font italicFont = new Font(font.getFontName(), Font.ITALIC, font.getSize());
    
    // Set italic text to jTextArea2
    jTextArea2.setFont(italicFont);
    jTextArea2.setText(text);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     // Print pdf from jTextarea2 function output
        try {
            jTextArea2.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, "Error: Unable to print - " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       String text = jTextArea2.getText();
      // Set text color to black
      jTextArea2.setForeground(Color.BLACK);

      // Set text to normal font
      Font font = jTextArea1.getFont();
      Font normalFont = new Font(font.getFontName(), Font.PLAIN, font.getSize());
      jTextArea2.setFont(normalFont);

      // Set normal text to jTextArea2
      jTextArea2.setText(text);

    }//GEN-LAST:event_jButton10ActionPerformed

    private void setsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setsizeActionPerformed
        // setsize button
        setsize.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        int fontSize = (int) jSpinner1.getValue(); // Get the selected font size
        Font currentFont = jTextArea2.getFont();
        Font newFont = new Font(currentFont.getFontName(), currentFont.getStyle(), fontSize);
        jTextArea2.setFont(newFont); // Set the font size of jTextArea2
    }
});
    }//GEN-LAST:event_setsizeActionPerformed

    private void fontsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontsActionPerformed
        // select fonts
        // Get the selected font family from the JComboBox
    String selectedFontFamily = (String) jComboBox1.getSelectedItem();
    
    // Get the current font of jTextArea2
    Font currentFont = jTextArea2.getFont();
    
    // Create a new font with the selected font family
    Font newFont = new Font(selectedFontFamily, currentFont.getStyle(), currentFont.getSize());
    
    // Set the new font to jTextArea2
    jTextArea2.setFont(newFont);
    }//GEN-LAST:event_fontsActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // color select
        // Get the selected color name from jComboBox2
    String selectedColorName = (String) jComboBox2.getSelectedItem();
    
    // Convert the color name to a Color object
    Color selectedColor = getColorByName(selectedColorName);
    
    // Set the foreground color of jTextArea2 to the selected color
    jTextArea2.setForeground(selectedColor);
}

// Method to get Color object by color name
private Color getColorByName(String colorName) {
    switch (colorName) {
        case "Black":
            return Color.BLACK;
        case "Red":
            return Color.RED;
        case "Blue":
            return Color.BLUE;
        case "Green":
            return Color.GREEN;
        case "Yellow":
            return Color.YELLOW;
        case "Orange":
            return Color.ORANGE;
        case "Purple":
            return new Color(128, 0, 128); // RGB: 128, 0, 128 (Purple)
        case "Cyan":
            return Color.CYAN;
        case "Magenta":
            return Color.MAGENTA;
        case "Pink":
            return Color.PINK;
        case "Gray":
            return Color.GRAY;
        case "Dark Gray":
            return Color.DARK_GRAY;
        case "Light Gray":
            return Color.LIGHT_GRAY;
        case "White":
            return Color.WHITE;
        default:
            return Color.BLACK; // Default color
    }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
// Match length to first line
    String text = jTextArea1.getText();
    String[] lines = text.split("\n");
    int firstLineLength = lines[0].length(); // Length of first line
    
    StringBuilder newText = new StringBuilder();
    for (String line : lines) {
        String[] sentences = line.split("(?<=[.!?])\\s+");
        for (String sentence : sentences) {
            sentence = sentence.trim(); // Remove leading and trailing spaces
            int sentenceLength = sentence.length();
            if (sentenceLength < firstLineLength) {
                newText.append(sentence);
                for (int i = sentenceLength; i < firstLineLength; i++) {
                    newText.append(" ");
                }
            } else if (sentenceLength > firstLineLength) {
                newText.append(sentence.substring(0, firstLineLength));
                newText.append("\n");
                String remainingText = sentence.substring(firstLineLength);
                while (remainingText.length() > firstLineLength) {
                    newText.append(remainingText.substring(0, firstLineLength));
                    newText.append("\n");
                    remainingText = remainingText.substring(firstLineLength);
                }
                if (!remainingText.isEmpty()) {
                    newText.append(remainingText);
                    for (int i = remainingText.length(); i < firstLineLength; i++) {
                        newText.append(" ");
                    }
                }
            } else {
                newText.append(sentence);
            }
            newText.append("\n");
        }
    }
    
    jTextArea2.setText(newText.toString());
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // workOn move text from jTextArea1 to working area jTextArea2
         String text = jTextArea1.getText();
         jTextArea2.setText(text);
    }//GEN-LAST:event_jButton13ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Field().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fonts;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton setsize;
    // End of variables declaration//GEN-END:variables
}
