/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Fær inn heiltölu og prentar út * í línu t.d.
 *            input = 3;
 *            *
 *            **
 *            ***
 *            input = 4;
 *            *
 *            **
 *            ***
 *            ****
 *
 *            og áfram eins eftir input stærð.
 *
 *****************************************************************************/
public class Triangle {
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(args[0]);
        for (int row = 1; row <= inputNumber; ++row) {
            for (int col = 1; col <= row; ++col) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
