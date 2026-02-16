import java.util.*;
public class QuizTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "1. Which is the capital of India? \nA) Mumbai \nB) Delhi \nC) Kolkata \nD) Chennai",
            "2. Who is known as father of computer? \nA) Charles Babbage \nB) Bill Gates \nC) Steve Jobs \nD) Alan Turing",
            "3. Which planet is known as Red Planet? \nA) Earth \nB) Mars \nC) Venus \nD) Jupiter",
            "4. What is the national animal of India? \nA) Lion \nB) Tiger \nC) Elephant \nD) Peacock",
            "5. Which is the largest ocean? \nA) Atlantic \nB) Pacific \nC) Indian \nD) Arctic",
            "6. Who invented telephone? \nA) Alexander Graham Bell \nB) Edison \nC) Newton \nD) Tesla",
            "7. Which gas is essential for breathing? \nA) Oxygen \nB) Nitrogen \nC) Carbon dioxide \nD) Hydrogen",
            "8. How many states are there in India? \nA) 28 \nB) 29 \nC) 27 \nD) 30",
            "9. Which is the fastest land animal? \nA) Tiger \nB) Horse \nC) Cheetah \nD) Leopard",
            "10. Who wrote 'Ramayana'? \nA) Valmiki \nB) Tulsidas \nC) Kalidas \nD) Ved Vyas"
        };
        char[] answers = {'B','A','B','B','B','A','A','A','C','A'};
        int score = 0;
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter your answer (A/B/C/D): ");
            char userAns = sc.next().toUpperCase().charAt(0);

            if(userAns == answers[i]) {
                System.out.println("Correct!\n");
                score += 5;
            } else {
                System.out.println("Wrong!");
                score -= 2;
            }
        }
        System.out.println("Your Total Score = " + score);
        sc.close();
    }
}
