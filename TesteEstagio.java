public class TesteEstagio {

    public static void main(String[] args) {
        // Executando cada questão separadamente
        System.out.println("=== Questão 1 ===");
        questao1();
        
        System.out.println("\n=== Questão 2 ===");
        questao2(21); // Exemplo com o número 21

        System.out.println("\n=== Questão 3 ===");
        questao3();

        System.out.println("\n=== Questão 4 ===");
        questao4();

        System.out.println("\n=== Questão 5 ===");
        questao5("Beatriz");
    }

    // Questão 1 - Cálculo de soma
    public static void questao1() {
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K++;
            SOMA += K;
        }
        System.out.println("Valor final da variável SOMA: " + SOMA);
    }

    // Questão 2 - Verifica se um número pertence à sequência de Fibonacci
    public static void questao2(int num) {
        int a = 0, b = 1, next = 0;
        boolean pertence = false;

        while (next < num) {
            next = a + b;
            a = b;
            b = next;
        }

        if (next == num || num == 0) {
            pertence = true;
        }

        if (pertence) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }

    // Questão 3 - Faturamento diário da distribuidora
    public static void questao3() {
        double[] faturamento = {
            22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0,
            42889.2258, 46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838,
            2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667,
            18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221,
            13220.495, 8414.61
        };

        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double soma = 0.0;
        int diasValidos = 0;

        // Encontrar menor, maior e soma dos dias com faturamento
        for (double valor : faturamento) {
            if (valor > 0) {
                menorValor = Math.min(menorValor, valor);
                maiorValor = Math.max(maiorValor, valor);
                soma += valor;
                diasValidos++;
            }
        }

        double mediaMensal = soma / diasValidos;
        int diasAcimaMedia = 0;

        // Contar dias acima da média mensal
        for (double valor : faturamento) {
            if (valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        System.out.printf("Menor faturamento do mês: R$ %.2f\n", menorValor);
        System.out.printf("Maior faturamento do mês: R$ %.2f\n", maiorValor);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
    }

    // Questão 4 - Percentual de faturamento por estado
    public static void questao4() {
        double SP = 67836.43;
        double RJ = 36678.66;
        double MG = 29229.88;
        double ES = 27165.48;
        double Outros = 19849.53;

        double total = SP + RJ + MG + ES + Outros;

        System.out.printf("Percentual de SP: %.2f%%\n", (SP / total) * 100);
        System.out.printf("Percentual de RJ: %.2f%%\n", (RJ / total) * 100);
        System.out.printf("Percentual de MG: %.2f%%\n", (MG / total) * 100);
        System.out.printf("Percentual de ES: %.2f%%\n", (ES / total) * 100);
        System.out.printf("Percentual de Outros: %.2f%%\n", (Outros / total) * 100);
    }

    // Questão 5 - Inverter caracteres de uma string
    public static void questao5(String input) {
        StringBuilder invertida = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            invertida.append(input.charAt(i));
        }

        System.out.println("String original: " + input);
        System.out.println("String invertida: " + invertida.toString());
    }
}
