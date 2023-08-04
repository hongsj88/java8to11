package me.whiteship.java8to11;

import java.awt.event.KeyEvent;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args){
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(1, "spring boot", true));
        javaClasses.add(new OnlineClass(2, "spring data jpa", true));
        javaClasses.add(new OnlineClass(3, "spring mvc", false));
        javaClasses.add(new OnlineClass(4, "spring core", false));
        javaClasses.add(new OnlineClass(5, "rest api development", false));

        List<List<OnlineClass>> keesunEvents = new ArrayList<>();
        keesunEvents.add(springClasses);
        keesunEvents.add(javaClasses);

        System.out.println("Spring으로 시작하는 수업");
        springClasses.stream().filter(s->s.getTitle().startsWith("spring"))
                .forEach(s-> System.out.println(s.getTitle()));
        System.out.println("close되지 않은 수업");
        springClasses.stream().filter(Predicate.not(OnlineClass::isClosed))
                .forEach(s-> System.out.println(s.getId()));


        // TODO

        System.out.println("두 수업목록에 들어있는 모든 수업아이디 출력");
        keesunEvents.stream().flatMap(Collection::stream)
                .forEach(oc-> System.out.println(oc.getTitle()));

        System.out.println("10부터 1씩 증가하는 무제한 스트림중에서 앞에 10개 빼고 최대 10개 까지만");
        IntStream.iterate(10,i->i+1)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("자바수업 중에 Test가 들어있는 수업이 있는지 확인");
        boolean test = springClasses.stream().anyMatch(s->s.getTitle().contains("Test"));
        System.out.println(test);

        System.out.println("수업이름만 모아서 제목만 모아서 list 만들기");
        List<String> spring = springClasses.stream().map(s->s.getTitle())
                .filter(t->t.contains("spring"))
                .collect(Collectors.toList());
        spring.forEach(System.out::println);


        System.out.println(springClasses.stream().count());

    }


}
