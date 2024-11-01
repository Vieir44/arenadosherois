package arenadosherois;

public class Mago extends Personagem {
	
	private int mana;
	
	public Mago(String nome) {
		super(nome, 100, 25); //Menos Vida, ataque muito moderado
		this.mana = 50;
	}
	
	@Override
	public void atacar(Personagem Oponente) {
		if(mana >= 10) {
			Oponente.receberDano(this.getDanoBase()+ 15); //Causa dano extra com magia
			mana -= 10;
			System.out.println(getNome() + " Lançou um feitiço em " + Oponente.getNome() + "à distância ");
		}
		else {
			System.out.println(getNome() + "Não tem mana o suficiente para atacar!");
		}
	}

	

	}


