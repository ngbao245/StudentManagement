
package data;

import java.util.Scanner;

public class Student extends Person {
    private String id;
    private double gpa;
    private String email;
    
    //constructor rỗng

   
    
    //getter/setter

    public String getId() {
        return id;
    }
    public boolean setId(String id){
        if(id.isEmpty()){ //id == null
            System.out.println("ID ko đc để trống");
            return false;
        }
        this.id = id;
        return true;
    }      
 
    public double getGpa() {
        return gpa;
    }

    public boolean setGpa(double gpa) {
        if(gpa < 0 || gpa > 10) {
            System.out.println("GPA phải từ 0-10");
            return false;
    }
        this.gpa = gpa;
        return true;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email == null || email.isEmpty() || !email.contains("@")){ //email == null || email.isEmpty()||
            System.out.println("Email ko hợp lệ");
            return false;
        }
        this.email = email;
        return true;
    }

    @Override
    public void inputInfor() {
      Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập id: ");
//        while(true){
//              String inputId = sc.nextLine(); //nhập vào id tạm
//            boolean check = setId(inputId);
//            if(check == true){
//                break;
//            }
//        }
        System.out.println("Nhập ID: ");
        while(!setId(sc.nextLine()));
        //name, gender, yob
        super.inputInfor();
        System.out.println("Nhập GPA: ");
        while(!setGpa(Double.parseDouble(sc.nextLine())));
        System.out.println("Nhập email: ");
        while(!setEmail(sc.nextLine()));
        
        
    }

    @Override
    public void showInfor() {
        String str = String.format("|%-10s|%-15s|%-5s|%4d|%5.2f|%-15s",
                id, name, gender, yob, gpa, email);
        System.out.println(str);
    }
    
    public boolean hasScholarship(){
        return this.gpa >= 8;
    }
    
    
}
