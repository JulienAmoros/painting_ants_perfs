package org.polytechtours.javaperformance.tp.paintingants;

public class MyColor {
    public int color=0;

    public MyColor(int r, int g, int b){
        color = (r<<(2*8)) + (g<<8) + b;
    }
    public MyColor(int rgb[]){
    	color=0;
    	setRed(rgb[0]);
    	setGreen(rgb[1]);
    	setBlue(rgb[2]);
    }
    public MyColor(int rgb){
    	color=rgb;
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
    
    public int[] getRGB(){
    	int rgb []= new int [3];
    	rgb[0]=getRed();
    	rgb[1]=getGreen();
    	rgb[2]=getBlue();
    	return rgb;
    }
    
    public int getColor(){
    	return color;
    }

}
