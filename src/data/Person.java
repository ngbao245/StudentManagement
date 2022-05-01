//1 class person
//name, gender, yob
//có consstructor roongx
//có getter/setter
//có hàm inputInfor(0
//có showInfor

package data;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String gender;
    protected int yob;
    
    //constructor

    public Person() {
    }

    
    
    
    //getter/setter

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getYob() {
        return yob;
    }
    public void setYob(int yob) {
        this.yob = yob;
    }
    
    //inputInfor
    
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập Giới Tính");
        this.gender = sc.nextLine();
        System.out.println("Nhập yob: ");
        this.yob = Integer.parseInt(sc.nextLine());
        
    }
    //
    public void showInfor(){
        String str = String.format("|%-10s|%-10s|%4d",
                name, gender, yob);
        System.out.println(str);
    }
 
    
    
}
