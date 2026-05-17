public class IncDec
{
    public static void main(String args[]){

        int a = 5;
        a++;
        System.out.println(a);

        int b =3, c, d=5, e;
        c = b++;
        System.out.println("Value of c : " + c);

        e = ++d;
        System.out.println("Valu of e " + e); 


        int p=5, q=4, r;
        r = 2 * p++ + 3 * ++q;
        System.out.println("Value of r: "+ r);


    }
}