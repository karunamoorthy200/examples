package org.example.designpatterns.behavioural.chainofresponsibility;

public class Client {


    public static void main(String[] args) {
        DataBase db = new DataBase();
        LoginService ls = new LoginService(new UserExistsHandler(db).setNext(new ValidUserHadler(db)));
        System.out.println(ls.validateUser("karuna", "gracy"));

    }
}
