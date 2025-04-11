package AtvAvaliativa;

// Subclasse - Herança de Acomodacao
class Suite extends Acomodacao {
    // Construtor chamando o construtor da superclasse
    public Suite(int numeroQuarto, double valorDiaria) {
        super(numeroQuarto, valorDiaria);
    }

    // Sobrescrita de método - Polimorfismo
    @Override
    public double calcularValorEstadia(int dias) {
        return super.calcularValorEstadia(dias) * 1.2;
    }

    @Override
    public void realizarReserva() {
        System.out.printf("Reserva realizada para Suite numero %d\n ", getNumeroQuarto());
    }
}
