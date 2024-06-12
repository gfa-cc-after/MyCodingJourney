public class AppendA9 {
    public static void main(String[] args) {
        // - Create an array variable named `animals`
        //   with the following content:
        //   `["koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr",
        //     "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul",
        //     "piranh"]`
        // - Add an `"a"` at the end of all elements (use a loop!)
        // - Print the 'fixed' array to the console:
        //   [koala, panda, zebra, anaconda, boa, ..., puma, tarantula, piranha]

        System.out.print("[");
        String[] animals = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr",
                            "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul",
                            "piranh"};
        
        for (int i = 0; i < animals.length ; i++) {
            System.out.print(animals[i]+"a");

            if (i < animals.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]" );

    }

}
