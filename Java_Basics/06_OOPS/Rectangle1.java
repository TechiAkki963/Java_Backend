class Rectangle{

    public double length;
    public double breadth;

    public double area(){
        return length * breadth;
    }

    public double perimeter(){
        return 2*(length + breadth);
    }

    public boolean isSqaure(){
        return length == breadth;
    }

}


class Rectangle1{

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        rec.length = 10;
        rec.breadth = 7;

        System.out.println("Area : "+rec.area());
        System.out.println("Perimeter : "+rec.perimeter());
        System.out.println("Check Square : "+   rec.isSqaure());
        
    }



}