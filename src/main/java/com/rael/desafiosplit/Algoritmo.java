package com.rael.desafiosplit;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo {

    public static void main(String[] args) {
        String dados = "Israel;DesvSis;2021;SENAI";
        RepresentaSeparado a1 = separar(dados);
        
        System.out.println(a1.toString());

    }

    public static RepresentaSeparado separar(String recebe) {
        
        recebe = recebe + ";";
        
        String aux = "";
        List<String> arrayCampos = new ArrayList();
        
         for (int i = 0; i < recebe.length(); i++) {
            
            if (recebe.charAt(i) != ';') {
                
                aux = aux + recebe.charAt(i);
                
            } else {
                
                arrayCampos.add(aux);
                aux = "";
                
            }
            
        }
        // Exibição do vetor - somente para teste.
        for (String t : arrayCampos) {
            System.out.println(t);
        }
        
        RepresentaSeparado alunoTemp = new RepresentaSeparado();
        alunoTemp.setNome(arrayCampos.get(0));
        alunoTemp.setCurso(arrayCampos.get(1));
        alunoTemp.setAno(   arrayCampos.get(2)  );
        alunoTemp.setEscola(arrayCampos.get(3));
        
        return alunoTemp;
    }

}
