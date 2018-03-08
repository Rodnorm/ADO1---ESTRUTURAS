package ado1.estruturas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ADO1ESTRUTURAS {

    public static void main(String[] args) {
        //Criação do menu
        int opt = 1;
        Scanner c = new Scanner(System.in);
        Lista lis = new Lista();

        try {
            while (opt == 1) {
                System.out.println("*************************MENU************************");
                System.out.println("| Escolha o que você deseja fazer:                  |");
                System.out.println("| Para inserir carros no inicio digite 1            |");
                System.out.println("| Para inserir carros no fim digite 2               |");
                System.out.println("| Para pesquisar carros pelo modelo digite 3        |");
                System.out.println("| Para imprimir todos os carros da lista digite 4   |");
                System.out.println("| Para remover um carro da lista digite 5           |");
                System.out.println("| Para remover todos os elementos da lista digite 6 |");
                System.out.println("| Para sair digite 0                                |");
                System.out.println("*************************MENU************************");
                int escolha = c.nextInt();

                switch (escolha) {
                    case 1:
                        Carros ca = new Carros();
                        String mod;
                        String marca;
                        int ano;
                        System.out.println("*************Inserir no começo da lista**************");
                        System.out.println("Insira o modelo:                                     |");
                        mod = c.next();
                        //ca.setModelo(c.next());
                        System.out.println("Insira a marca:                                      |");
                        marca = c.next();
                        //ca.setMarca(c.next());
                        System.out.println("Insira o ano:");
                        ano = c.nextInt();
                        //ca.setAno(c.nextInt());
                        ca.setAno(ano);
                        ca.setMarca(marca);
                        ca.setModelo(mod);
                        lis.inserirPrimeiro(ca);
                        System.out.println("****************Carro inserido***********************");

                        break;
                    case 2:
                        Carros car = new Carros();
                        System.out.println("********************Inserir no começo****************");
                        System.out.println("Insira o modelo: ");
                        car.setModelo(c.next());
                        System.out.println("Insira a marca: ");
                        car.setMarca(c.next());
                        System.out.println("Insira o ano: ");
                        car.setAno(c.nextInt());
                        lis.inserirUltimo(car);
                        System.out.println("********************Inserir no começo****************");
                        break;
                    case 3:
                        System.out.println("**************Pesquisa por modelo********************");
                        System.out.println("Insira o modelo: ");
                        String modelo_p = c.next();
                        System.out.println(lis.pesquisarNo(modelo_p));
                        System.out.println("*********************Pesquisa concluída**************");
                        break;
                    case 4:
                        System.out.println("*********************Imprimir a lista*****************");
                        System.out.println(lis.imprimirLista());
                        System.out.println("*********************Fim da lista*********************");
                        break;
                    case 5:
                        System.out.println("***********Remover um elemento da lista***************");
                        System.out.println("Insira o modelo: ");
                        String modelo_r = c.next();
                        if (lis.removerNo(modelo_r)) {
                            System.out.println("*******************Item removido******************");
                        } else {
                            System.out.println("***************Item não encontrado****************");
                            
                        }
                        break;
                    case 6:
                        lis.deletar();
                        break;
                    case 0:
                        System.out.println("Até mais :)");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("*******************Opção inválida********************");
                }

            }
        }catch (Exception e){
            System.out.println("***********************ERRO***********************");
        }
    }
}
