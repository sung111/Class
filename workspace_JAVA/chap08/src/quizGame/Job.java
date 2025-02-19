package quizGame;

public class Job implements Gamejob{

	
	// 모든캐릭터 피,마나 고정
	int hp = 100;
	int mp = 50;
	//공격력
	int power = 10;
	
	@Override
	public void attack(Gamejob job) {
		if(job instanceof Gamejob) {
			job.attack(job);
		}
	}

	@Override
	public void defense(Gamejob job) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heal(Gamejob job) {
		// TODO Auto-generated method stub
		
	}
	

}
