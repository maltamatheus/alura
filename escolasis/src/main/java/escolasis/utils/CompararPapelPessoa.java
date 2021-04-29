package escolasis.utils;

import java.util.Comparator;

import escolasis.modelo.PapelPessoa;

public class CompararPapelPessoa implements Comparator<PapelPessoa>{

	@Override
	public int compare(PapelPessoa o1, PapelPessoa o2) {
		return o1.getIdPapelPessoa().compareTo(o2.getIdPapelPessoa());
	}

}
