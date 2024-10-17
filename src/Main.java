//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Elaman", "Abjalov", 16);
        String[] lessons = {"Loop", "Massive", "Construction"};
        MyClass myClass1 = new MyClass("Elaman", "Abjalov", 16, lessons, "pizza");
        myClass.info();
        myClass1.information();
    }
}
