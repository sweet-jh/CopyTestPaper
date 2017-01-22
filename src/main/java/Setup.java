/**
 * Created by hjing on 1/22/17.
 */
public class Setup {
    static public void main(String[] args)
    {
        TestPaper studentA = new StudentACopyTestPaper();
        studentA.question1();

        TestPaper studentB = new StudentBCopyTestPaper();
        studentB.question1();
    }
}
