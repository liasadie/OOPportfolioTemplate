public class MultiSphere {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(2.0);
        Sphere sphere2 = new Sphere(4.0);
        Sphere sphere3 = new Sphere(6.0);

        System.out.println("Sphere 1: " + sphere1);
        System.out.println("Sphere 2: " + sphere2);
        System.out.println("Sphere 3: " + sphere3);

        sphere2.setDiameter(8.0);
        System.out.println("\nUpdated sphere 2: " + sphere2);
    }
}
