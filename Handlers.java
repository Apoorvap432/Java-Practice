//step 1- model (basic class)
public class Handlers {
    public final int id;
    public final String name;
}

//step-2 Data Access Object
// class UserDao {
//     private List<User> users = Arrays.asList(
//         new User(0, "Steve Rogers"),
//         new User(1, "Tony Stark"),
//         new User(2, "Carol Danvers")
//     );

//     private static UserDao userDao = null;

//     static UserDao instance() {
//         if (userDao == null) {
//             userDao = new UserDao();
//         }
//         return userDao;
//     }

//     Optional<User> getUserById(int id) { ... }
//     Iterable<String> getAllUsernames() { ... }
// }

