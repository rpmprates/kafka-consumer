package rpmproject.kafka.consumer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Aplication {

    public static void main(String[] args) {
        Aplication aplicacao = new Aplication();
        aplicacao.iniciar();
    }

    private void iniciar() {
        log.info("Iniciando a aplicação");
        ConsumidorEvento consumidor = new ConsumidorEvento();
        consumidor.executar();
    }
}

