package AtvAvaliativa;

// Subclasse - Herança de Acomodacao
class QuartoSimples extends Acomodacao {
    // Construtor chamando o construtor da superclasse
    public QuartoSimples(int numeroQuarto, double valorDiaria) {
        super(numeroQuarto, valorDiaria);
    }

    // Sobrescrita de método  - Polimorfismo
    @Override
    public double calcularValorEstadia(int dias) {
        return super.calcularValorEstadia(dias);
    }

    @Override
    public void realizarReserva() {
        System.out.printf("Reserva realizada para Quarto Simples numero %d\n", getNumeroQuarto());
    }
}

