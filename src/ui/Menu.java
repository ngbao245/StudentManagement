

//UI: user interface: giao diện dười dùng
package ui;

import java.util.Scanner;

/*
Menu: 1 class đứng ra chuyên tạo object
    có nhiệm vụ quản lý menu, quản lý các option trong menu
    kèm theo đó là các method giúp xử lý menu

    (thêm option)| thu thập lựa chọn của người dùng|
ép người dùng nhập đúng lựa chọn
*/

public class Menu {
    private static String title;
    private static String optionList[] = new String[100];
    private static int size = 0;
    
    //constructor rỗng

    public Menu(String title) {
        this.title = title;
    }
    
    //method: thêm những option
    public static void addNewOption(String newOption) {
        optionList[size] = newOption;
        size++;
    }
    
    //method: in ra các lựa chọn trong menu
    public static void printMenu() {
        System.out.println("------------------------");
        System.out.println(title);
        for(int i = 0; i <= size - 1; i++){
            String str = String.format("%-3d.%s",
                    i+1, optionList[i]);
            System.out.println(str);
            
        }
        
    }   
   //method: xin lựa chọn từ người dùng
   public static int getChoice(){
       Scanner sc =  new Scanner(System.in);
       System.out.println("Vui lòng nhập lựa chọn: ");
        while(true){
            try{
                int Choice = Integer.parseInt(sc.nextLine());
                if (Choice < 1 || Choice > size){
                    throw new Exception();
                }
                return Choice;
             }catch(Exception e){
                        System.out.println("Vui lòng từ 1 -"+size+" nha: ");
               }
            }   
        }
   }
