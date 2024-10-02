package sept.ex_20092024;

public class IfandElse_loop {

    public static void main(String[] args) {

        char grade = 'F';
        int score = 25;

        if (score >= 90 && score <= 100 ){
            grade ='A';
        } else if (score >=80 && score<=89) {
            grade ='B';
        } else if (score >=80 && score<=89) {
            grade ='c';
        } else {
            grade ='F';

        }
        System.out.println("your grade is ->" + grade);

    }
}
