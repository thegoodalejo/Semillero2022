
public class Main {
    public static void main (String[] args){
        int[] numbers = {5, 7, 2, 4, 1};
        ArrayAsc(numbers);
        ArrayDesc(numbers);

    }
    static void ArrayAsc(int[] numbers) {
        int num = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers.length - 1; k++) {
                if (numbers[k] > numbers[k + 1]) {
                    num = numbers[k];
                    numbers[k] = numbers[k + 1];
                    numbers[k + 1] = num;
                }
            }
        }
        System.out.println("ASC");
        for (int a :  numbers){
            System.out.print(a +" ");
        }
        System.out.println(" ");
    }
//ejercico 2
    static void ArrayDesc(int[] numbers) {
        int num = 0;
        for (int i = 0; i < numbers.length -1; i++) {
            for (int k = numbers.length -1; k > 0; k--) {
                if (numbers[k] > numbers[k - 1]) {
                    num = numbers[k];
                    numbers[k] = numbers[k - 1];
                    numbers[k - 1] = num;
                }
            }
        }
        System.out.println("DESC");
        for (int a :  numbers){
            System.out.print(a +" ");
        }
    }
}

