#NEIGHBORHOOD LIBRARY
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
This application opens a menu that allows the user to view a prefilled database of library books with various properties such as Author and ISBN. The menu provides options to check out and check in books.

CODE SNIPPET
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Originally I tried to contain this submenu in a while loop so that it could reset if there was an invalid option chosen. However, I couldn't figure out how to fully break out of a while loop from inside a switch-case statement, so instead I called the function again if an invalid option is entered.

switch (menuOption) {
    case "C":
        System.out.println("\nPlease enter the name of the book you would like to check out.");
        System.out.print(">>");
        String bookSelection = read.nextLine();
        for (Book book : books) {
            if (bookSelection.equals(book.getTitle())) {
                System.out.print("\nPlease enter your name.\n>>");
                String userName = read.nextLine();
                book.checkOut(userName);
                System.out.printf("%s successfully checked out to %s.\n", book.getTitle(), userName);
                Thread.sleep(1000);

            }
        }
        break;
    case "X":
        System.out.println("Returning to menu...\n");
        Thread.sleep(1000);
        break;
    default:
        System.out.println("Invalid Option. Please try again.\n");
        Thread.sleep(1000);
        showAvailable();
        break;
}