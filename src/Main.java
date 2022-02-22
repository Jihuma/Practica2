import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("---- Menu ----");
            System.out.println("1. Televisor");
            System.out.println("2. Libro");
            System.out.println("3. Lápiz");
            System.out.println("4. Bombillas");
            System.out.println("5. Laptop");
            System.out.println("6. Salir");
            System.out.println("--------------");

            try {

                System.out.println("Elige una de las opciones para capturar e imprimir");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Has seleccionado la opcion 1");
                        televisor();
                    }
                    case 2 -> {
                        System.out.println("Has seleccionado la opcion 2");
                        libro();
                    }
                    case 3 -> {
                        System.out.println("Has seleccionado la opcion 3");
                        lapiz();
                    }
                    case 4 -> {
                        System.out.println("Has seleccionado la opcion 4");
                        bombilla();
                    }
                    case 5 -> {
                        System.out.println("Has seleccionado la opcion 5");
                        laptop();
                    }
                    case 6 -> salir = true;
                    default -> System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

    static void televisor() {
        Televisor tel1 = new Televisor();
        Televisor tel2 = new Televisor();
        Televisor tel3 = new Televisor();

        System.out.println("\nIngresa el tamaño en pulgadas del televisor 1: ");
        Scanner inTamaño = new Scanner(System.in);
        tel1.setTamaño(inTamaño.nextInt());

        System.out.println("\nIngresa la marca del televisor 1: ");
        Scanner inMarca = new Scanner(System.in);
        tel1.setMarca(inMarca.next());

        System.out.println("\nIngresa el tipo de televisor 1: ");
        Scanner inTipo = new Scanner(System.in);
        tel1.setTipo(inTipo.next());

        System.out.println("\nIngresa el color de televisor 1: ");
        Scanner inColor = new Scanner(System.in);
        tel1.setColor(inColor.next());

        System.out.println("\nIngresa la resolucion de televisor 1: ");
        Scanner inResolucion = new Scanner(System.in);
        tel1.setResolucion(inResolucion.next());

        System.out.println("\nIngresa el tamaño en pulgadas del televisor 2: ");
        tel2.setTamaño(inTamaño.nextInt());

        System.out.println("\nIngresa la marca del televisor 2: ");
        tel2.setMarca(inMarca.next());

        System.out.println("\nIngresa el tipo de televisor 2: ");
        tel2.setTipo(inTipo.next());

        System.out.println("\nIngresa el color de televisor 2: ");
        tel2.setColor(inColor.next());

        System.out.println("\nIngresa la resolucion de televisor 2: ");
        tel2.setResolucion(inResolucion.next());

        System.out.println("\nIngresa el tamaño en pulgadas del televisor 3: ");
        tel3.setTamaño(inTamaño.nextInt());

        System.out.println("\nIngresa la marca del televisor 3: ");
        tel3.setMarca(inMarca.next());

        System.out.println("\nIngresa el tipo de televisor 3: ");
        tel3.setTipo(inTipo.next());

        System.out.println("\nIngresa el color de televisor 3: ");
        tel3.setColor(inColor.next());

        System.out.println("\nIngresa la resolucion de televisor 3: ");
        tel3.setResolucion(inResolucion.next());

        System.out.println("\n--- Lista de Televisores ---");
        System.out.println("\n--- Televisor 1 ---: ");
        System.out.println("Tamaño: "+tel1.getTamaño()+"\nMarca: "+tel1.getMarca()+"\nTipo: "+tel1.getTipo()+"\nColor: "+tel1.getColor()+"\nResolucion: "+tel1.getResolucion());

        System.out.println("\n--- Televisor 2 ---: ");
        System.out.println("Tamaño: "+tel2.getTamaño()+"\nMarca: "+tel2.getMarca()+"\nTipo: "+tel2.getTipo()+"\nColor: "+tel2.getColor()+"\nResolucion: "+tel2.getResolucion());

        System.out.println("\n--- Televisor 3 ---: ");
        System.out.println("Tamaño: "+tel3.getTamaño()+"\nMarca: "+tel3.getMarca()+"\nTipo: "+tel3.getTipo()+"\nColor: "+tel3.getColor()+"\nResolucion: "+tel3.getResolucion());

    }

    static void libro() {
        Libro lib1 = new Libro();
        Libro lib2 = new Libro();
        Libro lib3 = new Libro();

        System.out.println("\nIngresa el numero de paginas del libro 1: ");
        Scanner inPaginas = new Scanner(System.in);
        lib1.setPaginas(inPaginas.nextInt());

        System.out.println("\nIngresa la editorial del libro 1: ");
        Scanner inEditorial = new Scanner(System.in);
        lib1.setEditorial(inEditorial.next());

        System.out.println("\nIngresa el tipo de libro 1: ");
        Scanner inTipo = new Scanner(System.in);
        lib1.setTipo(inTipo.next());

        System.out.println("\nIngresa el autor del libro 1: ");
        Scanner inAutor = new Scanner(System.in);
        lib1.setAutor(inAutor.next());

        System.out.println("\nIngresa el titulo del libro 1: ");
        Scanner inTitulo = new Scanner(System.in);
        lib1.setTitulo(inTitulo.next());

        System.out.println("\nIngresa el numero de paginas del libro 2: ");
        lib2.setPaginas(inPaginas.nextInt());

        System.out.println("\nIngresa la editorial del libro 2: ");
        lib2.setEditorial(inEditorial.next());

        System.out.println("\nIngresa el tipo de libro 2: ");
        lib2.setTipo(inTipo.next());

        System.out.println("\nIngresa el autor del libro 2: ");
        lib2.setAutor(inAutor.next());

        System.out.println("\nIngresa el titulo del libro 2: ");
        lib2.setTitulo(inTitulo.next());

        System.out.println("\nIngresa el numero de paginas del libro 3: ");
        lib3.setPaginas(inPaginas.nextInt());

        System.out.println("\nIngresa la editorial del libro 3: ");
        lib3.setEditorial(inEditorial.next());

        System.out.println("\nIngresa el tipo de libro 3: ");
        lib3.setTipo(inTipo.next());

        System.out.println("\nIngresa el autor del libro 3: ");
        lib3.setAutor(inAutor.next());

        System.out.println("\nIngresa el titulo del libro 3: ");
        lib3.setTitulo(inTitulo.next());

        System.out.println("\n--- Lista de Libros ---");
        System.out.println("\n--- Libro 1 ---: ");
        System.out.println("Paginas: "+lib1.getPaginas()+"\nEditorial: "+lib1.getEditorial()+"\nTipo: "+lib1.getTipo()+"\nAutor: "+lib1.getAutor()+"\nTitulo: "+lib1.getTitulo());

        System.out.println("\n--- Libro 2 ---: ");
        System.out.println("Paginas: "+lib2.getPaginas()+"\nEditorial: "+lib2.getEditorial()+"\nTipo: "+lib2.getTipo()+"\nAutor: "+lib2.getAutor()+"\nTitulo: "+lib2.getTitulo());

        System.out.println("\n--- Libro 3 ---: ");
        System.out.println("Paginas: "+lib3.getPaginas()+"\nEditorial: "+lib3.getEditorial()+"\nTipo: "+lib3.getTipo()+"\nAutor: "+lib3.getAutor()+"\nTitulo: "+lib3.getTitulo());

    }

    static void lapiz() {
        Lapiz lap1 = new Lapiz();
        Lapiz lap2 = new Lapiz();
        Lapiz lap3 = new Lapiz();

        System.out.println("\nIngresa el color del lapiz 1: ");
        Scanner inColor = new Scanner(System.in);
        lap1.setColor(inColor.next());

        System.out.println("\nIngresa la marca del lapiz 1: ");
        Scanner inMarca = new Scanner(System.in);
        lap1.setMarca(inMarca.next());

        System.out.println("\nIngresa el tipo de lapiz 1: ");
        Scanner inTipo = new Scanner(System.in);
        lap1.setTipo(inTipo.next());

        System.out.println("\nIngresa el material del lapiz 1: ");
        Scanner inMaterial = new Scanner(System.in);
        lap1.setMaterial(inMaterial.next());

        System.out.println("\nIngresa el peso en gramos del lapiz 1: ");
        Scanner inPeso = new Scanner(System.in);
        lap1.setPeso(inPeso.nextInt());

        System.out.println("\nIngresa el color del lapiz 2: ");
        lap2.setColor(inColor.next());

        System.out.println("\nIngresa la marca del lapiz 2: ");
        lap2.setMarca(inMarca.next());

        System.out.println("\nIngresa el tipo de lapiz 2: ");
        lap2.setTipo(inTipo.next());

        System.out.println("\nIngresa material del lapiz 2: ");
        lap2.setMaterial(inMaterial.next());

        System.out.println("\nIngresa el peso en gramos del lapiz 2: ");
        lap2.setPeso(inPeso.nextInt());

        System.out.println("\nIngresa el color del lapiz 3: ");
        lap3.setColor(inColor.next());

        System.out.println("\nIngresa la marca del lapiz 3: ");
        lap3.setMarca(inMarca.next());

        System.out.println("\nIngresa el tipo de lapiz 3: ");
        lap3.setTipo(inTipo.next());

        System.out.println("\nIngresa el material del lapiz 3: ");
        lap3.setMaterial(inMaterial.next());

        System.out.println("\nIngresa el peso en gramos del lapiz 3: ");
        lap3.setPeso(inPeso.nextInt());

        System.out.println("\n--- Lista de Lapices ---");
        System.out.println("\n--- Lapiz 1 ---: ");
        System.out.println("Color: "+lap1.getColor()+"\nMarca: "+lap1.getMarca()+"\nTipo: "+lap1.getTipo()+"\nMaterial: "+lap1.getMaterial()+"\nPeso: "+lap1.getPeso());

        System.out.println("\n--- Lapiz 2 ---: ");
        System.out.println("Color: "+lap2.getColor()+"\nMarca: "+lap2.getMarca()+"\nTipo: "+lap2.getTipo()+"\nMaterial: "+lap2.getMaterial()+"\nPeso: "+lap2.getPeso());

        System.out.println("\n--- Lapiz 3 ---: ");
        System.out.println("Color: "+lap3.getColor()+"\nMarca: "+lap3.getMarca()+"\nTipo: "+lap3.getTipo()+"\nMaterial: "+lap3.getMaterial()+"\nPeso: "+lap3.getPeso());

    }

    static void bombilla() {
        Bombilla bom1 = new Bombilla();
        Bombilla bom2 = new Bombilla();
        Bombilla bom3 = new Bombilla();

        System.out.println("\nIngresa el tamaño de la bombilla 1: ");
        Scanner inTamaño = new Scanner(System.in);
        bom1.setTamaño(inTamaño.next());

        System.out.println("\nIngresa la potencia en watts de la bombilla 1: ");
        Scanner inPotencia = new Scanner(System.in);
        bom1.setPotencia(inPotencia.nextInt());

        System.out.println("\nIngresa el tipo de bombilla 1: ");
        Scanner inTipo = new Scanner(System.in);
        bom1.setTipo(inTipo.next());

        System.out.println("\nIngresa el color de la bombilla 1: ");
        Scanner inColor = new Scanner(System.in);
        bom1.setColor(inColor.next());

        System.out.println("\nIngresa el estado de la bombilla 1: ");
        Scanner inEstado = new Scanner(System.in);
        bom1.setEstado(inEstado.next());

        System.out.println("\nIngresa el tamaño de la bombilla 2: ");
        bom2.setTamaño(inTamaño.next());

        System.out.println("\nIngresa la potencia en watts de la bombilla 2: ");
        bom2.setPotencia(inPotencia.nextInt());

        System.out.println("\nIngresa el tipo de bombilla 2: ");
        bom2.setTipo(inTipo.next());

        System.out.println("\nIngresa el color de la bombilla 2: ");
        bom2.setColor(inColor.next());

        System.out.println("\nIngresa el estado de la bombilla 2: ");
        bom2.setEstado(inEstado.next());

        System.out.println("\nIngresa el tamaño de la bombilla 3: ");
        bom3.setTamaño(inTamaño.next());

        System.out.println("\nIngresa la potencia en watts de la bombilla 3: ");
        bom3.setPotencia(inPotencia.nextInt());

        System.out.println("\nIngresa el tipo de bombilla 3: ");
        bom3.setTipo(inTipo.next());

        System.out.println("\nIngresa el color de la bombilla 3: ");
        bom3.setColor(inColor.next());

        System.out.println("\nIngresa el estado de la bombilla 3: ");
        bom3.setEstado(inEstado.next());

        System.out.println("\n--- Lista de Bombillas ---");
        System.out.println("\n--- Bombilla 1 ---: ");
        System.out.println("Tamaño: "+bom1.getTamaño()+"\nPotencia: "+bom1.getPotencia()+"\nTipo: "+bom1.getTipo()+"\nColor: "+bom1.getColor()+"\nEstado: "+bom1.getEstado());

        System.out.println("\n--- Bombilla 2 ---: ");
        System.out.println("Tamaño: "+bom2.getTamaño()+"\nPotencia: "+bom2.getPotencia()+"\nTipo: "+bom2.getTipo()+"\nColor: "+bom2.getColor()+"\nEstado: "+bom2.getEstado());

        System.out.println("\n--- Bombilla 3 ---: ");
        System.out.println("Tamaño: "+bom3.getTamaño()+"\nPotencia: "+bom3.getPotencia()+"\nTipo: "+bom3.getTipo()+"\nColor: "+bom3.getColor()+"\nEstado: "+bom3.getEstado());

    }

    static void laptop() {
        Laptop ltp1 = new Laptop();
        Laptop ltp2 = new Laptop();
        Laptop ltp3 = new Laptop();

        System.out.println("\nIngresa el tamaño en pulgadas de la laptop 1: ");
        Scanner inTamaño = new Scanner(System.in);
        ltp1.setTamaño(inTamaño.nextInt());

        System.out.println("\nIngresa la marca de la laptop 1: ");
        Scanner inMarca = new Scanner(System.in);
        ltp1.setMarca(inMarca.next());

        System.out.println("\nIngresa el almacenamiento en GB de la laptop 1: ");
        Scanner inAlmacenamiento = new Scanner(System.in);
        ltp1.setAlmacenamiento(inAlmacenamiento.nextInt());

        System.out.println("\nIngresa el color de la laptop 1: ");
        Scanner inColor = new Scanner(System.in);
        ltp1.setColor(inColor.next());

        System.out.println("\nIngresa la cantidad de RAM en GB de la laptop 1: ");
        Scanner inRam = new Scanner(System.in);
        ltp1.setRam(inRam.nextInt());

        System.out.println("\nIngresa el tamaño en pulgadas de la laptop 2: ");
        ltp2.setTamaño(inTamaño.nextInt());

        System.out.println("\nIngresa la marca de la laptop 2: ");
        ltp2.setMarca(inMarca.next());

        System.out.println("\nIngresa el almacenamiento en GB de la laptop 2: ");
        ltp2.setAlmacenamiento(inAlmacenamiento.nextInt());

        System.out.println("\nIngresa el color de la laptop 2: ");
        ltp2.setColor(inColor.next());

        System.out.println("\nIngresa la cantidad de RAM en GB de la laptop 2: ");
        ltp2.setRam(inRam.nextInt());

        System.out.println("\nIngresa el tamaño en pulgadas de la laptop 3: ");
        ltp3.setTamaño(inTamaño.nextInt());

        System.out.println("\nIngresa la marca de la laptop 3: ");
        ltp3.setMarca(inMarca.next());

        System.out.println("\nIngresa el almacenamiento en GB de la laptop 3: ");
        ltp3.setAlmacenamiento(inAlmacenamiento.nextInt());

        System.out.println("\nIngresa el color de la laptop 3: ");
        ltp3.setColor(inColor.next());

        System.out.println("\nIngresa la cantidad de RAM en GB de la laptop 3: ");
        ltp3.setRam(inRam.nextInt());

        System.out.println("\n--- Lista de Laptops ---");
        System.out.println("\n--- Laptop 1 ---: ");
        System.out.println("Tamaño: "+ltp1.getTamaño()+"\nMarca: "+ltp1.getMarca()+"\nAlmacenamiento: "+ltp1.getAlmacenamiento()+"\nColor: "+ltp1.getColor()+"\nRAM: "+ltp1.getRam());

        System.out.println("\n--- Laptop 2 ---: ");
        System.out.println("Tamaño: "+ltp2.getTamaño()+"\nMarca: "+ltp2.getMarca()+"\nAlmacenamiento: "+ltp2.getAlmacenamiento()+"\nColor: "+ltp2.getColor()+"\nRAM: "+ltp2.getRam());

        System.out.println("\n--- Laptop 3 ---: ");
        System.out.println("Tamaño: "+ltp3.getTamaño()+"\nMarca: "+ltp3.getMarca()+"\nAlmacenamiento: "+ltp3.getAlmacenamiento()+"\nColor: "+ltp3.getColor()+"\nRAM: "+ltp3.getRam());

    }

}
