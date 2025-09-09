import java.util.*; //list k liye ye package import krna hi pdta h 

public class ListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Appu");
        list.add("Mikku");
        list.add("Apoorva");
        list.add("Arnav");
        System.out.println(list);   //[Appu, Mikku, Apoorva, Arnav]


        //index 3 pe element insert kro
        list.add(3, "and");
        System.out.println(list);

        //element ko access kro
        System.out.println(list.get(3));    //and 
        System.err.println(list.indexOf("Mikku"));     //1

        //element remove kro 
        list.remove(3);
        System.out.println(list);

        //element replace kro
        list.set(0, "Appu Panwar");
        System.out.println(list);

        //sublist nikaalo 
        List<String> sublist = list.subList(1, 3);
        System.out.println(sublist);
    }
}
