
public class Aritmetica implements ICalcMedia {

	@Override
	public double CalculaMedia(double p1, double p2) {
		return (p1 + p2) / 2;
	}

	@Override
	public String Situacao(double media) {
		String situacao;
		if (media > 5.0) {
			situacao = "Aprovado";
		} else {
			situacao = "Reprovado";
		}
		return situacao;
	}

}
