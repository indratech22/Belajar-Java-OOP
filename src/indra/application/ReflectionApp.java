package indra.application;

import indra.data.CreateUserRequest;
import util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setPassword("rahasia");
        request.setUsername("Indra");

        ValidationUtil.validationReflection(request);
    }
}
