package indra.application;

import indra.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
      connectDatabase("Indra",null);
        System.out.println("Sukses");

    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
