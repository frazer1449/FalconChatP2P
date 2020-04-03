/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconchatserver;

import static falconchatserver.ServerManage.dout;
import javax.swing.JOptionPane;

/**
 *
 * @author strea
 */
public class sendmessage extends ServerManage
{
    public void run()
    {
            try
            {
                dout.writeUTF(fcc.Message);
            }
            catch(Exception e1)
            {
                JOptionPane.showMessageDialog(null, e1, "InfoBox: ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
    }
}
