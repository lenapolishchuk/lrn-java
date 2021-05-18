package Interface;

import javax.swing.*;

public class TextFields extends JFrame {
    JPanel pnl = new JPanel();

    JTextField txt1 = new JTextField(38);
    JTextField txt2 = new JTextField("Текст по умолчанию" , 38 );
    JTextArea txtArea = new JTextArea(5, 37);
    JScrollPane pane = new JScrollPane(txtArea);

    String[] toppings = { "Пеперони" , "Грибная" , "С ветчиной" , "Томатная" } ;
    JCheckBox chk1 = new JCheckBox( toppings[0] ) ;
    JCheckBox chk2 = new JCheckBox( toppings[1] , true ) ;
    JCheckBox chk3 = new JCheckBox( toppings[2] ) ;
    JCheckBox chk4 = new JCheckBox( toppings[3] ) ;

    String[] styles = { "В глубокой форме" , "Для гурманов" , "Тонкая" } ;
    JComboBox<String> box1 = new JComboBox<String>( styles ) ;
    JList<String> lst1 = new JList<String>( toppings ) ;

    JRadioButton rad1 = new JRadioButton( "Красное" , true ) ;
    JRadioButton rad2 = new JRadioButton( "Розовое" ) ;
    JRadioButton rad3 = new JRadioButton( "Белое" ) ;

    ButtonGroup wines = new ButtonGroup();



    public TextFields(){
        super ("Window Swing");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add (pnl);
        setVisible(true);

        txtArea.setLineWrap( true ) ;
        txtArea.setWrapStyleWord( true ) ;

        pane.setVerticalScrollBarPolicy ( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ) ;
        pnl.add(txt1);
        pnl.add(txt2);
        pnl.add(pane);

        pnl.add( chk1 ) ;
        pnl.add( chk2 ) ;
        pnl.add( chk3 ) ;
        pnl.add( chk4 ) ;

        box1.setSelectedIndex( 0 ) ;
        pnl.add( box1 ) ;
        pnl.add( lst1 ) ;

        wines.add(rad1);
        wines.add(rad2);
        wines.add(rad3);

        pnl.add(rad1);
        pnl.add(rad2);
        pnl.add(rad3);


    }


    public static void main (String[] args){

        TextFields gui = new TextFields();
    }
}
