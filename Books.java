import java.util.Scanner;

class Books 
{
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    // Constructor
    Book(int bookId, String title, String author) 
	{
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Display book details
    void display() 
	{
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
        System.out.println("----------------------------");
    }

    // Borrow book
    void borrowBook() 
	{
        if (isAvailable) 
		{
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Return book
    void returnBook() 
	{
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }
}

public class LibraryManagement 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[10];
        int count = 0;
        int choice;

        do
		{
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add New Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    if (count < books.length) {
                        System.out.print("Enter Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();

                        books[count] = new Book(id, title, author);
                        count++;

                        System.out.println("Book Added Successfully.");
                    } else {
                        System.out.println("Library is Full.");
                    }
                    break;

                case 2:
                    if (count == 0)
						{
                        System.out.println("No Books Available.");
                    } else 
					{
                        for (int i = 0; i < count; i++) {
                            books[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Borrow: ");
                    int borrowId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++)
						{
                        if (books[i].bookId == borrowId) 
						{
                            books[i].borrowBook();
                            found = true;
                            break;
                        }
                    }

                    if (!found) 
					{
                        System.out.println("Book Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) 
					{
                        if (books[i].bookId == returnId)
							{
                            books[i].returnBook();
                            found = true;
                            break;
                        }
                    }

                    if (!found) 
					{
                        System.out.println("Book Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        
    }
}