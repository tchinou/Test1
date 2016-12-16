package beans;

public class StudentHibernateNaveen {

	int idS;
	String nameS;
	String emailS;
	int markS;
	public StudentHibernateNaveen(){
		
	}
	public StudentHibernateNaveen(int idS, String nameS, String emailS, int markS) {
		super();
		this.idS = idS;
		this.nameS = nameS;
		this.emailS = emailS;
		this.markS = markS;
	}
	
	
	public int getIdS() {
		return idS;
	}
	public void setIdS(int idS) {
		this.idS = idS;
	}
	public String getNameS() {
		return nameS;
	}
	public void setNameS(String nameS) {
		this.nameS = nameS;
	}
	public String getEmailS() {
		return emailS;
	}
	public void setEmailS(String emailS) {
		this.emailS = emailS;
	}
	public int getMarkS() {
		return markS;
	}
	public void setMarkS(int markS) {
		this.markS = markS;
	}
	
}
