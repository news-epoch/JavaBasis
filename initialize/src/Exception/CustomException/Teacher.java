package Exception.CustomException;

public class Teacher {
    public  void checkScore(int score) throws ScoreException{
        if (score < 1 || score > 100){
            throw new ScoreException();
        }
    }
}
