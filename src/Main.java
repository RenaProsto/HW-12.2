
public class Main {

    public static void main(String[] args) {
        Author andrzejSapkowski = new Author("Andrzej" , "Sapkowski");
        Author joanneRowling = new Author("Joanne","Rowling");

        Book theWitcher = new Book("The Witcher" , 1986);
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", 1997);

        System.out.println(theWitcher.getNameBook() + " " + theWitcher.getYearBook()+ " " + andrzejSapkowski.getNameAuthor()+ " " +andrzejSapkowski.getSurnameAuthor());
        System.out.println(harryPotter.getNameBook()+ " " +harryPotter.getYearBook()+ " " + joanneRowling.getNameAuthor() + " " +joanneRowling.getSurnameAuthor());

        theWitcher.setYearBook(1985);
        System.out.println(theWitcher.getYearBook() + " Изменен год.");

    }

}
