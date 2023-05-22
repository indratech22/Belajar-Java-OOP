package indra.application;

import indra.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("indra", "rahasia");

        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("indra"));
        System.out.println(new LoginRequest("indra","rahasia"));
    }
}
