
package com.rael.desafiosplit;


public class RepresentaSeparado {

    

    String nome;
    String curso;
    int ano;
    String escola;
    
    public RepresentaSeparado() {
   
    }
    
    public RepresentaSeparado(String nome, String curso, int ano, String escola) {
        this.nome = nome;
        this.curso = curso;
        this.ano = ano;
        this.escola = escola;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }
   
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setAno(String anoTexto) {
        
        this.ano = Integer.parseInt(anoTexto);
        
    }
   
    public String getEscola() {
        return escola;
    }
   
    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public String toString() {
//        return "RepresentaSeparado{" + "nome=" + nome + ", curso=" + curso + ", ano=" + ano + ", escola=" + escola + '}';
//    }
    
    return String.format("Nome: %s\nCurso: %s\nAno:%d\nInstituição: %s\n\n", 
                   this.nome,
                   this.curso,
                   this.ano,
                   this.escola);
    }
    
}
