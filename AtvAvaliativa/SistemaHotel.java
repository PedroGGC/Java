package AtvAvaliativa;

// Interface - abstração do comportamento de uma reserva
interface Reservavel {
    void realizarReserva(); // Método a ser implementado pelas acomodações
}

// Classe principal
public class SistemaHotel {
    public static void main(String[] args) {
        // Criando objetos das subclasses (Polimorfismo em ação)
        Acomodacao quarto = new QuartoSimples(101, 150.0);
        Acomodacao suite = new Suite(104, 300.0);

        // Teste de reservas
        quarto.realizarReserva();
        suite.realizarReserva();

        // Cálculo de estadia
        System.out.printf("Valor da estadia (5 dias) - Quarto Simples: R$ %.2f\n", quarto.calcularValorEstadia(5));
        System.out.printf("Valor da estadia (5 dias) - Suite: R$ %.2f", suite.calcularValorEstadia(5));
    }
}

