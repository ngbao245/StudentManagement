//chương trình gồm các tính năng
//nhập sinh viên
//hiển thị thông tin sinh viên
//tìm kiếm theo mã sinh viên
//tìm kiếm theo mã sinh viên
//sort theo tên và hiển thị


package runtime;

import data.StudentList;
import ui.Menu;


public class Program {

    //nhập sinh viên
    //hiển thị thông tin sinh viên
    //tìm kiếm theo mã sinh viên
    //sort theo tên và hiển thị
    //hiển thị thông tin các sinh viên có học bổng qua(gpa>8)
    //thoát
    
        public static void main(String[] args) {
            Menu menu = new Menu("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
            menu.addNewOption("Thêm mới sinh viên");
            menu.addNewOption("In ra danh sách sinh viên");
            menu.addNewOption("Tìm ra kiếm sinh viên dựa trên id");
            menu.addNewOption("Sắp xếp danh sách sinh viên theo tên");
            menu.addNewOption("In ra danh sách sinh viên có học bổng");
            menu.printMenu();
            
            
        int choice;    
        StudentList stl = new StudentList();
        while(true){
            menu.printMenu();
            //menu.getChoice();
            choice = menu.getChoice();
            switch(choice){
                case 1:{
                    stl.addNewStudent();
                    break;
                }
                case 2:{
                    stl.printStudentList();
                    break;
                }
                case 3:{
                    stl.searchStudentById();
                    break;
                }
                case 4:{
                    stl.sortStudentByName();
                    stl.printStudentList();
                    break;
                }
                case 5:{
                    stl.printStudentHasScholarshipList();
                    break;
                }
                case 6:{
                    System.out.println("see you again");
                   break;
                }
            }
        }
        
        }
        
    
}
