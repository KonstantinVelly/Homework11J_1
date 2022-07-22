import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test
    public void addSeveralMovies(){
        Afisha afisha = new Afisha();
        afisha.addMovie("Movie1");
        afisha.addMovie("Movie2");
        afisha.addMovie("Movie3");

        String[] actual = afisha.showAllMovies();
        String[] expected = {"Movie1", "Movie2", "Movie3"};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void addOneMovie(){
        Afisha afisha = new Afisha();
        afisha.addMovie("Movie1");

        String[] actual = afisha.showAllMovies();
        String[] expected = {"Movie1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLast14Movies(){
        Afisha afisha = new Afisha();
        afisha.addMovie("Movie1");
        afisha.addMovie("Movie2");
        afisha.addMovie("Movie3");
        afisha.addMovie("Movie4");
        afisha.addMovie("Movie5");
        afisha.addMovie("Movie6");
        afisha.addMovie("Movie7");
        afisha.addMovie("Movie8");
        afisha.addMovie("Movie9");
        afisha.addMovie("Movie10");
        afisha.addMovie("Movie11");
        afisha.addMovie("Movie12");
        afisha.addMovie("Movie13");
        afisha.addMovie("Movie14");

        String[] actual = afisha.showLastMovies(14);
        String[] expected = {"Movie14",
                            "Movie13",
                            "Movie12",
                            "Movie11",
                            "Movie10",
                            "Movie9",
                            "Movie8",
                            "Movie7",
                            "Movie6",
                            "Movie5",
                            "Movie4",
                            "Movie3",
                            "Movie2",
                            "Movie1"
        };

        assertArrayEquals(expected, actual);
    }
    @Test
    public void showLast7Movies(){
        Afisha afisha = new Afisha();
        afisha.addMovie("Movie1");
        afisha.addMovie("Movie2");
        afisha.addMovie("Movie3");
        afisha.addMovie("Movie4");
        afisha.addMovie("Movie5");
        afisha.addMovie("Movie6");
        afisha.addMovie("Movie7");
        afisha.addMovie("Movie8");
        afisha.addMovie("Movie9");
        afisha.addMovie("Movie10");
        afisha.addMovie("Movie11");
        afisha.addMovie("Movie12");
        afisha.addMovie("Movie13");
        afisha.addMovie("Movie14");

        String[] actual = afisha.showLastMovies(7);
        String[] expected = {
                "Movie14",
                "Movie13",
                "Movie12",
                "Movie11",
                "Movie10",
                "Movie9",
                "Movie8",
                };

        assertArrayEquals(expected, actual);
    }
    @Test
    public void showMaxPossibleMovies(){
        Afisha afisha = new Afisha();
        afisha.addMovie("Movie1");
        afisha.addMovie("Movie2");
        afisha.addMovie("Movie3");
        afisha.addMovie("Movie4");
        afisha.addMovie("Movie5");
        afisha.addMovie("Movie6");
        afisha.addMovie("Movie7");
        afisha.addMovie("Movie8");
        afisha.addMovie("Movie9");
        afisha.addMovie("Movie10");
        afisha.addMovie("Movie11");
        afisha.addMovie("Movie12");
        afisha.addMovie("Movie13");
        afisha.addMovie("Movie14");

        String[] actual = afisha.showLastMovies(25);
        String[] expected = {
                "Movie14",
                "Movie13",
                "Movie12",
                "Movie11",
                "Movie10",
                "Movie9",
                "Movie8",
                "Movie7",
                "Movie6",
                "Movie5",
                "Movie4",
                "Movie3",
                "Movie2",
                "Movie1"
        };


        assertArrayEquals(expected, actual);
    }
}
