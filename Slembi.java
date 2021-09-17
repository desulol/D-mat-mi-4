/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Prentar út slembitölu á bilinu 0.0 og 1.0. Ef talan er >=0.8
 *            hættir lykkjan.
 *
 *****************************************************************************/
public class Slembi {
    public static void main(String[] args) {
        double randomNumber = StdRandom.uniform(0.0, 1.0);
        double stopCheck = 0.8;
        while (randomNumber < stopCheck) {
            System.out.println(+randomNumber);
            randomNumber = StdRandom.uniform(0.0, 1.0);
        }
    }
}
