package arenadosherois;

public class Arqueiro extends Personagem {
	
	public Arqueiro(String nome) {
		super(nome, 80, 20); //vida alta e dano base
	}
	@Override
	public void atacar(Personagem Oponente) {
		Oponente.receberDano(this.getDanoBase());
		System.out.println(getNome() + " Disparou em flecha em " + Oponente.getNome()+ " à distância");
	}

}
