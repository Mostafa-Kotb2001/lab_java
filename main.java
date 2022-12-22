 class product{
    private double price ;
    public void setPrice(double newprice){
        this.price = newprice ;
    }
    public double getPrice(){
        return price ;
    }
}


class book extends product{
     void name (String name){
         System.out.println("name of book :" + name);
    } ;

    @Override
    public double getPrice() {
        return super.getPrice() * 0.5;
    }
}


class children extends book {
     void outher (String outher){
        System.out.println("name of outher :" + outher);
    } ;
    @Override
    public double getPrice() {
        return super.getPrice() * 0.3;
    }
}

interface Cartoon{
    public double price(double x) ;
}
class cartoon1 implements Cartoon{
    @Override
    public double price(double x) {
        return x * 0.8 ;
    }
}


public class main {
    public static void main (String[]args){

        double p[] ;
        p = new double[3] ;

        book x = new book() ;
        children y = new children() ;
        cartoon1 z = new cartoon1() ;
        x.setPrice(100);

        p[0] = x.getPrice(); ;
        y.setPrice(1200);
        p[1] = y.getPrice() ;
        p[2] = z.price(1000);
        for ( int i = 0 ; i<3 ; i++) System.out.println("price =" + p[i]);

    }
}
