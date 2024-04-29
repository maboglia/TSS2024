package comportamentali.memento;

public class TextDemo {

	public static void main(String[] args) {
		TextDocument documento = new TextDocument();
		
		documento.write("password");
		documento.write("12345");
		documento.save();
		documento.print();
		documento.write("54321");
		documento.print();
		documento.undo();
		documento.print();
		

	}

}
