package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Homework2 {
    public static void main(String[] args) {
        List<String> st = new ArrayList<>();
        List<String> st2 = new ArrayList<>();
        st.add("Sasha");
        st.add("Andrey");
        st.add("Petya");
        st.add("Diana");
        st.add("Anton");
        st.add("Dima");
        st.add("Diana");
        System.out.println(st);
        System.out.print("name 'Diana' count -");
        System.out.println(st.stream().filter(a -> a.equalsIgnoreCase("diana")).count());
        st.stream().filter(a -> a.toLowerCase().startsWith("a"))
                .forEach(a -> System.out.print(a + " "));
        //empty stream for test
        // Optional<String> first = st2.stream().sorted().findFirst();
        Optional<String> first = st.stream().sorted().findFirst();
        System.out.println("\n" + first.orElse("Empty@"));


    }
}
