import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List <User> users = new ArrayList<>();
        users.add(new User(1, "Evelina", "Markova", 22, "Russia"));
        users.add(new User(2, "Pavel", "Panov", 27, "Russia"));
        users.add(new User(3, "Riccardo", "Bertolini", 35, "Italy"));
        users.add(new User(4, "Joe", "Sugg", 5, "England"));
        System.out.println("Sorting by last name:");
        sortByLastName(users);
        System.out.println();
        System.out.println("Sorting by age:");
        sortByAge(users);
        System.out.println();
        checkAge(users);
        System.out.println();
        System.out.println("Average age:");
        System.out.println(calcuateAvgAge(users));
        System.out.println();
        System.out.println("Unique countries:");
        getUniqueCountries(users);
    }

    private static void sortByLastName(List <User> users) {
        Stream<User> usersStream = users.stream();
        usersStream
                .sorted(Comparator.comparing(User::getLastName))
                .forEach(user->System.out.println(user.toString()));
    }

    private static void sortByAge(List <User> users) {
        Stream<User> usersStream = users.stream();
        usersStream
                .sorted(Comparator.comparingInt(User::getAge))
                .forEach(user->System.out.println(user.toString()));
    }

    public static void checkAge(List <User> users) {
        Stream<User> usersStream = users.stream();
        List <User> filteredUsers = usersStream
                .filter(user -> user.getAge() > 7)
                .collect(Collectors.toList());
        if (users.size() == filteredUsers.size()) {
            System.out.println("All users are older than 7 years");
            return;
        }
        List<User> youngerUsers = users.stream()
                .filter(user -> !filteredUsers.contains(user))
                .collect(Collectors.toList());
        System.out.println("Users younger than 7 years:");
        youngerUsers.forEach(user -> System.out.println(user.toString()));
    }

    public static float calcuateAvgAge(List <User> users) {
        Stream<User> usersStream = users.stream();
        int sum = usersStream
                .mapToInt(user -> user.getAge())
                .sum();
        return (float) sum/users.size();
    }

    public static void getUniqueCountries(List <User> users) {
        Stream<User> usersStream = users.stream();
        List <String> usersList = usersStream
                .map(user -> user.getCountry())
                .distinct()
                .collect(Collectors.<String>toList());
        String result = String.join(", ", usersList);
        System.out.println(result);
    }
}