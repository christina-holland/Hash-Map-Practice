import java.util.HashMap;

public class NickNames {
    public static void main(String[] args) {
        //Creating a new HashMap object
        HashMap<String, String> nicknames = new HashMap<>();

        //Storing names and nicknames
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        //Getting Matthew's nickname
        String matthewsNickname = nicknames.get("matthew");

        //Printing Matthew's nickname
        System.out.println("matthew's nickname is: " + matthewsNickname);
    }
}

