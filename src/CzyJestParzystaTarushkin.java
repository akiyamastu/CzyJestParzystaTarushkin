public class CzyJestParzystaTarushkin {

    public static void main(String args[]) {
        int a = 0; // start
        int b = 100; // end

        int random_number = a + (int) (Math.random() * b);
        System.out.println("Losowa liczba: " + random_number);

        if((random_number%2)==0){
            System.out.println("Liczba " + random_number + " Parzysta ");
        }
        else{
            if((random_number%1)==0){
                System.out.println("Liczba " + random_number + ":" + " Nie parzysta ");
            }
        }
    }
}