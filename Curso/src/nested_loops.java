public class nested_loops {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i<= 3; i++) {          // for loops = loop dentro de outro loop
            for (int j = 1; j <= 9; j++) {     //             normalmente usado em matrizes e estrutura de data
                System.out.print(j);
            }
            System.out.println();
        }



    }
}
