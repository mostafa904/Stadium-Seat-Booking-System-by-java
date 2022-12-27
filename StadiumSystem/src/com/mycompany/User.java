package com.mycompany;
public class User {

    static int user_id = 0;
    private final String UserName;
    private final int UserPhone;
       private final Ticket userTicket;

    public User(String userName, int userPhone, Ticket userTicket) {
        UserName = userName;
        UserPhone = userPhone;

        user_id++;
        this.userTicket = userTicket;
    }

    public String reservedCategory () {
        return userTicket.getCategory();
    }


    public int getUserPhone() {
        return UserPhone;
    }

    public String getUserName() {
        return UserName;
    }



}
