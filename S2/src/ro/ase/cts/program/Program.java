package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.UniversalReader;
import ro.ase.cts.clase.readers.EmployeeReader;
import ro.ase.cts.clase.readers.StudentReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = UniversalReader.readAplicants(new EmployeeReader("angajati.txt"));
			for (Aplicant aplicant : listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
