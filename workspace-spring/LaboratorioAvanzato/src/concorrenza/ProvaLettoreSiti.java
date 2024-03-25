package concorrenza;

public class ProvaLettoreSiti {

	public static void main(String[] args) {

		String[] siti = {
				"https://immaginazioneelavoro.it/",
				"https://www.lastampa.it/",
				"https://news.google.com/home?hl=it&gl=IT&ceid=IT:it",
				"https://www.repubblica.it/il-gusto/dossier/benessere-a-tavola-/2024/03/24/news/friggere_in_modo_salutare-422267554/",
				"https://www.media.inaf.it/2024/03/22/stella-seconda-generazione-lmc/",
		};

		int i = 1;
		for (String sito : siti) {
			
//			String[] split = sito.split("i/");
			String path = "C:\\Users\\teacher\\Desktop\\siti\\";
			
			LettoreSitiWeb lsw = new LettoreSitiWeb(sito, (path + "file" + (i++) + ".html"));
			
			lsw.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		

	}

}
