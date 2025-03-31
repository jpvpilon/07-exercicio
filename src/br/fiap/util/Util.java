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
    private int idxFornecedor = 0;
    private int idxProduto = 0;

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
    String nome;
    int qtdEstoque;
    double valorUnitario;
    Fornecedor fornecedor = pesquisarFornecedor();
    if (fornecedor == null) {
        cadastrarFornecedor();
    }
}

public void cadastrarFornecedor() {
    long cnpj = parseLong(showInputDialog("CNPJ do fornnecedor"));
    String nome = showInputDialog("Fornecedor")
    fornecedor[idxFornecedor] = new Fornecedor(nome, cnpj);
    idxFornecedor++;
}

public Fornecedor pesquisarFornecedor() {
    long cnpj = parseLong(showInputDialog("CNPJ do fornecedor"));

    for (int i = 0; i < idxFornecedor; i++) {
        if (fornecedor[i].getCNPJ() == cnpj) {
            return fornecedor[i];
        }
    }
}

public void pesquisarProduto() {

}


