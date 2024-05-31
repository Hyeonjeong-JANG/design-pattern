package ex07factory.lib;

public interface DB {
    void setUrl(String url);

    int execute(String sql);
}
