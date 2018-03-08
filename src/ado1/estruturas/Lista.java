package ado1.estruturas;

public class Lista {
    private No prim;
    private No ult;
    private int qtdNo;
    
    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(No ult) {
        this.ult = ult;
    }

    public int getQtdNo() {
        return qtdNo;
    }

    public void setQtdNo(int qtdNo) {
        this.qtdNo = qtdNo;
    }
 
    public Lista(){
        this.prim = null;
        this.ult = null;
        this.qtdNo = 0;
    }
    
    public boolean isEmpty(){
        return(this.prim==null);
    }
    public void inserirPrimeiro(Carros c){
        No novoNo = new No(c);
        if(this.isEmpty())
            this.ult = novoNo;
        novoNo.setProx(this.prim);
        this.prim = novoNo;
        this.qtdNo++;
    }
    public void inserirUltimo (Carros c){
       No novoNo = new No (c);
       if (this.isEmpty()){
           this.prim = novoNo;
       }else{
           this.ult.setProx(novoNo);
       }
       this.ult = novoNo;
       this.qtdNo++;
    }
    
    public boolean removerNo(String modelo){
        No atual = this.prim;
        No anterior = null;
        if(this.isEmpty()){
            return false;
        }else{
            while(atual!=null && (!atual.getC().getModelo().equals(modelo))){
                anterior = atual;
                atual = atual.getProx();
            }if(atual == prim){
                if(this.prim == this.ult){
                    this.ult = null;
                }
                this.prim = this.prim.getProx();
            }else{
                if(atual == ult){
                    this.ult = anterior;
                }
                anterior.setProx(atual.getProx());
            }
        }
        this.qtdNo--;
        return true;
    }
        
    public String pesquisarNo(String modelo){
        String msg = "";
        No atual = this.prim;
        while(atual != null && (!atual.getC().getModelo().equals(modelo))){
            atual  = atual.getProx();
        }
        return msg = "Modelo: "+atual.getC().getModelo()+"\n"+
                     "Marca: "+atual.getC().getMarca()+"\n"+
                     "Ano: "+atual.getC().getAno()+".";
    }
    public String imprimirLista(){
        String msg = "";
        if(this.isEmpty()){
            msg = "Lista vazia";
        }else{
            No atual = this.prim;
            while(atual != null){
                msg += atual.getC().getModelo()+"--";
                atual = atual.getProx();
            }
        }
    return msg;
    }
    public void deletar(){
        if(this.isEmpty()){
            System.out.println("*****A lista já está vazia*****");
        }else{
            No atual = this.prim;
            while(atual != null){
                atual.getC().setAno(0);
                atual.getC().setMarca("");
                atual.getC().setModelo("");
                atual = atual.getProx();
            }
            System.out.println("*****Lista deletada*****");
        }
    }
}
