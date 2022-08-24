public class ConvertStringToCamelCase {
    static String toCamelCase(String s){
        String[] array = s.split("[-_]");
        String splittedWords = array[0];
        for(int x = 1; x < array.length; x++){
            splittedWords += Character.toUpperCase(array[x].charAt(0)) + array[x].substring(1);
        }
        return splittedWords;
    }
    public static void main(String[] args) {
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(toCamelCase("the-stealth-warrior"));
    }
}
