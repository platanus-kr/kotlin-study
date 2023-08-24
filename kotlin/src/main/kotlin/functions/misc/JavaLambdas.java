package functions.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 * 자바의 Functional Programming을 위한 노력들
 */
public class JavaLambdas {




    private List<Fruit> findApples(List<Fruit> fruits) {
        List<Fruit> apples = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getName().equals("사과")) {
                apples.add(fruit);
            }
        }
        return apples;
    }



    private List<Fruit> findBananas(List<Fruit> fruits) {
        List<Fruit> apples = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getName().equals("바나나")) {
                apples.add(fruit);
            }
        }
        return apples;
    }

    // -> 이런식으로 증식하는건 중복이라... 이런걸 만드는데..

    private List<Fruit> findFruitWithName(List<Fruit> fruits, String name) {
        // 이렇게 만듬
        List<Fruit> apples = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getName().equals(name)) {
                apples.add(fruit);
            }
        }
        return apples;
    }

    // 하지만 조건이 복잡해 질 수록 감당이 안됨.....

    // 그래서 인터페이스를 만드는데....

    private List<Fruit> filterFruit(List<Fruit> fruits, FruitFilter fruitFilter) {
        List<Fruit> results = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruitFilter.isSelected(fruit)) {
                results.add(fruit);
            }
        }
        return results;
    }

    private void justRun1() {
        JavaLambdas j = new JavaLambdas();
        List<Fruit> fruits = List.of(new Fruit("사과", 1_000L));

        j.filterFruit(fruits, new FruitFilter() {
            @Override
            public boolean isSelected(Fruit fruit) {
                return false; // 조건....
            }
        });
    }

    // 그러나 익명클래스는 코드가 너무 복잡해지고, 다른 조건이 들어오면 힘들어지는것은 여전하다.
    // 그래서 Funtional Programming을 위한 노력은..

    private List<Fruit> filterFruit2(List<Fruit> fruits, Predicate<Fruit> fruitFilter) {
        return fruits.stream()
                .filter(fruitFilter) // <- 요기임.
                .collect(Collectors.toList());
    }

    private void justRun2() {
        JavaLambdas j = new JavaLambdas();
        List<Fruit> fruits = List.of(new Fruit("사과", 1_000L));

        j.filterFruit2(fruits, fruit -> fruit.getName().equals("사과"));
    }

    // 자바에서는 메소드를 넘겨주는 것 '처럼' 쓸수 있다. 자바에서 함수는 2급시민이기 때문이다.

    // Lambdas.kt 에서 계속....

}

class Fruit {
    private final String name;
    private final long price;

    Fruit(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}

interface FruitFilter {
    boolean isSelected(Fruit fruit);
}