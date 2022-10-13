package q5;

public class Main {

    public static void main(String[] args) {

        Serial s = new Serial();
        Pacote p = new Pacote();
    }

}

//Suponha que você irá desenvolver um módulo para comunicação
//UFALBluetooth. No padrão UFALBluetooth, pode-se ter duas formas de
//comunicação, a saber: serial ou baseado em pacotes. A forma de
//abertura e fechamento de conexão são semelhantes entre ambas.
//Entretanto, a forma de processamento dos dados é diferente.
//Desenvolva uma solução que executa os seguintes passos: (1)
//estabelece uma conexão UFALBluetooth; (2) processa os dados; e (3)
//fecha a conexão. Sua solução deve ser capaz de utilizar qualquer uma
//das formas supracitadas.