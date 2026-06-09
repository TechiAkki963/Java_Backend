import java.util.Scanner;
class WebProtocol{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a URL: ");
        String url = in.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));

        if(protocol.equals("http")){
            System.out.println("Hypertext Transfer Protocol");
        }else if (protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }

        String ext = url.substring(url.lastIndexOf(".")+1);

        if(ext.equals("com")){
            System.out.println("Commercial");
        }else if(ext.equals("orgs")){
            System.out.println("Organization");
        }else if(ext.equals("net")){
            System.out.println("Network");
        }

    }


}