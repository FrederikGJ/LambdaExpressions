import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame
{
        JButton myButton = new JButton("My Button");
        JButton myButton2 = new JButton("Knipknappen");

        public MyFrame()
        {
                myButton.setBounds(100, 100, 100,100);
                myButton.addActionListener(
                        (e) -> System.out.println("YoU clicKEd a bUtttOn!")
                );
                myButton2.setBounds(100, 200, 100,100);
                myButton2.addActionListener(
                        (e) -> System.out.println("Du trykkede på knipknappen")
                );

                this.add(myButton);
                this.add(myButton2);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setSize(420,420);
                this.setLayout(null);
                this.setVisible(true);

        }
}
