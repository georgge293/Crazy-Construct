/**
 * ControlButtonListener.java
 * George Li
 * 2020-01-16
 * Action listener that takes the user out of and into the controls panel
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

class ControlButtonListener implements ActionListener{
    private JFrame targetFrame;
    private JPanel containerPanel;

    /* ControlButtonListener constructor
   * @param JFrame frame, menuFrame
   * @param JPanel containerPanel
   *  Constructor for ControlButtonListener
   */
    ControlButtonListener(JFrame frame,JPanel containerPanel){
        this.targetFrame = frame;
        this.containerPanel = containerPanel;
    }
    
    /* actionPerformed method
   * @param ActionEvent event
   *  Once action is performed will change the screen to next card with cardLayout
   */
    public void actionPerformed(ActionEvent event)  {  
        CardLayout cl = (CardLayout)(containerPanel.getLayout());
        cl.next(containerPanel);//change screens
    }
}