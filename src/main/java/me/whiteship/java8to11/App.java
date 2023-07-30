package me.whiteship.java8to11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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


        System.out.println("Spring으로 시작하는 수업");
        // TODO
        System.out.println("close되지 않은 수업");
        // TODO
        System.out.println("수업이름만 모아서 스트림 만들기");
        // TODO

        System.out.println("두 수업목록에 들어있는 모든 수업아이디 출력");
        // TODO
        System.out.println("10부터 1씩 증가하는 무제한 스트림중에서 앞에 10개 빼고 최대 10개 까지만");
        // TODO
        System.out.println("자바수업 중에 Test가 들어있는 수업이 있는지 확인");
        // TODO





    }


}
