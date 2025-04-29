import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

//        1. Filter and Print Odd Numbers from a List
//        Given a list of integers, write a Java Stream code to filter out even numbers and print the odd numbers.
       Integer[] arr={2,4,5,6,7,8,9};
        System.out.println("Printing odd Numbers");
        List<Integer> integerList=Arrays.asList(arr);
        integerList.stream().filter(x->x%2!=0).forEach(System.out::println);
        System.out.println("*******************************");
        System.out.println("Print Sum  of All Numbers");
         int sum=integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum All Numbers :"+sum);
        System.out.println("Find Maximum Number :");
        integerList.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);
        System.out.println("*******************************");

//        4. Count Words Starting with 'A'
        List<String> strings= Arrays.asList("Apple","Orange","Apricot");

        strings.stream().filter(x->x.charAt(0)=='A').forEach(System.out::println);
        System.out.println("*******************************");

        //. Average of Even Numbers
        //Write a Java Stream program to calculate the average of all even numbers in a list.
        System.out.println("Write a Java Stream program to calculate the average of all even numbers in a list");
       double average= integerList.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.println("Average :"+average);
        System.out.println("*******************************");

       //6. Convert List of Strings to Uppercas
        System.out.println("6. Convert List of Strings to Uppercase");
        strings.stream().map(x->x.toUpperCase()).forEach(System.out::println);
        System.out.println("*******************************");

        // 7. Remove Duplicates and Sort
       // Given a list of integers, remove the duplicates and sort them in ascending order using Java Streams.
        System.out.println("7. Remove Duplicates and Sort :");
        List<Integer> numbers = Arrays.asList(5, 3, 9, 5, 1, 3, 8);
         numbers.stream().distinct().sorted().forEach(System.out::println);

         //8. Group Strings by Length
        //Write a Stream code that groups a list of strings by their length.
        System.out.println(" Group Strings by Length :Write a Stream code that groups a list of strings by their length.");

        List<String> words = Arrays.asList("apple", "bat", "batman", "cherry", "dog", "elephant");

       Map<Integer,List<String>> resulMap= words.stream().collect(Collectors.groupingBy(String::length,Collectors.toList()));

       System.out.println("resulMap :"+resulMap);

        System.out.println("*******************************");


        //9 . Concatenate List of Strings
        //Given a list of strings, concatenate them into a single string, with a space separating each word.

         System.out.println("Given a list of strings, concatenate them into a single string, with a space separating each word.");

        List<String> words1 = Arrays.asList("Hello", "World", "Java", "Stream");
      String strings1=  words1.stream().collect(Collectors.joining(" "));
      System.out.println("string1 :"+strings1);

        System.out.println("*******************************");
//
//        10. Find the First Element Matching a Predicate
//        Write a Java Stream code that finds the first string in a list that has more than 5 characters
        System.out.println("Write a Java Stream code that finds the first string in a list that has more than 5 characters");
        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "date", "kiwi");

        String firstString= words2.stream().filter(x->x.length()>5).findFirst().orElse(null);

        System.out.println("FirstString :"+firstString);

        System.out.println("*******************************");

//        11. FlatMap Example
//        Given a list of lists, flatten the lists and print all the elements.

        System.out.println("Given a list of lists, flatten the lists and print all the elements.");

         List<List<String>> listOfLists = Arrays.asList(
                 Arrays.asList("apple", "banana"),
                 Arrays.asList("cherry", "date"),
                 Arrays.asList("kiwi", "lemon")
                 );

        List<String> flattenedList=listOfLists.stream().flatMap(word->word.stream()).collect(Collectors.toList());
        System.out.println("flattenedList :"+flattenedList);

        System.out.println("*******************************");

//        12. Map to Double the Values
//        Given a list of integers, create a new list where each integer is doubled

        System.out.println("Given a list of integers, create a new list where each integer is doubled");
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        numberList.stream().map(i->i*i).forEach(System.out::println);

        System.out.println("*******************************");


//       13. Find First Element
//       Given a list of integers, find the first element that is divisible by 3.
        System.out.println("Given a list of integers, find the first element that is divisible by 3.");
        List<Integer> numbersList = Arrays.asList(5, 7, 8, 9, 11, 12, 13);
        int m=numbersList.stream().filter(x->x%3==0).findFirst().orElse(0);
        System.out.println("m :"+m);

//
//        Problem: Employee Salary Analysis
//        You are given a list of employees, where each employee has the following fields:
//        id (Integer): Unique identifier of the employee.
//        name (String): Name of the employee.
//        department (String): Department to which the employee belongs.
//        salary (Double): Salary of the employee.
//        Write code using Java Streams to perform the following tasks:
//        Find the employee with the highest salary in each department.
//        Calculate the average salary of employees in the entire company.
//        List the names of employees who earn above the average salary,
//        sorted in descending order of their salaries.
//        Group employees by their departments.
//                Example Input

//
//        List<Employee> employees = Arrays.asList(new Employee(1, "Alice", "HR", 5000.0),new Employee(2, "Bob", "IT", 7000.0),    new Employee(3, "Charlie", "Finance", 6000.0),    new Employee(4, "David", "HR", 4000.0),    new Employee(5, "Eve", "IT", 8000.0),    new Employee(6, "Frank", "Finance", 5500.0));
//        Expected Output
//        Highest Salary in Each Department:
//        HR: Alice
//        IT: Eve
//        Finance: Charlie
//        Average Salary:
//        6083.33
//        Employees Above Average Salary:
//        Eve
//        Bob
//        Employees Grouped by Department:
//        HR: [Alice, David]
//        IT: [Bob, Eve]
//        Finance: [Charlie, Frank]

        List<Employee> employees = Arrays.asList( new Employee(1, "Alice", "HR", 5000.0), new Employee(2, "Bob", "IT", 7000.0),new Employee(3, "Charlie", "Finance", 6000.0),
                new Employee(4, "David", "HR", 4000.0),new Employee(5, "Eve", "IT", 8000.0),new Employee(6, "Frank", "Finance", 5500.0));
       System.out.println("Find the employee with the highest salary in each department. ");

      employees.stream().
               collect(Collectors.groupingBy(Employee::getDepartment,
                       Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)
                       ))).forEach((dep,maxsal)->{

                          maxsal.ifPresent(emp->{
                              System.out.println(dep+":"+emp.getName());
                          });
              });

        System.out.println("*******************************");

      System.out.println(" Calculate the average salary of employees in the entire company. :");

      OptionalDouble averageSal= employees.stream().map(x->x.salary).peek(System.out::println).mapToDouble(Double::doubleValue).average();
       double avgSal= employees.stream().map(x->x.salary).peek(System.out::println).mapToDouble(Double::doubleValue).average().orElse(0.0);
        averageSal.ifPresent(x->{
            System.out.println("Average Salary :"+x);
        });

        System.out.println("*******************************");
        System.out.println("Employees Above Average Salary: sorted in descending order of their salaries");

        employees.stream().filter(x->x.getSalary()>avgSal).sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getName).forEach(System.out::println);
       System.out.println("average Sal :"+avgSal);
        Map<String,Double> employeeAboveAverageSalMap= employees.stream().filter(x->x.getSalary()>avgSal).collect(Collectors.toMap(Employee::getName,Employee::getSalary))
                .entrySet().stream().sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println();

        System.out.println("Employees Above Average Salary sorted in descending order of their salaries: Collected to Map"+employeeAboveAverageSalMap);
        System.out.println("*******************************");

        System.out.println("Employees Grouped by Department:");

        //if you don't use Collectors.mapping here if you use below output will be
        // output:{Finance=[Charlie (6000.0), Frank (5500.0)],
        // HR=[Alice (5000.0), David (4000.0)], IT=[Bob (7000.0), Eve (8000.0)]}

       // employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
       // Map<String,List<Employee>> mapp=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
       // System.out.println(mapp);
         Map<String,  List<String>> employeesGroupedByDep = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName,Collectors.toList())));

        System.out.println("EmployeesGroupedByDep ::"+employeesGroupedByDep);

    }
}



class Employee {
    int id;
    String name;
    String department;
    double salary;
    public Employee(int id, String name, String department, double salary)
    {        this.id = id;
             this.name = name;
             this.department = department;
             this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override    public String toString() {
        return name + " (" + salary + ")";    }
}