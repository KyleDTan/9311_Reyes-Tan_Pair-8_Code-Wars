public class MultiplesOf3Or5 {

    public static void main(String[] args) {
        MultiplesOf3Or5 m = new MultiplesOf3Or5();
        m.start();

    }

    public int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;
        while (number != 0){
            number--;
            if(number % 3 == 0 || number % 5 == 0){
                sum += number;
            }
        }
        return sum;
    }

    public void start(){
        System.out.println(solution(10));

    }
}

