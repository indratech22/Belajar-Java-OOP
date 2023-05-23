package indra.application;

import indra.data.LoginRequest;
import indra.error.ValidationException;
import util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, "Rahasia");

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        }catch (ValidationException | NullPointerException exception){
            System.out.println("data tidak valid: " + exception.getMessage());
        }finally{
            System.out.println("Selalu di eksekusi");
        }


        LoginRequest loginRequest1 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest1);


    }
}
