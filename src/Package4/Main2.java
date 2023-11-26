package Package4;

import java.util.Objects;

public class Main2 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
    }
}
 class Pair<U, T>{
    private final U first;
    private final T second;

     private Pair(U first, T second) {
         this.first = first;
         this.second = second;
     }
     public static <U, T>Pair<U, T> of(U first, T second){
         return new Pair<>(first, second);
     }
     public U getFirst(){
        return first;
    }

    public T getSecond(){
        return  second;
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         Pair<?, ?> pair = (Pair<?, ?>) o;

         if (!Objects.equals(first, pair.first)) return false;
         return Objects.equals(second, pair.second);
     }

     @Override
     public int hashCode() {
         int result = first != null ? first.hashCode() : 0;
         result = 31 * result + (second != null ? second.hashCode() : 0);
         return result;
     }
 }
