# Client-Server-application (Remote Health System)

Remote Health Monitoring System (RHMS) is a client-server-based application that helps 
elderly patients who suffer from chronic diseases. It uses the Wireless Body Area Networks 
(WBAN) which helps to monitor the patients remotely. RHMS application consists of three 
major components: 

• The sensor client application that has three sensors to read the values of oxygen 
saturation, heart rate, and temperature of the patient and send it to a personal server. 

• The personal server that acts as a server and a client. Its server side receives the 
sensed data from the sensor application and checks the data to decide if it should be 
sent to the medical server. On the other hand, the client side is responsible for sending
messages to the medical server if the sensed data are not normal. 

• The medical server receives messages from the personal server, and displays them to the 
caregiver in addition to checking the data to decide what actions need to be taken
