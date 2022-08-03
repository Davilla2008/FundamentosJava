// 1 - Pacote
package fundamentos;
// 2 - Biblicotecas
import java.util.Scanner;
// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);

    // 3.2 - Métodos e Funções
    public static void main(String[] args){
        String opcao;
        int area = 0; // recebe o resultado dos calculos de area

        System.out.println("Escolha o Calculo Desejado ");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(2) - Area do Triangulo");
        System.out.println("(4) - Area do Círculo");

        opcao = entrada.nextLine(); // Leitura da opçao
        switch (opcao){
            case "1":
               area = calcularAreaDoQuadrado();
                break;
            case "2":
                // ToDo: calcular área do retangulo
                break;
            default:
                System.out.println("Opção Invalida: " + opcao);
        }
        if (area > 0){
            System.out.println("A área é de " + area + "m²");
        }


    }
    public static int calcularAreaDoQuadrado(){

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado * lado; // retorna a area do quadrado



    }

}
