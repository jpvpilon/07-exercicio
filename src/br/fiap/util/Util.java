package br.fiap.util;

import br.fiap.fornecedor.Fornecedor;
import br.fiap.produto.Produto;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Util {
    private Fornecedor[] fornecedor = new Fornecedor[5];
    private Produto[] produto = new Produto[2 * fornecedor.length];

}

private void menuPrincipal() {
    int opcao = 0;
    String menu = "1. Cadastrar Produto\n2. Pesquisar produto por nome\n3. Pesquisar fornecedor por CNPJ\n4. Finalizar";

    while (true) {
        opcao = parseInt(showInputDialog(menu));
        if (opcao == 4) {
            return;
        }

        switch (opcao) {
            case 1:
                cadastrarProduto();
                break;
            case 2:
                pesquisarProduto();
                break;
            case 3:
                pesquisarFornecedor();
                break;
            default:
                showMessageDialog(null, "Opção inválida");
        }

    }
}

public void cadastrarProduto() {

}

public Fornecedor pesquisarFornecedor() {

}

public void pesquisarProduto () {

}


