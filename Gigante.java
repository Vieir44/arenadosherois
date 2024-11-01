package arenadosherois;

public class Gigante extends Personagem{
	public Gigante(String nome) {
		super(nome, 200, 40); //vida alta e dano base
	}
	
	@Override
	public void atacar(Personagem Oponente) {
		int distancia = calcularDistancia(Oponente);
		if(distancia <=1) {
			Oponente.receberDano(this.getDanoBase());
			System.out.println(getNome() + " atacou " + Oponente.getNome()+ " Com força bruta.");
		}else {
			System.out.println(getNome() + " Está muito longe para atacar! ");
		}
	}

}
