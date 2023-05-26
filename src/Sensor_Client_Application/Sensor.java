/*
Group number: 5 
Member 1 : Areej Suleman , 1916786
Member 2 : Ebtihaj Alnaqeeb , 2011859
Member 3 : Mai Khalil , 2010295
Member 4 : Sarah Abukhammas 2006235
Member 5 : Shahad Bin Kulaib 2005339
Member 6 : Raghad Alghamdi , 2006357
*/
package Sensor_Client_Application;
//All needed imports go to here :
import java.io.*;
import java.awt.*;
import java.net.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
//_____________________________________________________________________________________________________
public class Sensor extends javax.swing.JFrame {
    /**
     * Creates new form Sensor
     */
    public Sensor() {
        initComponents();
    }
    //Create a duration variable for the specified duration of the connection.
    static int duration;
    @SuppressWarnings("unchecked")
    
    //Needed variables for Image icon in the Gui interface screen.
    static String imageName = null;
    static ImageIcon Temprature = new ImageIcon("Temperature.png");
    static ImageIcon HeartRate = new ImageIcon("HeartRate.png");
    static ImageIcon OxygenSaturation = new ImageIcon("OxygenSaturation.png");

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Duration1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextTemprature1 = new javax.swing.JTextField();
        TextHeart = new javax.swing.JTextField();
        TextOxygen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        imageOfTemperature = new javax.swing.JLabel();
        imageOfHeartRate = new javax.swing.JLabel();
        imageOfOxygenSaturation = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        setForeground(new java.awt.Color(0, 51, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Duration1.setBackground(new java.awt.Color(255, 255, 204));
        Duration1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Duration1ActionPerformed(evt);
            }
        });
        jPanel1.add(Duration1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 265, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("The duration is ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        TextTemprature1.setBackground(new java.awt.Color(255, 204, 204));
        TextTemprature1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTemprature1ActionPerformed(evt);
            }
        });
        jPanel1.add(TextTemprature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 490, 30));

        TextHeart.setBackground(new java.awt.Color(255, 204, 204));
        TextHeart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextHeartActionPerformed(evt);
            }
        });
        jPanel1.add(TextHeart, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 490, 30));

        TextOxygen.setBackground(new java.awt.Color(255, 204, 204));
        TextOxygen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextOxygenActionPerformed(evt);
            }
        });
        jPanel1.add(TextOxygen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 490, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 3058, -1, -1));
        jPanel1.add(imageOfTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 100));
        jPanel1.add(imageOfHeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 100));
        jPanel1.add(imageOfOxygenSaturation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 100, 100));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SensedDataImages/backgroundSensor.jpg"))); // NOI18N
        jPanel1.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextOxygenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextOxygenActionPerformed

    }//GEN-LAST:event_TextOxygenActionPerformed

    private void TextHeartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextHeartActionPerformed
        
    }//GEN-LAST:event_TextHeartActionPerformed

    private void Duration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Duration1ActionPerformed
        
    }//GEN-LAST:event_Duration1ActionPerformed

    private void TextTemprature1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTemprature1ActionPerformed
        
    }//GEN-LAST:event_TextTemprature1ActionPerformed

    public static void main(String args[]) throws IOException, InterruptedException {

       //Creeating a scanner object.
        Scanner input = new Scanner(System.in);
       //Printing a message to ask the user to enter the duration of the connection.
       System.out.print("Enter the duration of the connection time in seconds: (duration must be greater than or equal 60s) : ");
       System.out.println();
       duration = input.nextInt();
       //Integer.parseInt(Duration1.getText());
       //Loop for asking the user to enter the duration again if it is smaller than 60 seconds.
        while(duration < 60){       
           //Printing a message.
           System.out.println("duration must be greater than or equal 60s, try again:  ");
           System.out.println();
           duration = input.nextInt();
       }//The end of loop.
  
        //Setting the panel 
        new Sensor().setVisible(true);
        
        //Display the input duration in the GUI. 
        Duration1.setText(" "+duration);
        
        //Converting duration from seconds to milliseconds.
        duration = duration * 1000;
        
        //Creating a socket to connect to the server using the same port number.
        
        //these two lines of code will be used when running this program on different machines 
        
       /*InetAddress addresses = InetAddress.getByName("192.186.100.10");
        String hostName = addresses.getHostName();*/
        Socket client_socket = new Socket("localhost", 2014);
              
        //Creating the output stream writer to write the messages.
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(client_socket.getOutputStream());
        
        //Creatng the buffered writer and associating it with the output stream writer.
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
       
        //Sending the duration of the connection to the server.
        bufferedWriter.write((int) duration);
         
        //Initializing the starting time.
        long startTime = System.currentTimeMillis();
   
        //Creating a date and identifying the format of the date.
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'time' HH:mm:ss");
   
        //Infinie while loop for the connection between the client and the server.
        while(true){
            
            //Checking if the time is out(sepecified duration of the connection is done)to stop the connection.
            if(System.currentTimeMillis() > startTime + duration) {
                break;
            }
            //------------------------------------------------------------------
            //Generating a random value for the temprature between 36 and 41.
            int temprature = getRandomValue(36, 41);
            //Display the icon of Temperature. 
            imageName = "Temprature";
            imageOfTemperature.setIcon(Temprature);
            //Printing the temprature.
            TextTemprature1.setText("At date: " + formatter.format(System.currentTimeMillis()) + " sensed temperature is " + temprature+"\n");
            //Sending the value of the temprature to the server.
            bufferedWriter.write(temprature);
            //Flushing the buffered writer.
            bufferedWriter.flush();
         
            //To wait for 1 second before sending the value of the temprature, we will use a thread.
            Thread.sleep(1000);
                
            //Checking if the time is out to stop the connection.
            if(System.currentTimeMillis() > startTime + duration) {
                break;
            }
            //------------------------------------------------------------------
            //Generating a random value for the heart rate between 50 and 120.
            int heartRate = getRandomValue(50, 120);
            //Display the icon of Heart rate. 
            imageName = "HeartRate";
            imageOfHeartRate.setIcon(HeartRate);
            //Printing the heart rate.
            TextHeart.setText("At date: " + formatter.format(System.currentTimeMillis()) + " sensed heart rate is  " + heartRate+"\n");
            //Sending the value of the heart rate to the server.
            bufferedWriter.write(heartRate);
            //Flushing the buffered writer.
            bufferedWriter.flush();
             
            //To wait for 1 second before sending the value of the heartrate, we will use a thread.
            Thread.sleep(1000);
                
            //Cheching if the time is out(sepecified duration of the connection is done)to stop the connection.
            if(System.currentTimeMillis() > startTime + duration) {
                break;
            }
            //------------------------------------------------------------------
            //Generating a random value for the oxygen saturation between 60 and 100.
            int oxygen = getRandomValue(60, 100);
            //Display the icon of Oxygen saturation. 
            imageName = "OxygenSaturation_1";
            imageOfOxygenSaturation.setIcon(OxygenSaturation);
            //Printing the oxygen.
            TextOxygen.setText("At date: " + formatter.format(System.currentTimeMillis()) + " sensed oxygen saturation is " + oxygen+"\n");
            //Sending the value of the oxygen saturation to the server.
            bufferedWriter.write(oxygen);
            //Flushing the buffered writer.
            bufferedWriter.flush();
                
            //To wait for 5 seconds before sending the next block of data, we will use a thread..
            Thread.sleep(5000);
            
            //Checking if the time is out(sepecified duration of the connection is done)to stop the connection.
            if(System.currentTimeMillis() > startTime + duration) {
                break;
            }
            //------------------------------------------------------------------
            //To distinguish between each block of sensed data, print a blank line.
            System.out.println("");
            //To reset all the texts in the GUI screen. 
            TextTemprature1.setText(null);
            TextHeart.setText(null);
            TextOxygen.setText(null);
   
        } //The end of while loop.
        
        //Closing the socket and all of the in/output streams and buffers.
        if (client_socket != null) {
            client_socket.close();
        }
        if (outputStreamWriter != null) {
            outputStreamWriter.close();
        }
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
    }//The end of the main method.
    //_____________________________________________________________________________________________________
    //Header of getRandomValue method that generates a random value within the given range.
    public static int getRandomValue(int min, int max) throws InterruptedException {
        // Generating a random value and returning it.
        int randomValue = (int) (min + Math.random() * ((max - min) + 1));
        return randomValue;   
    }//The end of the getRandomValue method.
//-------------------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JLabel BackGround;
    static javax.swing.JTextField Duration1;
    static javax.swing.JTextField TextHeart;
    static javax.swing.JTextField TextOxygen;
    static javax.swing.JTextField TextTemprature1;
    static javax.swing.JLabel imageOfHeartRate;
    static javax.swing.JLabel imageOfOxygenSaturation;
    static javax.swing.JLabel imageOfTemperature;
    static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    static javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}// End of the class
