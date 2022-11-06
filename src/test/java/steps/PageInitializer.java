package steps;

import pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;


    public static void initializeObjects(){
        login=new LoginPage();
    }
}
