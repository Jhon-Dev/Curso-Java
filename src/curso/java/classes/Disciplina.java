package curso.java.classes;

/*Essa classe Disciplina servirá para todos objetos e instâncias de notas e materias*/
public class Disciplina {

	private double nota1;
	private String disciplina1;

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina1 == null) ? 0 : disciplina1.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (disciplina1 == null) {
			if (other.disciplina1 != null)
				return false;
		} else if (!disciplina1.equals(other.disciplina1))
			return false;
		if (Double.doubleToLongBits(nota1) != Double.doubleToLongBits(other.nota1))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [nota1=" + nota1 + ", disciplina1=" + disciplina1 + "]";
	}

}
