package test;

public class Course {
	private String cno; //�γ̱��
	private String cname; //�γ�����
	private double credit; //ѧ��
	private int period; //ѧʱ
	public Course(){
		
	}
	public Course(String cno,String cname,double credit, int period) {
		this.cno = cno;
		this.cname = cname;
		this.credit = credit;
		this.period = period;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCno() {
		return cno;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCname() {
		return cname;
	}
	public void setCredit() {
		this.credit=credit;
	}
	public double getCredit() {
		return credit;
	}
	public void setPeriod() {
		this.period=period;
	}
	public int getPeriod() {
		return period;
	}
	public String toString() {
		return cno+" "+ cname+" "+credit+" "+period;
	} 

}
