import java.util.ArrayList;

/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost extends Post
{
    private String filename;
    private String caption;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
        comments = new ArrayList<>();
    }

    /**
     * Meotdo que devuelve el nombre del archivo
     */
    public String getImageFile(){
        return filename;
    }

    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getCaption(){
        return caption;
    }

    /**
     * Metodo para añadir un comentario al post
     */
    public void addComment(String text){
        comments.add(text);
    }

    /**
     * Método para unir los comentarios al display de la clase Post
     */
    public void mostrarComentarios(){
        String comentarios = "";
        if(comments.size() != 0)
            for(int i=0; i<comments.size(); i++)
                comentarios += comments.get(i) + "\n_____________________\n";
        else
            comentarios += "Sin comentarios";
        display();
        System.out.println(comentarios);
    }
}
