public class Main {
    public static void main(String[] args) {
        System.out.println(convertToBinary(19));


    }

    public static int convertToBinary(int number){
        StringBuilder finalNumber = new StringBuilder();

        while(number > 0){
            int remainder = number%2;
            finalNumber.insert(0,remainder);
            number /= 2;
        }
        return Integer.parseInt(finalNumber.toString());
    }
}