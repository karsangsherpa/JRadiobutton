import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFrame extends JFrame implements ActionListener{
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton momoButton;
MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    pizzaButton = new JRadioButton("Pizza");
    hamburgerButton = new JRadioButton("Hamburger");
    momoButton = new JRadioButton("Momo");

    ButtonGroup group = new ButtonGroup();
    group.add(pizzaButton);
    group.add(hamburgerButton);
    group.add(momoButton);

    pizzaButton.addActionListener(this);
    hamburgerButton.addActionListener(this);
    momoButton.addActionListener(this);

    this.add(pizzaButton);
    this.add(hamburgerButton);
    this.add(momoButton);
    this.pack();
    this.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza");
        }
        else if(e.getSource() == hamburgerButton) {
            System.out.println("You ordered a hamburger");
        }
        else{
            System.out.println("You ordered a momo");
        }
    }

}
