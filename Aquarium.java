import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;

public class Aquarium {
    public static void main(String[] args) {
        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");

        PainterAPI painter = canvas.getPainter();
        painter.setSpeed(10); // Lower number means faster, zero means as fast as possible.
        painter.forward(100);
        painter.turnLeft(40);
     }
}
/* Draws Starfish at specified point (x, y), it may be angled
@param Starcolor th ecolor of the fish
@param PainterAPI
@param xPosition position of top corner of star
@param yPosition position of top corner of star */
    public void drawStarFish (Color Starcolor, double xPosition, double yPosition) {
        //Calls drawStar
        //calls moveTo
        //calls drawEyes
}
// Testing headers at Lab 118A