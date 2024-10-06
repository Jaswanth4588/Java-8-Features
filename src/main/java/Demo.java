import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args)
//    {
//        List<Integer> nums = Arrays.asList(6,5,7,1,9);
//
//        Stream<Integer> data = nums.stream();
//        Stream<Integer> mappedData = data.map(n -> n*2);
//        mappedData.forEach(n -> System.out.println(n));
//
//    }


//    {
//        List<Integer> nums = Arrays.asList(8,5,7,1,6); //using map,sorted,filter
//
//        nums.stream()
//                .filter(num -> num%2 == 0)
//                .sorted()
//                .map(n -> n*2)
//                .forEach(n -> System.out.println(n));
//
//    }



      //consumer class will take only one method
//    {
//        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
//
//        values.forEach(new Consumer<Integer>()
//        {
//            public void accept(Integer i)
//            {
//                System.out.println(i);
//            }
//        });
//
//        values.forEach(i -> System.out.println(i));
//    }


    //method reference
//    {
//        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
//
//
//        values.forEach(System.out::println);
//
//    }


      //stream map reduce
//    {
//        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
//
//        int result = 0;
//
//        for(int i : values)
//        {
//            result = result + i;
//        }
//
//       System.out.println(values.stream().map(i -> i * 2).reduce(0,(c,e) -> c + e));
//
//    }



     //map reduce using binary operator and lambda
//    {
//        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//        Stream s = values.stream();
//        Stream s1 = s.map(new Function<Integer, Integer>() {
//            public Integer apply(Integer i) {
//                return i * 2;
//            }
//        });
//
//        Integer result = (Integer)s1.reduce(0, new BinaryOperator<Integer>() {
//            public Integer apply(Integer i, Integer j) {
//                return i+j;
//            }
//        });
//        System.out.println(result);
//    }



      // filter reduce
//    {
//        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
//
//        int result = 0;
//        for (int i : values) {
//            if (i % 5 == 0) {
//                result += i;
//            }
//        }
//        System.out.println(result);
//
//        System.out.println(values.stream()
//                                 .filter(i -> i % 5 == 0)
//                                 .reduce(0,(c,e) -> c + e));



      //filter reduce predicate interface test method
//    {
//        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);
//
//        Predicate<Integer> p = new Predicate<Integer>() {
//            public boolean test(Integer i) {
//                return i % 5 == 0;
//            }
//        };
//        System.out.println(values.stream()
//                                 .filter(p)
//                                 .reduce(0,(c,e) -> c + e));
//    }



    //find first or else function
//    {
//        List<Integer> values = Arrays.asList(6,88,99);
//
//        System.out.println(values.stream()
//                                 .filter(i -> i % 5 == 0)
//                                 .map(i -> i * 2)
//                                 .findFirst()
//                                 .orElse(0));
//    }


    //lazy evaluation and terminal function
    {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68, 75);

        System.out.println(values.stream()
                                 .filter(Demo::isDivisible)
                                 .map(Demo::mapDouble)
                                 .findFirst()
                                 .orElse(0));
    }
    public static boolean isDivisible(int i)
    {
        return i%5==0;
    }
    public static int mapDouble(int i)
    {
        System.out.println("in mapdouble " +i);
        return i*2;
    }
}