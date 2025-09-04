class ControlFlow{
    public static void main(String[] args){
        //-----if-else----------

        int a = 5;
        int b = 8;
        if(a>b) {
            System.out.println("a is the greater number here!");
        } else {
            System.out.println("b is the greater number here!");
        }


        //-----switch-case----------
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
        }   
        
        //----------------loops---------------=
        // 1. for loop
        for (int c = 0; c<=5; c++){
            System.out.println("For loop: " + c);
        }

        // 2. While loop 
        int d=0;
        while (d<=5) {
            System.out.println("While loop: " + d);
            d++;
        }

        // 3. do-while loop
        int e = 5;
        do {
            System.out.println("Do-while loop: " + e);
            e++;
        } while (e <= 10);



        //------------break statement---------------
        for (int f = 10; f < 15; f++) { 
            if(f==14){
                System.out.println("Break statement: " + f);
                break;
            }
            System.out.println(f);      
        }


        //------------continue----------------------
        for(int g = 0; g < 20; g++){
            if(g % 2 == 0){
                continue;
            }
            System.err.println("only odd numbers: " + g);
        }


        //-----------------nested loops---------------
        for(int h = 0; h < 5; h++){
            for(int i = 0; i < 2; i++){
                System.out.println("h is: " + h + "\ni is: " + i);
            }
        }
    }
}