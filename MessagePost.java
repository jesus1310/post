/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost extends Post
{
    private String message;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author,String text)
    {
        super(author);
        message = text;
    }

    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getText(){
        return message;
    }
    
    /**
     * Método que imprime un String mostrando el nombre del autor
     */
    public void printShortSummary(){
        System.out.println("Este es un post de texto creado por " + getUsername());
    }
}
