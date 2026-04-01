package loops;

// public class triangle {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=4;j++){
//                 System.err.print("*");
//                 if(i==j){
//                     break;
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }


public class normal_triangle {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}

