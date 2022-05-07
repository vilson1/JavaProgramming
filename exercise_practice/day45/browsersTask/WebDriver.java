package day45.browsersTask;

public interface WebDriver extends SearchContext{

    void get();
    void close();
    void quit();
    void getTitle();

}
