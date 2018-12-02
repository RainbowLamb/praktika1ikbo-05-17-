package pracnika2;
public class testAuthor {
    public static void main(String[] args)
    { Author author_1 = new Author("Howard Phillips Lovecraft", "Cthulhu@gmail.com", 'm');
        System.out.println(author_1.outToString());
        author_1.setEmail("TheCallofCthulhu@yahoo.com");
        System.out.println(author_1.outToString()); }
}