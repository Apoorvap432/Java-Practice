// // Object ek special class hai Java me jo root class hai.
// // Matlab: har ek class chahe directly ya indirectly, Object se hi inherit karti hai.
// // Agar tum class A {} likhte ho (kuch extend nahi kara), to bhi compiler internally class A extends Object maan leta hai.


// //1.  toString() and equals(Object o)

// class Money {
//     int amount;
//     String currencyCode;

//     Money(int amount, String currencyCode){
//         this.amount = amount;
//         this.currencyCode = currencyCode;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (o == this) return true;                   // self check
//         if (!(o instanceof Money)) return false;      // type check
//         Money other = (Money) o;                      // cast
//         return this.amount == other.amount && 
//                this.currencyCode.equals(other.currencyCode);
//     }
// }



// // 2. hashCode()
// @Override
// public int hashCode() {
//     int result = 17;
//     result = 31 * result + amount;
//     result = 31 * result + (currencyCode == null ? 0 : currencyCode.hashCode());
//     return result;
// }


// //3. (e) Violation Example
// Money cash = new Money(42, "USD");
// WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");

// voucher.equals(cash); // false ✅
// cash.equals(voucher); // true ❌ (symmetry tod diya)



// //(f) hashCode + HashMap Example
// class Team {
//     String city;
//     String dept;

//     Team(String c, String d){
//         city = c;
//         dept = d;
//     }

//     @Override
//     public boolean equals(Object o){
//         if(!(o instanceof Team)) return false;
//         Team other = (Team) o;
//         return city.equals(other.city) && dept.equals(other.dept);
//     }

//     @Override
//     public int hashCode(){
//         return city.hashCode() + dept.hashCode();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Map<Team, String> leaders = new HashMap<>();
//         leaders.put(new Team("NY", "Dev"), "Anne");
//         leaders.put(new Team("Boston", "Dev"), "Brian");

//         Team myTeam = new Team("NY", "Dev");
//         System.out.println(leaders.get(myTeam)); // Anne ✅
//     }
// }
