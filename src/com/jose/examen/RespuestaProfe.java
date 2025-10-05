package com.jose.examen;

import java.util.Random;

public class RespuestaProfe {
    public static void main(String[] args) throws InterruptedException{

        Random r=new Random();
        int f=3;

        String cara1[][]=new String[f][f];
        String cara2[][]=new String[f][f];
        String cara3[][]=new String[f][f];
        String cara4[][]=new String[f][f];
        String cara5[][]=new String[f][f];
        String cara6[][]=new String[f][f];

        String colores[]= { "Blanco", "Amarillo", "Azul", "Rojo", "Verde", "Naranja"};
        llenarMatriz(cara1);
        llenarMatriz(cara2);
        llenarMatriz(cara3);
        llenarMatriz(cara4);
        llenarMatriz(cara5);
        llenarMatriz(cara6);

        cara1[1][1]=colores[0];
        cara2[1][1]=colores[1];
        cara3[1][1]=colores[2];
        cara4[1][1]=colores[3];
        cara5[1][1]=colores[4];
        cara6[1][1]=colores[5];

        int contadores[]= new int[6];
        for(int x=0; x<contadores.length; x++){
            contadores[x]=1;
        }

        int contador=6;
        while(contador<54){
            int cara= r.nextInt(6);
            int fila=r.nextInt(f);
            int columna=r.nextInt(f);
            int color=r.nextInt(6);

            if (fila == 1 && columna == 1) continue;
            if(cara==0){
                if(contadores[color]<9){
                    if(cara1[fila][columna].equals("        ")){
                        cara1[fila][columna]= colores[color];
                        contador++;
                        contadores[color]++;
                    }
                }
            }
            
            if(cara==1){
                if(contadores[color]<9){
                    if(cara2[fila][columna].equals("        ")){
                        cara2[fila][columna]= colores[color];
                        contador++;
                        contadores[color]++;
                    }
                }
            }

            if(cara==2){
                if(contadores[color]<9){
                    if(cara3[fila][columna].equals("        ")){
                        cara3[fila][columna]= colores[color];
                        contador++;
                        contadores[color]++;
                    }
                }
            }

            if(cara==3){
                if(contadores[color]<9){
                    if(cara4[fila][columna].equals("        ")){
                        cara4[fila][columna]= colores[color];
                        contador++;
                        contadores[color]++;
                    }
                }
            }

            if(cara==4){
                if(contadores[color]<9){
                    if(cara5[fila][columna].equals("        ")){
                        cara5[fila][columna]= colores[color];
                        contador++;
                        contadores[color]++;
                    }
                }
            }

            if(cara==5){
                if(contadores[color]<9){
                    if(cara6[fila][columna].equals("        ")){
                        cara6[fila][columna]= colores[color];
                        contador++;
                        contadores[color]++;
                    }
                }
            }

            for(int x=0; x<50; x++){
                System.out.println("");
            }

            imprimirMatriz(cara1);
            imprimirMatriz(cara2);
            imprimirMatriz(cara3);
            imprimirMatriz(cara4);
            imprimirMatriz(cara5);
            imprimirMatriz(cara6);
//            Thread.sleep(100);
        }
    }

    public static void llenarMatriz(String matriz[][]){
        for(int x=0; x<matriz.length; x++){
            for(int y=0; y<matriz[0].length; y++){
                matriz[x][y]="        ";
            }
        }
    }

    public static void imprimirMatriz(String matriz[][]){
        for(int x=0; x<matriz.length; x++){
            for(int y=0; y<matriz[0].length; y++){
                System.out.print("[" + matriz[x][y] + "]");
        }
        System.out.println();
    }
    System.out.println("-------------------------------------");
      
    
}
}
