import java.util.Date;
import java.text.SimpleDateFormat;

public class AnomalieEvent {
	private Date date_apparition;
	private String localisation;
	private int niveau;
	private SimpleDateFormat format;
	
	public AnomalieEvent() {
		this.date_apparition = new Date();
		this.setFormat(new SimpleDateFormat("'le' dd MMMM yyyy 'à' hh:mm:ss"));
		
	}

	public Date getDate_apparition() {
		return date_apparition;
	}

	public void setDate_apparition(Date date_apparition) {
		this.date_apparition = date_apparition;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public SimpleDateFormat getFormat() {
		return format;
	}

	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}
	
	
	
	
	
}
