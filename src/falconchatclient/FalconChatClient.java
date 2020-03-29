/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconchatclient;

/**
 *
 * @author strea
 */
public class FalconChatClient {
    public static ClientLogin cl; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cl = new ClientLogin(); 
        cl.setVisible(true);
    }
    
}
