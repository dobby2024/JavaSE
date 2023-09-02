package section15.access1;

public class SoccerTeam implements Cloneable{
	
	public String teamName;
	public String location;
	public int since;
	public String league;
	
	public SoccerTeam(String teamName, 
			String location, 
			int since, 
			String league) {
		
		this.teamName = teamName;
		this.location = location;
		this.since = since;
		this.league = league;
	}
	
	@Override
	public String toString() {
		return teamName + "@" + league;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Object callClone() throws CloneNotSupportedException {
		return clone();
	}
	
}



