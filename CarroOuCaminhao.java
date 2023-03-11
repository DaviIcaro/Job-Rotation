public class CarroOuCaminhao {
    public static void main(String[] args) {
        double distanciaTotal = 100; // em km
        double velocidadeCarro = 110; // em km/h
        double velocidadeCaminhao = 80; // em km/h
        double tempoPedagio = 5.0 / 60; // em horas
        
        // Calcula o tempo que o carro leva para chegar ao ponto de cruzamento
        double tempoCarro = distanciaTotal / (2 * velocidadeCarro);
        
        // Calcula o tempo que o caminhão leva para chegar ao ponto de cruzamento
        double tempoCaminhao = distanciaTotal / (2 * velocidadeCaminhao) + 2 * tempoPedagio;
        
        // Calcula a distância que cada veículo está da cidade de Ribeirão Preto no momento do cruzamento
        double distanciaCarro = distanciaTotal / 2;
        double distanciaCaminhao = distanciaTotal / 2 + velocidadeCaminhao * tempoPedagio;
        
        // Verifica qual veículo está mais próximo da cidade de Ribeirão Preto
        if (distanciaCarro < distanciaCaminhao) {
            System.out.println("O carro está mais próximo da cidade de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão está mais próximo da cidade de Ribeirão Preto.");
        }
    }
}


// CHEGUEI AO RESULTADO FAZENDO UM SIMPLES PROGRAMA EM JAVA UTILIZANDO  A FORMULA tempo = distância / velocidade.

// DESSA FORMA o carro estará a uma distância de 50 km, enquanto o caminhão está a uma distância de 56,67 km. Ou seja o carro é mais rapido.