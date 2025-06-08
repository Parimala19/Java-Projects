import java.util.Scanner;

class Book {
    String name;
    String author;
    int isbn;

    Book(String name, String author, int isbn) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    void displayInfo() {
        System.out.println("Book Name : " + name);
        System.out.println("Author    : " + author);
        System.out.println("ISBN      : " + isbn);
        System.out.println("---------------------------");
    }
}

class Library {
    Book[] books = new Book[100];
    int count = 0;

   
    void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully.\n");
        } else {
            System.out.println("Library is full.\n");
        }
    }
    void viewBooks(){
        if(count==0){
            System.out.println("Library is empty!!!");
            return;
        }
        System.out.println("----Books in the library----");
        for(int i=0;i<count;i++){
            books[i].displayInfo();
        }
    }
    void searchBook(String name){
        boolean found=false;
        if(count == 0)
        {
            System.out.println("Library is empty...");
            return;
        }
        for(int i=0;i<count;i++)
        {
            if(books[i].name.equalsIgnoreCase(name))
            {
                System.out.println("Book found");
                books[i].displayInfo();
                found=true;
                break;
            }
        }
        if(!found)
        System.out.println("Book is not found in the library database....");
    }
    void deleteBook(int isbn){
        if(count==0){
            System.out.println("Library is empty.. So cannot delete the book...");
            return;
        }
        boolean found=false;
        for(int i=0;i<count;i++){
            if(books[i].isbn==isbn){
                System.out.println("Book found to delete...");
                found=true;
                for(int j=i;j<count;j++){
                    books[j]=books[j+1];
                }
                books[count-1]=null;
                count--;
            }

        }
        if(!found)
        System.out.println("Cannot find book in the database to delete....");


    }
}


public class Library_Managemnet_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Name");
            System.out.println("4. Delete Book by ISBN");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN number: ");
                    int isbn = sc.nextInt();
                    lib.addBook(new Book(name, author, isbn));
                    break;

                case 2:
                    lib.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book Name to search: ");
                    String searchName = sc.nextLine();
                    lib.searchBook(searchName);
                    break;

                case 4:
                    System.out.print("Enter ISBN to delete: ");
                    int deleteIsbn = sc.nextInt();
                    lib.deleteBook(deleteIsbn);
                    break;

                case 5:
                    System.out.println("Thank you for using Library System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        }
    }
}
