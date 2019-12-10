package zadatak;

import java.util.ArrayList;

public class Ugovor {
	
	
	private Osoba fizickoLice;
	private Osoba sluzbenoLice;
	private double vrednostUgovora;
	private int trajanjeUgovora;
	private boolean luskuzan;
	private Object listaUgovora;
	public Ugovor(Osoba fizickoLice, Osoba sluzbenoLice, double vrednostUgovora, int trajanjeUgovora) {
		super();
		this.fizickoLice = fizickoLice;
		this.sluzbenoLice = sluzbenoLice;
		this.vrednostUgovora = vrednostUgovora;
		this.trajanjeUgovora = trajanjeUgovora;
		this.luskuzan = luskuzan;
		
		boolean luksuzan;
		if(vrednostUgovora > 10000) {
			luksuzan = true;
		}else {
			luksuzan = false;
		}
	}
	public void Ugovor(Osoba p, Osoba x, int vrednostUgovora2, int trajanjeUgovora2) {
		// TODO Auto-generated constructor stub
	}
	public void Ugovor1(Osoba p, Osoba x, int vrednostUgovora2, int trajanjeUgovora2) {
		// TODO Auto-generated constructor stub
	}
	public Osoba getFizickoLice() {
		return fizickoLice;
	}
	public void setFizickoLice(Osoba fizickoLice) {
		this.fizickoLice = fizickoLice;
	}
	public Osoba getSluzbenoLice() {
		return sluzbenoLice;
	}
	public void setSluzbenoLice(Osoba sluzbenoLice) {
		this.sluzbenoLice = sluzbenoLice;
	}
	public double getVrednostUgovora() {
		return vrednostUgovora;
	}
	public void setVrednostUgovora(double vrednostUgovora) {
		this.vrednostUgovora = vrednostUgovora;
	}
	public int getTrajanjeUgovora() {
		return trajanjeUgovora;
	}
	public void setTrajanjeUgovora(int trajanjeUgovora) {
		this.trajanjeUgovora = trajanjeUgovora;
	}
	public boolean isLuskuzan() {
		return luskuzan;
	}
	public void setLuskuzan(boolean luskuzan) {
		this.luskuzan = luskuzan;
	}
	@Override
	public String toString() {
		return "Ugovor [fizickoLice=" + fizickoLice + ", sluzbenoLice=" + sluzbenoLice + ", vrednostUgovora="
				+ vrednostUgovora + ", trajanjeUgovora=" + trajanjeUgovora + ", luskuzan=" + luskuzan + "]";
	}
	
	
	
	
	
	

}
