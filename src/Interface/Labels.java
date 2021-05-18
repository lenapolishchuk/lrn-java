package Interface;

import javax.swing.*;

public class Labels extends JFrame {

    JPanel pnl = new JPanel();

    ImageIcon duke = new ImageIcon("resourses/tick.jpg") ;

    JLabel lbl1 = new JLabel( duke ) ;
    JLabel lbl2 = new JLabel( "Дюк — талисман технологии Java." ) ;
    JLabel lbl3 = new JLabel( "Дюк" , duke , JLabel.CENTER ) ;


    public Labels(){
        super ("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add (pnl);
        setVisible(true);

        lbl1.setToolTipText( "Дюк — талисман Java" ) ;
        lbl2.setHorizontalTextPosition( JLabel.CENTER ) ;
        lbl3.setVerticalTextPosition( JLabel.BOTTOM ) ;

        pnl.add(lbl1);
        pnl.add(lbl2);
        pnl.add(lbl3);

    }

    public static void main (String[] args){

        Labels gui = new Labels();
    }
}
