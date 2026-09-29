package v4;

public class HelpDemo {
    public static void main(String[] args) throws Exception{
        char choice, ignore;
        HelpV4 hl = new HelpV4();
        for (;;){
            do {
                hl.showMenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }while (ignore != '\n');
            }while (!hl.isValid(choice));
            if (choice == 'd') break;
            System.out.println("\n");
            hl.helpOn(choice);
        }
    }
}
