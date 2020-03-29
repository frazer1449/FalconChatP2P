/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconchatserver;

import falconchatclient.*;

/**
 *
 * @author strea
 */
public class fcc {
    public static String ip = "127.0.0.1"; 
    public static int port = 1201;
    public static String username1 = "client2";  
    public static Server s; 
    public static ServerLogin sl; 
    public static void main(String[] args) {
        // TODO code application logic here
        s = new Server();
        sl = new ServerLogin(); 
    }
    
}
