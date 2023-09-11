package testing.src;

import java.util.Scanner;
public class TA
{
    static void text(String expression)
    {
        System.out.print(expression);
    }

    static void textln(String expression)
    {
        System.out.println(expression);
    }

    static Scanner input = new Scanner(System.in);
    static String[] data = new String[9];
    static String[] polylist = {"General Polyclinic", "Obstetrics Polyclinic", "Children's Polyclinic", "Eye Clinic", "Ear, Nose, Throat Polyclinic", "Oral and Dental Polyclinic"};
    static String[] price = {"Rp. 2.500.000", "Rp. 3.500.000", "Rp. 2.000.000", "Rp. 4.500.000", "Rp. 1.500.000", "Rp. 5.000.000"};
    static String[][] book = new String[18][9];
    static int bookCount = 0;
    static String[][] doctors = {
            {"dr. Johnny Sins", "0","Monday","available"},
            {"dr. Hello World","0","Tuesday","available"},
            {"dr. Za Warudo","0","Thursday","available"},
            {"dr. Hoonee Haq","1","Wednesday","available"},
            {"dr. Shaquille Oatmeal","1","Friday","available"},
            {"dr. Yao Ming","1","Monday","available"},
            {"dr. True Story","2","Tuesday","available"},
            {"dr. Not Bad","2","Wednesday","available"},
            {"dr. Lmao What","2","Friday","available"},
            {"dr. Trevor Philips","3","Thursday","available"},
            {"dr. Franklin Clinton","3","Friday","available"},
            {"dr. Michael de Santa","3","Monday","available"},
            {"dr. Liam Byrne","4","Thursday","available"},
            {"dr. Vincent Fabron","4","Monday","available"},
            {"dr. Sabine Callas","4","Tuesday","available"},
            {"dr. Tayane Alves","5","Friday","available"},
            {"dr. Sunwoo Han","5","Tuesday","available"},
            {"dr. Varun Batra","5","Wednesday","available"}
    };

    static String getCanEmpty(String message)
    {
        text(message);
        return input.nextLine();

    }

    static String getNonEmpty(String message, String errorMsg)
    {
        while (true)
        {
            text(message);
            String userInput = input.nextLine();
            if (!userInput.isEmpty()) {
                return userInput;
            }
            text(errorMsg);
        }
    }

    static int getIntNonEmpty(String message, String errorMsg, int min, int max)
    {
        while (true)
        {
            text(message);
            int userInput = input.nextInt();
            input.nextLine();
            if (userInput > min && userInput < max)
            {
                return userInput;
            }
            text(errorMsg);
        }
    }

    public static void printPoly()
    {
        textln("------------------------------------------------------------------------");
        System.out.printf("| %28s %s %-28s |\n", " ", "Polyclinic", " ");
        textln("------------------------------------------------------------------------");
        for (int i = 1; i <= polylist.length; i++)
        {
            System.out.printf("| %d %s %-63s |\n", i, ". ", polylist[i - 1]);
        }
        textln("------------------------------------------------------------------------");
    }

    public static void polyMenu()
    {
        printPoly();
        text("\nPress Enter to back to Menu...");
        input.nextLine();
    }

    private static void bookPrint()
    {
        for (int i = 1; i <= bookCount; i++)
        {
            String[] currentBooking = book[i - 1];
            System.out.printf("%d. %s\n", i, currentBooking[0]);
        }
    }

    static int printDoctor(String polyclinicPost)
    {
        int offset = 0;
        textln("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-30s | %-30s | %-30s | %-30s |\n", "Name", "Polyclinic", "Work Days","Availability");
        textln("-------------------------------------------------------------------------------------------------------------------------------------");
        boolean hasFound = false;
        for (int i = 0; i < doctors.length; i++)
        {
            String[] currentDoctor = doctors[i];
            if (!polyclinicPost.isEmpty())
            {
                if(!hasFound) offset++;
                //ngga match
                if(!currentDoctor[1].equals(polyclinicPost))
                {
                    continue;
                }
                hasFound = true;
            }
            String name = currentDoctor[0];
            String polyclinic = polylist[Integer.parseInt(currentDoctor[1])];
            String availableDays = currentDoctor[2];
            String availability = currentDoctor[3];

            System.out.printf("| %-30s | %-30s | %-30s | %-30s |\n", name, polyclinic, availableDays, availability);
        }
        textln("-------------------------------------------------------------------------------------------------------------------------------------");
        return offset-1;
    }

    private static void register()
    {
        if (bookCount > 4)
        {
            textln("");
            textln("The booking has reached limit! (5 book)");
        }
        else
        {
            textln("------------------------------------------------------------------------");
            textln("|                             Registration                             |");
            textln("------------------------------------------------------------------------");
            data[0] = getNonEmpty("Patient Name\t\t\t\t: ", "Patient Name can't be Empty!\n");
            data[1] = String.format("%d", getIntNonEmpty("Patient Age\t\t\t\t\t: ", "Patient Age can't be below 0 and beyond 200!\n", 0, 201));
            data[2] = getNonEmpty("Patient Address\t\t\t\t: ", "Patient Address can't be Empty!\n");
            data[3] = getCanEmpty("Disease History\t\t\t\t: ");
            data[4] = getNonEmpty("Perceived Symptoms\t\t\t: ", "Perceived Symptoms can't be Empty!\n");
            textln("Polyclinic: ");
            printPoly();
            data[5] = String.format("%d", getIntNonEmpty("Polyclinic Selection\t\t: ", "Please select Polyclinic Correctly!\n", 0, polylist.length + 1));
            int polyclinicIndex = Integer.parseInt(data[5]) - 1;
            String polyclinic = polylist[polyclinicIndex];
            int offset = printDoctor(String.format("%d", polyclinicIndex));
            String doctorName;
            String availableDays;
            while (true)
            {
                data[6] = String.format("%d", getIntNonEmpty("Select Doctor\t\t\t\t: ", "Please Select Doctor Correctly!\n", 0, 4) - 1 + offset);
                int doctorIndex = Integer.parseInt(data[6]);
                String[] doctor = doctors[doctorIndex];
                doctorName = doctor[0];
                availableDays = doctor[2];
                boolean isDoctorAvailable = doctor[3].equals("available");
                doctor[3] = "unavailable";
                if (isDoctorAvailable) break;
                textln("Doctor isn't available right now, please choose another Doctor!");
                data[6] = null;
            }
            textln("");
            String prices = price[polyclinicIndex];
            extract(data[0], data[1], data[2], data[3], data[4], polyclinic, doctorName, availableDays, prices);
            book[bookCount][0] = data[0];
            book[bookCount][1] = data[1];
            book[bookCount][2] = data[2];
            book[bookCount][3] = data[3];
            book[bookCount][4] = data[4];
            book[bookCount][5] = data[5];
            book[bookCount][6] = data[6];
            book[bookCount][7] = data[7];
            bookCount++;
            textln("");
            text("Press Enter to back to Menu...");
            input.nextLine();
        }
    }

    private static void booklist()
    {
        do
        {
            textln("------------------------------------------------------------------------");
            textln("|                              Book List                               |");
            textln("------------------------------------------------------------------------");
            bookPrint();
            textln("0. Back to Menu ");
            int bookListIndex = getIntNonEmpty("Menu: ", "Please choose menu correctly!\n", -1, bookCount+1);
            if (bookListIndex == 0)
            {
                break;
            }
            String[] bookSelect = book[bookListIndex - 1];
            int polyclinicIndex = Integer.parseInt(bookSelect[5]) - 1;
            String polyclinic = polylist[polyclinicIndex];
            int doctorIndex = Integer.parseInt(bookSelect[6]);
            String doctor = doctors[doctorIndex][0];
            String daySelection = doctors[doctorIndex][2];
            String prices = price[polyclinicIndex];
            extract(bookSelect[0], bookSelect[1], bookSelect[2], bookSelect[3], bookSelect[4], polyclinic, doctor, daySelection, prices);
            textln("");
            text("Press Enter to Back to Book List...");
            input.nextLine();
        }
        while (true);
    }

    private static void removal()
    {
        do
        {
            textln("------------------------------------------------------------------------");
            textln("|                              Delete List                             |");
            textln("------------------------------------------------------------------------");
            bookPrint();
            textln("0. Back to Menu ");
            int listDeletionIndex = getIntNonEmpty("Menu: ", "Please choose menu correctly!\n", -1, bookCount+1);
            if (listDeletionIndex == 0)
            {
                break;
            }

            text("Are you sure you want to delete? (y to confirm) ");
            boolean isYes = input.next().equalsIgnoreCase("y");

            if (isYes)
            {
                String[][] bookFilter = new String[book.length-1][];
                int count = 0;
                for (int i = 0; i < book.length; i++)
                {
                    if (i == listDeletionIndex - 1) {
                        int doctorIndex = Integer.parseInt(book[i][6]);
                        doctors[doctorIndex][3] = "available";
                        continue;
                    }
                    bookFilter[count] = book[i];
                    count++;
                }
                book = bookFilter;
                bookCount--;
            }
        }
        while(true);
    }

    public static void extract(String name, String age, String add, String dis, String sym, String poly, String doc, String day,String pr)
    {
        textln("------------------------------------------------------------------------");
        textln("|                            Patient Data                              |");
        textln("------------------------------------------------------------------------");
        System.out.printf("| %-20s : %-45s |\n","Name",name);
        System.out.printf("| %-20s : %-45s |\n", "Age",age);
        System.out.printf("| %-20s : %-45s |\n", "Address",add);
        System.out.printf("| %-20s : %-45s |\n", "Disease History",dis);
        System.out.printf("| %-20s : %-45s |\n", "Perceived Symptoms",sym);
        System.out.printf("| %-20s : %-45s |\n", "Polyclinic",poly);
        System.out.printf("| %-20s : %-45s |\n", "Doctor",doc);
        System.out.printf("| %-20s : %-45s |\n", "Day",day);
        System.out.printf("| %-20s : %-45s |\n", "Price",pr);
        textln("------------------------------------------------------------------------");
    }

    private static void doctorsList()
    {
        textln("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-58s %11s %58s |\n"," ","Doctor List"," ");
        printDoctor("");
        textln("");
        text("Press Enter to back to Menu...");
        input.nextLine();
    }

    public static void main(String[] args) {
        int menu;
        do
        {
            textln("------------------------------------------------------------------------");
            textln("|               Welcome to Wangsaf Hospital Registration               |");
            textln("------------------------------------------------------------------------");
            textln("Select Menu:");
            textln("1. Register New Patient");
            textln("2. Doctor List");
            textln("3. Polyclinic List");
            textln("4. Booking List");
            textln("5. Remove Booking");
            textln("0. Exit Program");
            menu = getIntNonEmpty("Menu: ", "Please choose menu correctly!\n", -1, 6);
            switch (menu) {
                case 1:
                    register();
                    break;
                case 2:
                    doctorsList();
                    break;
                case 3:
                    polyMenu();
                    break;
                case 4:
                    booklist();
                    break;
                case 5:
                    removal();
                    break;
                case 0:
                    textln("Thank you for using, See you!");
                    break;
            }
        }
        while (menu != 0);
    }
}