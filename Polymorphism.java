
/**
 * Polymorphism
 */
public class Polymorphism extends PolyMorphismTwo {
    String movie;

    public void sayMovie() {
        System.out.println("My favorite movies are Star Wars");
    }

    public void sayMovie(String movie) {
        System.out.println("My favorite movie is " + movie);
    }

    @Override
    public void worstMovie() {
        System.out.println("Actually, the worst movie is it's Anaconda");
    }

    public static void main(String[] args) {
        Polymorphism worst = new Polymorphism();
        worst.worstMovie();
        Polymorphism favorite = new Polymorphism();
        favorite.sayMovie();
    }
}