
import java.awt.*;
import java.applet.*;

public class SovietUnion extends Applet
{
    public void paint (Graphics g)
    {
        //This is the main flag background component.
        g.setColor(Color.red);
        g.fillRect(0,0,1200,600);
        //This is the star.
        g.setColor(Color.yellow);
       int [] xyellowstar = {84, 94, 100, 106, 116, 109, 116, 100, 84, 92}; 
       int [] yyellowstar = {34, 34, 24, 34, 34, 45, 56, 51, 56, 46};
       g.fillPolygon(xyellowstar,yyellowstar,10);
       g.setColor(Color.red);
       int [] xredstar = {88, 97, 100, 103, 112, 106, 113, 100, 88, 96}; 
       int [] yredstar = {37, 37, 27, 37, 37, 45, 53, 48, 53, 44};
       g.fillPolygon(xredstar, yredstar, 10);
        //This is the sickle blade.
       g.setColor(Color.yellow);
       g.fillOval(50,85,100,100);
       g.setColor(Color.red);
       g.fillOval(52,87,83,83);
       g.setColor(Color.red);
       g.fillOval(7,102,83,83);
         //This is the handle of the sickle.
       g.setColor(Color.yellow);
       g.fillOval(68,171,11,11);
       g.fillOval(61,175,15,15);
       int [] xhandle = {65,63,38,35};
       int [] yhandle = {177,190,210,200};
       g.fillPolygon(xhandle,yhandle,4);
       g.fillOval(25,200,15,15);
        //This is the hammer.
        g.setColor(Color.yellow);
       int [] xbell = {100, 75, 50,65};
       int [] ybell = {110, 110, 135,148};
       g.fillPolygon(xbell,ybell,4);
       int [] xshaft = {75,65,135, 145};
       int [] yshaft = {120,130, 200, 190};
       g.fillPolygon(xshaft,yshaft,4);
    }
}
        
   