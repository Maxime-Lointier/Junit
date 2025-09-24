package r5a08.example.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserGreating {
    public static String formatGreating(String nom){
        if (nom.isEmpty() || nom.length() > 10) {
            throw new UserGreatingFailureException("unauthorized input");
        }
        else {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(nom);
        boolean b = m.find();

        if (b){
            throw new UserGreatingFailureException("pas de caractere spéciaux");

    }}


        return "Bonjour, "+nom;

    }
}
