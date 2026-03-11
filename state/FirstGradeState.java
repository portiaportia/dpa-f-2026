package state;

public class FirstGradeState extends State {
    private static final String FILE_NAME = "state/txt/first.txt";

    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        words = FileReader.getWords(FILE_NAME);
    }

    @Override
    public void increaseGrade() {
        System.out.println("Moving to Second Grade...");
        spellingList.setState(spellingList.getSecondGradeState());
    }

    @Override
    public void decreaseGrade() {
        System.out.println("You can't go below First Grade...");
    }
}
