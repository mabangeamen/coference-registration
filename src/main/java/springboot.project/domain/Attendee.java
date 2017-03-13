package springboot.project.domain;

/**
 * Created by livhuwani on 2017/03/13.
 */
public class Attendee {
    private Integer id;
    private String title;
    private String surname;
    private String name;
    private String cellName;
    private int wpsMember;
    private String emailAdderess;
    private String contactNumber;
    private String location;
    private String specialCondition;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public int getWpsMember() {
        return wpsMember;
    }

    public void setWpsMember(int wpsMember) {
        this.wpsMember = wpsMember;
    }

    public String getEmailAdderess() {
        return emailAdderess;
    }

    public void setEmailAdderess(String emailAdderess) {
        this.emailAdderess = emailAdderess;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecialCondition() {
        return specialCondition;
    }

    public void setSpecialCondition(String specialConditionl) {
        this.specialCondition = specialConditionl;
    }

}