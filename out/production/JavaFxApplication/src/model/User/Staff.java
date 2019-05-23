package model.User;

public class Staff extends User {
    private String staffID;

    public Staff(String emailAddress, String password, String staffID) {
        super(emailAddress, password);
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

}
