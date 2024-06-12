public class TodoPrint4 {
    public static void main(String[] args) {


        // Add "My todo:" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying an extra 4 space indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String todoText = " - Buy milk\n";

        todoText = "My todo:\n" + todoText;

        todoText += " - Download Games\n";

        todoText += "     - Diablo\n";

        System.out.println(todoText);

    }
}
