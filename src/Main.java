import static java.lang.System.*;

public class Main {


    public static void main(String[] args) {
        out.println("This is my first project!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            out.println("i = " + i);
        }
        //Primitive types
        var a1 = 5;
        var b1 = 5.0;
        out.println("a1=" + a1);
        out.println("b1=" + b1);

        //Non Primitive type
        String c1 = "Test";
        out.println(c1);
    }
}