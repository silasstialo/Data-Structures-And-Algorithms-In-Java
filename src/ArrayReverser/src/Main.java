//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    Integer[] numbers = {10, 1, 13, 7, 44, 16, 5};
    IO.println("Array numbers before reversal: " + Arrays.toString(numbers));

    ArrayReverser.reverse(numbers);
    IO.println("Array numbers after reversal: " + Arrays.toString(numbers));

}
