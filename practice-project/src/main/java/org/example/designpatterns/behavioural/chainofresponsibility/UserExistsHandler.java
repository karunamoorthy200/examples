package org.example.designpatterns.behavioural.chainofresponsibility;

public class UserExistsHandler extends BaseHandler{

    DataBase db;


    public UserExistsHandler(DataBase db)
    {
        this.db = db;
    }

    @Override
    public boolean handle(String userName, String password) {
        if(!db.isUserExists(userName,password))
        {
            System.out.println("user does not exist, please signup");
            return false;
        }
        return handleNext(userName, password);
    }
}
