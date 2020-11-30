package Project4;

import java.awt.event.KeyEvent;

public class Project4 extends javax.swing.JFrame {

   
	private static final long serialVersionUID = 1L;
	//This is creating values for the flashcards as in once the GUI is created it will provide the options and values for addition subtraction etc.
    public Project4() {
        initComponents();
        buttonGroup1.add(additionradio);
        buttonGroup1.add(subradio);
        buttonGroup1.add(mulradio);
        buttonGroup1.add(divradio);
        additionradio.setSelected(true);
        additionradio.setActionCommand("A");
        mulradio.setActionCommand("M");
        divradio.setActionCommand("D");
        subradio.setActionCommand("S");
    }

    //This is basically the heart of the code it is initializing by calling the constructor.
    private void initComponents() {
       
         go = new javax.swing.JButton();
         jLabel5 = new javax.swing.JLabel();
         nameerror = new javax.swing.JLabel();
         problemerror = new javax.swing.JLabel();
         lowesterror = new javax.swing.JLabel();
         highesterror = new javax.swing.JLabel();
         resubmiterror = new javax.swing.JLabel();
         buttonGroup1 = new javax.swing.ButtonGroup();
         nametext = new javax.swing.JTextField();
         problemtext = new javax.swing.JTextField();
         lowesttext = new javax.swing.JTextField();
         highesttext = new javax.swing.JTextField();
         additionradio = new javax.swing.JRadioButton();
         subradio = new javax.swing.JRadioButton();
         mulradio = new javax.swing.JRadioButton();
         divradio = new javax.swing.JRadioButton();
         jLabel1 = new javax.swing.JLabel();
         jLabel2 = new javax.swing.JLabel();
         jLabel3 = new javax.swing.JLabel();
         jLabel4 = new javax.swing.JLabel();
       
        //This is the the same thing because its also calling the constructor
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        //This is where your name etc will be shown. It is first because it will show up first in the display.
        jLabel1.setText("Enter Your Name ");

        jLabel2.setText("How many problems ?");

        jLabel3.setText("Lowest value for range of factors");

        jLabel4.setText("Highest value for range of factors");
        
      //This is going to be shown in the GUI showing you what will be chosen for the method of calculation. This is second because it is show below the name and problems. 
        mulradio.setText("Multiplication x");

        divradio.setText("Division /");
        
        additionradio.setText("Additioin +");

        subradio.setText("Substraction -");


        go.setText("Go");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        //The code from 90 to 180 are all of the technical aspects of the code. This is by far the most difficult and longest party of the code. All the details of the GUI will be placed here.
        jLabel5.setText("Problem Type ");
            //The java swing classes are just imports to help build GUI
        	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        	getContentPane().setLayout(layout);
        	layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            //This is where all the technical aspects ae being defined. Alignment and size are being kept here
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(problemtext, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lowesttext, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(highesttext, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(72, 72, 72)
            //The sequentialgroup is position groups within a container based on hierarchy
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameerror)
            .addComponent(problemerror)
            .addComponent(lowesterror)
            .addComponent(highesterror)))
            .addGroup(layout.createSequentialGroup()
            .addGap(50, 50, 50)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            //This is where all the technical aspects are being defined. Alignment and size are being kept here
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(87, 87, 87)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subradio)
            .addComponent(additionradio)
            .addComponent(mulradio)
            .addComponent(divradio)))
            .addGroup(layout.createSequentialGroup()
            .addGap(218, 218, 218)
            .addComponent(go)))
            .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(resubmiterror, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40))
            // Any code not specified is simply defining details and layout of the GUI
        );
        layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        //From 145 to 165 is like before. it implements details that will be in the GUI
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(lowesttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(lowesterror))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(problemtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(problemerror))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(highesttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addComponent(highesterror))
        .addGap(41, 41, 41)
        //This code is also further aligning and showing size and design of text in the GUI
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(nameerror))
        .addComponent(additionradio)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        //This is how the components will be placed with respect to each other
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(subradio)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(mulradio))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(divradio)
        .addGap(18, 18, 18)
        .addComponent(go)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(resubmiterror, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }                     

    private void goActionPerformed(java.awt.event.ActionEvent evt) {                                 
     //Handling code is implemented below. This is the next step once the technical aspects are complete such as adding setters.
     String Operation = null;
     String name;
     int NameOfProb = 0;
     int LowRange = 0;
     int HighRange = 0;
     try
        {
      Operation = buttonGroup1.getSelection().getActionCommand();
        }
        catch(Exception op)
        {
        	//These will add values and results to the GUI
        	 nameerror.setText("");
             problemerror.setText("");
             resubmiterror.setText("");
             lowesterror.setText("");
             highesterror.setText("Invalid !");
        	
        }
         name=nametext.getText();
        if(name.isEmpty() )
        {
            resubmiterror.setText("Error ! Resubmit");
            nameerror.setText("");
            problemerror.setText("");
            lowesterror.setText("");
            highesterror.setText("");
        	
        }
        try{
        NameOfProb=Integer.parseInt(problemtext.getText());
        }
        catch(Exception e)
        {
            problemerror.setText("Invalid ! ");
            nameerror.setText("");
            lowesterror.setText("");
            highesterror.setText("");
            resubmiterror.setText("");
        }
        try{
         LowRange=Integer.parseInt(lowesttext.getText());
            if(LowRange<0)
            {
             nameerror.setText("");
             problemerror.setText("");
             highesterror.setText("");
             resubmiterror.setText("");
             lowesterror.setText("Invalid !");
            }
        }
        catch(Exception e1)
        {
        	nameerror.setText("");
            problemerror.setText("");
            resubmiterror.setText("");
            lowesterror.setText("");
            highesterror.setText("Invalid !");
              }
        try{
         HighRange=Integer.parseInt(highesttext.getText());
           if(HighRange<0)
           {
           
           nameerror.setText("");
           problemerror.setText("");
           highesterror.setText("");
           resubmiterror.setText("");
           lowesterror.setText("Invalid !");
            }
        }
        catch(Exception e1)
        {
           nameerror.setText("Empty !");
           problemerror.setText("");
           lowesterror.setText("");
           highesterror.setText("");
           resubmiterror.setText("");
             }
        //This will be shown in the display area of the GUI
        System.out.println(""+name+"\n"+NameOfProb+"\n"+LowRange+"\n"+HighRange+"\n"+Operation);
    }                                

    private void formKeyPressed(java.awt.event.KeyEvent evt) {                              
            if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                goActionPerformed(null);
                // Enter was pressed. Your code goes here.
   }
  
    }                             
          public static void main(String args[]) { //Array
          //Loops and if statements
          try {
          for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
          if ("Nimbus".equals(info.getName())) {
              javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
                }
          //Defines the code to be run and tested this is done when the try block has issues
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Project4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       //setting the user interface
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Project4().setVisible(true);
            }
        });
    }

    // End of the code where the remaining variables from above are being defined                
    private javax.swing.JLabel lowesterror;
    private javax.swing.JTextField lowesttext;
    private javax.swing.JRadioButton mulradio;
    private javax.swing.JLabel nameerror;
    private javax.swing.JTextField nametext;
    private javax.swing.JLabel problemerror;
    private javax.swing.JTextField problemtext;
    private javax.swing.JLabel resubmiterror;
    private javax.swing.JRadioButton subradio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton additionradio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton divradio;
    private javax.swing.JButton go;
    private javax.swing.JLabel highesterror;
    private javax.swing.JTextField highesttext;
   
    // End of variables declaration                 
}