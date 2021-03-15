package domen;

import java.util.Date;

public class KucnaHemija extends Artikal{
	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja.after(new Date()))
			this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return "Kucna Hemija [rokTrajanja=" + rokTrajanja + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
