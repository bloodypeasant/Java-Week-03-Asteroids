import javax.swing.JFrame;

public class View extends JFrame {

  private static final long serialVersionUID = 1L;

  public App app;
  public DisplayPanel display;

  public View(App app) {
    this.app = app;
    display = new DisplayPanel(this);
    add(display);
    pack();
    setTitle("Astroids Game");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
  }

}
