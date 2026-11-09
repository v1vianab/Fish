import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;
import java.util.Random;

public class Aquarium {
    static Random rand = new Random(10);
    // setPosition method
    static void setPosition(double x, double y, PainterAPI f) {
        f.liftPen();
        f.moveTo(x, y);
        f.lowerPen();
    }
    // Drawcircles method for fish
    static void drawCircle(Color color, double x, double y, double radius, PainterAPI f) {
        f.setPenColor(Color.BLACK);
        f.startFill(color);
        setPosition(x, y - radius, f);
        f.circle(radius);
        f.finishFill();
    }
    // Drawrectangles method for seaweed and sign elements
    static void drawRectangle(double x, double y, PainterAPI f, Color color, double width, double height) {
        f.setPenColor(Color.BLACK);
        f.startFill(color);
        setPosition(x, y, f);
        f.forward(width);
        f.turnRight(90);
        f.forward(height);
        f.turnRight(90);
        f.forward(width);
        f.turnRight(90);
        f.forward(height);
        f.turnRight(90);
        f.finishFill();
    }
    // Drawtriangles method for fins and tails
    static void drawTriangle(double x, double y, double size, Color color, PainterAPI f, double angle) {
        f.turnRight(angle);
        f.setPenColor(Color.BLACK);
        f.startFill(color);
        setPosition(x, y, f);
        for (int i = 0; i < 3; i++) {
            f.forward(size);
            f.turnRight(120);
        }
        f.finishFill();
        f.turnRight(360 - angle);
    }
    //draweyes method for fish :p
    static void drawEyes(double x, double y, PainterAPI f) {
        drawCircle(Color.BLACK, x, y, 5, f);
        drawCircle(Color.BLACK, x + 15, y, 5, f);
    }
    //DrawPuffer method
    static void drawPuffer(Color color, double x, double y, double radius, PainterAPI f) {
        //tail
        drawTriangle(x - radius - 30, y - 12, 30, color, f, 0);
        //body
        drawCircle(color, x, y, radius, f);
        //eyes
        drawEyes(x + 5, y + 15, f);
        //fin
        drawTriangle(x + 5, y + radius - 70, 25, color, f, 180);
    }
    // DrawClown method
    static void drawClown(Color color, double x, double y, double radius, PainterAPI f) {
        //tail
        drawTriangle(x - radius - 22, y - 8, 25, color, f, 0);
        //body
        drawCircle(color, x, y, radius, f);
        //eyes
        drawEyes(x + 3, y + 10, f);
        //fin
        drawTriangle(x + 5, y - radius + 8, 20, color, f, 180);
    }
    // Draw starfish using loop
    static void drawStar(double x, double y, double size, Color color, PainterAPI f) {
        f.setPenColor(color);
        f.startFill(color);
        setPosition(x, y, f);
        for (int i = 0; i < 5; i++) {
            f.forward(size);
            f.turnRight(144);
        }
        f.finishFill();
        drawEyes(x + 25, y - 5, f);
    }
    // Drawbubbles method ( calls random later)
    static void drawBubble(double x, double y, double radius, PainterAPI f) {
        drawCircle(Color.WHITE, x, y, radius, f);
    }
    // Draw groups of bubbles
    static void drawBubbles(double x, double y, PainterAPI f) {
        drawBubble(x, y, 8, f);
        drawBubble(x + 20, y + 20, 5, f);
        drawBubble(x - 15, y + 35, 6, f);
        drawBubble(x + 25, y + 50, 4, f);
    }
    // Drawseaweed
    static void drawSeaweed(Color color, double x, double y, PainterAPI f) {
        drawRectangle(x, y + 100, f, color, 8, 100);
        drawRectangle(x + 15, y + 130, f, color, 8, 130);
        drawRectangle(x + 30, y + 80, f, color, 8, 80);
    }
    // Drawpebbles
    static void drawPebbles(Color color, PainterAPI f) {
        for (int i = 0; i < 45; i++) {
            double x = -390 + rand.nextInt(780);
            double y = -275 + rand.nextInt(15);
            double radius = 2 + rand.nextInt(4);

            drawCircle(color, x, y, radius, f);
        }
    }
    //draw sign
    static void drawSign(Color color, double x, double y, PainterAPI f) {
    drawRectangle(x, y, f, color, 175, 85);
    drawRectangle(x + 25, y - 85, f, new Color(120, 75, 40), 8, 130);
    drawRectangle(x + 135, y - 85, f, new Color(120, 75, 40), 8, 130);
    }

    public static void main(String[] args) {

        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");

        PainterAPI f = canvas.getPainter();

        f.setSpeed(1);

        canvas.setBackgroundColor(new Color(70, 210, 230));

        drawRectangle(-400, -255, f, new Color(220, 190, 145), 800, 45);

        drawSeaweed(Color.GREEN, -370, -255, f);
        drawSeaweed(Color.GREEN, 315, -255, f);

        drawPebbles(Color.GRAY, f);

        drawPuffer(Color.ORANGE, -200, 130, 45, f);
        drawPuffer(Color.YELLOW, 190, -100, 45, f);

        drawClown(Color.ORANGE, 65, 155, 25, f);
        drawClown(Color.ORANGE, 30, 15, 23, f);

        drawStar(-325, -185, 65, Color.PINK, f);
        drawStar(320, 205, 75, Color.ORANGE, f);

        drawBubbles(-270, 170, f);
        drawBubbles(230, 160, f);
        drawBubbles(70, 20, f);
        drawBubbles(-350, -100, f);

        drawSign(new Color(210, 175, 130), -235, -45, f);
    }
}