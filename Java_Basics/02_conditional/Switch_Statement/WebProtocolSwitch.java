import java.util.Scanner;

class WebProtocolSwitch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String web = in.nextLine();

        String protocol = web.substring(web.lastIndexOf(".")+1);

        switch(protocol){
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organization");
                break;
            case "net":
                System.out.println("Network");
                break;
            case "gov":
                System.out.println("Government");
                break;
            default:
                System.out.println("Invlaid");

        }

    }
}