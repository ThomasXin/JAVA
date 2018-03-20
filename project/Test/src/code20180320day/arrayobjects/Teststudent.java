package code20180320day.arrayobjects;

import com.sun.corba.se.spi.orbutil.fsm.State;

public  class	Teststudent{
	
	public static void main(String[] args) {
		Student  [] stus = new  Student[20];// 声明并开辟长度
		
		for (int i = 0; i < stus.length; i++) {
			
			int state = (int)(Math.random()*3 + 1); //年级
			int score = (int)(Math.random()*101); // 分数
			stus[i] = new Student(i +1,state,score); 
		}
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].getState() == 3) {
				
				System.out.println(stus[i].toString());
			}
		}
		
		
	}
	
}


class Student {
	private int number;
	private int state;
	private int score;
	
	
	
	public Student(int number, int state, int score) {
		this.number = number;
		this.state = state;
		this.score = score;
	}
	
	public Student() {
		super();
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", state=" + state + ", score="
				+ score + "]";
	}

	
	
}
