//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 Search s1 = new Search();
 s1.push("Google");
 s1.push("Youtube");
 s1.displaySearches();
 s1.pop();
 s1.displaySearches();
 s1.IsNull();
 s1.DisplayLastSearch();
 s1.push("Estrutura de Dados");
 s1.DisplayLastSearch();
 s1.displaySearches();
 s1.pop();
 s1.IsNull();
    }

}
