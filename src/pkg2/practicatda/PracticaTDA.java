
package pkg2.practicatda;

/**
 *
 * @author Diaz
 */
 public class PracticaTDA {
 public static void main(String[] args) {
     
     //creamos un objeto de esfera 
        
        Esfera impEsfera = new Esfera(5);
        
        //implementar funcionalidades 
        System.out.println("el radio es:" + impEsfera.getRadio());
        System.out.println("el diametro es:" + impEsfera.getDiametro());
        System.out.println("la circuferencia es:" + impEsfera.getCircuferencia());
        System.out.println("el area es:" + impEsfera.getArea());
        System.out.println("el volumen de la esfera es:" + impEsfera.getVolumen());
     
    }
    
}
