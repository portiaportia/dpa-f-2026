package state;

public class SecondGradeState extends State {
    private static final String FILE_NAME = "state/txt/second.txt";

    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        words = FileReader.getWords(FILE_NAME);
    }

    @Override
    public void increaseGrade() {
        System.out.println("Moving to Third Grade...");
        spellingList.setState(spellingList.getThirdGradeState());
    }

    @Override
    public void decreaseGrade() {
        System.out.println("Moving to First Grade...");
        spellingList.setState(spellingList.getFirstGradeState());
    }
}
