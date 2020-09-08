package curso.java.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.classes.Aluno;
import curso.java.classes.Diretor;
import curso.java.classes.Disciplina;
import curso.java.classesauxiloares.FuncaoAutenticao;
import curso.java.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		try {
			lerArquivo();

			String login = JOptionPane.showInputDialog("Informe o Login");
			String senha = JOptionPane.showInputDialog("Informe a Senha");

			if (new FuncaoAutenticao(new Diretor(login, senha)).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
					String idade = JOptionPane.showInputDialog("Qual a idade?");

					String dataNascumento = JOptionPane.showInputDialog("Qual a data de nascimento?");
					String registroGeral = JOptionPane.showInputDialog("Registro Geral?");
					String cpf = JOptionPane.showInputDialog("Qual é o cpf?");
					String NomeMae = JOptionPane.showInputDialog("Qual é o nome da mãe?");
					String NomePai = JOptionPane.showInputDialog("Qual é o nome do Pai?");
					String DataMatricula = JOptionPane.showInputDialog("Qual é a matricula?");
					String NomeMatricula = JOptionPane.showInputDialog("Qual é o nome da Matricula?");
					String SerieMatriculado = JOptionPane.showInputDialog("Qual a serie matriculada?");
					String NomeEscola = JOptionPane.showInputDialog("Qual é o nome da escola?");

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));

					aluno1.setDataNascimento(dataNascumento);
					aluno1.setRegistroGeral(registroGeral);
					aluno1.setNumeroCpf(cpf);
					aluno1.setNomeMae(NomeMae);
					aluno1.setNomePai(NomePai);
					aluno1.setDataMatricula(DataMatricula);
					aluno1.setNomeMatricula(NomeMatricula);
					aluno1.setSerieMatriculado(SerieMatriculado);
					aluno1.setNomeEscola(NomeEscola);

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
						String nota = JOptionPane.showInputDialog("Nota da disciplina?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						// disciplina.setNota(Double.valueOf(nota));

						aluno1.getDisciplinas().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

					if (escolha == 0) { /* Opção sim é (0) */

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

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) { /* Separei em listas */

					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}

				}

				System.out.println("------------------- Lista dos Aprovados ---------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ " Com media de = " + aluno.getMediaNota());
				}

				System.out.println("------------------- Lista de Recuperação ---------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ " Com media de = " + aluno.getMediaNota());
				}

				System.out.println("------------------- Lista dos Reprovados ---------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
							+ " Com media de = " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}

		} catch (Exception e) {

			StringBuilder saida = new StringBuilder();

			/* Imprimi erro no console Java */
			e.printStackTrace();

			/* Mensagem do erro ou causa */
			System.out.println("Mensagem" + e.getMessage());

			for (int pos = 0; pos < e.getStackTrace().length; pos++) {

				saida.append("\n Classe de erro : " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Método de erro : " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro : " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n Linha de erro : " + e.getClass().getName());

				JOptionPane.showMessageDialog(null, "Erro ao processar notas" + saida.toString());
			}

		} finally { /* Sempre é execultado occorendo erros ou não */

			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java comigo");
		}
	}

	public static void lerArquivo() throws FileNotFoundException {

		File fil = new File("c://New.txt");
		Scanner scanner = new Scanner(fil);
	}

}
