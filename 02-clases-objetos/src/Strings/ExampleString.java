package Strings;

public class ExampleString {
    public static void main(String[] args) {
        String name = "Nico";
        String name2 = "Nico";

        System.out.println(name==name2);
        
        String name3 = new String("Developer");

        System.out.println(name3==name);
        System.out.println(name);
        System.out.println(name.toUpperCase());

        Person person = new Person("unicoast","java");

        System.out.println(person.toString());
    }
}
