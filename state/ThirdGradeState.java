package state;

public class ThirdGradeState extends State {
    private static final String FILE_NAME = "state/txt/third.txt";

    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        words = FileReader.getWords(FILE_NAME);
    }

    @Override
    public void increaseGrade() {
        System.out.println("Sorry, we currently only have up to third grade in our system...");
    }

    @Override
    public void decreaseGrade() {
        System.out.println("Moving to Second Grade...");
        spellingList.setState(spellingList.getSecondGradeState());
    }
}
