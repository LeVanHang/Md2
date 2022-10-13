package model;

public class Student {
    private String name;
    private int ID;
    private String gender;
    private int age;
    private String phone;
    private Date birthday;
    private Lop lop;
    private String address;
    private double averageScore;

    public Student(String address, String string, double averageScore, int i, String s) {
        this.address = address;
        this.averageScore = averageScore;
    }

    public Student(String name, int ID, String gender, int age, String phone, Date birthday, Lop lop, String address, double averageScore) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.birthday = birthday;
        this.lop = lop;
        this.address = address;
        this.averageScore = averageScore;
    }

    public static void add(Object student) {

    }

    public boolean getName() {
        String name1 = name;
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", ID=" + ID +
                ", Gender='" + gender + '\'' +
                ", Age=" + age +
                ", Phone='" + phone + '\'' +
                ", Birthday=" + birthday +
                ", Lop=" + lop +
                ", Address='" + address + '\'' +
                ", AverageScore=" + averageScore +
                '}';
    }
}
