//chương trình gồm các tính năng:

//nhập sinh viên
//hiển thị thông tin sinh viên
//tìm kiếm theo mã sinh viên
//sort theo tên và hiển thị
//hiển thị thông tin các sinh viên có học bổng(gpa > 😎
//thoát

package data;

import java.util.Scanner;

/*class chuyên tạo ra "chiếc tủ" lưu trữ hồ sơ
của các student kèm theo các method giúp
quản lý các hồ sơ
*/
public class StudentList {
    private static Student stl[] = new Student [100];
    private static int size = 0;
    
    public StudentList(){
    }
    public static void addNewStudent(){
        System.out.println("Thêm mới sinh viên");
        Student newStudent = new Student(); //tạo ra 1 vùng nhớ Student rỗng
        newStudent.inputInfor();//dùng object rỗng này gọi inputInfor để đổ thông tin
        stl[size] = newStudent; // kĩ thuật chèn trong array
        size++;
    }
//    in ra ds sinh viên
    public static void printStudentList() {
        if(size == 0){
            System.out.println("Nothing to print");
            return; // ngừng
        }
        //ko rỗng thì in ra
        for (int i = 0; i<= size - 1; i++){ // in ra nếu size != 0
            stl[i].showInfor(); 
        }
    }
    //tìm kiềm
    //tìm kiếm có 3 dạng chính
    //nhận vào id tìm đc vị trí
    public static int searchIndexStudentById(String Id){
        for( int i = 0; i <= size -1; i++){
            if(stl[i].getId().equalsIgnoreCase(Id)){
            return i;
            }
        }
        return -1;
    }
   
    //nhận vào id tìm đc object
    public static Student searchStudentById(String Id) {
        int pos = searchIndexStudentById(Id);
        if(pos == -1) return null;
        return stl[pos];
    }
    //search nhưng giao tiếp với người dùng
    
    
    public static void searchStudentById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id mà bạn muốn tìm: ");
        String inputId = sc.nextLine();
        Student st = searchStudentById(inputId);
        if(st == null){
            System.out.println("Sinh viên ko tồn tại");
        }else{
            System.out.println("Sinh viên bạn đang tìm là");
            st.showInfor();
        }
               
    }   
    public static void sortStudentByName(){
        if (size != 0) {
            return;
        }
        for(int i = 0; i <= size -2; i++){
            for (int j = i + 1; j <= size - 1; j++){
                if(stl[i].getName().compareToIgnoreCase(stl[j].getName()) > 0){
                    //swap
                    Student tmp = stl[i];
                    stl[i] = stl[j];
                    stl[j] = tmp;
                    
                }
            }
        }
        
    }
    //in ra ds những thằng có học bổng
    public static void printStudentHasScholarshipList(){
        for(int i = 0; i <= size -1; i++){
            if(stl[i].hasScholarship()){
                stl[i].showInfor();
            }
        
        }
        
    }


}


