
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//Created by: Carlos Natanauan || Computer Programming 2 Task Performance

public class Game extends JFrame implements ActionListener {

    JButton b1, b2, b3;
    ImageIcon icon1, icon2, icon3;

    String menuBGpath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\menuBg.jpg";
    String icon1path = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\smileIcon.png";
    String icon2path = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\flyingIcon.png";
    String icon3path = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\HelloIcon.png";

    Game() {

        ImageIcon background = new ImageIcon(menuBGpath);
        Image img = background.getImage();
        Image temp = img.getScaledInstance(487, 464, Image.SCALE_SMOOTH);
        background = new ImageIcon(temp);
        JLabel back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, 487, 464);

        icon1 = new ImageIcon(icon1path);
        icon2 = new ImageIcon(icon2path);
        icon3 = new ImageIcon(icon3path);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Doraemon's Land");
        this.setLocationRelativeTo(null);

        b1 = new JButton();
        b1.setBounds(130, 80, 230, 95);
        b1.addActionListener(this);
        b1.setText("Doraemon's Emotions");
        b1.setFocusable(false);
        b1.setIcon(icon1);
        b1.setHorizontalTextPosition(JButton.CENTER);
        b1.setVerticalTextPosition(JButton.BOTTOM);
        b1.setIconTextGap(-13);
        b1.setForeground(Color.DARK_GRAY);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setBorder(BorderFactory.createEtchedBorder());
        b1.setFont(new Font("Comic Sans", Font.BOLD, 18));

        b2 = new JButton();
        b2.setBounds(130, 200, 230, 95);
        b2.addActionListener(this);
        b2.setText("Let Doraemon Fly");
        b2.setFocusable(false);
        b2.setIcon(icon2);
        b2.setHorizontalTextPosition(JButton.CENTER);
        b2.setVerticalTextPosition(JButton.BOTTOM);
        b2.setIconTextGap(-5);
        b2.setForeground(Color.DARK_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setBorder(BorderFactory.createEtchedBorder());
        b2.setFont(new Font("Comic Sans", Font.BOLD, 18));

        b3 = new JButton();
        b3.setBounds(130, 320, 230, 95);
        b3.addActionListener(this);
        b3.setText("Say Hello");
        b3.setFocusable(false);
        b3.setIcon(icon3);
        b3.setHorizontalTextPosition(JButton.CENTER);
        b3.setVerticalTextPosition(JButton.BOTTOM);
        b3.setIconTextGap(-3);
        b3.setForeground(Color.DARK_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setBorder(BorderFactory.createEtchedBorder());
        b3.setFont(new Font("Comic Sans", Font.BOLD, 18));

        add(b1);
        add(b2);
        add(b3);
        this.add(back);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            new DoraemonEmotions();
            this.dispose();
        } else if (e.getSource() == b2) {
            new DoraemonFlying();
            this.dispose();
        } else if (e.getSource() == b3) {
            new DoraemonGreet();
            this.dispose();
        }
    }

    public static void main(String[] args) {
        new Game();
    }

}

class DoraemonEmotions extends JFrame implements MouseListener, ActionListener {

    JLabel labelFace;
    JButton HomeBt;
    ImageIcon smile, mad, angry, cry, home;

    String smilePath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\smile.png";
    String madPath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\mad.png";
    String angryPath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\angry.png";
    String cryPath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\cry.png";
    String bg = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\sky.jpg";
    String homeBTpath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\home.png";

    DoraemonEmotions() {

        ImageIcon background = new ImageIcon(bg);
        Image img = background.getImage();
        Image temp = img.getScaledInstance(487, 464, Image.SCALE_SMOOTH);
        background = new ImageIcon(temp);
        JLabel back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, 487, 464);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        labelFace = new JLabel();
        labelFace.addMouseListener(this);

        smile = new ImageIcon(smilePath);
        mad = new ImageIcon(madPath);
        angry = new ImageIcon(angryPath);
        cry = new ImageIcon(cryPath);

        home = new ImageIcon(homeBTpath);

        HomeBt = new JButton();
        HomeBt.setIcon(home);
        HomeBt.setBorder(BorderFactory.createEmptyBorder());
        HomeBt.setContentAreaFilled(false);
        HomeBt.addActionListener(this);
        HomeBt.setBounds(0, 0, 80, 80);

        labelFace.setIcon(smile);//default face
        this.add(HomeBt);
        this.add(labelFace);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.add(back);

        this.setLocationRelativeTo(null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        labelFace.setIcon(angry);
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        labelFace.setIcon(cry);
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        labelFace.setIcon(angry);
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        labelFace.setIcon(mad);
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        labelFace.setIcon(smile);
        System.out.println("Mouse Exited");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == HomeBt) {
            new Game();
            this.dispose();
        }
    }

}

class DoraemonFlying extends JFrame implements KeyListener, ActionListener {

    JLabel labelFly;
    JButton HomeBt;
    ImageIcon doraemonIcon, home;
    String dPath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\doraemon-flying.png";
    String backG = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\sky1.png";
    String homeBTpath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\home.png";

    DoraemonFlying() {

        ImageIcon background = new ImageIcon(backG);
        Image img = background.getImage();
        Image temp = img.getScaledInstance(487, 464, Image.SCALE_SMOOTH);
        background = new ImageIcon(temp);
        JLabel back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, 487, 464);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        doraemonIcon = new ImageIcon(dPath);

        labelFly = new JLabel();
        labelFly.setBounds(0, 0, 150, 200);
        labelFly.setIcon(doraemonIcon);

        home = new ImageIcon(homeBTpath);

        HomeBt = new JButton();
        HomeBt.setIcon(home);
        HomeBt.setBorder(BorderFactory.createEmptyBorder());
        HomeBt.setContentAreaFilled(false);
        HomeBt.addActionListener(this);
        HomeBt.setBounds(400, 0, 80, 80);
        HomeBt.setFocusable(false);
        this.add(HomeBt);
        this.add(labelFly);

        this.add(back);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                labelFly.setLocation(labelFly.getX() - 20, labelFly.getY());
                break;
            case 'w':
                labelFly.setLocation(labelFly.getX(), labelFly.getY() - 20);
                break;
            case 'd':
                labelFly.setLocation(labelFly.getX() + 20, labelFly.getY());
                break;
            case 's':
                labelFly.setLocation(labelFly.getX(), labelFly.getY() + 20);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                labelFly.setLocation(labelFly.getX() - 20, labelFly.getY());
                break;
            case 38:
                labelFly.setLocation(labelFly.getX(), labelFly.getY() - 20);
                break;
            case 39:
                labelFly.setLocation(labelFly.getX() + 20, labelFly.getY());
                break;
            case 40:
                labelFly.setLocation(labelFly.getX(), labelFly.getY() + 20);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You release key char: " + e.getKeyChar());
        System.out.println("You release key code: " + e.getKeyCode());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == HomeBt) {
            new Game();
            this.dispose();
        }
    }

}

class DoraemonGreet extends JFrame implements ActionListener {

    JButton submit, HomeBt;
    JTextField nameF;
    JLabel textName, selectGadget;
    JComboBox gadget;
    JCheckBox loveOrNot;

    ImageIcon yes, no, home;
    String xPath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\x.png";
    String checkPath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\check.png";
    String backG = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\try1.jpg";
    String homeBTpath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\home.png";

    DoraemonGreet() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        ImageIcon background = new ImageIcon(backG);
        Image img = background.getImage();
        Image temp = img.getScaledInstance(487, 464, Image.SCALE_SMOOTH);
        background = new ImageIcon(temp);
        JLabel back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, 487, 464);

        nameF = new JTextField();
        nameF.setBounds(100, 50, 300, 50);
        nameF.setFont(new Font("Consolas", Font.BOLD, 45));
        nameF.setForeground(Color.BLUE);
        nameF.setBackground(Color.GRAY);
        nameF.setCaretColor(Color.BLUE);

        textName = new JLabel("Your Name?");
        textName.setBounds(130, 10, 250, 50);
        textName.setFont(new Font("Consolas", Font.BOLD, 45));
        textName.setForeground(Color.BLACK);

        selectGadget = new JLabel("Favorite Gadget?");
        selectGadget.setBounds(50, 120, 500, 50);
        selectGadget.setFont(new Font("Consolas", Font.BOLD, 45));
        selectGadget.setForeground(Color.BLACK);

        String[] dg = {"Take-copter", "Anywhere Door", "4D Pocket"};
        gadget = new JComboBox(dg);
        gadget.addActionListener(this);
        gadget.setBounds(50, 170, 400, 50);
        gadget.setFont(new Font("Consolas", Font.BOLD, 45));
        gadget.setForeground(Color.BLUE);
        gadget.setBackground(Color.GRAY);
        gadget.setSelectedIndex(0);

        no = new ImageIcon(xPath);
        yes = new ImageIcon(checkPath);
        loveOrNot = new JCheckBox();
        loveOrNot.setText("I love Doraemon");
        loveOrNot.setBounds(50, 270, 400, 71);
        loveOrNot.setFocusable(false);
        loveOrNot.setFont(new Font("Consolas", Font.BOLD, 37));
        loveOrNot.setForeground(Color.BLACK);
        loveOrNot.setIcon(no);
        loveOrNot.setSelectedIcon(yes);
        loveOrNot.setBackground(Color.GRAY);

        submit = new JButton("SUBMIT");
        submit.setBounds(150, 370, 200, 50);
        submit.addActionListener(this);
        submit.setFocusable(false);
        submit.setHorizontalTextPosition(JButton.CENTER);
        submit.setVerticalTextPosition(JButton.BOTTOM);
        submit.setForeground(Color.BLUE);
        submit.setBackground(Color.GRAY);
        submit.setBorder(BorderFactory.createEtchedBorder());
        submit.setFont(new Font("Comic Sans", Font.BOLD, 35));

        home = new ImageIcon(homeBTpath);

        HomeBt = new JButton();
        HomeBt.setIcon(home);
        HomeBt.setBorder(BorderFactory.createEmptyBorder());
        HomeBt.setContentAreaFilled(false);
        HomeBt.addActionListener(this);
        HomeBt.setBounds(0, 0, 80, 80);
        HomeBt.setFocusable(false);

        this.setResizable(false);
        this.add(HomeBt);
        this.add(textName);
        this.add(nameF);
        this.add(selectGadget);
        this.add(gadget);

        this.add(loveOrNot);

        this.add(submit);
        this.add(back);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            new display();
            this.dispose();
        } else if (e.getSource() == HomeBt) {
            new Game();
            this.dispose();
        }
    }

    class display extends JFrame implements ActionListener {

        JLabel label;
        String backG = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\dialogBG.png";
        String doorPath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\door.png";
        String copterPath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\copter.png";
        String pocketPath = "C:\\Users\\Benedict\\Pictures\\01Doraemon\\pocket.png";
        JLabel name, favorite, love;

        JLabel gift;
        ImageIcon door, copter, pocket;

        display() {

            ImageIcon background = new ImageIcon(backG);
            Image img = background.getImage();
            Image temp = img.getScaledInstance(487, 464, Image.SCALE_SMOOTH);
            background = new ImageIcon(temp);
            JLabel back = new JLabel(background);
            back.setLayout(null);
            back.setBounds(0, 0, 487, 464);

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500, 500);
            this.setLocationRelativeTo(null);
            this.setLayout(null);

            name = new JLabel();
            name.setBounds(30, 75, 500, 50);
            name.setFont(new Font("Consolas", Font.BOLD, 35));
            name.setForeground(Color.BLUE);
            name.setText("Hi, " + nameF.getText());

            love = new JLabel();
            love.setBounds(33, 107, 500, 100);
            love.setFont(new Font("Consolas", Font.BOLD, 35));
            love.setForeground(Color.BLUE);
            if (loveOrNot.isSelected()) {
                love.setText("<html> Thank you for <br>  loving me</html>");
            } else {
                love.setText("<html>I hope you'll <br>   love me someday</html>");
            }

            favorite = new JLabel();
            favorite.setBounds(35, 232, 500, 100);
            favorite.setFont(new Font("Consolas", Font.BOLD, 20));
            favorite.setForeground(Color.BLUE);
            favorite.setText("<html>Here's my gift <br> " + "A " + gadget.getSelectedItem() + "!</html>");

            door = new ImageIcon(doorPath);
            copter = new ImageIcon(copterPath);
            pocket = new ImageIcon(pocketPath);

            gift = new JLabel();
            gift.setBounds(35, 320, 150, 130);

            if (gadget.getSelectedItem().equals("Anywhere Door")) {
                gift.setIcon(door);
            } else if (gadget.getSelectedItem().equals("4D Pocket")) {
                gift.setIcon(pocket);
            } else if (gadget.getSelectedItem().equals("Take-copter")) {
                gift.setIcon(copter);
            }

            home = new ImageIcon(homeBTpath);

            HomeBt = new JButton();
            HomeBt.setIcon(home);
            HomeBt.setBorder(BorderFactory.createEmptyBorder());
            HomeBt.setContentAreaFilled(false);
            HomeBt.addActionListener(this);
            HomeBt.setBounds(400, 0, 80, 80);
            HomeBt.setFocusable(false);

            this.setResizable(false);
            this.add(HomeBt);
            this.setTitle("Display");
            this.add(name);
            this.add(love);
            this.add(favorite);
            this.add(gift);
            this.add(back);
            this.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == HomeBt) {
                new Game();
                this.dispose();
            }
        }

    }

}
