import java.util.Arrays;

public class MyClass {
        String firstName;
        String lastName;
        int Age;
        String [] lessons;
        String food;
        public MyClass(String firstName,String lastName, int Age){
            this.firstName =firstName;
            this.lastName=lastName;
            this.Age= Age;

        }
        public MyClass(String firstName,String lastName,int Age,String[]lessons,String food) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.Age = Age;
            this.lessons = lessons;
            this.food = food;

        }public void info() {
            System.out.println("firsName" + firstName + "\n" + "Last Name;" + lastName + "\n" + "Age:" + Age);
        }public void information(){
            System.out.println("firsName" + firstName + "\n" + "Last Name;" + lastName + "\n" + "Age:" + Age);
            System.out.println("lessens:"+ Arrays.toString(lessons));
            System.out.println("Fovarite food:"+food);

        }

}


