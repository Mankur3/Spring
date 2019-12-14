//import java.net.URI;
//import java.util.LinkedHashMap;
//import java.util.List;
//
//import com.springboot.model.User;
//import org.junit.jupiter.api.Test;
//import org.springframework.web.client.RestTemplate;
//
//public class SpringBootRestAPITests {
//
//    public static final String REST_SERVICE_URI = "http://192.168.43.221:8080/BootRestAPI/";
//
//    /* GET */
//    @SuppressWarnings("unchecked")
//    @Test
//    private static void listAllUsersTest(){
//        System.out.println("Testing listAllUsersTest API-----------");
//
//        RestTemplate restTemplate = new RestTemplate();
//        List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI+"/user/", List.class);
//
//        if(usersMap!=null){
//            for(LinkedHashMap<String, Object> map : usersMap){
//                System.out.println("User : id="+map.get("id")+", Name="+map.get("name")+", Age="+map.get("age")+", Salary="+map.get("salary"));;
//            }
//        }else{
//            System.out.println("No user exist----------");
//        }
//    }
//
//    /* GET */
//    @Test
//    private static void getUser(){
//        System.out.println("Testing getUser API----------");
//        RestTemplate restTemplate = new RestTemplate();
//        User user = restTemplate.getForObject(REST_SERVICE_URI+"/user/1", User.class);
//        System.out.println(user);
//    }
//
//    /* POST */
//    private static void createUser() {
//        System.out.println("Testing create User API----------");
//        RestTemplate restTemplate = new RestTemplate();
//        User user = new User(0,"ankur",25,12344);
//        URI uri = restTemplate.postForLocation(REST_SERVICE_URI+"/user/", user, User.class);
//        System.out.println("Location : "+uri.toASCIIString());
//    }
//
//    /* PUT */
//    private static void updateUser() {
//        System.out.println("Testing update User API----------");
//        RestTemplate restTemplate = new RestTemplate();
//        User user  = new User(1,"Punit",23, 70000);
//        restTemplate.put(REST_SERVICE_URI+"/user/1", user);
//        System.out.println(user);
//    }
//
//    /* DELETE */
////    private static void deleteUser() {
////        System.out.println("Testing delete User API----------");
////        RestTemplate restTemplate = new RestTemplate();
////        restTemplate.delete(REST_SERVICE_URI+"/user/3");
////    }
//
//
//    /* DELETE */
////    private static void deleteAllUsers() {
////        System.out.println("Testing all delete Users API----------");
////        RestTemplate restTemplate = new RestTemplate();
////        restTemplate.delete(REST_SERVICE_URI+"/user/");
////    }
//    @Test
//    void test(){
//        listAllUsersTest();
//        getUser();
//        createUser();
//        listAllUsersTest();
//        updateUser();
//        listAllUsersTest();
////        deleteUser();
////        listAllUsersTest();
////        deleteAllUsers();
////        listAllUsersTest();
//    }
//}