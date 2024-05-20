package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

    public class ConjuntoEspalhamento4 {
        private final List<List<String>> tabela = new ArrayList<List<String>>();

        public ConjuntoEspalhamento4() {
            for (int i = 0; i < 26; i++) {
                LinkedList<String> lista = new LinkedList<String>();
                tabela.add(lista);
            }
        }

        public void adiciona(String palavra) {
            if (!this.contem(palavra)) {
                int indice = this.calculaIndiceDaTabela(palavra);
                List<String> lista = this.tabela.get(indice);
                lista.add(palavra);
                this.tamanho++;
            }
        }

        public boolean contem(String palavra) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            return lista.contains(palavra);
        }

        private int tamanho = 0;

        public List<String> pegaTodas() {
            List<String> palavras = new ArrayList<String>();
            for (int i = 0; i < this.tabela.size(); i++) {
                palavras.addAll(this.tabela.get(i));
            }
            return palavras;
        }
        public void remove(String palavra) {
            if (this.contem(palavra)) {
                int indice = this.calculaIndiceDaTabela(palavra);
                List<String> lista = this.tabela.get(indice);
                lista.remove(palavra);
                this.tamanho--;
            }
        }
        private int calculaCodigoDeEspalhamento(String palavra){
            int codigo = 1;
            for (int i = 0; i < palavra.length(); i++) {
                codigo = 31 * codigo + palavra.charAt(i);
            }
            return codigo;
        }
        private int calculaIndiceDaTabela(Object objeto) {
            int codigoDeEspalhamento = objeto.hashCode();
            codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
            return codigoDeEspalhamento % tabela.size();
        }

        public void imprimeTabela(){
            for (List<String> lista : this.tabela) {System.out.print("[");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.print("*");
                }
                System.out.println("]");
            }
        }
        public List<Object> pegaTodos() {
            List<Object> objetos = new ArrayList<Object>();
            for (int i = 0; i < this.tabela.size(); i++) {
                objetos.addAll(this.tabela.get(i));
            }
            return objetos;
        }
    }


