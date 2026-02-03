package week2sel;

public class Library {

    public void addBook(String bookTitle){
        System.out.println("The Book added Successfully");
        System.out.println(bookTitle);

    }
    public void issueBook(){
        System.out.println("Book issued Successfully");
    }
    public static void main(String[] args){
        Library obj=new Library();
        obj.addBook("JamesBond");
        obj.issueBook();
    }




}
