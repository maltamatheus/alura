package escolasis.teste;

import java.time.LocalDate;

public class Testes{

	public static void main(String[] args) {
		
		String valor = "1980-06-26";
		
		System.out.println(valor.split("-")[0]);
		System.out.println(valor.split("-")[1]);
		System.out.println(valor.split("-")[2]);
		
		Integer ano = Integer.parseInt(valor.split("-")[1]);
		
		System.out.println(ano);
		
		System.out.println(LocalDate.of(Integer.parseInt(valor.split("-")[0]), 
				                        Integer.parseInt(valor.split("-")[1]),
				                        Integer.parseInt(valor.split("-")[2])));

		/*
		Pessoa eu  = new Pessoa("08766985773","Matheus",LocalDate.of(1980, 6, 26),1L);
		Pessoa eu1 = new Pessoa("11111111111","Matheus1",LocalDate.of(1980, 6, 26),1L);
		Pessoa eu2 = new Pessoa("22222222222","Matheus2",LocalDate.of(1980, 6, 26),1L);
		Pessoa eu3 = new Pessoa("33333333333","Matheus3",LocalDate.of(1980, 6, 26),1L);
		Pessoa eu4 = new Pessoa("44444444444","Matheus4",LocalDate.of(1980, 6, 26),1L);
		
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		listaPessoas.add(eu);
		listaPessoas.add(eu1);
		listaPessoas.add(eu2);
		listaPessoas.add(eu3);
		listaPessoas.add(eu4);
		*/
//		PapelPessoa papel = new PapelPessoa(1L, "professor");
		
//		DaoFactory.getDaoFactory().getPapelPessoaDao().salvar(papel);
	
//		System.out.println(eu);
		
//		List<PapelPessoa> lista = DaoFactory.getDaoFactory().getPapelPessoaDao().listar();
//		
//		for (PapelPessoa papelPessoa : lista) {
//			System.out.println(papelPessoa);
//		}
		
//		for (Pessoa pessoa : listaPessoas) {
//			
//			DaoFactory.getDaoFactory().getPessoaDao().salvar(pessoa);
//			
//		}
	}

}