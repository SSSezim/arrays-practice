void main() {
    int[] array = {0, 34, -21, -100, 3, 0, 45, -1, 0, 77};

    int positive = 0;
    int negative = 0;
    int zero = 0;


    for(int i = 0; i < array.length; i++) {
        if (array[i] < 0) {
            negative++;
        } else if (array[i] > 0) {
            positive++;
        } else {
            zero++;
        }
    }

    System.out.print("Array: ");
    for(int n : array) System.out.print(n + " ");

    System.out.println("\nPositive: " + positive);
    System.out.println("Negative: " + negative);
    System.out.println("Zeros: " + zero);
        }