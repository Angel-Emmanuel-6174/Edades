import java.util.Scanner;

public class Edades{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO\nDATOS DE EDAD Y GENERO");
        int edad;
        char gen, salir='n';
        int youngH=0, adultH=0, oldH=0, kidsH=0, adoH=0, adoM=0, kidsM=0, youngM=0, adultM=0, oldM=0, totalH=0, totalM=0, ado=0, kids=0, young=0, adult=0, old=0;
        while(salir !='s'){
            System.out.println("INGRESE SU EDAD:");
            edad = sc.nextInt();
            System.out.println("INGRESE SU GENERO H/M:");
            gen = sc.next().charAt(0);
            if(edad >=1 && edad <= 15){
                kids++;
                if(gen == 'H'){
                    kidsH++;
                }else if(gen == 'M'){
                    kidsM++;
                }
                totalH = totalH + kidsH;
                totalM = totalM + kidsM;
            }
            else if(edad >=16 && edad <= 20){
                ado++;
                if(gen == 'H'){
                    adoH++;
                }else if(gen == 'M'){
                    adoM++;
                }
                totalH = totalH + adoH;
                totalM = totalM + adoM;
            }
            else if(edad >=21 && edad <= 30){
                young++;
                if(gen == 'H'){
                    youngH++;
                }else if(gen == 'M'){
                    youngM++;
                }
                totalH = totalH + youngH;
                totalM = totalM + youngM;
            }
            else if(edad >=31 && edad <= 60){
                adult++;
                if(gen == 'H'){
                    adultH++;
                }else if(gen == 'M'){
                    adultM++;
                }
                totalH = totalH + adultH;
                totalM = totalM + adultM;
            }
            else if(edad >= 60){
                old++;
                if(gen == 'H'){
                    oldH++;
                }else if(gen == 'M'){
                    oldM++;
                }
                totalH = totalH + oldH;
                totalM = totalM + oldM;
            }
            System.out.println("SALIR? 's'");
            salir = sc.next().charAt(0);
        }

            System.out.println("TOTAL DE NIÑOS: "+kids+"                  HOMBRES: "+kidsH+"           MUJERES: "+kidsM);
            System.out.println("TOTAL DE ADOLESCENTES: "+ado+"           HOMBRES: "+adoH+"           MUJERES: "+adoM);
            System.out.println("TOTAL DE ADULTOS JOVENES: "+young+"        HOMBRES: "+youngH+"           MUJERES: "+youngM);
            System.out.println("TOTAL DE ADULTOS: "+adult+"                HOMBRES: "+adultH+"           MUJERES: "+adultM);
            System.out.println("TOTAL DE ADULTOS MAYORES: "+old+"        HOMBRES: "+oldH+"           MUJERES: "+oldM);
        


        
    }


}