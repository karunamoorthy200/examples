package org.example.designpatterns.behavioural.chainofresponsibility;

public class ValidUserHadler extends BaseHandler {

    DataBase db;



    public ValidUserHadler(DataBase db)
    {
        this.db = db;
    }
    @Override
    public boolean handle(String userName, String password) {
        if(db.isUserValid(userName,password))
        {
            System.out.println("user successfully logged in");
            return true;
        }
        return handleNext(userName, password);

    }
}
