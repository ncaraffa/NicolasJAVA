public class constructor {
    public static void main(String[] args) {

        // constructor = Um metodo especial de inicializar objetos
        //               Você pode passar argumentos à um construtor
        //               E setar valores iniciais

        Students students1 = new Students("Spongebob", 30, 3.2);
        Students students2 = new Students("Patrick", 34, 1.5);
        Students students3 = new Students("Sandy", 27, 4.0);

        System.out.println(students1.name);
        System.out.println(students1.age);
        System.out.println(students1.gpa);
        System.out.println(students1.isEnrolled);

        System.out.println(students2.name);
        System.out.println(students2.age);
        System.out.println(students2.gpa);
        System.out.println(students2.isEnrolled);

        System.out.println(students3.name);
        System.out.println(students3.age);
        System.out.println(students3.gpa);
        System.out.println(students3.isEnrolled);

        students1.study();
        students2.study();
        students3.study();

    }
}
