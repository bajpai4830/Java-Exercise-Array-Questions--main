/* Task 
1. Create an array of String with 5 names. 
2. Write a method findName(String[] arr, String name) that returns true if 
the name exists. 
3. Test it with different names. */
public class exercise8 {

    public static void main(String[] args) {
        String[] names = {"Ayush", "Abhay", "Ishika", "Gigras", "amit"};
        System.out.println(findName(names, "Ayush")); 
        System.out.println(findName(names, "amit")); 
    }

    public static boolean findName(String[] arr, String name) {
        for (String n : arr) {
            if (n==name) {
                return true;
            }
        }
        return false;
    }
}
