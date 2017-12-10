package org.polytechtours.javaperformance.tp.paintingants;

public class myColor {
    public int color;

    public myColor(int r, int g, int b){
        color = (r<<(2*8)) + (g<<8) + b;
    }

    public void setRed(int red){
        color -= (this.getRed()<<(2*8));
        color += (red<<(2*8));
    }
    public void setGreen(int green){
        color -= (this.getGreen()<<8);
        color += (green<<8);
    }
    public void setBlue(int blue){
        color -= this.getBlue();
        color += blue;
    }
    public int getRed(){
        return color>>(2*8);
    }
    public int getGreen(){
        return (color>>8)%256;
    }
    public int getBlue(){
        return color%256;
    }

}
