package tile;

import main.GameLogic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class TileManager {

    GameLogic gp;
    Tile[] tile;

    public TileManager(GameLogic gp){

        this.gp = gp;

        tile = new Tile[10];

        getTileImage();
    }
    public void getTileImage(){

        try {

            tile[0] = new Tile();
            tile[0].image =  ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/002.png"));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/019.png"));

            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("tiles/032.png"));


        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void draw(Graphics2D g2){

        g2.drawImage(tile[0].image,0,0, gp.tileSize, gp.tileSize,null);
    }

}
