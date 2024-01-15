package Switch;

public class SwitchExample4 {
    public static void main(String[] args) {
        record Person(String firstName, String lastName, int age){}
        String var1 = "Have a nyc day";
        Integer var2 = 100;
        String[] var3 = {"Hello","Good-Morning"};
        Person var4 = new Person("Jake","winston",34);
        Person var5 = new Person("Abe","reeves",34);

        Object obj = var4;

        switch (obj){
            case String msg -> System.out.println(msg);
            case Integer num -> System.out.printf("your jersey number -- %d%n",num);
            case String[] arr -> System.out.printf("looks like an array of %d elements",arr.length);
            case Person person -> System.out.printf("name %s,lastName %s, age %d%n",person.firstName,person.lastName,person.age);
            case null -> System.out.println("its null");
            default -> System.out.println("you got nothing");
        }
    }
}
