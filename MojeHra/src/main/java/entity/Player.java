package entity;

import main.GameLogic;
import main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Entity{

    GameLogic gp;
    KeyHandler keyH;

    public Player(GameLogic gp, KeyHandler keyH){

        this.gp = gp;
        this.keyH = keyH;

        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues() {

        x = 100;
        y = 100;
        speed = 6; //rychlost hráče
        direction = "left";
    }
    public void getPlayerImage() {

        try{
            //přidej animace na diagonální směry a ať má každž walk cycle 3 framy

            up1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/up.png"));
            up2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/up.png"));
            up3 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/up.png"));
            //_________________________
            upRight1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/upright.png"));
            upRight2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/upright.png"));
            upRight3 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/upright.png"));
            //_________________________
            down1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/down.png"));
            down2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/down.png"));
            //down3 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //_________________________
            //downLeft1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //downLeft2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //downLeft3 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //_________________________
            left1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/left.png"));
            left2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/left.png"));
            //left3 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //_________________________
            //rightDown1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //rightDown2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //rightDown3 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //_________________________
            right1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/right.png"));
            right2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream("player/right.png"));
            //right3 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //_________________________
            //upLeft1 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //upLeft2 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //upLeft3 = ImageIO.read(getClass().getClassLoader().getResourceAsStream(""));
            //_________________________

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void update() {

        if(keyH.upPressed ==true || keyH.upRightPressed == true || keyH.downPressed == true || keyH.downLeftPressed == true || keyH.leftPressed == true ||
                keyH.rigthDownPressed == true || keyH.rightPressed == true || keyH.upLeftPressed == true ){

        //_____________________________
            if(keyH.upPressed == true) {
            direction = "up";
            y -= speed;
        }

        if (keyH.upRightPressed == true) {
            direction = "upRight";
            y -= speed;
            x += speed;

        }

       //_____________________________

        if (keyH.downPressed == true) {
            direction = "down";
            y += speed;
        }

        if (keyH.downLeftPressed == true) {
            direction = "downleft";
            y += speed;
        }

        //_____________________________


        if (keyH.leftPressed == true) {
            direction = "left";
            x -= speed;
        }

        if (keyH.rigthDownPressed == true) {
            direction = "rightdown";
            x -= speed;
        }
       //________________________________

        if (keyH.rightPressed == true) {
            direction = "right";
            x += speed;

        }

        if (keyH.upLeftPressed == true) {
            direction = "upleft";
            x += speed;

        }
        //________________________________
        // tady jsem přidal 1 if ale změnil jsem v něm hodnoty o 1 vyšší
            spriteCounter++;
        //sprite counter = za kolik framů se změní player image
            if(spriteCounter > 12) {
                if(spriteNum == 1) {
                    spriteNum = 2;
                    if(spriteNum == 2){
                    spriteNum = 3;
                }
                }
                //tady jsi přídal 1 if a změnil jsi v tom else is spriteNum ze 2 na 3
                if(spriteNum == 3){
                    spriteNum =3;
                }
                else if(spriteNum == 2){
                    spriteNum =1;
                }
                spriteCounter = 0;
            }


        }


    }
    public void draw(Graphics2D g2) {
       // g2.setColor(Color.white);
        //g2.fillRect(x, y, gp.tileSize, gp.tileSize);

        //tady to uprav tak aby tam byly ty framy navíc a zároveň ty směry navíc
        BufferedImage image = null;

        switch (direction){
            case "up":
                if(spriteNum == 1){
                    image = up1;
                }
                if(spriteNum == 2){
                    image = up2;
                }
                if(spriteNum == 3){
                    image = up3;
                }
                break;
        //_________________________
            case "upRight":
                if(spriteNum == 1){
                    image = upRight1;
                }
                if(spriteNum == 2){
                    image = upRight2;
                }
                if(spriteNum == 3){
                    image = upRight3;
                }
                break;
        //_________________________

            case "down":
                if(spriteNum == 1){
                    image = down1;
                }
                if(spriteNum == 2){
                    image = down2;
                }
                if(spriteNum == 3){
                    image = down1;
                }
                break;
        //_________________________

            //case "downleft":
                //if(spriteNum == 1){
                    //image = downleft1;
                //}
                //if(spriteNum == 2){
                    //image = downleft2;
                //}
                //if(spriteNum == 3){
                    //image = downleft3;
                //}
                //break;

        //_________________________
            case "left":
                if(spriteNum == 1){
                    image = left1;
                }
                if(spriteNum == 2){
                    image = left2;
                }
                if(spriteNum == 3){
                    image = left1;
                }
                break;
        //_________________________
            //case "rightdown":
                //if(spriteNum == 1){
                    //image = rightdown1;
                //}
                //if(spriteNum == 2){
                    //image = rightdown2;
                //}
                //if(spriteNum == 3){
                    //image = rightdown3;
                //}
                //break;

        //_________________________
            case "right":
                if(spriteNum == 1){
                    image = right1;
                }
                if(spriteNum == 2){
                    image = right2;
                }
                if(spriteNum == 3){
                    image = right1;
                }
                break;
        //_________________________
            //case "upleft":
                //if(spriteNum == 1){
                    //image = upleft1;
                //}
                //if(spriteNum == 2){
                    //image = upleft2;
                //}
                //if(spriteNum == 3){
                    //image = upleft3;
                //}
                //break;




        //_________________________
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }
}
