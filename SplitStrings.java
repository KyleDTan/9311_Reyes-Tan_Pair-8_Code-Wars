public class SplitStrings {
    public static String[] solution(String s) {
        if(s.length()%2 != 0){
            s +="_";
        }
        int arrayLength = s.length() / 2;
        String[] pairedCharas = new String[arrayLength];
        int counter = 0;
        for(int x = 0; x < pairedCharas.length; x++){
            StringBuilder string = new StringBuilder();
            string.append(s.charAt(x));
            string.append(s.charAt(x+1));

            pairedCharas[counter] = string.toString();
            counter++;
            x++;
        }

        //Write your code here
        return pairedCharas;
    }

    public static void main(String[] args) {
        String[] array = solution("abcdef");
        for(int x = 0; x < array.length; x++){
            System.out.print(array[x] + " ");
        }
    }
}
