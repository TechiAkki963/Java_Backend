class Email{

    public static void main(String[] args) {
        
        String str = "programmer@gmail.com";
        int i = str.indexOf('@');
        System.out.println(i);
        String username = str.substring(0,i);
        System.out.println(username);
        String domain =  str.substring(i+1, str.length());
        System.out.println(domain);
        
        int j = domain.indexOf('.');
        String webname = domain.substring(0,j);
        System.out.println(webname);
        System.out.println(webname.equals("gmail"));

    }


}