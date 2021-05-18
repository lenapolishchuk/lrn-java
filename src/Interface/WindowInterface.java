package Interface;

import javax.swing.*;

public class WindowInterface extends JFrame {
    JPanel pnl = new JPanel();

    ClassLoader ldr = this.getClass().getClassLoader() ;
    java.net.URL tickURL = ldr.getResource("resourses/tick.jpg") ;
    java.net.URL crossURL = ldr.getResource("resourses/NoBtn.png") ;

    ImageIcon tick = new ImageIcon( tickURL) ;
    ImageIcon cross = new ImageIcon( crossURL) ;

    JButton btn = new JButton( "Нажми меня" ) ;
    JButton tickBtn = new JButton( tick ) ;
    JButton crossBtn = new JButton( "СТОП" , cross ) ;


    public WindowInterface(){
        super ("Window Swing");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pnl.add(btn);
        pnl.add(tickBtn);
        pnl.add(crossBtn);

        add (pnl);
        pnl.setVisible(true);
    }

    public static void main (String[] args){

        WindowInterface gui = new WindowInterface();
    }
}
