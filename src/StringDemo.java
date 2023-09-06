public class StringDemo {
    public static void main(String[] args) {
        String name = "Padam is Awesome";

        // lowercase
        name = name.toLowerCase();
        System.out.println(name);

        //replace spaces with underscore
        name = name.replace(" ", "_");
        System.out.println(name);

        //dynamic string replacement
        String letter = "Dear <|name|> thanks a lot";
        letter = letter.replace("<|name|>", "Padam");
        System.out.println(letter);

        //detect double or tripple spaces
        String myString = "This string contains  double and   tripple spaces.";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //use escape sequence character
        String text = "Dear Padam, \n\tYour are awesome. \n\tThanks";
        System.out.println(text);
    }
}
