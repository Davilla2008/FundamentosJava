// 1 - Pacote
package fundamentos;
// 2 - Biblicotecas
import java.util.Scanner;
// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in);

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        String opcao = "";
        int area = 0; // recebe o resultado dos calculos de area

       // while (!opcao.toUpperCase().equals("S")){

        System.out.println("Escolha o Calculo Desejado ");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(2) - Area do Triangulo");
        System.out.println("(4) - Area do Círculo");
        System.out.println("(5) - Tabuada");
        System.out.println("(6) - Fibonacci");
        System.out.println("(7) - Contagem Regressiva");
            System.out.println("(8) - Divisao por Zero");
        System.out.println("(S) - Sair");


    opcao = entrada.nextLine(); // Leitura da opçao
    switch (opcao) {
        case "1":
            area = calcularAreaDoQuadrado();
            break;
        case "2":
            // ToDo: calcular área do retangulo
            break;
        case "5":
            tabuada();
            break;
        case "6":
            fibonacci();
            break;
        case "7":
            contagemRegressiva();
            break;
        case"8":
            divisaoPorZero();
        case "s":
        case "S":
            System.out.println("Agradecemos pela preferencia! Fui!!");
            break;
        default:
            System.out.println("Opção Invalida: " + opcao);
    }
    if (area > 0) {
        System.out.println("A área é de " + area + "m²");
    }
    }

    //}

    public static int calcularAreaDoQuadrado() {

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado

        // Desenhar o quadrado
        for (int linha = 1; linha <= lado; linha += 2) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");
            }
            System.out.println(""); // Pular de linha
        }
        System.out.println(""); // pular de linha

        return lado * lado; // retorna a area do quadrado
    }

    public static void tabuada() {
        System.out.print("Você quer calcular a tabuada de qual número? ");
        byte numero = entrada.nextByte();

        for (byte i = 1; i <= 10; i++) {
            System.out.print(numero * i + " ");
        }
    }

    public static void fibonacci() {
        System.out.print("Quantos números deseja calcular na sequencia? ");
        byte numero = entrada.nextByte();

        switch (numero){
            case 0:
                System.out.println("A sequencia está vazia. ");
                break;
            case 1:
                System.out.println("Sequencia de Fibonacci: 1");
                break;
            default:
                int num1 = 0;
                int num2 = 1;
                System.out.print("Sequencia de Fibonacci: 1 ");
                for(byte i = 2; i<=numero; i ++){
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;
                }
        }

    }
    public static void contagemRegressiva(){
        System.out.print("Começar a contagem de qual número? ");
        int numero = entrada.nextInt();
        System.out.print("Diminuindo de quantos emquantos numeros por vez? ");
        int decrescimo = entrada.nextInt();
        for (int i = numero; i >= 1; i-=decrescimo){
            System.out.println(i);
        }

    }
    public static void divisaoPorZero(){
        try{
        System.out.print("Qual é o dividendo? (numero a ser dividido) ");
        byte dividendo = entrada.nextByte();
        System.out.print("Qual é o divisor? (numero que divide o dividendo) ");
        byte divisor = entrada.nextByte();



            System.out.println("O resultado é: " +  dividendo / divisor);
        }
        catch(Exception e){

            System.out.println("Mensagem Temporaria em Ingleso: " + e.getMessage());

            }
        finally {
            System.out.println("Por hoje é só pessoal!!");
        }



        }


    }














