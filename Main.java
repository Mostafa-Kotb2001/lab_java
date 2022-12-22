package com.company;

class circle {
    private double redius ;
    private String color ;
    public void setRedius(double x){
        this.redius = x ;
    }
    public double getRedius(){
        return redius ;
    }
    public void setColor( String y){
        this.color = y ;
    }
    public String getColor(){
        return color ;
    }
    public double area () {
        return  3.14 * getRedius() * getRedius();
    }

}


class cylider extends circle{
    private double height ;
    public void setHeight(double y){
        this.height = y ;
    }
    public double getHeight(){
        return height ;
    }

    @Override
    public double area() {
      return  super.area() * getHeight();
    }
}

public class Main {

    public static void main(String[] args) {
        cylider myobj = new cylider() ;
        myobj.setRedius(5);
        myobj.setHeight(10);
        System.out.println(" area = " + myobj.area())  ;

    }
}
