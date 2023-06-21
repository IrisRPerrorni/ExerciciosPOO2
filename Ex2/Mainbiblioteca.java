package Ex2;

public class Mainbiblioteca {
    public static void main(String[] args) {

        Biblioteca livro1 = new Biblioteca("Harry Potter" , "Fantasia" , "JK" , 012);
        Biblioteca livro2 = new Biblioteca("Romeu e Julieta" , "Romance" , "Shakespeare" , 013);
        Biblioteca livro3 = new Biblioteca("POO em java" , "Educacional" , "Catalisa" , 014);

        livro1.registrarLivro(livro1.getIsbn());
        livro2.registrarLivro(livro2.getIsbn() , livro2.getNome());
        livro3.registrarLivro(livro3.getIsbn(), livro3.getNome(), livro3.getGenero());
        livro1.registrarLivro(livro1.getIsbn() , livro1.getNome() , livro1.getGenero() , livro1.getAutor());


    }

}
