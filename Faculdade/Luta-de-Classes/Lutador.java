public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso= peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
	}
	
	public void apresentar() {
		System.out.println(""+this.getNome());
		System.out.println("Nacionalidade: "+this.getNacionalidade());
		System.out.println("Idade: "+this.getIdade()+" anos");
		System.out.println("Altura: "+this.getAltura());
		System.out.println("Peso: "+this.getPeso()+ "Kg");
		System.out.println("Vitorias: " +this.getVitorias());
		System.out.println("Derrotas: "+this.getDerrotas());
		System.out.println("Emapates: "+this.getEmpates());
	}
	
	public void status() {
		System.out.println(this.getNome() + "");
		System.out.println(this.getIdade() + " anos");
		System.out.println(this.getAltura() + " de altura");
		System.out.println(this.getPeso() + " Kg");
		
	}

	 public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getNacionalidade() {
	        return nacionalidade;
	    }

	    public void setNacionalidade(String nacionalidade) {
	        this.nacionalidade = nacionalidade;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public float getAltura() {
	        return altura;
	    }

	    public void setAltura(float altura) {
	        this.altura = altura;
	    }

	    public float getPeso() {
	        return peso;
	        
	    }

	    public void setPeso(float peso) {
	        this.peso = peso;
	        
	    }


	    public int getVitorias() {
	        return vitorias;
	    }

	    public void setVitorias(int vitorias) {
	        this.vitorias = vitorias;
	    }

	    public int getDerrotas() {
	        return derrotas;
	    }

	    public void setDerrotas(int derrotas) {
	        this.derrotas = derrotas;
	    }

	    public int getEmpates() {
	        return empates;
	    }

	    public void setEmpates(int empates) {
	        this.empates = empates;
	    }
}