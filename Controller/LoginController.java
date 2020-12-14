package MVC.com.Controller;

import MVC.com.Model.LoginModel;

public class LoginController {
    public static boolean isValidLogin(String username, String password){
        LoginModel loginmodel = new LoginModel(username, password);
        return loginmodel.isValidUser();
    }
}
