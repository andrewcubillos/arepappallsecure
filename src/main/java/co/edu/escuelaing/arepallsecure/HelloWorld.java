/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.arepallsecure;

import static spark.Spark.*;

public class HelloWorld {

    public static void main(String[] args) {
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath, truststorePassword); 
        secure("keystores/ecikeystore.p12", "escuelaingedu", null, null);
         port(getPort()); 
         get("/hello", (req, res) -> "Hello Heroku");
    
}
     static int getPort() { 
        if (System.getenv("PORT") != null) { 
            return Integer.parseInt(System.getenv("PORT")); 
        } 
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost) 
    }
}
