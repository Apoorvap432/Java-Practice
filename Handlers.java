//step 1- model (basic class)
// public class Handlers {
//     public final int id;
//     public final String name;
// }



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



// Step 3: Controller (UserController.java)
// public class UserController {
//     public static Handler fetchAllUsernames = ctx -> {
//         UserDao dao = UserDao.instance();
//         Iterable<String> allUsers = dao.getAllUsernames();
//         ctx.json(allUsers);
//     };

//     public static Handler fetchById = ctx -> {
//         int id = Integer.parseInt(ctx.pathParam("id"));
//         UserDao dao = UserDao.instance();
//         Optional<User> user = dao.getUserById(id);

//         if (user.isPresent()) {
//             ctx.json(user.get());
//         } else {
//             ctx.html("Not Found");
//         }
//     };
// }


// Step 4: Routes Register Karna
// app.get("/users", UserController.fetchAllUsernames);
// app.get("/users/{id}", UserController.fetchById);