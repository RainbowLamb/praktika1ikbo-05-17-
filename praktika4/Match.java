import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Match extends JFrame implements ActionListener{

    int FRAME_WIDTH = 400;
    int FRAME_HEIGHT = 300;
    int MilanScore = 0;
    int MadridScore = 0;
    String Winner = "";
    String LastScorerString = "";

    JLabel Result = new JLabel("Result: "+MilanScore+" X "+MadridScore);
    JLabel LastScorer = new JLabel("Last Scorer: "+LastScorerString);
    JLabel WinnerLabel = new JLabel("Winner: "+Winner);

    JButton AddScoreToMilan = new JButton("AC Milan");
    JButton AddScoreToMadrid = new JButton("Real Madrid");

    public Match()
    {   super("Score");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLayout(null);
        Font fnt = new Font("Arial",Font.BOLD,20);
        Result.setBounds(20,20,200,40);
        LastScorer.setBounds(20,60,300,40);
        WinnerLabel.setBounds(20,100,300,40);
        AddScoreToMilan.setBounds(0,170,200,40);
        AddScoreToMadrid.setBounds(200,170,200,40); 
        Result.setFont(fnt);
        LastScorer.setFont(fnt);
        WinnerLabel.setFont(fnt);
        add(Result);
        add(LastScorer);
        add(WinnerLabel);
        add(AddScoreToMadrid);
        add(AddScoreToMilan);
        AddScoreToMilan.addActionListener(this);
        AddScoreToMadrid.addActionListener(this); }
    
    public void checkWinner()
    {   if(MadridScore > MilanScore)
            Winner = "Real Madrid";
        else if(MadridScore < MilanScore)
            Winner = "AC Milan";
        else
            Winner = "DRAW";}
    
    public void actionPerformed(ActionEvent evt) 
    { Object src = evt.getSource();
        if (src == AddScoreToMadrid) {
            MadridScore++;
            LastScorerString = "Real Madrid";
            checkWinner();
            WinnerLabel.setText("Winner: "+Winner);
            Result.setText("Result: "+MilanScore+" X "+MadridScore);
            LastScorer.setText("Last Scorer: "+LastScorerString);}
            else if (src == AddScoreToMilan) {
            MilanScore++;
            LastScorerString = "AC Milan";
            checkWinner();
            WinnerLabel.setText("Winner: "+Winner);
            Result.setText("Result: "+MilanScore+" X "+MadridScore);
            LastScorer.setText("Last Scorer: "+LastScorerString);}
    }


    public static void main(String[] args)
    { new Match().setVisible(true);}
}
