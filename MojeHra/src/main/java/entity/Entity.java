package entity;

import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class Entity {

    public int x, y;
    public int speed;

    //bufferedimage popisuje obrázek s dostupnýmy daty toho obrázku pouziva se to na ukládání obrázků)
    public BufferedImage up1, up2, up3,upRight1, upRight2, upRight3, down1, down2, down3, downLeft1, getDownLeft2, downleft3,
            left1, left2, left3, rightDown1, rightDown2, rightDown3, right1, right2, right3, upLeft1, upLeft2, upLeft3;
    public String direction;

    public int spriteCounter = 0;
    public int spriteNum = 1;
}
