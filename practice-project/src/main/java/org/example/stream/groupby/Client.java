package org.example.stream.groupby;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.groupingBy;

public class Client {


    public static void main(String[] args) {
        Employee e1 = new Employee(1, "karuna", 20);
        Employee e2 = new Employee(2, "kerena", 32);
        Employee e3 = new Employee(3, "therasa", 54);
        Employee e4= new Employee(4,  "amma", 54);
        Employee e5 = new Employee(5, "akka", 26);
        Employee e6 = new Employee(6, "james", 26);
        Employee e7 = new Employee(7, "karuna", 20);


        List<Employee> elist = Arrays.asList(e1, e2, e3, e4, e5 ,e6, e7);


        System.out.println(elist.stream().collect(groupingBy(Employee::getAge,  groupingBy(Employee::getName))));
        System.out.println(elist.stream().collect(groupingBy(Employee::getName,  averagingInt(Employee::getAge))));
        System.out.println(elist.stream().collect(groupingBy(Employee::getName, Collectors.toSet())));
        System.out.println(String.valueOf(elist.stream().collect(groupingBy(Employee::getName, TreeMap::new , Collectors.toSet()))));


        System.out.println(
                //convert the employee to list of age
                elist.stream().map(e-> e.getAge()).collect(Collectors.toList())
                        //create the summary statistyic and get the average
                        .stream().mapToInt(f->f).summaryStatistics().getAverage());


        System.out.println(
                //creating list with the employee name
                elist.stream().map(e-> e.getName()).collect(Collectors.toList()).
                        //joining all the names with the delimiter ,
                        stream().collect(Collectors.joining(",  "))


        );
//create the set element
Set<String> names = new HashSet<>();
        System.out.println(
                //create a list of employee names
                elist.stream().map(e-> e.getName()).collect(Collectors.toList()).
                        //create the filter which will add the vallue in the set and see what is the return type , if it is false collect it in teh list
                        stream().filter(e-> !names.add(e)).collect(Collectors.toList())

        );


        int[] a = {1, 2, 3, 4, 5};
        int [] b = {2, 4, 7};

        System.out.println(

                //createing the stream from array a and doing filter
                Arrays.stream(a).filter(aval ->
                        //creating stream from band finding anymatch with the aval
                        Arrays.stream(b).anyMatch(bval ->
                                bval==aval))
                                    .boxed().collect(Collectors.toList()));







        int[] c = {1,2,3,4,5};


        IntStream.range(0, c.length/2).forEach(
                i->
                {

                }


        );









    }
}
