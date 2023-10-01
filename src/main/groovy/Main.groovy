import java.util.stream.Collector
import java.util.stream.Collectors

class Main {
    static void main(String[] args) {
        ArrayList listOfNumbers = [1, 1, 2, 2, 3, 3, 3];

        elementsCount(listOfNumbers)
    }

    private static void elementsCount(ArrayList<Integer> listOfNumbers) {
       listOfNumbers.stream()
                .collect(Collectors.groupingBy { number -> number })
                .forEach { k, v -> println(k.toString() + " size = " + v.size()) };
    }
}

