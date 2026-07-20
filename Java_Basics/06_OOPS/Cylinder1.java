class Cylinder{

    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI * radius *radius;
    }

    public double totalSurfaceArea(){
        return 2 * Math.PI *radius * (height + radius);
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }


}




class Cylinder1{
    public static void main(String args[]) {
        Cylinder cl1 = new Cylinder();

        cl1.radius = 5;
        cl1.height = 10;

        System.out.println("Lid Area of Cylinder : "+cl1.lidArea());
        System.out.println("Total Surface Area : "+cl1.totalSurfaceArea());
        System.out.println("Volume : "+cl1.volume());       
    }
}