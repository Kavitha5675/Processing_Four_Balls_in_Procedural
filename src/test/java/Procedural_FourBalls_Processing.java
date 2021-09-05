public class Procedural_FourBalls_Processing extends processing.core.PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int DIAMETER = 10;
    int ballonespeed=0;
    int balltwospeed=0;
    int ballthreespeed=0;
    int ballfourspeed=0;

    public static void main(String[] args){
        processing.core.PApplet.main("Procedural_FourBalls_Processing",args);}

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle();

    }

    private void drawCircle() {
        ellipse(ballonespeed,HEIGHT/5, DIAMETER,DIAMETER);
        ballonespeed+=1;
        ellipse(balltwospeed,2*HEIGHT/5, DIAMETER,DIAMETER);
        balltwospeed+=2;
        ellipse(ballthreespeed,3*HEIGHT/5, DIAMETER,DIAMETER);
        ballthreespeed+=3;
        ellipse(ballfourspeed,4*HEIGHT/5, DIAMETER,DIAMETER);
        ballfourspeed+=4;
    }
}
