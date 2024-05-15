
public class Disciplina {
	private ICalcMedia calcMedia;
	double media;
	private String nome;
	private double p1;
	private double p2;
	String situacao;

	public ICalcMedia getCalcMedia() {
		return calcMedia;
	}

	public double getMedia() {
		return media;
	}

	public String getNome() {
		return nome;
	}

	public double getP1() {
		return p1;
	}

	public double getP2() {
		return p2;
	}

	public String getSituacao() {
		return calcMedia.Situacao(media);
	}

	public void setCalcMedia(ICalcMedia calcMedia) {
		this.calcMedia = calcMedia;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public void CalcularMedia() {
		media = calcMedia.CalculaMedia(p1, p2);
	}

	public Disciplina(ICalcMedia calcMedia) {
		this.calcMedia = calcMedia;
	}

}
