package QuizApp;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[4];
    public QuestionService() {
        questions[0] = new Question(1, "Which is a common welcoming greeting in Spanish?", (new String[] {"hi", "bye", "ciamo", "hola"}), "hola");
        questions[1] = new Question(2, "Who killed the sun?", (new String[] {"Bob", "Teletubbies kid", "Bill Nye", "Roblox Kid"}), "Teletubbies kid");
        questions[2] = new Question(3, "Which is the best programming language?", (new String[] {"Python", "Java", "C#", "HTML"}), "Python");
        questions[3] = new Question(4, "What is the best utensil brand?", (new String[] {"Doms", "Faber Castell", "Tincondegora", "Pen+Gear"}), "Doms");

    }
    public void playQuiz(){
        String selections[] = new String[4];
        int score = 0;
        for (int i=0; i<4; i++){
            Question Q = questions[i];
            System.out.println("Question #"+Q.getId());
            System.out.println(Q.getQuestion());
            for (String option: Q.getOptions()){
                System.out.println(" - "+option);
            }
            Scanner sc = new Scanner(System.in);
            selections[i] = sc.nextLine();
            if (selections[i].equals(Q.getAnswer())){
                score++;
            }
        }
        for (String s:selections){
            System.out.println(s);
        }
        System.out.println("Your Score is: "+score);

    }
}
