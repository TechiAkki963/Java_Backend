class AreaOverloading{

    static double area (double x, double y){
        double area;
        area = x * y;
        return area;
    }

    static double area (double r){
        double area;
        area = Math.PI * r *r;
        return area;
    }

    static double area(double a, double b, double h){
        double area;
        area = ((a+b)*h )/ 2;
        return area;
    }

    public static void main(String[] args) {
        System.out.println("Area: "+ area(5,6,7));
    }
}