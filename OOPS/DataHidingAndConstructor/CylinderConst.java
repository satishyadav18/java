class CylinderTest{
    private double radius;
    private double height;

    // constructors
    public CylinderTest(){
        setRadius(0);
        setHeight(0);
    }

    public CylinderTest(double r){
        setRadius(r);
        setHeight(1);
    }

    public CylinderTest(double r, double h){
        setRadius(r);
        setHeight(h);
    }

    //methods
    public double getRadius(){
        return radius;
    }
    
    public double getHeight(){
        return height;
    }

     public void setRadius(double r){
        if(r >= 0){
            radius = r;
        }
        else{
            radius = 0;
        }
    }

    public void setHeight(double h){
        if(h >= 0){
            height = h;
        }
        else{
            height = 0;
        }
    }

    public void setDimension(double r, double h){
        if(r >= 0){
            radius = r;
        }
        else{
            radius = 0;
        }
        
        
        if(h >= 0){
            height = h;
        }
        else{
            height = 0;
        }
    }

    public double circumference(){
        return 2 * Math.PI * getRadius();
    }

    public double lidArea(){
        return Math.PI * getRadius() * getRadius();
    }

    public double totalSurfArea(){
        return 2 * lidArea() + circumference() * getHeight();
    }

    public double volume(){
        return lidArea() * getHeight();
    }

}


class CylinderConst{
    public static void main(String[] args){
        CylinderTest c = new CylinderTest(3, 7);

        System.out.println("Circumference: "+c.circumference());
        System.out.println("Lid Area is: "+c.lidArea());
        System.out.println("Total Surafce Area: "+c.totalSurfArea());
        System.out.println("Volume: "+c.volume());
    }
}