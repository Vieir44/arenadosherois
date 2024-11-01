package arenadosherois;

public class Guerreiro extends Personagem {

	public Guerreiro(String nome) {
		super(nome, 150, 30); //vida alta e dano base

	}
	
	@Override
	public void atacar(Personagem Oponente) {
		int distancia = calcularDistancia(Oponente);
		if(distancia <= 1) {
			Oponente.receberDano(this.getDanoBase());
			System.out.println(getNome() + " atacou " + Oponente.getNome() + " com sua espadsa");
		}
		else {
			System.out.println(getNome() + " Está muito longe para atacar ");
		}
	}

}
