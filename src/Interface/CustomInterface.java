package Interface;

import javax.swing.*;
import java.awt.*;

public class CustomInterface extends JFrame {
    JPanel pnl = new JPanel();

    ClassLoader ldr = this.getClass().getClassLoader() ;
    java.net.URL tickURL = ldr.getResource("Interface/tick.jpg") ;
    java.net.URL crossURL = ldr.getResource("Interface/NoBtn.png") ;

    ImageIcon tick = new ImageIcon( tickURL) ;
    ImageIcon cross = new ImageIcon( crossURL) ;

    JButton btn = new JButton( "Нажми меня" ) ;
    JButton tickBtn = new JButton( tick ) ;
    JButton crossBtn = new JButton( "СТОП" , cross ) ;


    JLabel lbl1 = new JLabel( "Пользовательский задний фон" ) ;
    JLabel lbl2 = new JLabel( "Пользовательский передний фон" ) ;
    JLabel lbl3 = new JLabel( "Пользовательский шрифт" ) ;

    Color customColor = new Color (255, 0, 0);
    Font customFont = new Font("Serif", Font.PLAIN, 32);

    Container contentPane = getContentPane() ;
    JPanel grid = new JPanel( new GridLayout( 2 , 2 ) ) ;


    public CustomInterface(){
        super ("Window Swing");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add (pnl);
        setVisible(true);
        pnl.add(btn);
        pnl.add(tickBtn);
        pnl.add(crossBtn);

        lbl1.setOpaque( true ) ;
        lbl1.setBackground( Color.YELLOW ) ;

        lbl2.setForeground(customColor);

        lbl3.setFont(customFont);
        pnl.add( lbl1 ) ;
        pnl.add( lbl2 ) ;
        pnl.add( lbl3 ) ;

        pnl.add( new JButton( "Да" ) ) ;
        pnl.add( new JButton( "Нет" ) ) ;
        pnl.add( new JButton( "Отмена" ) ) ;
        grid.add( new JButton( "1" ) ) ;
        grid.add( new JButton( "2" ) ) ;
        grid.add( new JButton( "3" ) ) ;
        grid.add( new JButton( "4" ) ) ;

        contentPane.add("North", pnl);
        contentPane.add("Center",grid);
        contentPane.add("West", new JButton("West"));

    }

    public static void main (String[] args){

        CustomInterface gui = new CustomInterface();
    }
}
