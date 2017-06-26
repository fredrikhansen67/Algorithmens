import java.util.stream.IntStream;

/**
 * Created by pappa on 2017-06-26.
 */
public class Pyramid {

    public void runProgram() {
        int j = 0;
        for(;j<=10;j++){
            int finalJ = j;
            //Puts the first star at the top postiion, only done once
            if(j==0) {
                IntStream.range(0, 2 * j - j).forEach(s -> {
                    System.out.print(" ");
                });
                IntStream.range(0, 2 * j - 1).forEach(s -> {
                    System.out.print("*");
                    if (s == 2 * finalJ - 2) {
                        System.out.println();
                    }
                });
                continue;
            }
            //The rest of the tree is printed....
            IntStream.range(0, 10- j).forEach(s -> {
                System.out.print(" ");
            });
            IntStream.range(0, 2 * j - 1).forEach(s -> {
                System.out.print("*");
                if (s == 2 * finalJ - 2) {
                    System.out.println();
                }
            });
        }

    }

    public void runProgramUpsidedown(){

        int j = 10;
        for(;j>=0;j--) {
            int finalJ = j;
            IntStream.range(0, 10 - j).forEach(s -> {
                System.out.print(" ");
            });
            IntStream.range(0, 2 * j - 1).forEach(s -> {
                System.out.print("*");
                if (s == 2 * finalJ - 2) {
                    System.out.println();
                }
            });
        }
    }

}
