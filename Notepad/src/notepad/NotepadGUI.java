/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;

/**
 *
 * @author Swapnil
 */
public class NotepadGUI extends javax.swing.JFrame {

    private String filename;
    boolean checkAvailableText;
    private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    private Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
    private Highlighter highlighter;

    public NotepadGUI() {
        initComponents();
        filename = "Untitled";
        highlighter = textField.getHighlighter();
        checkAvailableText=false;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textField = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        findButton = new javax.swing.JMenuItem();
        cutButton = new javax.swing.JMenuItem();
        copyButton = new javax.swing.JMenuItem();
        pasteButton = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        wordCount = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        textField.setColumns(20);
        textField.setRows(5);
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textField);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jMenu1.add(newFile);

        openFile.setText("Open");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });
        jMenu2.add(findButton);

        cutButton.setText("Cut");
        cutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutButtonActionPerformed(evt);
            }
        });
        jMenu2.add(cutButton);

        copyButton.setText("Copy");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });
        jMenu2.add(copyButton);

        pasteButton.setText("Paste");
        pasteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteButtonActionPerformed(evt);
            }
        });
        jMenu2.add(pasteButton);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");

        wordCount.setText("Word Count");
        wordCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordCountActionPerformed(evt);
            }
        });
        jMenu3.add(wordCount);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
  
    
    
    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        String copyString = textField.getSelectedText();
        StringSelection colpySelection = new StringSelection(copyString);
        clipboard.setContents(colpySelection, colpySelection);

    }//GEN-LAST:event_copyButtonActionPerformed

    
    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed

        //changes the title of the window and delete everything on the text field
        textField.setText("");
        setTitle(filename);
        checkAvailableText=false;

    }//GEN-LAST:event_newFileActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed

        // uses the java built in FileDialog class to open a file already in the computer 
        FileDialog fileDialog = new FileDialog(this, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            //fetches the directory adress and stores it in filename
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);

            try {
                //texts are read line by line and put into the stringbuilder object.
                BufferedReader br = new BufferedReader(new FileReader(filename));
                String line = null;
                StringBuilder sb = new StringBuilder();
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                textField.setText(sb.toString());
                br.close();

            } catch (Exception e) {
                System.out.println("File not found while opening");

            }

        }

    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed

       saveFile();


    }//GEN-LAST:event_saveFileActionPerformed

    private void saveFile()
    {
         FileDialog fd = new FileDialog(this, "Save File", FileDialog.SAVE);
        fd.setVisible(true);

        if (fd.getFile() != null) {
            filename = fd.getDirectory() + fd.getFile();
            setTitle(filename);

        }
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(textField.getText());
            setTitle(filename);
            fw.close();

        } catch (Exception e) {
            System.out.println("File not found while saving");

        }
        
    }
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit before saving?", filename, JOptionPane.YES_NO_CANCEL_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            //open a file menu to save the file
            saveFile();
            
            
        }


    }//GEN-LAST:event_exitActionPerformed

    private void cutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutButtonActionPerformed
        String cutString = textField.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipboard.setContents(cutSelection, cutSelection);
        textField.replaceRange("", textField.getSelectionStart(), textField.getSelectionEnd());

    }//GEN-LAST:event_cutButtonActionPerformed

    private void pasteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteButtonActionPerformed
        try {
            Transferable pasteText = clipboard.getContents(this);
            String pasteString = (String) pasteText.getTransferData(DataFlavor.stringFlavor);
            textField.replaceRange(pasteString, textField.getSelectionStart(), textField.getSelectionEnd());

        } catch (Exception e) {
            System.out.println("Clipboard is currently busy");
        }

    }//GEN-LAST:event_pasteButtonActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed

        highlighter.removeAllHighlights();
        int count = 0;
        String keyword = JOptionPane.showInputDialog("Enter the word to search");
        if (keyword == null) {
            

        } else {
            
            try {
                String text = textField.getText();
                int index_start = 0, index_end = 0;
                keyword = keyword.toLowerCase();

                while ((index_start = text.toLowerCase().indexOf(keyword, index_start)) != -1) {
                    count++;
                    System.out.println(index_start);
                    index_end = index_start + keyword.length();
                    highlighter.addHighlight(index_start, index_end, painter);
                    index_start += keyword.length();

                }
            } catch (BadLocationException ex) {
                Logger.getLogger(NotepadGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Number of words matched: " + count);
            
            //after user presses ok, the following lines will execute
            //remove all highlighters to default
            highlighter.removeAllHighlights();
          
           
        }


    }//GEN-LAST:event_findButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        if(checkAvailableText==false)    
            System.exit(0);

      
        int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want exit without saving?", filename, JOptionPane.YES_NO_OPTION);
        if(ans==JOptionPane.YES_OPTION)
        
            System.exit(0);
        
        else
        
            saveFile();
        
    }//GEN-LAST:event_formWindowClosing

    private void textFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldKeyTyped
        // TODO add your handling code here:
        checkAvailableText=true;
    }//GEN-LAST:event_textFieldKeyTyped

    private void wordCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordCountActionPerformed
        JOptionPane.showMessageDialog(this, "Total word count: "+textField.getText().length(), "Word Count", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_wordCountActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadGUI().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyButton;
    private javax.swing.JMenuItem cutButton;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem findButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem pasteButton;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JTextArea textField;
    private javax.swing.JMenuItem wordCount;
    // End of variables declaration//GEN-END:variables
}
