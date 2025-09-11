import java.util.*;

class simplepayroll {
    static String[] names = new String[100];
    static double[] salaries = new double[100];
    static int count = 0;
    static int[] undoIndex = new int[100];
    static int undocount = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.Add employee\n2.Show payroll\n3.Undo last\n4.Exit");
            System.out.println("Choice:");
            int ch = Integer.parseInt(sc.nextLine());
            try {
                if (ch == 1) addEmployee();
                else if (ch == 2) showpayroll();
                else if (ch == 3) undolast();
                else if (ch == 4) break;
                else System.out.println("Invalid choice!");
            } catch (Exception e) {
                System.out.println("Error. " + e.getMessage());
            }
        }
    }

    static void addEmployee() throws Exception {
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter salary:");
        double salary = Double.parseDouble(sc.nextLine());
        if (name.isEmpty() || salary < 0) throw new Exception("Invalid name or salary!");
        names[count] = name;
        salaries[count] = salary;
        undoIndex[undocount++] = count;
        count++;
        System.out.println("Employee added:");
    }

    static void showpayroll() throws Exception {
        if (count == 0) throw new Exception("No employees to display!");
        for (int i = 0; i < count; i++) {
            if (names[i] != null) {
                System.out.println(names[i] + ", salary: " + salaries[i]);
            }
        }
    }

    static void undolast() throws Exception {
        if (undocount == 0) throw new Exception("Nothing to undo!");
        int id = undoIndex[--undocount];
        System.out.println("Remove last added employee: " + names[id]);
        names[id] = null;
        salaries[id] = 0;
    }
}
