import java.util.Date;
import java.util.EventObject;
import java.text.SimpleDateFormat;

public abstract class AnomalieEvent extends EventObject {
	private Date date_apparition;
	private String localisation;
	private int niveau;
	private SimpleDateFormat format;
	
	public AnomalieEvent(Object source) {
		super(source);
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

	public String get_type_anomalie() {
		return null;
	}
	
	public void print_Anomalie() {
		System.out.println("Détail de l'anomalie :");
		System.out.println(" - Type de danger : " + this.get_type_anomalie());
		System.out.println(" - Date : " + this.date_apparition);
		System.out.println(" - Localisation : " + this.localisation);
		System.out.println(" - Niveau de danger : " + this.niveau + "\n");
		
		
	}
	
	
	
}
