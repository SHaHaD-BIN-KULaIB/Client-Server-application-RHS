/*
Group number: 5 
Member 1 : Areej Suleman , 1916786
Member 2 : Ebtihaj Alnaqeeb , 2011859
Member 3 : Mai Khalil , 2010295
Member 4 : Sarah Abukhammas 2006235
Member 5 : Shahad Bin Kulaib 2005339
Member 6 : Raghad Alghamdi , 2006357
*/
package Medical_Server;
//All needed imports go to here :
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
//_____________________________________________________________________________________________________
public class Medical_Server extends javax.swing.JFrame {

    /**
     * Creates new form MedicalServer
     */
    public Medical_Server() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        serverIsON = new javax.swing.JTextField();
        conncetionEsablished = new javax.swing.JTextField();
        TextTemprature = new javax.swing.JTextField();
        TextHeart = new javax.swing.JTextField();
        TextOxagyn = new javax.swing.JTextField();
        TextAction = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serverIsON.setBackground(new java.awt.Color(255, 255, 198));
        jPanel1.add(serverIsON, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 242, 20));

        conncetionEsablished.setBackground(new java.awt.Color(240, 255, 255));
        jPanel1.add(conncetionEsablished, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 239, 480, 20));

        TextTemprature.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(TextTemprature, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 299, 400, 30));

        TextHeart.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(TextHeart, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 349, 400, 30));

        TextOxagyn.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(TextOxagyn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 399, 400, 30));

        TextAction.setBackground(new java.awt.Color(204, 255, 255));
        TextAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextActionActionPerformed(evt);
            }
        });
        jPanel1.add(TextAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 459, 354, 30));
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 230, 230));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medical_Server/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Needed variables for Image icon in the Gui interface screen.
    static String imageName = null;
    static ImageIcon ambulance = new ImageIcon("ambulance.jpg");
    static ImageIcon callFamily = new ImageIcon("callFamily.jpg");
    static ImageIcon appointment = new ImageIcon("appointment.jpg");
    
    private void TextActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextActionActionPerformed
      
    }//GEN-LAST:event_TextActionActionPerformed

    public static void main(String args[]) throws IOException {
            
        new Medical_Server().setVisible(true);
        
        //Initailizing a socket.
        Socket socket = null;

        //Initailizing an input stream reader.
        InputStreamReader inputStreamReader = null;

        //Initailizing a buffered reader.
        BufferedReader bufferedReader = null;

        //Initailizing a server socket that waits for requests to come over the network.
        ServerSocket server_socket = null;

        //Creating the server socket to communicate with the client, & the port No. should be the same.
        //Listen on a certain port No. for connections.
        server_socket = new ServerSocket(6062);

        //Printing a message.
        serverIsON.setText("Server is ON and wait for data...");
        
        //Declaring variabales to be read the by socket.
        int temprature;
        int heartRate;
        int oxygen;

        //While loop to create new socket and accept the connection with the client.
        try {
            while (true) {

                //Communication done ,Handshaking.
                socket = server_socket.accept();
                
                //Printing a message.
                conncetionEsablished.setText("New connection with Personal Server is established, here are the received data: ");

                //Creating the input stream reader to read the messages.
                inputStreamReader = new InputStreamReader(socket.getInputStream());

                //Creatng the buffered reader and associating it with the input stream reader.
                bufferedReader = new BufferedReader(inputStreamReader);

                //Reading data sent by the client. 
               temprature = bufferedReader.read();
                heartRate = bufferedReader.read();
                oxygen = bufferedReader.read();
              

                //Creating a date and identifying the format of the date.
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'time' HH:mm:ss");

                //Initailizing the timeout variable with 0 to start connection with 1 client.       
                int timeout = 0;
                
                //While loop to receive and read data sent by the client. It ends when the connection time is out.
                while (timeout == 0) {
                    
                    /*
                    Cases of medical server, these are the message that are sent to the caregiver of the patient. 
                    The medical server will first process the sent data of the patient and based on
                    the 3 cases will send the caregiver a message to show them the proper action to 
                    take care of the patint.
                    */
                    //1st case.
                    if (temprature > 39 && heartRate > 100 && oxygen < 95) {
                        TextTemprature.setText("At date: " + formatter.format(System.currentTimeMillis()) + " Tempruture is high " + temprature);
                        // Printing a message.
                        TextHeart.setText("At date: " + formatter.format(System.currentTimeMillis()) + " Heart Rate is above normal " + heartRate);
                        // Printing a message.
                        TextOxagyn.setText("At date: " + formatter.format(System.currentTimeMillis()) + " oxygen saturation is low " + oxygen);
                        //Printing a message.
                        TextAction.setText("Send an ambulance to the patient!");
                        //Create an image and display it. 
                        imageName = "ambulance";
                        image.setIcon(ambulance);
                    } 
                    //------------------------------------------------------------------
                    //2nd case.
                    else if ((temprature >= 38 && temprature <= 38.9) && (heartRate >= 95 && heartRate <= 98) && oxygen < 80) {
                        //Printing a message.
                        TextTemprature.setText("At date: " + formatter.format(System.currentTimeMillis()) + " Tempruture is normal " + temprature);
                        //Printing a message.
                        TextHeart.setText("At date: " + formatter.format(System.currentTimeMillis()) + " Heart Rate is normal " + heartRate);
                        //Printing a message.
                        TextOxagyn.setText("At date: " + formatter.format(System.currentTimeMillis()) + " oxygen saturation is low " + oxygen);
                        //Printing a message.
                        TextAction.setText("Call the patient's family!");
                        //Create an image and display it. 
                        imageName = "callFamily";
                        image.setIcon(callFamily);
                    } 
                    //------------------------------------------------------------------
                    //3rd case.
                    else {
                        if(temprature >= 39){
                        //Printing a message.
                        TextTemprature.setText("At date: " + formatter.format(System.currentTimeMillis()) + " Tempruture is high " + temprature);
                        }
                        else if(temprature < 37){
                        //Printing a message.
                        TextTemprature.setText("At date: " + formatter.format(System.currentTimeMillis()) + " Tempruture is low " + temprature);
                        }
                        else{
                        //Printing a message.
                        TextTemprature.setText("At date: " + formatter.format(System.currentTimeMillis()) + " Tempruture is normal " + temprature);
                        }
                        if(heartRate < 60){
                        //Printing a message.
                        TextHeart.setText("At date: " + formatter.format(System.currentTimeMillis()) + " Heart Rate is below normal " + heartRate);
                        }
                        else if(heartRate > 100){
                        //Printing a message.
                        TextHeart.setText("At date: " + formatter.format(System.currentTimeMillis()) + " Heart Rate is above normal " + heartRate);
                        }
                        else{
                        //Printing a message.
                        TextHeart.setText("At date: " + formatter.format(System.currentTimeMillis()) + " Heart Rate is normal " + heartRate);
                        }
                        if(oxygen < 95 ){
                        //Printing a message.
                        TextOxagyn.setText("At date: " + formatter.format(System.currentTimeMillis()) + " oxygen saturation is low " + oxygen);
                        }
                        else if(oxygen > 100){
                        //Printing a message.
                        TextOxagyn.setText("At date: " + formatter.format(System.currentTimeMillis()) + " oxygen saturation is high " + oxygen);
                        }
                        else{
                        //Printing a message.
                        TextOxagyn.setText("At date: " + formatter.format(System.currentTimeMillis()) + " oxygen saturation is normal " + oxygen);
                        }
                        //Printing a message.
                        TextAction.setText("Warning, advise patient to make a checkup appointment!");
                        //Create an image and display it. 
                        imageName = "appointment";
                        image.setIcon(appointment);
                    }
                    //------------------------------------------------------------------
                    //To distinguish between each block of sensed data, print a blank line.
                    System.out.println();
                    //To end the connection with the client,change the value of the timeout variable to 1. 
                    timeout = -1; 
                }//The end of inner loop.  
            }//The end of outer loop.
        }//The end of try.
        catch (IOException exp) {
        //Closing the socket and all of the in/output streams and buffers.
            socket.close();
            inputStreamReader.close();
            bufferedReader.close();
        }//The end of catch. 
    }//The end of the main method.
//-------------------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JTextField TextAction;
    static javax.swing.JTextField TextHeart;
    static javax.swing.JTextField TextOxagyn;
    static javax.swing.JTextField TextTemprature;
    static javax.swing.JLabel background;
    static javax.swing.JTextField conncetionEsablished;
    static javax.swing.JLabel image;
    static javax.swing.JPanel jPanel1;
    static javax.swing.JTextField serverIsON;
    // End of variables declaration//GEN-END:variables
}//The end of the class. 

