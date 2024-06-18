package exercise;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int elementsInList) {
        List<Home> sortedList = apartments.stream()//new ArrayList<>(apartments);
                .sorted(Comparator.comparing(Home::getArea))
                .limit(elementsInList)
                .collect(Collectors.toList());
        return sortedList.stream()
                .map(e -> e.toString())
                .collect(Collectors.toList());
        //sortedList.sort(Comparator.comparing(Home::getArea));
        /*Comparator<Double> comparator = new Comparator<Double>() {
            @Override
            public int compare(Home firstApartment, Home secondApartment) {
                return firstApartment.compareTo(secondApartment);
            }
        };
        List<String> sortedList = apartments.stream()
                .sorted(comparator)
                .limit(elementsInList)
                .map(ap -> ap.toString())
                .collect(Collectors.toList());
        return sortedList;*/
        /*List<String> resultList = new List<String>();
        int size = 0;
        while (size < elementsInList) {
            for (var element : sortedList) {
                resultList.add(element.to);
                size ++;
            }
        }
        return resultList;
    }*/
    }
    /*public static void main(String[] args) {
        CharSequence text = new ReversedSequence("abcdef");
        System.out.println(text.toString()); // "fedcba"
        System.out.println(text.charAt(1)); // 'e'
        System.out.println(text.length()); // 6
        System.out.println(text.subSequence(1, 4).toString()); //"edc"
    }*/
}
// END
