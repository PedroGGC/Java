package AtvAvaliativa;

class Acomodacao implements Reservavel {
    // Encapsulamento com uso de private e métodos getters/setters
    private int numeroQuarto;
    private double valorDiaria;

    // Construtor - inicializa os atributos da classe
    public Acomodacao(int numeroQuarto, double valorDiaria) {
        this.numeroQuarto = numeroQuarto;
        this.valorDiaria = valorDiaria;
    }

    // Getters e Setters
    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    // Método que pode ser sobrescrito nas subclasses - Polimorfismo (Sobrescrita)
    public double calcularValorEstadia(int dias) {
        return valorDiaria * dias;
    }

    // Implementação do método da interface Reservavel
    public void realizarReserva() {
        System.out.printf("Reserva realizada para o quarto %d ", numeroQuarto);
    }
}
