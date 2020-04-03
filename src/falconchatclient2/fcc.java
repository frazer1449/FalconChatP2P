/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconchatclient2;

/**
 *
 * @author strea
 */
public class fcc {
    public static String ip = "127.0.0.1"; 
    public static int port = 1202;
    public static Client c; 
    public static ClientLogin cl; 
    public static void main(String[] args) {
        // TODO code application logic here
        c = new Client();
        cl = new ClientLogin(); 
    }
}
