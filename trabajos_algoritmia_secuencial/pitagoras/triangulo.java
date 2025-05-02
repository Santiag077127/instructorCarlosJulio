package pitagoras;

public class triangulo {
    public static void main (String []args){
        int catetoA=8;
        int catetoB=2;
        int calcularCatetos;
        double hipotenusa;

        calcularCatetos = (catetoA * catetoA) + (catetoB * catetoB);

        hipotenusa = Math.sqrt(calcularCatetos);

        System.out.println(hipotenusa);
    }
}
