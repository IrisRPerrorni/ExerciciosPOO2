package Ex2;

public class Biblioteca {
    private String nome;
    private String genero;
    private String autor;
    private int isbn;



    public Biblioteca(String nome, String genero, String autor, int isbn) {
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.isbn = isbn;
    }

    public void registrarLivro(int isbn){
        System.out.println("O livro foi registrado com o IBSN : " + getIsbn());

    }
    public void registrarLivro(int ibsn , String nome){
        System.out.println("O livro foi registrado com o IBSN : " + getIsbn() + " e o nome: " + getNome());

    }
    public void registrarLivro(int ibsn , String nome , String genero ){
        System.out.println("O livro foi registrado com todos o IBSN : " + getIsbn() + " , o nome: " + getNome() +
                " e o gênero: " + getGenero());

    }
    public void registrarLivro(int ibsn , String nome , String genero , String autor ){
        System.out.println("O livro foi registrado com todos os atributos ! \no IBSN : " + getIsbn() + " , o nome: " + getNome() +
                " , o gênero: " + getGenero() + " e o autor: "+ getAutor());

    }

    public String getNome() {

        return nome;
    }

    public String getGenero() {

        return genero;
    }

    public String getAutor() {

        return autor;
    }

    public int getIsbn() {

        return isbn;
    }
}
