package com.ifpb.cadastroproduto.control;

import com.ifpb.cadastroproduto.model.Produto;

import java.util.Arrays;

public class CadastroProduto {

    private Produto[] produtos;
    private int quantidade;

    public CadastroProduto(){
        produtos = new Produto[2];
        quantidade = 0;
    }

    public boolean salvar(Produto produto, int posicao){
        if(posicao>=0 && posicao<=quantidade){

            if(isCheio()){
                aumentarArray();
            }

            for(int i = quantidade; i>posicao; i--){
                produtos[i] = produtos[i-1];
            }

            produtos[posicao] = produto;
            quantidade++;
            return true;

        }else{
            return false;
        }
    }

    public boolean salvar(Produto produto){

        if(isCheio()){
            aumentarArray();
        }

        if(buscarPorCodigo(produto.getCodigo()) == null){
            produtos[quantidade++] = produto;
            return true;
        }else{
            return false;
        }
    }

    private void aumentarArray() {
        produtos = Arrays.copyOf(produtos, produtos.length*2);
    }

    private boolean isCheio() {
        return quantidade == produtos.length;
    }

    public Produto buscarPorCodigo(int codigo){
        for(int i=0; i<quantidade; i++){
            if(produtos[i].getCodigo() == codigo){
                return produtos[i];
            }
        }
        return null;
    }

    private int posicaoPorCodigo(int codigo){
        for(int i=0; i<quantidade;i++){
            if(produtos[i].getCodigo() == codigo){
                return i;
            }
        }
        return -1;
    }

    public Produto buscarPorPosicao(int posicao){
        if(posicao >=0 && posicao < quantidade){
            return produtos[posicao];
        }else{
            return null;
        }
    }

    public Produto[] listar(){
        return Arrays.copyOfRange(produtos, 0, quantidade);
    }

    public boolean atualizar(Produto produto){
        int i = posicaoPorCodigo(produto.getCodigo());

        if(i>=0){
            produtos[i] = produto;
            return true;
        }else{
            return false;
        }
    }

    public boolean excluir(int codigo){
        int i = posicaoPorCodigo(codigo);

        if(i>=0){
            for(int j=i; j<quantidade-1;j++){
                produtos[j] = produtos[j+1];
            }
            quantidade--;
            return true;
        }else{
            return false;
        }
    }

}
