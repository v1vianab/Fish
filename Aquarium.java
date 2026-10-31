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
    public void drawStarFish (Color Starcolor, double xPosition, double yPosition, PainterAPI f) {
        //Calls drawStar
        //calls moveTo
        //calls drawEyes
}
// Testing headers at Lab 118A
/* Draws pufferFish ast specified point (x, y)
@param PainerAPI
@param pufferColor color of the fish
@param xPosition
@param yPosition
@param radius radius of fish 
    public void drawPuffer (Color pufferColor, double xPosition, double yPostion, PainterAPI f, radius) {
        calls drawCircle
        calls move to
        calls drawEyes
        calls fins
    }
 */ 
/* Draws clownfish ast specified point (x, y)
@param PainterAPI
@param clownColor color of fish
@param xPosition
@param yPosition
@param radius, radius of fish
    public void drawClown (Color color, double xPosition, double yPosition, PainterAPI f, radius) {
        calls drawCircle
        calls move to
        calls drawEyes
        calls tail 
        calls fin
    }
 */
/*Draws big sign that says "didnt brush!" 
@param PainterAPI
@param signColor color of sign
@param xPosition
@param yPosition 
    public void drawSign (Color, color, double xPosition, double yPosition) {
        calls drawRectangle
        calls moveTo
        calls drawStand
        calls string 
        } 
*/
/*Draws bubbles at random points
@param */
/*Drawsaquarium pebbles
 */
/*Draws seaweed
 */