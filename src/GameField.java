public class GameField extends JFrame {
    private final int SIZE=400;
    private final int DOT_SIZE=20;
    private final int ALL_DOTS=900;
    private Image dot;
    private Image pear;
    private int pearX;
    private int pearY;
    private int []x=new int [ALL_DOTS];
    private int []y=new int [ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left=false;
    private boolean right=true;
    private boolean up=false;
    private boolean down=true;
    public GameField() {
        setBackground(Color.Red);
        loadImages();
    }
    public void loadImages(){
        ImageIcon lid=new ImageIcon("pear.png");
        dotx=lidgetImage();
    }
}
