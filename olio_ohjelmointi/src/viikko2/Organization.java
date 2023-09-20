package viikko2;

public class Organization {
	private String nimi;
	private double  vuosittainenTulo;
	private  boolean voittoaTavoitteleva;
	
	 public Organization(String nimi, double vuosittainenTulo, boolean voittoaTavoitteleva) {
	        this.nimi = nimi;
	        this.vuosittainenTulo = vuosittainenTulo;
	        this.voittoaTavoitteleva = voittoaTavoitteleva;
	    }
	 
	 public String getNimi() {
	        return nimi;
	    }
	 public void setNimi(String nimi) {
		 if (nimi != null && !nimi.isEmpty()) {
			 this.nimi = nimi;
		 } else {
			System.out.println("Virhe: Nimi ei voi olla tyhjä");
		}
	 }
	 
	 public double getVuosittainenTulo() {
		 return vuosittainenTulo;
	 }
	 
	 public void setVuosittainenTulo(double vuosittainenTulo) {
		 if (vuosittainenTulo >= 0) {
			 this.vuosittainenTulo = vuosittainenTulo;
		 } else {
			System.out.println("Virhe: Vuosittainen tulo ei voi alla negaatiivinen");
		}
	 }
	 
	 public boolean isVoittoaTavoitteleva() {
		 return voittoaTavoitteleva;
	 }
	 
	 public void setVoittoaTavoitteleva(boolean voittoaTavoitteleva) {
		 this.voittoaTavoitteleva = voittoaTavoitteleva;
	 }
	 
	 public void näytäTiedot() {
	        System.out.println("Organisaation nimi: " + nimi);
	        System.out.println("Vuosittainen tulo: $" + vuosittainenTulo);
	        System.out.println("Voittoa tavoitteleva: " + (voittoaTavoitteleva ? "Kyllä" : "Ei"));
	    }
	    
	    public void displayInfo() {
	    	System.out.println("Organisaation nimi: " + nimi);
	    	System.out.println("Vuosittainen tulo: $" + vuosittainenTulo);
	    	System.out.println("Voittoa tavoitteleva: "+ (voittoaTavoitteleva ? "Kyllä" : "Ei"));
	    }
	}

