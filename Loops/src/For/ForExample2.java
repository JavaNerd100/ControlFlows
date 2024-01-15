package For;

public class ForExample2 {
    public static void main(String[] args) {
        String[] fruits = {"Apple","PineApple","Orange","Plum"};

        //Basic for loop
        System.out.println("With normal for loop");
        for (int counter = 0;counter<fruits.length;counter++){
            System.out.println("fruits are " + fruits[counter]);
        }

        //Enhanced for loop
        System.out.println("with Enhanced for loop");
        for (String fruit:fruits){
            System.out.println("fruits are " + fruit);

        }
    }
}
