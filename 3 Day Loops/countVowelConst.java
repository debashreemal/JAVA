//Count Vowels and Consonants in a String ignore spaces and non character letters

public class countVowelConst {
    public static void main(String[] args) {
        String name = "Debashree Mal";
        int i;
        int vowel = 0;
        int consonant = 0;

        for(i = 0; i < name.length() ; i++ ){
            char c = name.charAt(i);

            if( c == 'a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u') {
                vowel++;
            }
            else if(Character.isLetter(c)){ //charcter. is buildin method t check if the characters
                consonant++;
            }
        } 
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}
