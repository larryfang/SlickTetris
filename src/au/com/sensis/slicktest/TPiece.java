package au.com.sensis.slicktest;

import org.newdawn.slick.Color;

public class TPiece extends Piece {
    
    private static final Color COLOR = new Color(28, 209, 4);
    
    static {
        ROTATIONS = new Rotation[4];
        //Inner arrays are the columns (vertical) - read as rotated by 90 degrees clockwise
        ROTATIONS[0] = new Rotation(new Block[][] {
                {new Block(COLOR), null, null, null},
                {new Block(COLOR), new Block(COLOR), null, null},
                {new Block(COLOR), null, null, null},
                {null, null, null, null},
        }, 2, 3);
        ROTATIONS[1] = new Rotation(new Block[][] {
                {new Block(COLOR), new Block(COLOR), new Block(COLOR), null},
                {null,        new Block(COLOR),        null, null},
                {null, null, null, null},
                {null, null, null, null},
        }, 3, 2);
        ROTATIONS[2] = new Rotation(new Block[][] {
                {null,        new Block(COLOR), null, null},
                {new Block(COLOR),        new Block(COLOR), null, null},
                {null, new Block(COLOR), null , null},
                {null, null, null, null},
        }, 2, 3);
        ROTATIONS[3] = new Rotation(new Block[][] {
                {null, new Block(COLOR), null , null},
                {new Block(COLOR), new Block(COLOR), new Block(COLOR), null},
                {null, null, null, null},
                {null, null, null, null},
        }, 3, 2);

    }
    
    public TPiece(final Coord coord) {
        super(coord);
        
        this.layout = ROTATIONS[0].getLayout();
        this.height = ROTATIONS[0].getHeight();
        this.width = ROTATIONS[0].getWidth();
    }

}
