package curso.java.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import curso.java.classes.Aluno;
import curso.java.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 0; qtd <= 1; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno" + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade?"); String
			 * dataNascumento = JOptionPane.showInputDialog("Qual a data de nascimento?");
			 * String registroGeral = JOptionPane.showInputDialog("Registro Geral?"); String
			 * cpf = JOptionPane.showInputDialog("Qual � o cpf?"); String NomeMae =
			 * JOptionPane.showInputDialog("Qual � o nome da m�e?"); String NomePai =
			 * JOptionPane.showInputDialog("Qual � o nome do Pai?"); String DataMatricula =
			 * JOptionPane.showInputDialog("Qual � a matricula?"); String NomeMatricula =
			 * JOptionPane.showInputDialog("Qual � o nome da Matricula?"); String
			 * SerieMatriculado = JOptionPane.showInputDialog("Qual a serie matriculada?");
			 * String NomeEscola = JOptionPane.showInputDialog("Qual � o nome da escola?");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascumento);
			 * aluno1.setRegistroGeral(registroGeral); aluno1.setNumeroCpf(cpf);
			 * aluno1.setNomeMae(NomeMae); aluno1.setNomePai(NomePai);
			 * aluno1.setDataMatricula(DataMatricula);
			 * aluno1.setNomeMatricula(NomeMatricula);
			 * aluno1.setSerieMatriculado(SerieMatriculado);
			 * aluno1.setNomeEscola(NomeEscola);
			 */

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
				String nota = JOptionPane.showInputDialog("Nta da disciplina?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(nota));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

			if (escolha == 0) { /* Op��o sim � (0) */

				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {

					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}
			alunos.add(aluno1);
		}

		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("alex")) {
				System.out.println(aluno.toString()); /* Descri��o do objeto na memoria */
				System.out.println("M�dia do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.print("-------------------------------------------------------------------");
				break;
			}

		}
	}
}
