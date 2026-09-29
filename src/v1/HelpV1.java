package v1;

public class HelpV1 {
    public static void main(String[] args) throws Exception{
        System.out.println("справка по:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("Выберите вариант: ");
        char choice;
        choice = (char) System.in.read();
        switch (choice){
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Традиционный оператор switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа:");
                System.out.println("   последовательность операторов");
                System.out.println("    break;");
                System.out.println("}");
                break;
            default:
                System.out.println("Выбранный вариант не найден");
        }
    }
}
