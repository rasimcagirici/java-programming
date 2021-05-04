package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengel cat tabby cat persian cat no cat here";
        String[] catTypes = cats.split("cat");
        System.out.println(cats.split("cat").length-1);
        for (String type : catTypes) {
            System.out.print(type + " ");
        }
    }
}
