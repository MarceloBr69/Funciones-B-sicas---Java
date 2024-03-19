import java.util.ArrayList;
public class EjerciciosBásicos {
    public static void main(String [] args){
        //Imprimir 1 - 255
        for(int i = 1; i<=255; i++){
            System.out.println(i);
        }    
        System.out.println("Fin del primer ejercicio");


        //Imprimir los Números Impares Entre 1 - 255

        for(int i = 1; i<=255; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("Fin del segundo ejercicio");


        //Imprimir la Suma
        int Suma = 0; 
        for(int i = 0; i<=255; i++){
    
            System.out.println("Nuevo numero: " + i +" Suma: "+ Suma);
            Suma = Suma + i;
        }
        System.out.println("Fin del tercer ejercicio");



        //Recorrer un Arreglo
        ArrayList<Integer> Array = new ArrayList<Integer>(); //objeto
        Array.add(1);
        Array.add(3);
        Array.add(5);
        Array.add(7);
        Array.add(9);
        Array.add(13);

        for (int ArrayNumeros : Array){
            System.out.println(ArrayNumeros);
        }
        System.out.println("Fin del 4to ejercicio");


        //Encontrar el Máximo
        int [] numerosMaximo = {3,2,-1,0,200,20};
        int max = numerosMaximo[0];
        for (int i = 0; i<numerosMaximo.length; i++){
            max = Math.max(max, numerosMaximo[i]);
        }
        System.out.println("Maximum Value: " + max);
        System.out.println("Fin del 5to ejercicio");




        //Obtener el Promedio
        int [] numerosPromedio = {2, 10, 3};
        int sum = 0;

        for (int i = 0; i<numerosPromedio.length; i++){
            sum = numerosPromedio[i] + sum;
            if(i == 2){
                double div = sum / numerosPromedio.length;
                System.out.println("El promedio es: " + div);
            }
        }
        System.out.println("Fin del 6xto ejercicio");

        //Arreglo con Números Impares
    
       
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 1; i<=255; i++){
            if(i % 2 != 0){
                myArray.add(i);
            }
        }
        System.out.println(myArray);
        System.out.println("Fin del 7mo ejercicio");


        //Mayor que Y
        int [] menorY = {1,2,1,6,7,2};
        int contador = 0;
        for(int i = 0; i<menorY.length; i++){
            if(menorY[i]>3){
                contador ++;
            }
        }
        System.out.println(contador);
        System.out.println("Fin del 8vo ejercicio");






        //Valores al Cuadrado
        int [] ArrayCuadrado = {2,2,5,8};
        int Calculo = 0;
        for(int i = 0; i<ArrayCuadrado.length; i++){
            Calculo = ArrayCuadrado[i] * ArrayCuadrado[i];
            System.out.println(Calculo);
        }
        System.out.println("Fin del 9no ejercicio");

        

        
        
        
        //Eliminar Números Negativos
        ArrayList<Integer> NegativosEliminar = new ArrayList<Integer>();
        
        NegativosEliminar.add(2);
        NegativosEliminar.add(-2);
        NegativosEliminar.add(-5);
        NegativosEliminar.add(20);

        
        for(int i = 0; i<NegativosEliminar.size(); i++){
            if(NegativosEliminar.get(i) < 0){
                NegativosEliminar.add(i, 0);
                NegativosEliminar.remove(i+1);
            }
        }
        System.out.println(NegativosEliminar);




        //Ejercicio: Mínimo, Máximo y Promedio  
        int[] numeros = {10, 5, 20, 15, 25}; //Array inicial
        double mayor = numeros[0];
        double menor = numeros[0];
        double suma = 0;
            
        // Recorremos el array para encontrar el mayor, el menor y calcular la suma
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
                    }
            if (numero < menor) {
                menor = numero;
            }
            suma += numero;
        }
        double promedio = suma / numeros.length;

        ArrayList<Double> resultadofinal = new ArrayList<Double>(); //Array final
        resultadofinal.add(promedio);
        resultadofinal.add(mayor);
        resultadofinal.add(menor);
        System.out.println(resultadofinal);
            
        




        //Cambiando los Valores del Arreglo
        int [] x = {1,5,10,7,-2};
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 0; i<x.length - 1; i++){
            int z = x[i + 1];
            y.add(z);
        }
        y.add(0);
        System.out.println(y);













        
        
        


        
            
        




        



        

        

        
        


    }
}
