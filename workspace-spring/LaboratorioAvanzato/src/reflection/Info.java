package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Info {

	public static void main(String[] args) {
		
		String classDaCostruire = "reflection.Libro";
		
		try {
			Class<?> classGenerica = Class.forName(classDaCostruire);
			
			String nomeClasse = classGenerica.getSimpleName();
			
			System.out.println(nomeClasse);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Libro l = new Libro("Io robot", "I. Asimov");
		
		Class<? extends Libro> class1 = l.getClass();
		
		System.out.println("Name: "+class1.getName());
		System.out.println("PackageName: "+class1.getPackageName());
		System.out.println("SimpleName: "+class1.getSimpleName());
		
		Method[] methods = class1.getMethods();

		for (Method method : methods) {
			System.out.println("Metodo: "+method.getName());
		}
		
		Constructor<?>[] constructors = class1.getConstructors();
		
		for (Constructor<?> constructor : constructors) {
			System.out.println("Costruttore: " + constructor.getName());
		}
		
	}

}
