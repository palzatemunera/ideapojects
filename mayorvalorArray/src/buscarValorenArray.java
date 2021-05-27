import java.util.Scanner;

public class buscarValorenArray {

    public static void main(String[]args){
                Scanner teclado=new Scanner(System.in);
                boolean elNumeroEsta = false;

                int num[]=new int[3];
                int x;
                for(x=0;x<num.length;x++){
                    System.out.print("ingrese un numero: ");
                    num[x]=teclado.nextInt();
                }
                for(x=0;x<num.length;x++){
                    System.out.println(num[x]);
                }

                System.out.print("buscar numero: ");
                int numero;
                numero=teclado.nextInt();

                for(x=0;x<num.length;x++){
                    if (numero == num[x]) {
                        System.out.println("El numero esta en el indice "+x+", en la posicion "+(x+1));
                        elNumeroEsta = true;
                    }
                }

                if(elNumeroEsta ==false) {
                    System.out.println("El numero no esta");
                }
            }
        }