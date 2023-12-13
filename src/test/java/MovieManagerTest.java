import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {

    @Test
    public void zeroAdditionTest() {

        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void oneAdditionTest() {

        MovieManager manager = new MovieManager();


        manager.addMovie("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void threeAdditionTest() {
        MovieManager manager = new MovieManager();


        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReversedAllMovies() {
        MovieManager manager = new MovieManager();


        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");

        String[] expected = {"Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testLimitMovies() {
        MovieManager manager = new MovieManager();


        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");

        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testOverLimitMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");

        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

}
