//1. local variable.. jo srf us method ya class k andr tk hi accessible hoga fir dlte ho jaega. Isme access modifier ni honge 

// class VariableScope { 
//     void Number(){
//         int x = 45;
//         System.out.println("Your number is: " + x);
//     }
//     public static void main(String[] args) {
//         VariableScope obj = new VariableScope();
//         obj.Number();
//         // System.out.println(x);        --> ye yaha pe kaam ni kregi qki x yaha accessible ni hoga 
//     }
// }


//instance / non-static variable

class VariableScope{
    int rollNo;
    String name;

    void setData(int r, String n){
        rollNo = r;
        name = n;
    }

    void Show() {
        System.out.println(rollNo + " " + name);
    }

    public static void main(String[] args) {
        VariableScope obj1 = new VariableScope();
        obj1.setData(1, "Appu");
        obj1.Show();

        VariableScope obj2 = new VariableScope();
        obj2.setData(2, "Apoorva");
        obj2.Show();
    }
}