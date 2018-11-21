public class Aufgabe5_1810652445 {
    public static void main(String[] args){
        int zahl1=10;
        int zahl2=20;

        System.out.println(zahl1++);
        System.out.println(zahl2++);
        System.out.println(zahl1);
        System.out.println(zahl1);
        System.out.println(++zahl1);
        System.out.println(++zahl1);

        System.out.println(zahl1);
        System.out.println(zahl2);
        /* Der Unterschied zwischen Prä- und Postfix besteht in der Ausführungsreihenfolge. Beim Präfix (++a) wird es vor der Weiterverwendung, beim Postfix(a++) nach der Weiterverwendung der Variablen ausgeführt. */
    }
}
