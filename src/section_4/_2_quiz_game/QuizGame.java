package section_4._2_quiz_game;

import javax.swing.*;

public class QuizGame {
	public static void main(String[] args) {
int score = 0;
JOptionPane.showMessageDialog(null,"Hello and Welcome to My Quiz Game");
JOptionPane.showMessageDialog(null, "There are 5 questions in total, answer them all right and you get nothing!");
String answer = JOptionPane.showInputDialog("Are there are 24 hours in a day");
if(answer.equalsIgnoreCase("Yes")) {
	JOptionPane.showMessageDialog(null,"Correct!");
	score = score +1;
}
else {
	JOptionPane.showMessageDialog(null,"Wrong!");
	
	
}

String answer1 = JOptionPane.showInputDialog(null, "Did Shakespeare invent many words like 'elbow'");
if(answer1.equalsIgnoreCase("yes")) {
JOptionPane.showMessageDialog(null, "Correct!");
score = score +1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong!");
}

String answer2 = JOptionPane.showInputDialog(null, "Are there 12 Holidays in a day");
if(answer2.equalsIgnoreCase("No")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score +1;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong! There are actully 11 Holidays in a year");
}

JOptionPane.showMessageDialog(null, "Now time for some tricky questions");

String answer3 = JOptionPane.showInputDialog(null, "Are there 4 days that begin win the letter 't'");
if(answer3.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score + 1;
}
else { JOptionPane.showMessageDialog(null, "Wrong! The 4 days are Tuesday, Thursday, Today, and Tomorrow");
}
JOptionPane.showMessageDialog(null, "Last Question");

String answer4 = JOptionPane.showInputDialog(null, "How many month's' has 28 days, 'write your answer in word form'");
if(answer4.equalsIgnoreCase("twelve")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score = score + 1;
}
else { JOptionPane.showMessageDialog(null, "Wrong! All the months have 28 days");
}



JOptionPane.showMessageDialog(null, "You're Done! Now lets see how you did");
JOptionPane.showMessageDialog(null, "Your Score is " +score+ " out of 5");
if(score == 0) {
	JOptionPane.showMessageDialog(null,  "Wow, you can't even get the first question right, I don't think you need luck if you can't get the first one right");
}
if(score == 1) {
	JOptionPane.showMessageDialog(null,  "You did bad, but atleast you now know some things, better like next time");
}
if(score == 2) {
	JOptionPane.showMessageDialog(null, "You did, I'd say like good but better luck next time");
}
if(score == 3) {
	JOptionPane.showMessageDialog(null, "You did well, the as two was tricky");
}
if (score == 4) {
	JOptionPane.showMessageDialog(null, "Nice, too bad that you got one wrong but Great Job!");;
}
if (score == 5) {
	JOptionPane.showMessageDialog(null, "Awesome! You Got it all correct give yourself a pat on the back for completing this very bad quiz I made");
}
}
	}


