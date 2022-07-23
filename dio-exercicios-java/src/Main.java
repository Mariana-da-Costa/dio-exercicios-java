public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício calculadora");
        Calculadora.soma(2, 8);
        Calculadora.subtracao(15, 9.5);
        Calculadora.multiplicacao(5, 5);
        Calculadora.divisao(7, 1.5);

        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(20);

        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(8000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(8000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(8000, 4);
    }

}
