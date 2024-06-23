package ch003;

public class FootballPlayer {

public int no;	
public String name;
public boolean inPlay;
public int minutes;
public int numberOfGoals;




void play(int minutesToPlay)
{
	
	if( inPlay == true)
	{
		minutes = minutes + minutesToPlay;
		System.out.println("Oyuncunu "+ minutesToPlay + " dakikadır oyunda.");
	}else
	{
		minutesToPlay = 0;
		System.out.println("Oyuncunu daha oyuna girmedi.");

	}
}

void score(int goalCount)
{
	this.numberOfGoals = numberOfGoals + goalCount;
	System.out.println("Oyun skoru : " + numberOfGoals);
}


}
