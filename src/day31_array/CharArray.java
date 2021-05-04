package day31_array;

public class CharArray {
    public static void main(String[] args) {
        char[] charArr = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for (char each : charArr) {
            System.out.print(each);
        }

        String sentence = new String(charArr);
        System.out.println("\n" + sentence);

        String item = "Wooden Spoon";
        char[] itemArr = item.toCharArray();

        for (char each : itemArr) {
            System.out.print(each);
        }
        System.out.println();
        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String between = "-";
        String fruitStr = "";
        for (String each : fruits) {
            System.out.print(each + between);
            fruitStr += each + "-";
        }
        System.out.println();
        System.out.println("fruitStr = " + fruitStr);

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join(" ",languages));
        String joinedLanguages = String.join(", ",languages);
        System.out.println(joinedLanguages);

        String str = "git";
        char[] strArray = str.toCharArray();
    }
}
