package week4inheri;

public class LoginTestData extends TestData  {
    public void enterUsername(){
        System.out.println("enter username");
    }
    public void enterPassword(){
        System.out.println("enter password");
    }
    public static  void main(String[] args){
        LoginTestData value=new LoginTestData();
        value.navigateToHomePage();
        value.enterUsername();
        value.enterPassword();
        value.enterCredentials();
    }
}
